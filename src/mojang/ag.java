package mojang;

import mojang.entity.animal.Cow;
import mojang.world.World;

public class ag extends Item {

   private int a;


   public ag(int var1, int var2) {
      super(var1);
      this.aX = 1;
      this.aY = 64;
      this.a = var2;
   }

   public fp a(fp var1, World var2, eb var3) {
      float var4 = 1.0F;
      float var5 = var3.aF + (var3.aD - var3.aF) * var4;
      float var6 = var3.aE + (var3.aC - var3.aE) * var4;
      double var7 = var3.at + (var3.aw - var3.at) * (double)var4;
      double var9 = var3.au + (var3.ax - var3.au) * (double)var4 + 1.62D - (double)var3.aO;
      double var11 = var3.av + (var3.ay - var3.av) * (double)var4;
      ao var13 = mojang.ao.b(var7, var9, var11);
      float var14 = fi.b(-var6 * 0.017453292F - 3.1415927F);
      float var15 = fi.a(-var6 * 0.017453292F - 3.1415927F);
      float var16 = -fi.b(-var5 * 0.017453292F);
      float var17 = fi.a(-var5 * 0.017453292F);
      float var18 = var15 * var16;
      float var20 = var14 * var16;
      double var21 = 5.0D;
      ao var23 = var13.c((double)var18 * var21, (double)var17 * var21, (double)var20 * var21);
      nx var24 = var2.a(var13, var23, this.a == 0);
      if(var24 == null) {
         return var1;
      } else {
         if(var24.a == 0) {
            int var25 = var24.b;
            int var26 = var24.c;
            int var27 = var24.d;
            if(!var2.a(var3, var25, var26, var27)) {
               return var1;
            }

            if(this.a == 0) {
               if(var2.f(var25, var26, var27) == hb.f && var2.e(var25, var26, var27) == 0) {
                  var2.d(var25, var26, var27, 0);
                  return new fp(av);
               }

               if(var2.f(var25, var26, var27) == hb.g && var2.e(var25, var26, var27) == 0) {
                  var2.d(var25, var26, var27, 0);
                  return new fp(aw);
               }
            } else {
               if(this.a < 0) {
                  return new fp(au);
               }

               if(var24.e == 0) {
                  --var26;
               }

               if(var24.e == 1) {
                  ++var26;
               }

               if(var24.e == 2) {
                  --var27;
               }

               if(var24.e == 3) {
                  ++var27;
               }

               if(var24.e == 4) {
                  --var25;
               }

               if(var24.e == 5) {
                  ++var25;
               }

               if(var2.a(var25, var26, var27) == 0 || !var2.f(var25, var26, var27).a()) {
                  if(var2.currentDimension.d && this.a == nq.A.bh) {
                     var2.a(var7 + 0.5D, var9 + 0.5D, var11 + 0.5D, "random.fizz", 0.5F, 2.6F + (var2.l.nextFloat() - var2.l.nextFloat()) * 0.8F);

                     for(int var28 = 0; var28 < 8; ++var28) {
                        var2.a("largesmoke", (double)var25 + Math.random(), (double)var26 + Math.random(), (double)var27 + Math.random(), 0.0D, 0.0D, 0.0D);
                     }
                  } else {
                     var2.b(var25, var26, var27, this.a, 0);
                  }

                  return new fp(au);
               }
            }
         } else if(this.a == 0 && var24.g instanceof Cow) {
            return new fp(aE);
         }

         return var1;
      }
   }
}
