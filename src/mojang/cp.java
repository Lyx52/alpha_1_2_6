package mojang;

import mojang.world.World;

import java.util.Random;

public class cp extends js {

   public boolean a(World var1, Random var2, int var3, int var4, int var5) {
      byte var6 = 3;
      int var7 = var2.nextInt(2) + 2;
      int var8 = var2.nextInt(2) + 2;
      int var9 = 0;

      int var10;
      int var11;
      int var12;
      for(var10 = var3 - var7 - 1; var10 <= var3 + var7 + 1; ++var10) {
         for(var11 = var4 - 1; var11 <= var4 + var6 + 1; ++var11) {
            for(var12 = var5 - var8 - 1; var12 <= var5 + var8 + 1; ++var12) {
               hb var13 = var1.f(var10, var11, var12);
               if(var11 == var4 - 1 && !var13.a()) {
                  return false;
               }

               if(var11 == var4 + var6 + 1 && !var13.a()) {
                  return false;
               }

               if((var10 == var3 - var7 - 1 || var10 == var3 + var7 + 1 || var12 == var5 - var8 - 1 || var12 == var5 + var8 + 1) && var11 == var4 && var1.a(var10, var11, var12) == 0 && var1.a(var10, var11 + 1, var12) == 0) {
                  ++var9;
               }
            }
         }
      }

      if(var9 >= 1 && var9 <= 5) {
         for(var10 = var3 - var7 - 1; var10 <= var3 + var7 + 1; ++var10) {
            for(var11 = var4 + var6; var11 >= var4 - 1; --var11) {
               for(var12 = var5 - var8 - 1; var12 <= var5 + var8 + 1; ++var12) {
                  if(var10 != var3 - var7 - 1 && var11 != var4 - 1 && var12 != var5 - var8 - 1 && var10 != var3 + var7 + 1 && var11 != var4 + var6 + 1 && var12 != var5 + var8 + 1) {
                     var1.d(var10, var11, var12, 0);
                  } else if(var11 >= 0 && !var1.f(var10, var11 - 1, var12).a()) {
                     var1.d(var10, var11, var12, 0);
                  } else if(var1.f(var10, var11, var12).a()) {
                     if(var11 == var4 - 1 && var2.nextInt(4) != 0) {
                        var1.d(var10, var11, var12, nq.ao.bh);
                     } else {
                        var1.d(var10, var11, var12, nq.w.bh);
                     }
                  }
               }
            }
         }

         var10 = 0;

         while(var10 < 2) {
            var11 = 0;

            while(true) {
               if(var11 < 3) {
                  label204: {
                     var12 = var3 + var2.nextInt(var7 * 2 + 1) - var7;
                     int var14 = var5 + var2.nextInt(var8 * 2 + 1) - var8;
                     if(var1.a(var12, var4, var14) == 0) {
                        int var15 = 0;
                        if(var1.f(var12 - 1, var4, var14).a()) {
                           ++var15;
                        }

                        if(var1.f(var12 + 1, var4, var14).a()) {
                           ++var15;
                        }

                        if(var1.f(var12, var4, var14 - 1).a()) {
                           ++var15;
                        }

                        if(var1.f(var12, var4, var14 + 1).a()) {
                           ++var15;
                        }

                        if(var15 == 1) {
                           var1.d(var12, var4, var14, nq.au.bh);
                           ga var16 = (ga)var1.b(var12, var4, var14);

                           for(int var17 = 0; var17 < 8; ++var17) {
                              fp var18 = this.a(var2);
                              if(var18 != null) {
                                 var16.a(var2.nextInt(var16.c()), var18);
                              }
                           }
                           break label204;
                        }
                     }

                     ++var11;
                     continue;
                  }
               }

               ++var10;
               break;
            }
         }

         var1.d(var3, var4, var5, nq.as.bh);
         bl var19 = (bl)var1.b(var3, var4, var5);
         var19.b = this.b(var2);
         return true;
      } else {
         return false;
      }
   }

   private fp a(Random var1) {
      int var2 = var1.nextInt(11);
      return var2 == 0?new fp(Item.ay):(var2 == 1?new fp(Item.m, var1.nextInt(4) + 1):(var2 == 2?new fp(Item.S):(var2 == 3?new fp(Item.R, var1.nextInt(4) + 1):(var2 == 4?new fp(Item.K, var1.nextInt(4) + 1):(var2 == 5?new fp(Item.I, var1.nextInt(4) + 1):(var2 == 6?new fp(Item.au):(var2 == 7 && var1.nextInt(100) == 0?new fp(Item.ar):(var2 == 8 && var1.nextInt(2) == 0?new fp(Item.aA, var1.nextInt(4) + 1):(var2 == 9 && var1.nextInt(10) == 0?new fp(Item.itemIds[Item.MUSIC_DISC_13.aW + var1.nextInt(2)]):null)))))))));
   }

   private String b(Random var1) {
      int var2 = var1.nextInt(4);
      return var2 == 0?"Skeleton":(var2 == 1?"Zombie":(var2 == 2?"Zombie":(var2 == 3?"Spider":"")));
   }
}
