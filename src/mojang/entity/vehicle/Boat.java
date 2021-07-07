package mojang.entity.vehicle;

import mojang.*;
import mojang.entity.Entity;
import mojang.tags.CompoundTag;

import java.io.IOException;
import java.util.List;

public class Boat extends Entity {

   public int a;
   public int b;
   public int c;
   private int d;
   private double e;
   private double f;
   private double g;
   private double h;
   private double i;
   private double j;
   private double k;
   private double l;


   public Boat(cy var1) {
      super(var1);
      this.a = 0;
      this.b = 0;
      this.c = 1;
      this.ap = true;
      this.a(1.5F, 0.6F);
      this.aO = this.aQ / 2.0F;
      this.aT = false;
   }

   public co a(Entity var1) {
      return var1.aG;
   }

   public co e() {
      return this.aG;
   }

   public boolean d_() {
      return true;
   }

   public Boat(cy var1, double var2, double var4, double var6) {
      this(var1);
      this.b(var2, var4 + (double)this.aO, var6);
      this.az = 0.0D;
      this.aA = 0.0D;
      this.aB = 0.0D;
      this.at = var2;
      this.au = var4;
      this.av = var6;
   }

   public double j() {
      return (double)this.aQ * 0.0D - 0.30000001192092896D;
   }

   public boolean a(Entity var1, int var2) {
      if(!this.as.z && !this.aN) {
         this.c = -this.c;
         this.b = 10;
         this.a += var2 * 10;
         this.M();
         if(this.a > 40) {
            int var3;
            for(var3 = 0; var3 < 3; ++var3) {
               this.a(nq.x.bh, 1, 0.0F);
            }

            for(var3 = 0; var3 < 2; ++var3) {
               this.a(dx.B.aW, 1, 0.0F);
            }

            this.J();
         }

         return true;
      } else {
         return true;
      }
   }

   public void g() {
      this.c = -this.c;
      this.b = 10;
      this.a += this.a * 10;
   }

   public boolean n_() {
      return !this.aN;
   }

   public void a(double var1, double var3, double var5, float var7, float var8, int var9) {
      this.e = var1;
      this.f = var3;
      this.g = var5;
      this.h = (double)var7;
      this.i = (double)var8;
      this.d = var9 + 4;
      this.az = this.j;
      this.aA = this.k;
      this.aB = this.l;
   }

   public void a(double var1, double var3, double var5) {
      this.j = this.az = var1;
      this.k = this.aA = var3;
      this.l = this.aB = var5;
   }

