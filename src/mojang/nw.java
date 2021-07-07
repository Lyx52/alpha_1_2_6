package mojang;

import mojang.entity.vehicle.Boat;
import mojang.entity.Entity;

public class nw extends dx {

   public nw(int var1) {
      super(var1);
      this.aX = 1;
   }

   public fp a(fp var1, cy var2, eb var3) {
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
      nx var24 = var2.a(var13, var23, true);
      if(var24 == null) {
         return var1;
      } else {
         if(var24.a == 0) {
            int var25 = var24.b;
            int var26 = var24.c;
            int var27 = var24.d;
            if(!var2.z) {
               var2.a((Entity)(new Boat(var2, (double)((float)var25 + 0.5F), (double)((float)var26 + 1.5F), (double)((float)var27 + 0.5F))));
            }

            --var1.a;
         }

         return var1;
      }
   }
}
