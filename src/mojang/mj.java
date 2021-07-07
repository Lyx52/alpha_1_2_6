package mojang;

import java.util.Random;

public class mj extends lh {

   private final boolean a;


   protected mj(int var1, boolean var2) {
      super(var1, hb.d);
      this.a = var2;
      this.bg = 45;
   }

   public int a(int var1, Random var2) {
      return aB.bh;
   }

   public void e(cy var1, int var2, int var3, int var4) {
      super.e(var1, var2, var3, var4);
      this.h(var1, var2, var3, var4);
   }

   private void h(cy var1, int var2, int var3, int var4) {
      int var5 = var1.a(var2, var3, var4 - 1);
      int var6 = var1.a(var2, var3, var4 + 1);
      int var7 = var1.a(var2 - 1, var3, var4);
      int var8 = var1.a(var2 + 1, var3, var4);
      byte var9 = 3;
      if(o[var5] && !o[var6]) {
         var9 = 3;
      }

      if(o[var6] && !o[var5]) {
         var9 = 2;
      }

      if(o[var7] && !o[var8]) {
         var9 = 5;
      }

      if(o[var8] && !o[var7]) {
         var9 = 4;
      }

      var1.b(var2, var3, var4, var9);
   }

   public int a(pk var1, int var2, int var3, int var4, int var5) {
      if(var5 == 1) {
         return t.bg;
      } else if(var5 == 0) {
         return t.bg;
      } else {
         int var6 = var1.e(var2, var3, var4);
         return var5 != var6?this.bg:(this.a?this.bg + 16:this.bg - 1);
      }
   }

   public void b(cy var1, int var2, int var3, int var4, Random var5) {
      if(this.a) {
         int var6 = var1.e(var2, var3, var4);
         float var7 = (float)var2 + 0.5F;
         float var8 = (float)var3 + 0.0F + var5.nextFloat() * 6.0F / 16.0F;
         float var9 = (float)var4 + 0.5F;
         float var10 = 0.52F;
         float var11 = var5.nextFloat() * 0.6F - 0.3F;
         if(var6 == 4) {
            var1.a("smoke", (double)(var7 - var10), (double)var8, (double)(var9 + var11), 0.0D, 0.0D, 0.0D);
            var1.a("flame", (double)(var7 - var10), (double)var8, (double)(var9 + var11), 0.0D, 0.0D, 0.0D);
         } else if(var6 == 5) {
            var1.a("smoke", (double)(var7 + var10), (double)var8, (double)(var9 + var11), 0.0D, 0.0D, 0.0D);
            var1.a("flame", (double)(var7 + var10), (double)var8, (double)(var9 + var11), 0.0D, 0.0D, 0.0D);
         } else if(var6 == 2) {
            var1.a("smoke", (double)(var7 + var11), (double)var8, (double)(var9 - var10), 0.0D, 0.0D, 0.0D);
            var1.a("flame", (double)(var7 + var11), (double)var8, (double)(var9 - var10), 0.0D, 0.0D, 0.0D);
         } else if(var6 == 3) {
            var1.a("smoke", (double)(var7 + var11), (double)var8, (double)(var9 + var10), 0.0D, 0.0D, 0.0D);
            var1.a("flame", (double)(var7 + var11), (double)var8, (double)(var9 + var10), 0.0D, 0.0D, 0.0D);
         }

      }
   }

   public int a(int var1) {
      return var1 == 1? t.bh:(var1 == 0? t.bh:(var1 == 3?this.bg - 1:this.bg));
   }

   public boolean a(cy var1, int var2, int var3, int var4, eb var5) {
      lt var6 = (lt)var1.b(var2, var3, var4);
      var5.a(var6);
      return true;
   }

   public static void a(boolean var0, cy var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      ji var6 = var1.b(var2, var3, var4);
      if(var0) {
         var1.d(var2, var3, var4, aC.bh);
      } else {
         var1.d(var2, var3, var4, aB.bh);
      }

      var1.b(var2, var3, var4, var5);
      var1.a(var2, var3, var4, var6);
   }

   protected ji a_() {
      return new lt();
   }

   public void a(cy var1, int var2, int var3, int var4, hf var5) {
      int var6 = fi.b((double)(var5.aC * 4.0F / 360.0F) + 0.5D) & 3;
      if(var6 == 0) {
         var1.b(var2, var3, var4, 2);
      }

      if(var6 == 1) {
         var1.b(var2, var3, var4, 5);
      }

      if(var6 == 2) {
         var1.b(var2, var3, var4, 3);
      }

      if(var6 == 3) {
         var1.b(var2, var3, var4, 4);
      }

   }
}
