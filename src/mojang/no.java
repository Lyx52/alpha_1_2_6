package mojang;

import mojang.entity.Entity;
import mojang.world.World;

import java.util.Random;

public class no {

   private Random a = new Random();


   public void a(World var1, Entity var2) {
      if(!this.b(var1, var2)) {
         this.c(var1, var2);
         this.b(var1, var2);
      }
   }

   public boolean b(World var1, Entity var2) {
      short var3 = 128;
      double var4 = -1.0D;
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;
      int var9 = fi.b(var2.aw);
      int var10 = fi.b(var2.ay);

      double Z;
      for(int var11 = var9 - var3; var11 <= var9 + var3; ++var11) {
         double var12 = (double)var11 + 0.5D - var2.aw;

         for(int var14 = var10 - var3; var14 <= var10 + var3; ++var14) {
            double var15 = (double)var14 + 0.5D - var2.ay;

            for(int var17 = 127; var17 >= 0; --var17) {
               if(var1.a(var11, var17, var14) == nq.be.bh) {
                  while(var1.a(var11, var17 - 1, var14) == nq.be.bh) {
                     --var17;
                  }

                  Z = (double)var17 + 0.5D - var2.ax;
                  double var20 = var12 * var12 + Z * Z + var15 * var15;
                  if(var4 < 0.0D || var20 < var4) {
                     var4 = var20;
                     var6 = var11;
                     var7 = var17;
                     var8 = var14;
                  }
               }
            }
         }
      }

      if(var4 >= 0.0D) {
         double X = (double)var6 + 0.5D;
         double Y = (double)var7 + 0.5D;
         Z = (double)var8 + 0.5D;
         if(var1.a(var6 - 1, var7, var8) == nq.be.bh) {
            X -= 0.5D;
         }

         if(var1.a(var6 + 1, var7, var8) == nq.be.bh) {
            X += 0.5D;
         }

         if(var1.a(var6, var7, var8 - 1) == nq.be.bh) {
            Z -= 0.5D;
         }

         if(var1.a(var6, var7, var8 + 1) == nq.be.bh) {
            Z += 0.5D;
         }

         System.out.println("Teleporting to " + X + ", " + Y + ", " + Z);
         var2.c(X, Y, Z, var2.aC, 0.0F);
         var2.az = var2.aA = var2.aB = 0.0D;
         return true;
      } else {
         return false;
      }
   }

