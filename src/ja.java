import java.util.Random;

public class ja extends ld {

   int a = 0;
   boolean[] b = new boolean[4];
   int[] c = new int[4];


   protected ja(int var1, hb var2) {
      super(var1, var2);
   }

   private void j(cy var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      var1.a(var2, var3, var4, this.bh + 1, var5);
      var1.b(var2, var3, var4, var2, var3, var4);
      var1.h(var2, var3, var4);
   }

   public void a(cy var1, int var2, int var3, int var4, Random var5) {
      int var6 = this.h(var1, var2, var3, var4);
      byte var7 = 1;
      if(this.bs == hb.g && !var1.q.d) {
         var7 = 2;
      }

      boolean var8 = true;
      int var10;
      if(var6 > 0) {
         byte var9 = -100;
         this.a = 0;
         int var12 = this.f(var1, var2 - 1, var3, var4, var9);
         var12 = this.f(var1, var2 + 1, var3, var4, var12);
         var12 = this.f(var1, var2, var3, var4 - 1, var12);
         var12 = this.f(var1, var2, var3, var4 + 1, var12);
         var10 = var12 + var7;
         if(var10 >= 8 || var12 < 0) {
            var10 = -1;
         }

         if(this.h(var1, var2, var3 + 1, var4) >= 0) {
            int var11 = this.h(var1, var2, var3 + 1, var4);
            if(var11 >= 8) {
               var10 = var11;
            } else {
               var10 = var11 + 8;
            }
         }

         if(this.a >= 2 && this.bs == hb.f) {
            if(var1.g(var2, var3 - 1, var4)) {
               var10 = 0;
            } else if(var1.f(var2, var3 - 1, var4) == this.bs && var1.e(var2, var3, var4) == 0) {
               var10 = 0;
            }
         }

         if(this.bs == hb.g && var6 < 8 && var10 < 8 && var10 > var6 && var5.nextInt(4) != 0) {
            var10 = var6;
            var8 = false;
         }

         if(var10 != var6) {
            var6 = var10;
            if(var10 < 0) {
               var1.d(var2, var3, var4, 0);
            } else {
               var1.b(var2, var3, var4, var10);
               var1.h(var2, var3, var4, this.bh);
               var1.g(var2, var3, var4, this.bh);
            }
         } else if(var8) {
            this.j(var1, var2, var3, var4);
         }
      } else {
         this.j(var1, var2, var3, var4);
      }

      if(this.m(var1, var2, var3 - 1, var4)) {
         if(var6 >= 8) {
            var1.b(var2, var3 - 1, var4, this.bh, var6);
         } else {
            var1.b(var2, var3 - 1, var4, this.bh, var6 + 8);
         }
      } else if(var6 >= 0 && (var6 == 0 || this.l(var1, var2, var3 - 1, var4))) {
         boolean[] var13 = this.k(var1, var2, var3, var4);
         var10 = var6 + var7;
         if(var6 >= 8) {
            var10 = 1;
         }

         if(var10 >= 8) {
            return;
         }

         if(var13[0]) {
            this.g(var1, var2 - 1, var3, var4, var10);
         }

         if(var13[1]) {
            this.g(var1, var2 + 1, var3, var4, var10);
         }

         if(var13[2]) {
            this.g(var1, var2, var3, var4 - 1, var10);
         }

         if(var13[3]) {
            this.g(var1, var2, var3, var4 + 1, var10);
         }
      }

   }

   private void g(cy var1, int var2, int var3, int var4, int var5) {
      if(this.m(var1, var2, var3, var4)) {
         int var6 = var1.a(var2, var3, var4);
         if(var6 > 0) {
            if(this.bs == hb.g) {
               this.i(var1, var2, var3, var4);
            } else {
               nq.m[var6].b_(var1, var2, var3, var4, var1.e(var2, var3, var4));
            }
         }

         var1.b(var2, var3, var4, this.bh, var5);
      }

   }

   private int a(cy var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = 1000;

      for(int var8 = 0; var8 < 4; ++var8) {
         if((var8 != 0 || var6 != 1) && (var8 != 1 || var6 != 0) && (var8 != 2 || var6 != 3) && (var8 != 3 || var6 != 2)) {
            int var9 = var2;
            int var11 = var4;
            if(var8 == 0) {
               var9 = var2 - 1;
            }

            if(var8 == 1) {
               ++var9;
            }

            if(var8 == 2) {
               var11 = var4 - 1;
            }

            if(var8 == 3) {
               ++var11;
            }

            if(!this.l(var1, var9, var3, var11) && (var1.f(var9, var3, var11) != this.bs || var1.e(var9, var3, var11) != 0)) {
               if(!this.l(var1, var9, var3 - 1, var11)) {
                  return var5;
               }

               if(var5 < 4) {
                  int var12 = this.a(var1, var9, var3, var11, var5 + 1, var8);
                  if(var12 < var7) {
                     var7 = var12;
                  }
               }
            }
         }
      }

      return var7;
   }

   private boolean[] k(cy var1, int var2, int var3, int var4) {
      int var5;
      int var6;
      for(var5 = 0; var5 < 4; ++var5) {
         this.c[var5] = 1000;
         var6 = var2;
         int var8 = var4;
         if(var5 == 0) {
            var6 = var2 - 1;
         }

         if(var5 == 1) {
            ++var6;
         }

         if(var5 == 2) {
            var8 = var4 - 1;
         }

         if(var5 == 3) {
            ++var8;
         }

         if(!this.l(var1, var6, var3, var8) && (var1.f(var6, var3, var8) != this.bs || var1.e(var6, var3, var8) != 0)) {
            if(!this.l(var1, var6, var3 - 1, var8)) {
               this.c[var5] = 0;
            } else {
               this.c[var5] = this.a(var1, var6, var3, var8, 1, var5);
            }
         }
      }

      var5 = this.c[0];

      for(var6 = 1; var6 < 4; ++var6) {
         if(this.c[var6] < var5) {
            var5 = this.c[var6];
         }
      }

      for(var6 = 0; var6 < 4; ++var6) {
         this.b[var6] = this.c[var6] == var5;
      }

      return this.b;
   }

   private boolean l(cy var1, int var2, int var3, int var4) {
      int var5 = var1.a(var2, var3, var4);
      if(var5 != nq.aE.bh && var5 != nq.aL.bh && var5 != nq.aD.bh && var5 != nq.aF.bh && var5 != nq.aX.bh) {
         if(var5 == 0) {
            return false;
         } else {
            hb var6 = nq.m[var5].bs;
            return var6.a();
         }
      } else {
         return true;
      }
   }

   protected int f(cy var1, int var2, int var3, int var4, int var5) {
      int var6 = this.h(var1, var2, var3, var4);
      if(var6 < 0) {
         return var5;
      } else {
         if(var6 == 0) {
            ++this.a;
         }

         if(var6 >= 8) {
            var6 = 0;
         }

         return var5 >= 0 && var6 >= var5?var5:var6;
      }
   }

   private boolean m(cy var1, int var2, int var3, int var4) {
      hb var5 = var1.f(var2, var3, var4);
      return var5 == this.bs?false:(var5 == hb.g?false:!this.l(var1, var2, var3, var4));
   }

   public void e(cy var1, int var2, int var3, int var4) {
      super.e(var1, var2, var3, var4);
      if(var1.a(var2, var3, var4) == this.bh) {
         var1.h(var2, var3, var4, this.bh);
      }

   }
}
