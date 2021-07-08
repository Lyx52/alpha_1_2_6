package mojang;

import mojang.entity.item.DroppedItem;
import mojang.entity.Entity;
import mojang.tags.CompoundTag;
import mojang.world.World;

import java.io.IOException;
import java.util.List;

public class hj extends Entity {

   private int d;
   private int e;
   private int f;
   private int g;
   private boolean h;
   public int a;
   public eb b;
   private int i;
   private int j;
   private int k;
   public Entity c;
   private int l;
   private double m;
   private double n;
   private double o;
   private double p;
   private double q;
   private double r;
   private double s;
   private double t;


   public hj(World var1) {
      super(var1);
      this.d = -1;
      this.e = -1;
      this.f = -1;
      this.g = 0;
      this.h = false;
      this.a = 0;
      this.j = 0;
      this.k = 0;
      this.c = null;
      this.a(0.25F, 0.25F);
   }

   public boolean a(double var1) {
      double var3 = this.aG.b() * 4.0D;
      var3 *= 64.0D;
      return var1 < var3 * var3;
   }

   public hj(World var1, double var2, double var4, double var6) {
      this(var1);
      this.b(var2, var4, var6);
   }

   public hj(World var1, eb var2) {
      super(var1);
      this.d = -1;
      this.e = -1;
      this.f = -1;
      this.g = 0;
      this.h = false;
      this.a = 0;
      this.j = 0;
      this.k = 0;
      this.c = null;
      this.b = var2;
      this.b.n = this;
      this.a(0.25F, 0.25F);
      this.c(var2.aw, var2.ax + 1.62D - (double)var2.aO, var2.ay, var2.aC, var2.aD);
      this.aw -= (double)(fi.b(this.aC / 180.0F * 3.1415927F) * 0.16F);
      this.ax -= 0.10000000149011612D;
      this.ay -= (double)(fi.a(this.aC / 180.0F * 3.1415927F) * 0.16F);
      this.b(this.aw, this.ax, this.ay);
      this.aO = 0.0F;
      float var3 = 0.4F;
      this.az = (double)(-fi.a(this.aC / 180.0F * 3.1415927F) * fi.b(this.aD / 180.0F * 3.1415927F) * var3);
      this.aB = (double)(fi.b(this.aC / 180.0F * 3.1415927F) * fi.b(this.aD / 180.0F * 3.1415927F) * var3);
      this.aA = (double)(-fi.a(this.aD / 180.0F * 3.1415927F) * var3);
      this.a(this.az, this.aA, this.aB, 1.5F, 1.0F);
   }

   public void a(double var1, double var3, double var5, float var7, float var8) {
      float var9 = fi.a(var1 * var1 + var3 * var3 + var5 * var5);
      var1 /= (double)var9;
      var3 /= (double)var9;
      var5 /= (double)var9;
      var1 += this.bd.nextGaussian() * 0.007499999832361937D * (double)var8;
      var3 += this.bd.nextGaussian() * 0.007499999832361937D * (double)var8;
      var5 += this.bd.nextGaussian() * 0.007499999832361937D * (double)var8;
      var1 *= (double)var7;
      var3 *= (double)var7;
      var5 *= (double)var7;
      this.az = var1;
      this.aA = var3;
      this.aB = var5;
      float var10 = fi.a(var1 * var1 + var5 * var5);
      this.aE = this.aC = (float)(Math.atan2(var1, var5) * 180.0D / 3.1415927410125732D);
      this.aF = this.aD = (float)(Math.atan2(var3, (double)var10) * 180.0D / 3.1415927410125732D);
      this.i = 0;
   }

   public void a(double var1, double var3, double var5, float var7, float var8, int var9) {
      this.m = var1;
      this.n = var3;
      this.o = var5;
      this.p = (double)var7;
      this.q = (double)var8;
      this.l = var9;
      this.az = this.r;
      this.aA = this.s;
      this.aB = this.t;
   }

   public void a(double var1, double var3, double var5) {
      this.r = this.az = var1;
      this.s = this.aA = var3;
      this.t = this.aB = var5;
   }

