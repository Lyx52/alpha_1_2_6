package mojang;

import mojang.entity.Entity;

import java.util.Random;

public abstract class ld extends nq {

   protected ld(int var1, hb var2) {
      super(var1, (var2 == hb.g?14:12) * 16 + 13, var2);
      float var3 = 0.0F;
      float var4 = 0.0F;
      this.a(0.0F + var4, 0.0F + var3, 0.0F + var4, 1.0F + var4, 1.0F + var3, 1.0F + var4);
      this.b(true);
   }

   public static float b(int var0) {
      if(var0 >= 8) {
         var0 = 0;
      }

      float var1 = (float)(var0 + 1) / 9.0F;
      return var1;
   }

   public int a(int var1) {
      return var1 != 0 && var1 != 1?this.bg + 1:this.bg;
   }

   protected int h(cy var1, int var2, int var3, int var4) {
      return var1.f(var2, var3, var4) != this.bs?-1:var1.e(var2, var3, var4);
   }

   protected int c(pk var1, int var2, int var3, int var4) {
      if(var1.f(var2, var3, var4) != this.bs) {
         return -1;
      } else {
         int var5 = var1.e(var2, var3, var4);
         if(var5 >= 8) {
            var5 = 0;
         }

         return var5;
      }
   }

   public boolean b() {
      return false;
   }

   public boolean a() {
      return false;
   }

   public boolean a(int var1, boolean var2) {
      return var2 && var1 == 0;
   }

   public boolean b(pk var1, int var2, int var3, int var4, int var5) {
      hb var6 = var1.f(var2, var3, var4);
      return var6 == this.bs?false:(var6 == hb.r?false:(var5 == 1?true:super.b(var1, var2, var3, var4, var5)));
   }

   public co d(cy var1, int var2, int var3, int var4) {
      return null;
   }

   public int g() {
      return 4;
   }

   public int a(int var1, Random var2) {
      return 0;
   }

   public int a(Random var1) {
      return 0;
   }

   private ao e(pk var1, int var2, int var3, int var4) {
      ao var5 = mojang.ao.b(0.0D, 0.0D, 0.0D);
      int var6 = this.c(var1, var2, var3, var4);

      for(int var7 = 0; var7 < 4; ++var7) {
         int var8 = var2;
         int var10 = var4;
         if(var7 == 0) {
            var8 = var2 - 1;
         }

         if(var7 == 1) {
            var10 = var4 - 1;
         }

         if(var7 == 2) {
            ++var8;
         }

         if(var7 == 3) {
            ++var10;
         }

         int var11 = this.c(var1, var8, var3, var10);
         int var12;
         if(var11 < 0) {
            if(!var1.f(var8, var3, var10).c()) {
               var11 = this.c(var1, var8, var3 - 1, var10);
               if(var11 >= 0) {
                  var12 = var11 - (var6 - 8);
                  var5 = var5.c((double)((var8 - var2) * var12), (double)((var3 - var3) * var12), (double)((var10 - var4) * var12));
               }
            }
         } else if(var11 >= 0) {
            var12 = var11 - var6;
            var5 = var5.c((double)((var8 - var2) * var12), (double)((var3 - var3) * var12), (double)((var10 - var4) * var12));
         }
      }

      if(var1.e(var2, var3, var4) >= 8) {
         boolean var13 = false;
         if(var13 || this.b(var1, var2, var3, var4 - 1, 2)) {
            var13 = true;
         }

         if(var13 || this.b(var1, var2, var3, var4 + 1, 3)) {
            var13 = true;
         }

         if(var13 || this.b(var1, var2 - 1, var3, var4, 4)) {
            var13 = true;
         }

         if(var13 || this.b(var1, var2 + 1, var3, var4, 5)) {
            var13 = true;
         }

         if(var13 || this.b(var1, var2, var3 + 1, var4 - 1, 2)) {
            var13 = true;
         }

         if(var13 || this.b(var1, var2, var3 + 1, var4 + 1, 3)) {
            var13 = true;
         }

         if(var13 || this.b(var1, var2 - 1, var3 + 1, var4, 4)) {
            var13 = true;
         }

         if(var13 || this.b(var1, var2 + 1, var3 + 1, var4, 5)) {
            var13 = true;
         }

         if(var13) {
            var5 = var5.b().c(0.0D, -6.0D, 0.0D);
         }
      }

      var5 = var5.b();
      return var5;
   }

