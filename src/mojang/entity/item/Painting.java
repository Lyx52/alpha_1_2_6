package mojang.entity.item;

import mojang.*;
import mojang.entity.Entity;
import mojang.tags.CompoundTag;
import mojang.world.World;

import java.util.ArrayList;
import java.util.List;

public class Painting extends Entity {

   private int c;
   public int a;
   private int d;
   private int e;
   private int f;
   public fl b;


   public Painting(World var1) {
      super(var1);
      this.c = 0;
      this.a = 0;
      this.aO = 0.0F;
      this.a(0.5F, 0.5F);
   }

   public Painting(World var1, int var2, int var3, int var4, int var5) {
      this(var1);
      this.d = var2;
      this.e = var3;
      this.f = var4;
      ArrayList var6 = new ArrayList();
      fl[] var7 = fl.values();
      int var8 = var7.length;

      for(int var9 = 0; var9 < var8; ++var9) {
         fl var10 = var7[var9];
         this.b = var10;
         this.b(var5);
         if(this.k()) {
            var6.add(var10);
         }
      }

      if(var6.size() > 0) {
         this.b = (fl)var6.get(this.bd.nextInt(var6.size()));
      }

      this.b(var5);
   }

   public void b(int var1) {
      this.a = var1;
      this.aE = this.aC = (float)(var1 * 90);
      float var2 = (float)this.b.z;
      float var3 = (float)this.b.A;
      float var4 = (float)this.b.z;
      if(var1 != 0 && var1 != 2) {
         var2 = 0.5F;
      } else {
         var4 = 0.5F;
      }

      var2 /= 32.0F;
      var3 /= 32.0F;
      var4 /= 32.0F;
      float var5 = (float)this.d + 0.5F;
      float var6 = (float)this.e + 0.5F;
      float var7 = (float)this.f + 0.5F;
      float var8 = 0.5625F;
      if(var1 == 0) {
         var7 -= var8;
      }

      if(var1 == 1) {
         var5 -= var8;
      }

      if(var1 == 2) {
         var7 += var8;
      }

      if(var1 == 3) {
         var5 += var8;
      }

      if(var1 == 0) {
         var5 -= this.c(this.b.z);
      }

      if(var1 == 1) {
         var7 += this.c(this.b.z);
      }

      if(var1 == 2) {
         var5 += this.c(this.b.z);
      }

      if(var1 == 3) {
         var7 -= this.c(this.b.z);
      }

      var6 += this.c(this.b.A);
      this.b((double)var5, (double)var6, (double)var7);
      float var9 = -0.00625F;
      this.aG.c((double)(var5 - var2 - var9), (double)(var6 - var3 - var9), (double)(var7 - var4 - var9), (double)(var5 + var2 + var9), (double)(var6 + var3 + var9), (double)(var7 + var4 + var9));
   }

   private float c(int var1) {
      return var1 == 32?0.5F:(var1 == 64?0.5F:0.0F);
   }

   public void e_() {
      if(this.c++ == 100 && !this.k()) {
         this.c = 0;
         this.J();
         this.as.a((Entity)(new DroppedItem(this.as, this.aw, this.ax, this.ay, new fp(Item.aq))));
      }

   }

   public boolean k() {
      if(this.as.a((Entity)this, this.aG).size() > 0) {
         return false;
      } else {
         int var1 = this.b.z / 16;
         int var2 = this.b.A / 16;
         int var3 = this.d;
         int var4 = this.e;
         int var5 = this.f;
         if(this.a == 0) {
            var3 = fi.b(this.aw - (double)((float)this.b.z / 32.0F));
         }

         if(this.a == 1) {
            var5 = fi.b(this.ay - (double)((float)this.b.z / 32.0F));
         }

         if(this.a == 2) {
            var3 = fi.b(this.aw - (double)((float)this.b.z / 32.0F));
         }

         if(this.a == 3) {
            var5 = fi.b(this.ay - (double)((float)this.b.z / 32.0F));
         }

         var4 = fi.b(this.ax - (double)((float)this.b.A / 32.0F));

         int var7;
         for(int var6 = 0; var6 < var1; ++var6) {
            for(var7 = 0; var7 < var2; ++var7) {
               hb var8;
               if(this.a != 0 && this.a != 2) {
                  var8 = this.as.f(this.d, var4 + var7, var5 + var6);
               } else {
                  var8 = this.as.f(var3 + var6, var4 + var7, this.f);
               }

               if(!var8.a()) {
                  return false;
               }
            }
         }

         List var9 = this.as.b((Entity)this, this.aG);

         for(var7 = 0; var7 < var9.size(); ++var7) {
            if(var9.get(var7) instanceof Painting) {
               return false;
            }
         }

         return true;
      }
   }

   public boolean n_() {
      return true;
   }

   public boolean a(Entity var1, int var2) {
      this.J();
      this.M();
      this.as.a((Entity)(new DroppedItem(this.as, this.aw, this.ax, this.ay, new fp(Item.aq))));
      return true;
   }

   public void a(CompoundTag var1) {
      var1.putByteTag("Dir", (byte)this.a);
      var1.putStringTag("Motive", this.b.y);
      var1.putIntegerTag("TileX", this.d);
      var1.putIntegerTag("TileY", this.e);
      var1.putIntegerTag("TileZ", this.f);
   }

   public void b(CompoundTag var1) {
      this.a = var1.getByte("Dir");
      this.d = var1.getInteger("TileX");
      this.e = var1.getInteger("TileY");
      this.f = var1.getInteger("TileZ");
      String var2 = var1.getString("Motive");
      fl[] var3 = fl.values();
      int var4 = var3.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         fl var6 = var3[var5];
         if(var6.y.equals(var2)) {
            this.b = var6;
         }
      }

      if(this.b == null) {
         this.b = fl.a;
      }

      this.b(this.a);
   }
}