   public void e_() throws IOException {
      super.e_();
      if(this.b > 0) {
         --this.b;
      }

      if(this.a > 0) {
         --this.a;
      }

      this.at = this.aw;
      this.au = this.ax;
      this.av = this.ay;
      byte var1 = 5;
      double var2 = 0.0D;

      for(int var4 = 0; var4 < var1; ++var4) {
         double var5 = this.aG.b + (this.aG.e - this.aG.b) * (double)(var4 + 0) / (double)var1 - 0.125D;
         double var7 = this.aG.b + (this.aG.e - this.aG.b) * (double)(var4 + 1) / (double)var1 - 0.125D;
         co var9 = co.b(this.aG.a, var5, this.aG.c, this.aG.d, var7, this.aG.f);
         if(this.as.b(var9, hb.f)) {
            var2 += 1.0D / (double)var1;
         }
      }

      double var6;
      double var8;
      double var10;
      double var23;
      if(this.as.z) {
         if(this.d > 0) {
            var23 = this.aw + (this.e - this.aw) / (double)this.d;
            var6 = this.ax + (this.f - this.ax) / (double)this.d;
            var8 = this.ay + (this.g - this.ay) / (double)this.d;

            for(var10 = this.h - (double)this.aC; var10 < -180.0D; var10 += 360.0D) {
               ;
            }

            while(var10 >= 180.0D) {
               var10 -= 360.0D;
            }

            this.aC = (float)((double)this.aC + var10 / (double)this.d);
            this.aD = (float)((double)this.aD + (this.i - (double)this.aD) / (double)this.d);
            --this.d;
            this.b(var23, var6, var8);
            this.c(this.aC, this.aD);
         } else {
            var23 = this.aw + this.az;
            var6 = this.ax + this.aA;
            var8 = this.ay + this.aB;
            this.b(var23, var6, var8);
            if(this.aH) {
               this.az *= 0.5D;
               this.aA *= 0.5D;
               this.aB *= 0.5D;
            }

            this.az *= 0.9900000095367432D;
            this.aA *= 0.949999988079071D;
            this.aB *= 0.9900000095367432D;
         }

      } else {
         var23 = var2 * 2.0D - 1.0D;
         this.aA += 0.03999999910593033D * var23;
         if(this.aq != null) {
            this.az += this.aq.az * 0.2D;
            this.aB += this.aq.aB * 0.2D;
         }

         var6 = 0.4D;
         if(this.az < -var6) {
            this.az = -var6;
         }

         if(this.az > var6) {
            this.az = var6;
         }

         if(this.aB < -var6) {
            this.aB = -var6;
         }

         if(this.aB > var6) {
            this.aB = var6;
         }

         if(this.aH) {
            this.az *= 0.5D;
            this.aA *= 0.5D;
            this.aB *= 0.5D;
         }

         this.d(this.az, this.aA, this.aB);
         var8 = Math.sqrt(this.az * this.az + this.aB * this.aB);
         double var12;
         if(var8 > 0.15D) {
            var10 = Math.cos((double)this.aC * 3.141592653589793D / 180.0D);
            var12 = Math.sin((double)this.aC * 3.141592653589793D / 180.0D);

            for(int var14 = 0; (double)var14 < 1.0D + var8 * 60.0D; ++var14) {
               double var15 = (double)(this.bd.nextFloat() * 2.0F - 1.0F);
               double var17 = (double)(this.bd.nextInt(2) * 2 - 1) * 0.7D;
               double var19;
               double var21;
               if(this.bd.nextBoolean()) {
                  var19 = this.aw - var10 * var15 * 0.8D + var12 * var17;
                  var21 = this.ay - var12 * var15 * 0.8D - var10 * var17;
                  this.as.a("splash", var19, this.ax - 0.125D, var21, this.az, this.aA, this.aB);
               } else {
                  var19 = this.aw + var10 + var12 * var15 * 0.7D;
                  var21 = this.ay + var12 - var10 * var15 * 0.7D;
                  this.as.a("splash", var19, this.ax - 0.125D, var21, this.az, this.aA, this.aB);
               }
            }
         }

         if(this.aI && var8 > 0.15D) {
            if(!this.as.z) {
               this.J();

               int var24;
               for(var24 = 0; var24 < 3; ++var24) {
                  this.a(nq.x.bh, 1, 0.0F);
               }

               for(var24 = 0; var24 < 2; ++var24) {
                  this.a(dx.B.aW, 1, 0.0F);
               }
            }
         } else {
            this.az *= 0.9900000095367432D;
            this.aA *= 0.949999988079071D;
            this.aB *= 0.9900000095367432D;
         }

         this.aD = 0.0F;
         var10 = (double)this.aC;
         var12 = this.at - this.aw;
         double var25 = this.av - this.ay;
         if(var12 * var12 + var25 * var25 > 0.001D) {
            var10 = (double)((float)(Math.atan2(var25, var12) * 180.0D / 3.141592653589793D));
         }

         double var16;
         for(var16 = var10 - (double)this.aC; var16 >= 180.0D; var16 -= 360.0D) {
            ;
         }

         while(var16 < -180.0D) {
            var16 += 360.0D;
         }

         if(var16 > 20.0D) {
            var16 = 20.0D;
         }

         if(var16 < -20.0D) {
            var16 = -20.0D;
         }

         this.aC = (float)((double)this.aC + var16);
         this.c(this.aC, this.aD);
         List var18 = this.as.b((Entity)this, this.aG.b(0.20000000298023224D, 0.0D, 0.20000000298023224D));
         if(var18 != null && var18.size() > 0) {
            for(int var26 = 0; var26 < var18.size(); ++var26) {
               Entity var20 = (Entity)var18.get(var26);
               if(var20 != this.aq && var20.d_() && var20 instanceof Boat) {
                  var20.g(this);
               }
            }
         }

         if(this.aq != null && this.aq.aN) {
            this.aq = null;
         }

      }
   }

   public void j_() {
      if(this.aq != null) {
         double var1 = Math.cos((double)this.aC * 3.141592653589793D / 180.0D) * 0.4D;
         double var3 = Math.sin((double)this.aC * 3.141592653589793D / 180.0D) * 0.4D;
         this.aq.b(this.aw + var1, this.ax + this.j() + this.aq.y(), this.ay + var3);
      }
   }

   protected void a(CompoundTag var1) {}

   protected void b(CompoundTag var1) {}

   public float i_() {
      return 0.0F;
   }

   public boolean a(eb var1) {
      if(this.aq != null && this.aq instanceof eb && this.aq != var1) {
         return true;
      } else {
         if(!this.as.z) {
            var1.h(this);
         }

         return true;
      }
   }
}