   public void a(cy var1, int var2, int var3, int var4, Entity var5, ao var6) {
      ao var7 = this.e((pk)var1, var2, var3, var4);
      var6.a += var7.a;
      var6.b += var7.b;
      var6.c += var7.c;
   }

   public int d() {
      return this.bs == hb.f?5:(this.bs == hb.g?30:0);
   }

   public float d(pk var1, int var2, int var3, int var4) {
      float var5 = var1.c(var2, var3, var4);
      float var6 = var1.c(var2, var3 + 1, var4);
      return var5 > var6?var5:var6;
   }

   public void a(cy var1, int var2, int var3, int var4, Random var5) {
      super.a(var1, var2, var3, var4, var5);
   }

   public int c() {
      return this.bs == hb.f?1:0;
   }

   public void b(cy var1, int var2, int var3, int var4, Random var5) {
      if(this.bs == hb.f && var5.nextInt(64) == 0) {
         int var6 = var1.e(var2, var3, var4);
         if(var6 > 0 && var6 < 8) {
            var1.a((double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), "liquid.water", var5.nextFloat() * 0.25F + 0.75F, var5.nextFloat() * 1.0F + 0.5F);
         }
      }

      if(this.bs == hb.g && var1.f(var2, var3 + 1, var4) == hb.a && !var1.g(var2, var3 + 1, var4) && var5.nextInt(100) == 0) {
         double var12 = (double)((float)var2 + var5.nextFloat());
         double var8 = (double)var3 + this.bo;
         double var10 = (double)((float)var4 + var5.nextFloat());
         var1.a("lava", var12, var8, var10, 0.0D, 0.0D, 0.0D);
      }

   }

   public static double a(pk var0, int var1, int var2, int var3, hb var4) {
      ao var5 = null;
      if(var4 == hb.f) {
         var5 = ((ld) A).e(var0, var1, var2, var3);
      }

      if(var4 == hb.g) {
         var5 = ((ld) C).e(var0, var1, var2, var3);
      }

      return var5.a == 0.0D && var5.c == 0.0D?-1000.0D:Math.atan2(var5.c, var5.a) - 1.5707963267948966D;
   }

   public void e(cy var1, int var2, int var3, int var4) {
      this.j(var1, var2, var3, var4);
   }

   public void a(cy var1, int var2, int var3, int var4, int var5) {
      this.j(var1, var2, var3, var4);
   }

   private void j(cy var1, int var2, int var3, int var4) {
      if(var1.a(var2, var3, var4) == this.bh) {
         if(this.bs == hb.g) {
            boolean var5 = false;
            if(var5 || var1.f(var2, var3, var4 - 1) == hb.f) {
               var5 = true;
            }

            if(var5 || var1.f(var2, var3, var4 + 1) == hb.f) {
               var5 = true;
            }

            if(var5 || var1.f(var2 - 1, var3, var4) == hb.f) {
               var5 = true;
            }

            if(var5 || var1.f(var2 + 1, var3, var4) == hb.f) {
               var5 = true;
            }

            if(var5 || var1.f(var2, var3 + 1, var4) == hb.f) {
               var5 = true;
            }

            if(var5) {
               int var6 = var1.e(var2, var3, var4);
               if(var6 == 0) {
                  var1.d(var2, var3, var4, ap.bh);
               } else if(var6 <= 4) {
                  var1.d(var2, var3, var4, w.bh);
               }

               this.i(var1, var2, var3, var4);
            }
         }

      }
   }

   protected void i(cy var1, int var2, int var3, int var4) {
      var1.a((double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), "random.fizz", 0.5F, 2.6F + (var1.l.nextFloat() - var1.l.nextFloat()) * 0.8F);

      for(int var5 = 0; var5 < 8; ++var5) {
         var1.a("largesmoke", (double)var2 + Math.random(), (double)var3 + 1.2D, (double)var4 + Math.random(), 0.0D, 0.0D, 0.0D);
      }

   }
}