   public boolean c(World var1, Entity var2) {
      byte var3 = 16;
      double var4 = -1.0D;
      int var6 = fi.b(var2.aw);
      int var7 = fi.b(var2.ax);
      int var8 = fi.b(var2.ay);
      int var9 = var6;
      int var10 = var7;
      int var11 = var8;
      int var12 = 0;
      int var13 = this.a.nextInt(4);

      int var14;
      double var15;
      int var17;
      double var18;
      int var20;
      int var21;
      int var22;
      int var23;
      int var24;
      int var25;
      int var26;
      int var27;
      int var28;
      double var32;
      double var33;
      for(var14 = var6 - var3; var14 <= var6 + var3; ++var14) {
         var15 = (double)var14 + 0.5D - var2.aw;

         for(var17 = var8 - var3; var17 <= var8 + var3; ++var17) {
            var18 = (double)var17 + 0.5D - var2.ay;

            label271:
            for(var20 = 127; var20 >= 0; --var20) {
               if(var1.a(var14, var20, var17) == 0) {
                  while(var20 > 0 && var1.a(var14, var20 - 1, var17) == 0) {
                     --var20;
                  }

                  for(var21 = var13; var21 < var13 + 4; ++var21) {
                     var22 = var21 % 2;
                     var23 = 1 - var22;
                     if(var21 % 4 >= 2) {
                        var22 = -var22;
                        var23 = -var23;
                     }

                     for(var24 = 0; var24 < 3; ++var24) {
                        for(var25 = 0; var25 < 4; ++var25) {
                           for(var26 = -1; var26 < 4; ++var26) {
                              var27 = var14 + (var25 - 1) * var22 + var24 * var23;
                              var28 = var20 + var26;
                              int var29 = var17 + (var25 - 1) * var23 - var24 * var22;
                              if(var26 < 0 && !var1.f(var27, var28, var29).a() || var26 >= 0 && var1.a(var27, var28, var29) != 0) {
                                 continue label271;
                              }
                           }
                        }
                     }

                     var32 = (double)var20 + 0.5D - var2.ax;
                     var33 = var15 * var15 + var32 * var32 + var18 * var18;
                     if(var4 < 0.0D || var33 < var4) {
                        var4 = var33;
                        var9 = var14;
                        var10 = var20;
                        var11 = var17;
                        var12 = var21 % 4;
                     }
                  }
               }
            }
         }
      }

      if(var4 < 0.0D) {
         for(var14 = var6 - var3; var14 <= var6 + var3; ++var14) {
            var15 = (double)var14 + 0.5D - var2.aw;

            for(var17 = var8 - var3; var17 <= var8 + var3; ++var17) {
               var18 = (double)var17 + 0.5D - var2.ay;

               label219:
               for(var20 = 127; var20 >= 0; --var20) {
                  if(var1.a(var14, var20, var17) == 0) {
                     while(var1.a(var14, var20 - 1, var17) == 0) {
                        --var20;
                     }

                     for(var21 = var13; var21 < var13 + 2; ++var21) {
                        var22 = var21 % 2;
                        var23 = 1 - var22;

                        for(var24 = 0; var24 < 4; ++var24) {
                           for(var25 = -1; var25 < 4; ++var25) {
                              var26 = var14 + (var24 - 1) * var22;
                              var27 = var20 + var25;
                              var28 = var17 + (var24 - 1) * var23;
                              if(var25 < 0 && !var1.f(var26, var27, var28).a() || var25 >= 0 && var1.a(var26, var27, var28) != 0) {
                                 continue label219;
                              }
                           }
                        }

                        var32 = (double)var20 + 0.5D - var2.ax;
                        var33 = var15 * var15 + var32 * var32 + var18 * var18;
                        if(var4 < 0.0D || var33 < var4) {
                           var4 = var33;
                           var9 = var14;
                           var10 = var20;
                           var11 = var17;
                           var12 = var21 % 2;
                        }
                     }
                  }
               }
            }
         }
      }

      int var30 = var9;
      int var16 = var10;
      var17 = var11;
      int var31 = var12 % 2;
      int var19 = 1 - var31;
      if(var12 % 4 >= 2) {
         var31 = -var31;
         var19 = -var19;
      }

      boolean var34;
      if(var4 < 0.0D) {
         if(var10 < 70) {
            var10 = 70;
         }

         if(var10 > 118) {
            var10 = 118;
         }

         var16 = var10;

         for(var20 = -1; var20 <= 1; ++var20) {
            for(var21 = 1; var21 < 3; ++var21) {
               for(var22 = -1; var22 < 3; ++var22) {
                  var23 = var30 + (var21 - 1) * var31 + var20 * var19;
                  var24 = var16 + var22;
                  var25 = var17 + (var21 - 1) * var19 - var20 * var31;
                  var34 = var22 < 0;
                  var1.d(var23, var24, var25, var34?nq.ap.bh:0);
               }
            }
         }
      }

      for(var20 = 0; var20 < 4; ++var20) {
         var1.i = true;

         for(var21 = 0; var21 < 4; ++var21) {
            for(var22 = -1; var22 < 4; ++var22) {
               var23 = var30 + (var21 - 1) * var31;
               var24 = var16 + var22;
               var25 = var17 + (var21 - 1) * var19;
               var34 = var21 == 0 || var21 == 3 || var22 == -1 || var22 == 3;
               var1.d(var23, var24, var25, var34?nq.ap.bh:nq.be.bh);
            }
         }

         var1.i = false;

         for(var21 = 0; var21 < 4; ++var21) {
            for(var22 = -1; var22 < 4; ++var22) {
               var23 = var30 + (var21 - 1) * var31;
               var24 = var16 + var22;
               var25 = var17 + (var21 - 1) * var19;
               var1.g(var23, var24, var25, var1.a(var23, var24, var25));
            }
         }
      }

      return true;
   }
}
