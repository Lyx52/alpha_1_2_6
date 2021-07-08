package mojang;

import mojang.tags.CompoundTag;
import mojang.world.World;

import java.util.HashMap;
import java.util.Map;

public class ji {

   private static Map a = new HashMap();
   private static Map b = new HashMap();
   public World e;
   public int f;
   public int g;
   public int h;


   private static void a(Class var0, String var1) {
      if(b.containsKey(var1)) {
         throw new IllegalArgumentException("Duplicate id: " + var1);
      } else {
         a.put(var1, var0);
         b.put(var0, var1);
      }
   }

   public void a(CompoundTag var1) {
      this.f = var1.getInteger("x");
      this.g = var1.getInteger("y");
      this.h = var1.getInteger("z");
   }

   public void b(CompoundTag var1) {
      String var2 = (String)b.get(this.getClass());
      if(var2 == null) {
         throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
      } else {
         var1.putStringTag("id", var2);
         var1.putIntegerTag("x", this.f);
         var1.putIntegerTag("y", this.g);
         var1.putIntegerTag("z", this.h);
      }
   }

   public void b() {}

   @SuppressWarnings("deprecation")
   public static ji c(CompoundTag var0) {
      ji var1 = null;

      try {
         Class var2 = (Class)a.get(var0.getString("id"));
         if(var2 != null) {
            var1 = (ji)var2.newInstance();
         }
      } catch (Exception var3) {
         var3.printStackTrace();
      }

      if(var1 != null) {
         var1.a(var0);
      } else {
         System.out.println("Skipping TileEntity with id " + var0.getString("id"));
      }

      return var1;
   }

   public int f() {
      return this.e.e(this.f, this.g, this.h);
   }

   public void h() {
      this.e.b(this.f, this.g, this.h, this);
   }

   public double a(double var1, double var3, double var5) {
      double var7 = (double)this.f + 0.5D - var1;
      double var9 = (double)this.g + 0.5D - var3;
      double var11 = (double)this.h + 0.5D - var5;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public nq g() {
      return nq.m[this.e.a(this.f, this.g, this.h)];
   }

   static {
      a(lt.class, "Furnace");
      a(ga.class, "Chest");
      a(qc.class, "Sign");
      a(bl.class, "MobSpawner");
   }
}
