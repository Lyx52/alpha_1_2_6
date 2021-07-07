import java.util.Random;

public class c extends lh {

   private Random a = new Random();


   protected c(int var1) {
      super(var1, hb.c);
      this.bg = 26;
   }

   public int a(pk var1, int var2, int var3, int var4, int var5) {
      if(var5 == 1) {
         return this.bg - 1;
      } else if(var5 == 0) {
         return this.bg - 1;
      } else {
         int var6 = var1.a(var2, var3, var4 - 1);
         int var7 = var1.a(var2, var3, var4 + 1);
         int var8 = var1.a(var2 - 1, var3, var4);
         int var9 = var1.a(var2 + 1, var3, var4);
         int var10;
         int var11;
         int var12;
         byte var13;
         if(var6 != this.bh && var7 != this.bh) {
            if(var8 != this.bh && var9 != this.bh) {
               byte var14 = 3;
               if(nq.o[var6] && !nq.o[var7]) {
                  var14 = 3;
               }

               if(nq.o[var7] && !nq.o[var6]) {
                  var14 = 2;
               }

               if(nq.o[var8] && !nq.o[var9]) {
                  var14 = 5;
               }

               if(nq.o[var9] && !nq.o[var8]) {
                  var14 = 4;
               }

               return var5 == var14?this.bg + 1:this.bg;
            } else if(var5 != 4 && var5 != 5) {
               var10 = 0;
               if(var8 == this.bh) {
                  var10 = -1;
               }

               var11 = var1.a(var8 == this.bh?var2 - 1:var2 + 1, var3, var4 - 1);
               var12 = var1.a(var8 == this.bh?var2 - 1:var2 + 1, var3, var4 + 1);
               if(var5 == 3) {
                  var10 = -1 - var10;
               }

               var13 = 3;
               if((nq.o[var6] || nq.o[var11]) && !nq.o[var7] && !nq.o[var12]) {
                  var13 = 3;
               }

               if((nq.o[var7] || nq.o[var12]) && !nq.o[var6] && !nq.o[var11]) {
                  var13 = 2;
               }

               return (var5 == var13?this.bg + 16:this.bg + 32) + var10;
            } else {
               return this.bg;
            }
         } else if(var5 != 2 && var5 != 3) {
            var10 = 0;
            if(var6 == this.bh) {
               var10 = -1;
            }

            var11 = var1.a(var2 - 1, var3, var6 == this.bh?var4 - 1:var4 + 1);
            var12 = var1.a(var2 + 1, var3, var6 == this.bh?var4 - 1:var4 + 1);
            if(var5 == 4) {
               var10 = -1 - var10;
            }

            var13 = 5;
            if((nq.o[var8] || nq.o[var11]) && !nq.o[var9] && !nq.o[var12]) {
               var13 = 5;
            }

            if((nq.o[var9] || nq.o[var12]) && !nq.o[var8] && !nq.o[var11]) {
               var13 = 4;
            }

            return (var5 == var13?this.bg + 16:this.bg + 32) + var10;
         } else {
            return this.bg;
         }
      }
   }

   public int a(int var1) {
      return var1 == 1?this.bg - 1:(var1 == 0?this.bg - 1:(var1 == 3?this.bg + 1:this.bg));
   }

   public boolean a(cy var1, int var2, int var3, int var4) {
      int var5 = 0;
      if(var1.a(var2 - 1, var3, var4) == this.bh) {
         ++var5;
      }

      if(var1.a(var2 + 1, var3, var4) == this.bh) {
         ++var5;
      }

      if(var1.a(var2, var3, var4 - 1) == this.bh) {
         ++var5;
      }

      if(var1.a(var2, var3, var4 + 1) == this.bh) {
         ++var5;
      }

      return var5 > 1?false:(this.h(var1, var2 - 1, var3, var4)?false:(this.h(var1, var2 + 1, var3, var4)?false:(this.h(var1, var2, var3, var4 - 1)?false:!this.h(var1, var2, var3, var4 + 1))));
   }

   private boolean h(cy var1, int var2, int var3, int var4) {
      return var1.a(var2, var3, var4) != this.bh?false:(var1.a(var2 - 1, var3, var4) == this.bh?true:(var1.a(var2 + 1, var3, var4) == this.bh?true:(var1.a(var2, var3, var4 - 1) == this.bh?true:var1.a(var2, var3, var4 + 1) == this.bh)));
   }

   public void b(cy var1, int var2, int var3, int var4) {
      ga var5 = (ga)var1.b(var2, var3, var4);

      for(int var6 = 0; var6 < var5.c(); ++var6) {
         fp var7 = var5.c(var6);
         if(var7 != null) {
            float var8 = this.a.nextFloat() * 0.8F + 0.1F;
            float var9 = this.a.nextFloat() * 0.8F + 0.1F;
            float var10 = this.a.nextFloat() * 0.8F + 0.1F;

            while(var7.a > 0) {
               int var11 = this.a.nextInt(21) + 10;
               if(var11 > var7.a) {
                  var11 = var7.a;
               }

               var7.a -= var11;
               eo var12 = new eo(var1, (double)((float)var2 + var8), (double)((float)var3 + var9), (double)((float)var4 + var10), new fp(var7.c, var11, var7.d));
               float var13 = 0.05F;
               var12.az = (double)((float)this.a.nextGaussian() * var13);
               var12.aA = (double)((float)this.a.nextGaussian() * var13 + 0.2F);
               var12.aB = (double)((float)this.a.nextGaussian() * var13);
               var1.a((lw)var12);
            }
         }
      }

      super.b(var1, var2, var3, var4);
   }

   public boolean a(cy var1, int var2, int var3, int var4, eb var5) {
      Object var6 = (ga)var1.b(var2, var3, var4);
      if(var1.g(var2, var3 + 1, var4)) {
         return true;
      } else if(var1.a(var2 - 1, var3, var4) == this.bh && var1.g(var2 - 1, var3 + 1, var4)) {
         return true;
      } else if(var1.a(var2 + 1, var3, var4) == this.bh && var1.g(var2 + 1, var3 + 1, var4)) {
         return true;
      } else if(var1.a(var2, var3, var4 - 1) == this.bh && var1.g(var2, var3 + 1, var4 - 1)) {
         return true;
      } else if(var1.a(var2, var3, var4 + 1) == this.bh && var1.g(var2, var3 + 1, var4 + 1)) {
         return true;
      } else {
         if(var1.a(var2 - 1, var3, var4) == this.bh) {
            var6 = new ix("Large chest", (ga)var1.b(var2 - 1, var3, var4), (hi)var6);
         }

         if(var1.a(var2 + 1, var3, var4) == this.bh) {
            var6 = new ix("Large chest", (hi)var6, (ga)var1.b(var2 + 1, var3, var4));
         }

         if(var1.a(var2, var3, var4 - 1) == this.bh) {
            var6 = new ix("Large chest", (ga)var1.b(var2, var3, var4 - 1), (hi)var6);
         }

         if(var1.a(var2, var3, var4 + 1) == this.bh) {
            var6 = new ix("Large chest", (hi)var6, (ga)var1.b(var2, var3, var4 + 1));
         }

         var5.a((hi)var6);
         return true;
      }
   }

   protected ji a_() {
      return new ga();
   }
}
