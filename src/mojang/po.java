package mojang;

import mojang.world.World;

import java.util.Random;

public class po {

   private ng e;
   private ng f;
   private ng g;
   public double[] a;
   public double[] b;
   public double[] c;
   public gg[] d;


   protected po() {}

   public po(World var1) {
      this.e = new ng(new Random(var1.worldSeed * 9871L), 4);
      this.f = new ng(new Random(var1.worldSeed * 39811L), 4);
      this.g = new ng(new Random(var1.worldSeed * 543321L), 2);
   }

   public gg a(qm var1) {
      return this.a(var1.a, var1.b);
   }

   public gg a(int var1, int var2) {
      return this.a(var1, var2, 1, 1)[0];
   }

   public double b(int var1, int var2) {
      this.a = this.e.a(this.a, (double)var1, (double)var2, 1, 1, 0.02500000037252903D, 0.02500000037252903D, 0.5D);
      return this.a[0];
   }

   public gg[] a(int var1, int var2, int var3, int var4) {
      this.d = this.a(this.d, var1, var2, var3, var4);
      return this.d;
   }

   public double[] a(double[] var1, int var2, int var3, int var4, int var5) {
      if(var1 == null || var1.length < var4 * var5) {
         var1 = new double[var4 * var5];
      }

      var1 = this.e.a(var1, (double)var2, (double)var3, var4, var4, 0.02500000037252903D, 0.02500000037252903D, 0.25D);
      this.c = this.g.a(this.c, (double)var2, (double)var3, var4, var4, 0.25D, 0.25D, 0.5882352941176471D);
      int var6 = 0;

      for(int var7 = 0; var7 < var4; ++var7) {
         for(int var8 = 0; var8 < var5; ++var8) {
            double var9 = this.c[var6] * 1.1D + 0.5D;
            double var11 = 0.01D;
            double var13 = 1.0D - var11;
            double var15 = (var1[var6] * 0.15D + 0.7D) * var13 + var9 * var11;
            var15 = 1.0D - (1.0D - var15) * (1.0D - var15);
            if(var15 < 0.0D) {
               var15 = 0.0D;
            }

            if(var15 > 1.0D) {
               var15 = 1.0D;
            }

            var1[var6] = var15;
            ++var6;
         }
      }

      return var1;
   }

   public gg[] a(gg[] var1, int var2, int var3, int var4, int var5) {
      if(var1 == null || var1.length < var4 * var5) {
         var1 = new gg[var4 * var5];
      }

      this.a = this.e.a(this.a, (double)var2, (double)var3, var4, var4, 0.02500000037252903D, 0.02500000037252903D, 0.25D);
      this.b = this.f.a(this.b, (double)var2, (double)var3, var4, var4, 0.05000000074505806D, 0.05000000074505806D, 0.3333333333333333D);
      this.c = this.g.a(this.c, (double)var2, (double)var3, var4, var4, 0.25D, 0.25D, 0.5882352941176471D);
      int var6 = 0;

      for(int var7 = 0; var7 < var4; ++var7) {
         for(int var8 = 0; var8 < var5; ++var8) {
            double var9 = this.c[var6] * 1.1D + 0.5D;
            double var11 = 0.01D;
            double var13 = 1.0D - var11;
            double var15 = (this.a[var6] * 0.15D + 0.7D) * var13 + var9 * var11;
            var11 = 0.002D;
            var13 = 1.0D - var11;
            double var17 = (this.b[var6] * 0.15D + 0.5D) * var13 + var9 * var11;
            var15 = 1.0D - (1.0D - var15) * (1.0D - var15);
            if(var15 < 0.0D) {
               var15 = 0.0D;
            }

            if(var17 < 0.0D) {
               var17 = 0.0D;
            }

            if(var15 > 1.0D) {
               var15 = 1.0D;
            }

            if(var17 > 1.0D) {
               var17 = 1.0D;
            }

            this.a[var6] = var15;
            this.b[var6] = var17;
            var1[var6++] = gg.a(var15, var17);
         }
      }

      return var1;
   }
}