   public void e_() throws IOException {
      super.e_();
      if(this.l > 0) {
         double var21 = this.aw + (this.m - this.aw) / (double)this.l;
         double var22 = this.ax + (this.n - this.ax) / (double)this.l;
         double var23 = this.ay + (this.o - this.ay) / (double)this.l;

         double var7;
         for(var7 = this.p - (double)this.aC; var7 < -180.0D; var7 += 360.0D) {
            ;
         }

         while(var7 >= 180.0D) {
            var7 -= 360.0D;
         }

         this.aC = (float)((double)this.aC + var7 / (double)this.l);
         this.aD = (float)((double)this.aD + (this.q - (double)this.aD) / (double)this.l);
         --this.l;
         this.b(var21, var22, var23);
         this.c(this.aC, this.aD);
      } else {
         if(!this.as.z) {
            fp var1 = this.b.w();
            if(this.b.aN || !this.b.E() || var1 == null || var1.a() != Item.aP || this.f(this.b) > 1024.0D) {
               this.J();
               this.b.n = null;
               return;
            }

            if(this.c != null) {
               if(!this.c.aN) {
                  this.aw = this.c.aw;
                  this.ax = this.c.aG.b + (double)this.c.aQ * 0.8D;
                  this.ay = this.c.ay;
                  return;
               }

               this.c = null;
            }
         }

         if(this.a > 0) {
            --this.a;
         }

         if(this.h) {
            int var19 = this.as.a(this.d, this.e, this.f);
            if(var19 == this.g) {
               ++this.i;
               if(this.i == 1200) {
                  this.J();
               }

               return;
            }

            this.h = false;
            this.az *= (double)(this.bd.nextFloat() * 0.2F);
            this.aA *= (double)(this.bd.nextFloat() * 0.2F);
            this.aB *= (double)(this.bd.nextFloat() * 0.2F);
            this.i = 0;
            this.j = 0;
         } else {
            ++this.j;
         }

         ao var20 = mojang.ao.b(this.aw, this.ax, this.ay);
         ao var2 = mojang.ao.b(this.aw + this.az, this.ax + this.aA, this.ay + this.aB);
         nx var3 = this.as.a(var20, var2);
         var20 = mojang.ao.b(this.aw, this.ax, this.ay);
         var2 = mojang.ao.b(this.aw + this.az, this.ax + this.aA, this.ay + this.aB);
         if(var3 != null) {
            var2 = mojang.ao.b(var3.f.a, var3.f.b, var3.f.c);
         }

         Entity var4 = null;
         List var5 = this.as.b((Entity)this, this.aG.a(this.az, this.aA, this.aB).b(1.0D, 1.0D, 1.0D));
         double var6 = 0.0D;

         double var13;
         for(int var8 = 0; var8 < var5.size(); ++var8) {
            Entity var9 = (Entity)var5.get(var8);
            if(var9.n_() && (var9 != this.b || this.j >= 5)) {
               float var10 = 0.3F;
               co var11 = var9.aG.b((double)var10, (double)var10, (double)var10);
               nx var12 = var11.a(var20, var2);
               if(var12 != null) {
                  var13 = var20.c(var12.f);
                  if(var13 < var6 || var6 == 0.0D) {
                     var4 = var9;
                     var6 = var13;
                  }
               }
            }
         }

         if(var4 != null) {
            var3 = new nx(var4);
         }

         if(var3 != null) {
            if(var3.g != null) {
               if(var3.g.a(this.b, 0)) {
                  this.c = var3.g;
               }
            } else {
               this.h = true;
            }
         }

         if(!this.h) {
            this.d(this.az, this.aA, this.aB);
            float var24 = fi.a(this.az * this.az + this.aB * this.aB);
            this.aC = (float)(Math.atan2(this.az, this.aB) * 180.0D / 3.1415927410125732D);

            for(this.aD = (float)(Math.atan2(this.aA, (double)var24) * 180.0D / 3.1415927410125732D); this.aD - this.aF < -180.0F; this.aF -= 360.0F) {
               ;
            }

            while(this.aD - this.aF >= 180.0F) {
               this.aF += 360.0F;
            }

            while(this.aC - this.aE < -180.0F) {
               this.aE -= 360.0F;
            }

            while(this.aC - this.aE >= 180.0F) {
               this.aE += 360.0F;
            }

            this.aD = this.aF + (this.aD - this.aF) * 0.2F;
            this.aC = this.aE + (this.aC - this.aE) * 0.2F;
            float var25 = 0.92F;
            if(this.aH || this.aI) {
               var25 = 0.5F;
            }

            byte var26 = 5;
            double var27 = 0.0D;

            for(int var28 = 0; var28 < var26; ++var28) {
               double var14 = this.aG.b + (this.aG.e - this.aG.b) * (double)(var28 + 0) / (double)var26 - 0.125D + 0.125D;
               double var16 = this.aG.b + (this.aG.e - this.aG.b) * (double)(var28 + 1) / (double)var26 - 0.125D + 0.125D;
               co var18 = co.b(this.aG.a, var14, this.aG.c, this.aG.d, var16, this.aG.f);
               if(this.as.b(var18, hb.f)) {
                  var27 += 1.0D / (double)var26;
               }
            }

            if(var27 > 0.0D) {
               if(this.k > 0) {
                  --this.k;
               } else if(this.bd.nextInt(500) == 0) {
                  this.k = this.bd.nextInt(30) + 10;
                  this.aA -= 0.20000000298023224D;
                  this.as.a(this, "random.splash", 0.25F, 1.0F + (this.bd.nextFloat() - this.bd.nextFloat()) * 0.4F);
                  float var29 = (float)fi.b(this.aG.b);

                  float var15;
                  int var30;
                  float var31;
                  for(var30 = 0; (float)var30 < 1.0F + this.aP * 20.0F; ++var30) {
                     var15 = (this.bd.nextFloat() * 2.0F - 1.0F) * this.aP;
                     var31 = (this.bd.nextFloat() * 2.0F - 1.0F) * this.aP;
                     this.as.a("bubble", this.aw + (double)var15, (double)(var29 + 1.0F), this.ay + (double)var31, this.az, this.aA - (double)(this.bd.nextFloat() * 0.2F), this.aB);
                  }

                  for(var30 = 0; (float)var30 < 1.0F + this.aP * 20.0F; ++var30) {
                     var15 = (this.bd.nextFloat() * 2.0F - 1.0F) * this.aP;
                     var31 = (this.bd.nextFloat() * 2.0F - 1.0F) * this.aP;
                     this.as.a("splash", this.aw + (double)var15, (double)(var29 + 1.0F), this.ay + (double)var31, this.az, this.aA, this.aB);
                  }
               }
            }

            if(this.k > 0) {
               this.aA -= (double)(this.bd.nextFloat() * this.bd.nextFloat() * this.bd.nextFloat()) * 0.2D;
            }

            var13 = var27 * 2.0D - 1.0D;
            this.aA += 0.03999999910593033D * var13;
            if(var27 > 0.0D) {
               var25 = (float)((double)var25 * 0.9D);
               this.aA *= 0.8D;
            }

            this.az *= (double)var25;
            this.aA *= (double)var25;
            this.aB *= (double)var25;
            this.b(this.aw, this.ax, this.ay);
         }
      }
   }

