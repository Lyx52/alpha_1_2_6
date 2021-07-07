package mojang;

import java.util.Random;

public class lu extends nq {

   private boolean a = true;


   public lu(int var1, int var2) {
      super(var1, var2, hb.n);
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.0625F, 1.0F);
   }

   public int a(int var1, int var2) {
      return this.bg + (var2 > 0?16:0);
   }

   public co d(cy var1, int var2, int var3, int var4) {
      return null;
   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public int g() {
      return 5;
   }

   public boolean a(cy var1, int var2, int var3, int var4) {
      return var1.g(var2, var3 - 1, var4);
   }

   private void h(cy var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      int var6 = 0;
      this.a = false;
      boolean var7 = var1.o(var2, var3, var4);
      this.a = true;
      int var8;
      int var9;
      int var10;
      if(var7) {
         var6 = 15;
      } else {
         for(var8 = 0; var8 < 4; ++var8) {
            var9 = var2;
            var10 = var4;
            if(var8 == 0) {
               var9 = var2 - 1;
            }

            if(var8 == 1) {
               ++var9;
            }

            if(var8 == 2) {
               var10 = var4 - 1;
            }

            if(var8 == 3) {
               ++var10;
            }

            var6 = this.g(var1, var9, var3, var10, var6);
            if(var1.g(var9, var3, var10) && !var1.g(var2, var3 + 1, var4)) {
               var6 = this.g(var1, var9, var3 + 1, var10, var6);
            } else if(!var1.g(var9, var3, var10)) {
               var6 = this.g(var1, var9, var3 - 1, var10, var6);
            }
         }

         if(var6 > 0) {
            --var6;
         } else {
            var6 = 0;
         }
      }

      if(var5 != var6) {
         var1.b(var2, var3, var4, var6);
         var1.b(var2, var3, var4, var2, var3, var4);
         if(var6 > 0) {
            --var6;
         }

         for(var8 = 0; var8 < 4; ++var8) {
            var9 = var2;
            var10 = var4;
            int var11 = var3 - 1;
            if(var8 == 0) {
               var9 = var2 - 1;
            }

            if(var8 == 1) {
               ++var9;
            }

            if(var8 == 2) {
               var10 = var4 - 1;
            }

            if(var8 == 3) {
               ++var10;
            }

            if(var1.g(var9, var3, var10)) {
               var11 += 2;
            }

            int var12 = this.g(var1, var9, var3, var10, -1);
            if(var12 >= 0 && var12 != var6) {
               this.h(var1, var9, var3, var10);
            }

            var12 = this.g(var1, var9, var11, var10, -1);
            if(var12 >= 0 && var12 != var6) {
               this.h(var1, var9, var11, var10);
            }
         }

         if(var5 == 0 || var6 == 0) {
            var1.g(var2, var3, var4, this.bh);
            var1.g(var2 - 1, var3, var4, this.bh);
            var1.g(var2 + 1, var3, var4, this.bh);
            var1.g(var2, var3, var4 - 1, this.bh);
            var1.g(var2, var3, var4 + 1, this.bh);
            var1.g(var2, var3 - 1, var4, this.bh);
            var1.g(var2, var3 + 1, var4, this.bh);
         }
      }

   }

   private void i(cy var1, int var2, int var3, int var4) {
      if(var1.a(var2, var3, var4) == this.bh) {
         var1.g(var2, var3, var4, this.bh);
         var1.g(var2 - 1, var3, var4, this.bh);
         var1.g(var2 + 1, var3, var4, this.bh);
         var1.g(var2, var3, var4 - 1, this.bh);
         var1.g(var2, var3, var4 + 1, this.bh);
         var1.g(var2, var3 - 1, var4, this.bh);
         var1.g(var2, var3 + 1, var4, this.bh);
      }
   }

   public void e(cy var1, int var2, int var3, int var4) {
      super.e(var1, var2, var3, var4);
      if(!var1.z) {
         this.h(var1, var2, var3, var4);
         var1.g(var2, var3 + 1, var4, this.bh);
         var1.g(var2, var3 - 1, var4, this.bh);
         this.i(var1, var2 - 1, var3, var4);
         this.i(var1, var2 + 1, var3, var4);
         this.i(var1, var2, var3, var4 - 1);
         this.i(var1, var2, var3, var4 + 1);
         if(var1.g(var2 - 1, var3, var4)) {
            this.i(var1, var2 - 1, var3 + 1, var4);
         } else {
            this.i(var1, var2 - 1, var3 - 1, var4);
         }

         if(var1.g(var2 + 1, var3, var4)) {
            this.i(var1, var2 + 1, var3 + 1, var4);
         } else {
            this.i(var1, var2 + 1, var3 - 1, var4);
         }

         if(var1.g(var2, var3, var4 - 1)) {
            this.i(var1, var2, var3 + 1, var4 - 1);
         } else {
            this.i(var1, var2, var3 - 1, var4 - 1);
         }

         if(var1.g(var2, var3, var4 + 1)) {
            this.i(var1, var2, var3 + 1, var4 + 1);
         } else {
            this.i(var1, var2, var3 - 1, var4 + 1);
         }

      }
   }

   public void b(cy var1, int var2, int var3, int var4) {
      super.b(var1, var2, var3, var4);
      if(!var1.z) {
         var1.g(var2, var3 + 1, var4, this.bh);
         var1.g(var2, var3 - 1, var4, this.bh);
         this.h(var1, var2, var3, var4);
         this.i(var1, var2 - 1, var3, var4);
         this.i(var1, var2 + 1, var3, var4);
         this.i(var1, var2, var3, var4 - 1);
         this.i(var1, var2, var3, var4 + 1);
         if(var1.g(var2 - 1, var3, var4)) {
            this.i(var1, var2 - 1, var3 + 1, var4);
         } else {
            this.i(var1, var2 - 1, var3 - 1, var4);
         }

         if(var1.g(var2 + 1, var3, var4)) {
            this.i(var1, var2 + 1, var3 + 1, var4);
         } else {
            this.i(var1, var2 + 1, var3 - 1, var4);
         }

         if(var1.g(var2, var3, var4 - 1)) {
            this.i(var1, var2, var3 + 1, var4 - 1);
         } else {
            this.i(var1, var2, var3 - 1, var4 - 1);
         }

         if(var1.g(var2, var3, var4 + 1)) {
            this.i(var1, var2, var3 + 1, var4 + 1);
         } else {
            this.i(var1, var2, var3 - 1, var4 + 1);
         }

      }
   }

   private int g(cy var1, int var2, int var3, int var4, int var5) {
      if(var1.a(var2, var3, var4) != this.bh) {
         return var5;
      } else {
         int var6 = var1.e(var2, var3, var4);
         return var6 > var5?var6:var5;
      }
   }

   public void a(cy var1, int var2, int var3, int var4, int var5) {
      if(!var1.z) {
         int var6 = var1.e(var2, var3, var4);
         boolean var7 = this.a(var1, var2, var3, var4);
         if(!var7) {
            this.b_(var1, var2, var3, var4, var6);
            var1.d(var2, var3, var4, 0);
         } else {
            this.h(var1, var2, var3, var4);
         }

         super.a(var1, var2, var3, var4, var5);
      }
   }

   public int a(int var1, Random var2) {
      return dx.aA.aW;
   }

   public boolean c(cy var1, int var2, int var3, int var4, int var5) {
      return !this.a?false:this.c((pk)var1, var2, var3, var4, var5);
   }

   public boolean c(pk var1, int var2, int var3, int var4, int var5) {
      if(!this.a) {
         return false;
      } else if(var1.e(var2, var3, var4) == 0) {
         return false;
      } else if(var5 == 1) {
         return true;
      } else {
         boolean var6 = c(var1, var2 - 1, var3, var4) || !var1.g(var2 - 1, var3, var4) && c(var1, var2 - 1, var3 - 1, var4);
         boolean var7 = c(var1, var2 + 1, var3, var4) || !var1.g(var2 + 1, var3, var4) && c(var1, var2 + 1, var3 - 1, var4);
         boolean var8 = c(var1, var2, var3, var4 - 1) || !var1.g(var2, var3, var4 - 1) && c(var1, var2, var3 - 1, var4 - 1);
         boolean var9 = c(var1, var2, var3, var4 + 1) || !var1.g(var2, var3, var4 + 1) && c(var1, var2, var3 - 1, var4 + 1);
         if(!var1.g(var2, var3 + 1, var4)) {
            if(var1.g(var2 - 1, var3, var4) && c(var1, var2 - 1, var3 + 1, var4)) {
               var6 = true;
            }

            if(var1.g(var2 + 1, var3, var4) && c(var1, var2 + 1, var3 + 1, var4)) {
               var7 = true;
            }

            if(var1.g(var2, var3, var4 - 1) && c(var1, var2, var3 + 1, var4 - 1)) {
               var8 = true;
            }

            if(var1.g(var2, var3, var4 + 1) && c(var1, var2, var3 + 1, var4 + 1)) {
               var9 = true;
            }
         }

         return !var8 && !var7 && !var6 && !var9 && var5 >= 2 && var5 <= 5?true:(var5 == 2 && var8 && !var6 && !var7?true:(var5 == 3 && var9 && !var6 && !var7?true:(var5 == 4 && var6 && !var8 && !var9?true:var5 == 5 && var7 && !var8 && !var9)));
      }
   }

   public boolean e() {
      return this.a;
   }

   public void b(cy var1, int var2, int var3, int var4, Random var5) {
      if(var1.e(var2, var3, var4) > 0) {
         double var6 = (double)var2 + 0.5D + ((double)var5.nextFloat() - 0.5D) * 0.2D;
         double var8 = (double)((float)var3 + 0.0625F);
         double var10 = (double)var4 + 0.5D + ((double)var5.nextFloat() - 0.5D) * 0.2D;
         var1.a("reddust", var6, var8, var10, 0.0D, 0.0D, 0.0D);
      }

   }

   public static boolean c(pk var0, int var1, int var2, int var3) {
      int var4 = var0.a(var1, var2, var3);
      return var4 == av.bh?true:(var4 == 0?false: m[var4].e());
   }
}
