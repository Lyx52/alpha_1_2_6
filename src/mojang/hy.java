package mojang;

import mojang.world.World;

import java.util.Random;

public class hy extends js {

   private int a;
   private int b;


   public hy(int var1) {
      this.a = nq.aW.bh;
      this.b = var1;
   }

   public boolean a(World var1, Random var2, int var3, int var4, int var5) {
      if(var1.f(var3, var4, var5) != hb.f) {
         return false;
      } else {
         float var6 = var2.nextFloat() * 3.1415927F;
         double var7 = (double)((float)(var3 + 8) + fi.a(var6) * (float)this.b / 8.0F);
         double var9 = (double)((float)(var3 + 8) - fi.a(var6) * (float)this.b / 8.0F);
         double var11 = (double)((float)(var5 + 8) + fi.b(var6) * (float)this.b / 8.0F);
         double var13 = (double)((float)(var5 + 8) - fi.b(var6) * (float)this.b / 8.0F);
         double var15 = (double)(var4 + var2.nextInt(3) + 2);
         double var17 = (double)(var4 + var2.nextInt(3) + 2);

         for(int var19 = 0; var19 <= this.b; ++var19) {
            double var20 = var7 + (var9 - var7) * (double)var19 / (double)this.b;
            double var22 = var15 + (var17 - var15) * (double)var19 / (double)this.b;
            double var24 = var11 + (var13 - var11) * (double)var19 / (double)this.b;
            double var26 = var2.nextDouble() * (double)this.b / 16.0D;
            double var28 = (double)(fi.a((float)var19 * 3.1415927F / (float)this.b) + 1.0F) * var26 + 1.0D;
            double var30 = (double)(fi.a((float)var19 * 3.1415927F / (float)this.b) + 1.0F) * var26 + 1.0D;

            for(int var32 = (int)(var20 - var28 / 2.0D); var32 <= (int)(var20 + var28 / 2.0D); ++var32) {
               for(int var33 = (int)(var22 - var30 / 2.0D); var33 <= (int)(var22 + var30 / 2.0D); ++var33) {
                  for(int var34 = (int)(var24 - var28 / 2.0D); var34 <= (int)(var24 + var28 / 2.0D); ++var34) {
                     double var35 = ((double)var32 + 0.5D - var20) / (var28 / 2.0D);
                     double var37 = ((double)var33 + 0.5D - var22) / (var30 / 2.0D);
                     double var39 = ((double)var34 + 0.5D - var24) / (var28 / 2.0D);
                     if(var35 * var35 + var37 * var37 + var39 * var39 < 1.0D) {
                        int var41 = var1.a(var32, var33, var34);
                        if(var41 == nq.E.bh) {
                           var1.a(var32, var33, var34, this.a);
                        }
                     }
                  }
               }
            }
         }

         return true;
      }
   }
}
