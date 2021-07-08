package mojang;

import mojang.entity.Entity;
import mojang.world.World;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class ks {

   public boolean a = false;
   private Random h = new Random();
   private World i;
   public double b;
   public double c;
   public double d;
   public Entity e;
   public float f;
   public Set g = new HashSet();


   public ks(World var1, Entity var2, double var3, double var5, double var7, float var9) {
      this.i = var1;
      this.e = var2;
      this.f = var9;
      this.b = var3;
      this.c = var5;
      this.d = var7;
   }

   public void a() {
      float var1 = this.f;
      byte var2 = 16;

      int var3;
      int var4;
      int var5;
      double var15;
      double var17;
      double var19;
      for(var3 = 0; var3 < var2; ++var3) {
         for(var4 = 0; var4 < var2; ++var4) {
            for(var5 = 0; var5 < var2; ++var5) {
               if(var3 == 0 || var3 == var2 - 1 || var4 == 0 || var4 == var2 - 1 || var5 == 0 || var5 == var2 - 1) {
                  double var6 = (double)((float)var3 / ((float)var2 - 1.0F) * 2.0F - 1.0F);
                  double var8 = (double)((float)var4 / ((float)var2 - 1.0F) * 2.0F - 1.0F);
                  double var10 = (double)((float)var5 / ((float)var2 - 1.0F) * 2.0F - 1.0F);
                  double var12 = Math.sqrt(var6 * var6 + var8 * var8 + var10 * var10);
                  var6 /= var12;
                  var8 /= var12;
                  var10 /= var12;
                  float var14 = this.f * (0.7F + this.i.l.nextFloat() * 0.6F);
                  var15 = this.b;
                  var17 = this.c;
                  var19 = this.d;

                  for(float var21 = 0.3F; var14 > 0.0F; var14 -= var21 * 0.75F) {
                     int var22 = fi.b(var15);
                     int var23 = fi.b(var17);
                     int var24 = fi.b(var19);
                     int var25 = this.i.a(var22, var23, var24);
                     if(var25 > 0) {
                        var14 -= (nq.m[var25].a(this.e) + 0.3F) * var21;
                     }

                     if(var14 > 0.0F) {
                        this.g.add(new on(var22, var23, var24));
                     }

                     var15 += var6 * (double)var21;
                     var17 += var8 * (double)var21;
                     var19 += var10 * (double)var21;
                  }
               }
            }
         }
      }

      this.f *= 2.0F;
      var3 = fi.b(this.b - (double)this.f - 1.0D);
      var4 = fi.b(this.b + (double)this.f + 1.0D);
      var5 = fi.b(this.c - (double)this.f - 1.0D);
      int var29 = fi.b(this.c + (double)this.f + 1.0D);
      int var7 = fi.b(this.d - (double)this.f - 1.0D);
      int var30 = fi.b(this.d + (double)this.f + 1.0D);
      List var9 = this.i.b(this.e, co.b((double)var3, (double)var5, (double)var7, (double)var4, (double)var29, (double)var30));
      ao var31 = ao.b(this.b, this.c, this.d);

      for(int var11 = 0; var11 < var9.size(); ++var11) {
         Entity var33 = (Entity)var9.get(var11);
         double var13 = var33.f(this.b, this.c, this.d) / (double)this.f;
         if(var13 <= 1.0D) {
            var15 = var33.aw - this.b;
            var17 = var33.ax - this.c;
            var19 = var33.ay - this.d;
            double var39 = (double)fi.a(var15 * var15 + var17 * var17 + var19 * var19);
            var15 /= var39;
            var17 /= var39;
            var19 /= var39;
            double var40 = (double)this.i.a(var31, var33.aG);
            double var41 = (1.0D - var13) * var40;
            var33.a(this.e, (int)((var41 * var41 + var41) / 2.0D * 8.0D * (double)this.f + 1.0D));
            var33.az += var15 * var41;
            var33.aA += var17 * var41;
            var33.aB += var19 * var41;
         }
      }

      this.f = var1;
      ArrayList var32 = new ArrayList();
      var32.addAll(this.g);
      if(this.a) {
         for(int var34 = var32.size() - 1; var34 >= 0; --var34) {
            on var35 = (on)var32.get(var34);
            int var36 = var35.a;
            int var37 = var35.b;
            int var16 = var35.c;
            int var38 = this.i.a(var36, var37, var16);
            int var18 = this.i.a(var36, var37 - 1, var16);
            if(var38 == 0 && nq.o[var18] && this.h.nextInt(3) == 0) {
               this.i.d(var36, var37, var16, nq.ar.bh);
            }
         }
      }

   }

   public void b() {
      this.i.a(this.b, this.c, this.d, "random.explode", 4.0F, (1.0F + (this.i.l.nextFloat() - this.i.l.nextFloat()) * 0.2F) * 0.7F);
      ArrayList var1 = new ArrayList();
      var1.addAll(this.g);

      for(int var2 = var1.size() - 1; var2 >= 0; --var2) {
         on var3 = (on)var1.get(var2);
         int var4 = var3.a;
         int var5 = var3.b;
         int var6 = var3.c;
         int var7 = this.i.a(var4, var5, var6);

         for(int var8 = 0; var8 < 1; ++var8) {
            double var9 = (double)((float)var4 + this.i.l.nextFloat());
            double var11 = (double)((float)var5 + this.i.l.nextFloat());
            double var13 = (double)((float)var6 + this.i.l.nextFloat());
            double var15 = var9 - this.b;
            double var17 = var11 - this.c;
            double var19 = var13 - this.d;
            double var21 = (double)fi.a(var15 * var15 + var17 * var17 + var19 * var19);
            var15 /= var21;
            var17 /= var21;
            var19 /= var21;
            double var23 = 0.5D / (var21 / (double)this.f + 0.1D);
            var23 *= (double)(this.i.l.nextFloat() * this.i.l.nextFloat() + 0.3F);
            var15 *= var23;
            var17 *= var23;
            var19 *= var23;
            this.i.a("explode", (var9 + this.b * 1.0D) / 2.0D, (var11 + this.c * 1.0D) / 2.0D, (var13 + this.d * 1.0D) / 2.0D, var15, var17, var19);
            this.i.a("smoke", var9, var11, var13, var15, var17, var19);
         }

         if(var7 > 0) {
            nq.m[var7].a(this.i, var4, var5, var6, this.i.e(var4, var5, var6), 0.3F);
            this.i.d(var4, var5, var6, 0);
            nq.m[var7].c(this.i, var4, var5, var6);
         }
      }

   }
}
