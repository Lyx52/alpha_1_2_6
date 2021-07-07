package mojang;

import java.util.Random;

public class x extends fy {

   public x(int var1, int var2) {
      super(var1, var2, hb.x, false);
   }

   public co d(cy var1, int var2, int var3, int var4) {
      return null;
   }

   public void a(pk var1, int var2, int var3, int var4) {
      float var5;
      float var6;
      if(var1.a(var2 - 1, var3, var4) != this.bh && var1.a(var2 + 1, var3, var4) != this.bh) {
         var5 = 0.125F;
         var6 = 0.5F;
         this.a(0.5F - var5, 0.0F, 0.5F - var6, 0.5F + var5, 1.0F, 0.5F + var6);
      } else {
         var5 = 0.5F;
         var6 = 0.125F;
         this.a(0.5F - var5, 0.0F, 0.5F - var6, 0.5F + var5, 1.0F, 0.5F + var6);
      }

   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public boolean a_(cy var1, int var2, int var3, int var4) {
      byte var5 = 0;
      byte var6 = 0;
      if(var1.a(var2 - 1, var3, var4) == ap.bh || var1.a(var2 + 1, var3, var4) == ap.bh) {
         var5 = 1;
      }

      if(var1.a(var2, var3, var4 - 1) == ap.bh || var1.a(var2, var3, var4 + 1) == ap.bh) {
         var6 = 1;
      }

      System.out.println(var5 + ", " + var6);
      if(var5 == var6) {
         return false;
      } else {
         if(var1.a(var2 - var5, var3, var4 - var6) == 0) {
            var2 -= var5;
            var4 -= var6;
         }

         int var7;
         int var8;
         for(var7 = -1; var7 <= 2; ++var7) {
            for(var8 = -1; var8 <= 3; ++var8) {
               boolean var9 = var7 == -1 || var7 == 2 || var8 == -1 || var8 == 3;
               if(var7 != -1 && var7 != 2 || var8 != -1 && var8 != 3) {
                  int var10 = var1.a(var2 + var5 * var7, var3 + var8, var4 + var6 * var7);
                  if(var9) {
                     if(var10 != ap.bh) {
                        return false;
                     }
                  } else if(var10 != 0 && var10 != ar.bh) {
                     return false;
                  }
               }
            }
         }

         var1.i = true;

         for(var7 = 0; var7 < 2; ++var7) {
            for(var8 = 0; var8 < 3; ++var8) {
               var1.d(var2 + var5 * var7, var3 + var8, var4 + var6 * var7, be.bh);
            }
         }

         var1.i = false;
         return true;
      }
   }

   public void a(cy var1, int var2, int var3, int var4, int var5) {
      byte var6 = 0;
      byte var7 = 1;
      if(var1.a(var2 - 1, var3, var4) == this.bh || var1.a(var2 + 1, var3, var4) == this.bh) {
         var6 = 1;
         var7 = 0;
      }

      int var8;
      for(var8 = var3; var1.a(var2, var8 - 1, var4) == this.bh; --var8) {
         ;
      }

      if(var1.a(var2, var8 - 1, var4) != ap.bh) {
         var1.d(var2, var3, var4, 0);
      } else {
         int var9;
         for(var9 = 1; var9 < 4 && var1.a(var2, var8 + var9, var4) == this.bh; ++var9) {
            ;
         }

         if(var9 == 3 && var1.a(var2, var8 + var9, var4) == ap.bh) {
            boolean var10 = var1.a(var2 - 1, var3, var4) == this.bh || var1.a(var2 + 1, var3, var4) == this.bh;
            boolean var11 = var1.a(var2, var3, var4 - 1) == this.bh || var1.a(var2, var3, var4 + 1) == this.bh;
            if(var10 && var11) {
               var1.d(var2, var3, var4, 0);
            } else if((var1.a(var2 + var6, var3, var4 + var7) != ap.bh || var1.a(var2 - var6, var3, var4 - var7) != this.bh) && (var1.a(var2 - var6, var3, var4 - var7) != ap.bh || var1.a(var2 + var6, var3, var4 + var7) != this.bh)) {
               var1.d(var2, var3, var4, 0);
            }
         } else {
            var1.d(var2, var3, var4, 0);
         }
      }
   }

   public boolean b(pk var1, int var2, int var3, int var4, int var5) {
      return true;
   }

   public int a(Random var1) {
      return 0;
   }

   public int c() {
      return 1;
   }

   public void a(cy var1, int var2, int var3, int var4, lw var5) {
      if(!var1.z) {
         var5.q();
      }
   }

   public void b(cy var1, int var2, int var3, int var4, Random var5) {
      if(var5.nextInt(100) == 0) {
         var1.a((double)var2 + 0.5D, (double)var3 + 0.5D, (double)var4 + 0.5D, "portal.portal", 1.0F, var5.nextFloat() * 0.4F + 0.8F);
      }

      for(int var6 = 0; var6 < 4; ++var6) {
         double var7 = (double)((float)var2 + var5.nextFloat());
         double var9 = (double)((float)var3 + var5.nextFloat());
         double var11 = (double)((float)var4 + var5.nextFloat());
         double var13 = 0.0D;
         double var15 = 0.0D;
         double var17 = 0.0D;
         int var19 = var5.nextInt(2) * 2 - 1;
         var13 = ((double)var5.nextFloat() - 0.5D) * 0.5D;
         var15 = ((double)var5.nextFloat() - 0.5D) * 0.5D;
         var17 = ((double)var5.nextFloat() - 0.5D) * 0.5D;
         if(var1.a(var2 - 1, var3, var4) != this.bh && var1.a(var2 + 1, var3, var4) != this.bh) {
            var7 = (double)var2 + 0.5D + 0.25D * (double)var19;
            var13 = (double)(var5.nextFloat() * 2.0F * (float)var19);
         } else {
            var11 = (double)var4 + 0.5D + 0.25D * (double)var19;
            var17 = (double)(var5.nextFloat() * 2.0F * (float)var19);
         }

         var1.a("portal", var7, var9, var11, var13, var15, var17);
      }

   }
}
