package mojang;

import mojang.entity.Entity;
import mojang.entity.LivingEntity;
import mojang.entity.monster.Skeleton;
import mojang.entity.monster.Spider;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class bg {

   private static Set a = new HashSet();


   protected static on a(cy var0, int var1, int var2) {
      int var3 = var1 + var0.l.nextInt(16);
      int var4 = var0.l.nextInt(128);
      int var5 = var2 + var0.l.nextInt(16);
      return new on(var3, var4, var5);
   }

   public static final int a(cy var0) {
      a.clear();

      int var1;
      for(var1 = 0; var1 < var0.d.size(); ++var1) {
         eb var2 = (eb)var0.d.get(var1);
         int var3 = fi.b(var2.aw / 16.0D);
         int var4 = fi.b(var2.ay / 16.0D);
         byte var5 = 8;

         for(int var6 = -var5; var6 <= var5; ++var6) {
            for(int var7 = -var5; var7 <= var5; ++var7) {
               a.add(new qm(var6 + var3, var7 + var4));
            }
         }
      }

      var1 = 0;

      for(int var28 = 0; var28 < gy.values().length; ++var28) {
         gy var29 = gy.values()[var28];
         if(var0.b(var29.c) <= var29.d * a.size() / 256) {
            Iterator var30 = a.iterator();

            label90:
            while(var30.hasNext()) {
               qm var31 = (qm)var30.next();
               if(var0.l.nextInt(50) == 0) {
                  gg var32 = var0.a().a(var31);
                  Class[] var33 = var32.a(var29);
                  if(var33 != null && var33.length != 0) {
                     int var8 = var0.l.nextInt(var33.length);
                     on var9 = a(var0, var31.a * 16, var31.b * 16);
                     int var10 = var9.a;
                     int var11 = var9.b;
                     int var12 = var9.c;
                     if(!var0.g(var10, var11, var12) && var0.f(var10, var11, var12) == hb.a) {
                        int var13 = 0;

                        for(int var14 = 0; var14 < 3; ++var14) {
                           int var15 = var10;
                           int var16 = var11;
                           int var17 = var12;
                           byte var18 = 6;

                           for(int var19 = 0; var19 < 4; ++var19) {
                              var15 += var0.l.nextInt(var18) - var0.l.nextInt(var18);
                              var16 += var0.l.nextInt(1) - var0.l.nextInt(1);
                              var17 += var0.l.nextInt(var18) - var0.l.nextInt(var18);
                              if(var0.g(var15, var16 - 1, var17) && !var0.g(var15, var16, var17) && !var0.f(var15, var16, var17).d() && !var0.g(var15, var16 + 1, var17)) {
                                 float var20 = (float)var15 + 0.5F;
                                 float var21 = (float)var16;
                                 float var22 = (float)var17 + 0.5F;
                                 if(var0.a((double)var20, (double)var21, (double)var22, 24.0D) == null) {
                                    float var23 = var20 - (float)var0.m;
                                    float var24 = var21 - (float)var0.n;
                                    float var25 = var22 - (float)var0.o;
                                    float var26 = var23 * var23 + var24 * var24 + var25 * var25;
                                    if(var26 >= 576.0F) {
                                       LivingEntity var34;
                                       try {
                                          var34 = (LivingEntity)var33[var8].getConstructor(new Class[]{cy.class}).newInstance(new Object[]{var0});
                                       } catch (Exception var27) {
                                          var27.printStackTrace();
                                          return var1;
                                       }

                                       var34.c((double)var20, (double)var21, (double)var22, var0.l.nextFloat() * 360.0F, 0.0F);
                                       if(var34.a()) {
                                          ++var13;
                                          var0.a((Entity)var34);
                                          if(var34 instanceof Spider && var0.l.nextInt(100) == 0) {
                                             Skeleton var35 = new Skeleton(var0);
                                             var35.c((double)var20, (double)var21, (double)var22, var34.aC, 0.0F);
                                             var0.a((Entity)var35);
                                             var35.h(var34);
                                          }

                                          if(var13 >= var34.i()) {
                                             continue label90;
                                          }
                                       }

                                       var1 += var13;
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      return var1;
   }

}
