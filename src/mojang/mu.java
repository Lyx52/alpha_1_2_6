package mojang;

import mojang.entity.Entity;
import mojang.tags.BaseTag;
import mojang.tags.CompoundTag;
import mojang.tags.ListTag;
import mojang.world.World;
import mojang.world.WorldIOStream;

import java.io.*;
import java.util.Iterator;

public class mu implements ai {

   private File a;
   private boolean b;


   public mu(File var1, boolean var2) {
      this.a = var1;
      this.b = var2;
   }

   private File a(int var1, int var2) {
      String var3 = "c." + Integer.toString(var1, 36) + "." + Integer.toString(var2, 36) + ".dat";
      String var4 = Integer.toString(var1 & 63, 36);
      String var5 = Integer.toString(var2 & 63, 36);
      File var6 = new File(this.a, var4);
      if(!var6.exists()) {
         if(!this.b) {
            return null;
         }

         var6.mkdir();
      }

      var6 = new File(var6, var5);
      if(!var6.exists()) {
         if(!this.b) {
            return null;
         }

         var6.mkdir();
      }

      var6 = new File(var6, var3);
      return !var6.exists() && !this.b?null:var6;
   }

   public ha a(World var1, int var2, int var3) throws IOException {
      File var4 = this.a(var2, var3);
      if(var4 != null && var4.exists()) {
         try {
            FileInputStream var5 = new FileInputStream(var4);
            CompoundTag var6 = WorldIOStream.readLevelData((InputStream)var5);
            if(!var6.hasKey("Level")) {
               System.out.println("Chunk file at " + var2 + "," + var3 + " is missing level data, skipping");
               return null;
            }

            if(!var6.getMapTag("Level").hasKey("Blocks")) {
               System.out.println("Chunk file at " + var2 + "," + var3 + " is missing block data, skipping");
               return null;
            }

            ha var7 = a(var1, var6.getMapTag("Level"));
            if(!var7.a(var2, var3)) {
               System.out.println("Chunk file at " + var2 + "," + var3 + " is in the wrong location; relocating. (Expected " + var2 + ", " + var3 + ", got " + var7.j + ", " + var7.k + ")");
               var6.putIntegerTag("xPos", var2);
               var6.putIntegerTag("zPos", var3);
               var7 = a(var1, var6.getMapTag("Level"));
            }

            return var7;
         } catch (Exception var8) {
            var8.printStackTrace();
         }
      }

      return null;
   }

   public void a(World var1, ha var2) {
      var1.lockOutputStreamFile();
      File var3 = this.a(var2.j, var2.k);
      if(var3.exists()) {
         var1.size -= var3.length();
      }

      try {
         File var4 = new File(this.a, "tmp_chunk.dat");
         FileOutputStream var5 = new FileOutputStream(var4);
         CompoundTag var6 = new CompoundTag();
         CompoundTag var7 = new CompoundTag();
         var6.putBaseTag("Level", (BaseTag)var7);
         this.a(var2, var1, var7);
         WorldIOStream.a(var6, (OutputStream)var5);
         var5.close();
         if(var3.exists()) {
            var3.delete();
         }

         var4.renameTo(var3);
         var1.size += var3.length();
      } catch (Exception var8) {
         var8.printStackTrace();
      }

   }

   public void a(ha var1, World var2, CompoundTag var3) {
      var2.lockOutputStreamFile();
      var3.putIntegerTag("xPos", var1.j);
      var3.putIntegerTag("zPos", var1.k);
      var3.putLongTag("LastUpdate", var2.lastTime);
      var3.putByteArrayTag("Blocks", var1.b);
      var3.putByteArrayTag("Data", var1.e.a);
      var3.putByteArrayTag("SkyLight", var1.f.a);
      var3.putByteArrayTag("BlockLight", var1.g.a);
      var3.putByteArrayTag("HeightMap", var1.h);
      var3.putBooleanTag("TerrainPopulated", var1.n);
      var1.r = false;
      ListTag var4 = new ListTag();

      Iterator var6;
      CompoundTag var8;
      for(int var5 = 0; var5 < var1.m.length; ++var5) {
         var6 = var1.m[var5].iterator();

         while(var6.hasNext()) {
            Entity var7 = (Entity)var6.next();
            var1.r = true;
            var8 = new CompoundTag();
            if(var7.c(var8)) {
               var4.a((BaseTag)var8);
            }
         }
      }

      var3.putBaseTag("Entities", (BaseTag)var4);
      ListTag var9 = new ListTag();
      var6 = var1.l.values().iterator();

      while(var6.hasNext()) {
         ji var10 = (ji)var6.next();
         var8 = new CompoundTag();
         var10.b(var8);
         var9.a((BaseTag)var8);
      }

      var3.putBaseTag("TileEntities", (BaseTag)var9);
   }

   public static ha a(World var0, CompoundTag var1) {
      int var2 = var1.getInteger("xPos");
      int var3 = var1.getInteger("zPos");
      ha var4 = new ha(var0, var2, var3);
      var4.b = var1.getByteArray("Blocks");
      var4.e = new oo(var1.getByteArray("Data"));
      var4.f = new oo(var1.getByteArray("SkyLight"));
      var4.g = new oo(var1.getByteArray("BlockLight"));
      var4.h = var1.getByteArray("HeightMap");
      var4.n = var1.getBoolean("TerrainPopulated");
      if(!var4.e.a()) {
         var4.e = new oo(var4.b.length);
      }

      if(var4.h == null || !var4.f.a()) {
         var4.h = new byte[256];
         var4.f = new oo(var4.b.length);
         var4.c();
      }

      if(!var4.g.a()) {
         var4.g = new oo(var4.b.length);
         var4.a();
      }

      ListTag var5 = var1.getListTag("Entities");
      if(var5 != null) {
         for(int var6 = 0; var6 < var5.c(); ++var6) {
            CompoundTag var7 = (CompoundTag)var5.a(var6);
            Entity var8 = fq.a(var7, var0);
            var4.r = true;
            if(var8 != null) {
               var4.a(var8);
            }
         }
      }

      ListTag var10 = var1.getListTag("TileEntities");
      if(var10 != null) {
         for(int var11 = 0; var11 < var10.c(); ++var11) {
            CompoundTag var12 = (CompoundTag)var10.a(var11);
            ji var9 = ji.c(var12);
            if(var9 != null) {
               var4.a(var9);
            }
         }
      }

      return var4;
   }

   public void a() {}

   public void b() {}

   public void b(World var1, ha var2) {}
}