   public void a(CompoundTag var1) {
      var1.putShortTag("xTile", (short)this.d);
      var1.putShortTag("yTile", (short)this.e);
      var1.putShortTag("zTile", (short)this.f);
      var1.putByteTag("inTile", (byte)this.g);
      var1.putByteTag("shake", (byte)this.a);
      var1.putByteTag("inGround", (byte)(this.h?1:0));
   }

   public void b(CompoundTag var1) {
      this.d = var1.getShort("xTile");
      this.e = var1.getShort("yTile");
      this.f = var1.getShort("zTile");
      this.g = var1.getByte("inTile") & 255;
      this.a = var1.getByte("shake") & 255;
      this.h = var1.getByte("inGround") == 1;
   }

   public float i_() {
      return 0.0F;
   }

   public int k() {
      byte var1 = 0;
      if(this.c != null) {
         double var2 = this.b.aw - this.aw;
         double var4 = this.b.ax - this.ax;
         double var6 = this.b.ay - this.ay;
         double var8 = (double)fi.a(var2 * var2 + var4 * var4 + var6 * var6);
         double var10 = 0.1D;
         this.c.az += var2 * var10;
         this.c.aA += var4 * var10 + (double)fi.a(var8) * 0.08D;
         this.c.aB += var6 * var10;
         var1 = 3;
      } else if(this.k > 0) {
         DroppedItem var13 = new DroppedItem(this.as, this.aw, this.ax, this.ay, new fp(Item.aS.aW));
         double var3 = this.b.aw - this.aw;
         double var5 = this.b.ax - this.ax;
         double var7 = this.b.ay - this.ay;
         double var9 = (double)fi.a(var3 * var3 + var5 * var5 + var7 * var7);
         double var11 = 0.1D;
         var13.az = var3 * var11;
         var13.aA = var5 * var11 + (double)fi.a(var9) * 0.08D;
         var13.aB = var7 * var11;
         this.as.a((Entity)var13);
         var1 = 1;
      }

      if(this.h) {
         var1 = 2;
      }

      this.J();
      this.b.n = null;
      return var1;
   }
}
