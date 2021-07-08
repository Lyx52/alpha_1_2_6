package mojang.entity.vehicle;

import mojang.*;
import mojang.entity.Entity;
import mojang.entity.LivingEntity;
import mojang.entity.item.DroppedItem;
import mojang.tags.BaseTag;
import mojang.tags.CompoundTag;
import mojang.tags.ListTag;
import mojang.world.World;

import java.util.List;

public class Minecart extends Entity implements hi {

   private fp[] h;
   public int a;
   public int b;
   public int c;
   private boolean i;
   public int d;
   public int e;
   public double f;
   public double g;
   private static final int[][][] j = new int[][][]{{{0, 0, -1}, {0, 0, 1}}, {{-1, 0, 0}, {1, 0, 0}}, {{-1, -1, 0}, {1, 0, 0}}, {{-1, 0, 0}, {1, -1, 0}}, {{0, 0, -1}, {0, -1, 1}}, {{0, -1, -1}, {0, 0, 1}}, {{0, 0, 1}, {1, 0, 0}}, {{0, 0, 1}, {-1, 0, 0}}, {{0, 0, -1}, {-1, 0, 0}}, {{0, 0, -1}, {1, 0, 0}}};
   private int k;
   private double l;
   private double m;
   private double n;
   private double o;
   private double p;
   private double q;
   private double r;
   private double s;


   public Minecart(World var1) {
      super(var1);
      this.h = new fp[36];
      this.a = 0;
      this.b = 0;
      this.c = 1;
      this.i = false;
      this.ap = true;
      this.a(0.98F, 0.7F);
      this.aO = this.aQ / 2.0F;
      this.aT = false;
   }

   public co a(Entity var1) {
      return var1.aG;
   }

   public co e() {
      return null;
   }

   public boolean d_() {
      return true;
   }

   public Minecart(World var1, double var2, double var4, double var6, int var8) {
      this(var1);
      this.b(var2, var4 + (double)this.aO, var6);
      this.az = 0.0D;
      this.aA = 0.0D;
      this.aB = 0.0D;
      this.at = var2;
      this.au = var4;
      this.av = var6;
      this.d = var8;
   }

   public double j() {
      return (double)this.aQ * 0.0D - 0.30000001192092896D;
   }

   public boolean a(Entity var1, int var2) {
      if(!this.as.z && !this.aN) {
         this.c = -this.c;
         this.b = 10;
         this.M();
         this.a += var2 * 10;
         if(this.a > 40) {
            this.a(Item.ax.aW, 1, 0.0F);
            if(this.d == 1) {
               this.a(nq.au.bh, 1, 0.0F);
            } else if(this.d == 2) {
               this.a(nq.aB.bh, 1, 0.0F);
            }

            this.J();
         }

         return true;
      } else {
         return true;
      }
   }

   public void g() {
      System.out.println("Animating hurt");
      this.c = -this.c;
      this.b = 10;
      this.a += this.a * 10;
   }

   public boolean n_() {
      return !this.aN;
   }

   public void J() {
      for(int var1 = 0; var1 < this.c(); ++var1) {
         fp var2 = this.c(var1);
         if(var2 != null) {
            float var3 = this.bd.nextFloat() * 0.8F + 0.1F;
            float var4 = this.bd.nextFloat() * 0.8F + 0.1F;
            float var5 = this.bd.nextFloat() * 0.8F + 0.1F;

            while(var2.a > 0) {
               int var6 = this.bd.nextInt(21) + 10;
               if(var6 > var2.a) {
                  var6 = var2.a;
               }

               var2.a -= var6;
               DroppedItem var7 = new DroppedItem(this.as, this.aw + (double)var3, this.ax + (double)var4, this.ay + (double)var5, new fp(var2.c, var6, var2.d));
               float var8 = 0.05F;
               var7.az = (double)((float)this.bd.nextGaussian() * var8);
               var7.aA = (double)((float)this.bd.nextGaussian() * var8 + 0.2F);
               var7.aB = (double)((float)this.bd.nextGaussian() * var8);
               this.as.a((Entity)var7);
            }
         }
      }

      super.J();
   }

   public void e_() {
      if(this.b > 0) {
         --this.b;
      }

      if(this.a > 0) {
         --this.a;
      }

      double var7;
      if(this.as.z && this.k > 0) {
         if(this.k > 0) {
            double var41 = this.aw + (this.l - this.aw) / (double)this.k;
            double var42 = this.ax + (this.m - this.ax) / (double)this.k;
            double var5 = this.ay + (this.n - this.ay) / (double)this.k;

            for(var7 = this.o - (double)this.aC; var7 < -180.0D; var7 += 360.0D) {
               ;
            }

            while(var7 >= 180.0D) {
               var7 -= 360.0D;
            }

            this.aC = (float)((double)this.aC + var7 / (double)this.k);
            this.aD = (float)((double)this.aD + (this.p - (double)this.aD) / (double)this.k);
            --this.k;
            this.b(var41, var42, var5);
            this.c(this.aC, this.aD);
         } else {
            this.b(this.aw, this.ax, this.ay);
            this.c(this.aC, this.aD);
         }

      } else {
         this.at = this.aw;
         this.au = this.ax;
         this.av = this.ay;
         this.aA -= 0.03999999910593033D;
         int var1 = fi.b(this.aw);
         int var2 = fi.b(this.ax);
         int var3 = fi.b(this.ay);
         if(this.as.a(var1, var2 - 1, var3) == nq.aG.bh) {
            --var2;
         }

         double var4 = 0.4D;
         boolean var6 = false;
         var7 = 0.0078125D;
         if(this.as.a(var1, var2, var3) == nq.aG.bh) {
            ao var9 = this.h(this.aw, this.ax, this.ay);
            int var10 = this.as.e(var1, var2, var3);
            this.ax = (double)var2;
            if(var10 >= 2 && var10 <= 5) {
               this.ax = (double)(var2 + 1);
            }

            if(var10 == 2) {
               this.az -= var7;
            }

            if(var10 == 3) {
               this.az += var7;
            }

            if(var10 == 4) {
               this.aB += var7;
            }

            if(var10 == 5) {
               this.aB -= var7;
            }

            int[][] var11 = j[var10];
            double var12 = (double)(var11[1][0] - var11[0][0]);
            double var14 = (double)(var11[1][2] - var11[0][2]);
            double var16 = Math.sqrt(var12 * var12 + var14 * var14);
            double var18 = this.az * var12 + this.aB * var14;
            if(var18 < 0.0D) {
               var12 = -var12;
               var14 = -var14;
            }

            double var20 = Math.sqrt(this.az * this.az + this.aB * this.aB);
            this.az = var20 * var12 / var16;
            this.aB = var20 * var14 / var16;
            double var22 = 0.0D;
            double var24 = (double)var1 + 0.5D + (double)var11[0][0] * 0.5D;
            double var26 = (double)var3 + 0.5D + (double)var11[0][2] * 0.5D;
            double var28 = (double)var1 + 0.5D + (double)var11[1][0] * 0.5D;
            double var30 = (double)var3 + 0.5D + (double)var11[1][2] * 0.5D;
            var12 = var28 - var24;
            var14 = var30 - var26;
            double var32;
            double var34;
            double var36;
            if(var12 == 0.0D) {
               this.aw = (double)var1 + 0.5D;
               var22 = this.ay - (double)var3;
            } else if(var14 == 0.0D) {
               this.ay = (double)var3 + 0.5D;
               var22 = this.aw - (double)var1;
            } else {
               var32 = this.aw - var24;
               var34 = this.ay - var26;
               var36 = (var32 * var12 + var34 * var14) * 2.0D;
               var22 = var36;
            }

            this.aw = var24 + var12 * var22;
            this.ay = var26 + var14 * var22;
            this.b(this.aw, this.ax + (double)this.aO, this.ay);
            var32 = this.az;
            var34 = this.aB;
            if(this.aq != null) {
               var32 *= 0.75D;
               var34 *= 0.75D;
            }

            if(var32 < -var4) {
               var32 = -var4;
            }

            if(var32 > var4) {
               var32 = var4;
            }

            if(var34 < -var4) {
               var34 = -var4;
            }

            if(var34 > var4) {
               var34 = var4;
            }

            this.d(var32, 0.0D, var34);
            if(var11[0][1] != 0 && fi.b(this.aw) - var1 == var11[0][0] && fi.b(this.ay) - var3 == var11[0][2]) {
               this.b(this.aw, this.ax + (double)var11[0][1], this.ay);
            } else if(var11[1][1] != 0 && fi.b(this.aw) - var1 == var11[1][0] && fi.b(this.ay) - var3 == var11[1][2]) {
               this.b(this.aw, this.ax + (double)var11[1][1], this.ay);
            }

            if(this.aq != null) {
               this.az *= 0.996999979019165D;
               this.aA *= 0.0D;
               this.aB *= 0.996999979019165D;
            } else {
               if(this.d == 2) {
                  var36 = (double)fi.a(this.f * this.f + this.g * this.g);
                  if(var36 > 0.01D) {
                     var6 = true;
                     this.f /= var36;
                     this.g /= var36;
                     double var38 = 0.04D;
                     this.az *= 0.800000011920929D;
                     this.aA *= 0.0D;
                     this.aB *= 0.800000011920929D;
                     this.az += this.f * var38;
                     this.aB += this.g * var38;
                  } else {
                     this.az *= 0.8999999761581421D;
                     this.aA *= 0.0D;
                     this.aB *= 0.8999999761581421D;
                  }
               }

               this.az *= 0.9599999785423279D;
               this.aA *= 0.0D;
               this.aB *= 0.9599999785423279D;
            }

            ao var46 = this.h(this.aw, this.ax, this.ay);
            if(var46 != null && var9 != null) {
               double var37 = (var9.b - var46.b) * 0.05D;
               var20 = Math.sqrt(this.az * this.az + this.aB * this.aB);
               if(var20 > 0.0D) {
                  this.az = this.az / var20 * (var20 + var37);
                  this.aB = this.aB / var20 * (var20 + var37);
               }

               this.b(this.aw, var46.b, this.ay);
            }

            int var47 = fi.b(this.aw);
            int var48 = fi.b(this.ay);
            if(var47 != var1 || var48 != var3) {
               var20 = Math.sqrt(this.az * this.az + this.aB * this.aB);
               this.az = var20 * (double)(var47 - var1);
               this.aB = var20 * (double)(var48 - var3);
            }

            if(this.d == 2) {
               double var39 = (double)fi.a(this.f * this.f + this.g * this.g);
               if(var39 > 0.01D && this.az * this.az + this.aB * this.aB > 0.001D) {
                  this.f /= var39;
                  this.g /= var39;
                  if(this.f * this.az + this.g * this.aB < 0.0D) {
                     this.f = 0.0D;
                     this.g = 0.0D;
                  } else {
                     this.f = this.az;
                     this.g = this.aB;
                  }
               }
            }
         } else {
            if(this.az < -var4) {
               this.az = -var4;
            }

            if(this.az > var4) {
               this.az = var4;
            }

            if(this.aB < -var4) {
               this.aB = -var4;
            }

            if(this.aB > var4) {
               this.aB = var4;
            }

            if(this.aH) {
               this.az *= 0.5D;
               this.aA *= 0.5D;
               this.aB *= 0.5D;
            }

            this.d(this.az, this.aA, this.aB);
            if(!this.aH) {
               this.az *= 0.949999988079071D;
               this.aA *= 0.949999988079071D;
               this.aB *= 0.949999988079071D;
            }
         }

         this.aD = 0.0F;
         double var43 = this.at - this.aw;
         double var44 = this.av - this.ay;
         if(var43 * var43 + var44 * var44 > 0.001D) {
            this.aC = (float)(Math.atan2(var44, var43) * 180.0D / 3.141592653589793D);
            if(this.i) {
               this.aC += 180.0F;
            }
         }

         double var13;
         for(var13 = (double)(this.aC - this.aE); var13 >= 180.0D; var13 -= 360.0D) {
            ;
         }

         while(var13 < -180.0D) {
            var13 += 360.0D;
         }

         if(var13 < -170.0D || var13 >= 170.0D) {
            this.aC += 180.0F;
            this.i = !this.i;
         }

         this.c(this.aC, this.aD);
         List var15 = this.as.b((Entity)this, this.aG.b(0.20000000298023224D, 0.0D, 0.20000000298023224D));
         if(var15 != null && var15.size() > 0) {
            for(int var45 = 0; var45 < var15.size(); ++var45) {
               Entity var17 = (Entity)var15.get(var45);
               if(var17 != this.aq && var17.d_() && var17 instanceof Minecart) {
                  var17.g(this);
               }
            }
         }

         if(this.aq != null && this.aq.aN) {
            this.aq = null;
         }

         if(var6 && this.bd.nextInt(4) == 0) {
            --this.e;
            if(this.e < 0) {
               this.f = this.g = 0.0D;
            }

            this.as.a("largesmoke", this.aw, this.ax + 0.8D, this.ay, 0.0D, 0.0D, 0.0D);
         }

      }
   }

   public ao a(double var1, double var3, double var5, double var7) {
      int var9 = fi.b(var1);
      int var10 = fi.b(var3);
      int var11 = fi.b(var5);
      if(this.as.a(var9, var10 - 1, var11) == nq.aG.bh) {
         --var10;
      }

      if(this.as.a(var9, var10, var11) == nq.aG.bh) {
         int var12 = this.as.e(var9, var10, var11);
         var3 = (double)var10;
         if(var12 >= 2 && var12 <= 5) {
            var3 = (double)(var10 + 1);
         }

         int[][] var13 = j[var12];
         double var14 = (double)(var13[1][0] - var13[0][0]);
         double var16 = (double)(var13[1][2] - var13[0][2]);
         double var18 = Math.sqrt(var14 * var14 + var16 * var16);
         var14 /= var18;
         var16 /= var18;
         var1 += var14 * var7;
         var5 += var16 * var7;
         if(var13[0][1] != 0 && fi.b(var1) - var9 == var13[0][0] && fi.b(var5) - var11 == var13[0][2]) {
            var3 += (double)var13[0][1];
         } else if(var13[1][1] != 0 && fi.b(var1) - var9 == var13[1][0] && fi.b(var5) - var11 == var13[1][2]) {
            var3 += (double)var13[1][1];
         }

         return this.h(var1, var3, var5);
      } else {
         return null;
      }
   }

   public ao h(double var1, double var3, double var5) {
      int var7 = fi.b(var1);
      int var8 = fi.b(var3);
      int var9 = fi.b(var5);
      if(this.as.a(var7, var8 - 1, var9) == nq.aG.bh) {
         --var8;
      }

      if(this.as.a(var7, var8, var9) == nq.aG.bh) {
         int var10 = this.as.e(var7, var8, var9);
         var3 = (double)var8;
         if(var10 >= 2 && var10 <= 5) {
            var3 = (double)(var8 + 1);
         }

         int[][] var11 = j[var10];
         double var12 = 0.0D;
         double var14 = (double)var7 + 0.5D + (double)var11[0][0] * 0.5D;
         double var16 = (double)var8 + 0.5D + (double)var11[0][1] * 0.5D;
         double var18 = (double)var9 + 0.5D + (double)var11[0][2] * 0.5D;
         double var20 = (double)var7 + 0.5D + (double)var11[1][0] * 0.5D;
         double var22 = (double)var8 + 0.5D + (double)var11[1][1] * 0.5D;
         double var24 = (double)var9 + 0.5D + (double)var11[1][2] * 0.5D;
         double var26 = var20 - var14;
         double var28 = (var22 - var16) * 2.0D;
         double var30 = var24 - var18;
         if(var26 == 0.0D) {
            var1 = (double)var7 + 0.5D;
            var12 = var5 - (double)var9;
         } else if(var30 == 0.0D) {
            var5 = (double)var9 + 0.5D;
            var12 = var1 - (double)var7;
         } else {
            double var32 = var1 - var14;
            double var34 = var5 - var18;
            double var36 = (var32 * var26 + var34 * var30) * 2.0D;
            var12 = var36;
         }

         var1 = var14 + var26 * var12;
         var3 = var16 + var28 * var12;
         var5 = var18 + var30 * var12;
         if(var28 < 0.0D) {
            ++var3;
         }

         if(var28 > 0.0D) {
            var3 += 0.5D;
         }

         return mojang.ao.b(var1, var3, var5);
      } else {
         return null;
      }
   }

   protected void a(CompoundTag var1) {
      var1.putIntegerTag("Type", this.d);
      if(this.d == 2) {
         var1.putDoubleTag("PushX", this.f);
         var1.putDoubleTag("PushZ", this.g);
         var1.putShortTag("Fuel", (short)this.e);
      } else if(this.d == 1) {
         ListTag var2 = new ListTag();

         for(int var3 = 0; var3 < this.h.length; ++var3) {
            if(this.h[var3] != null) {
               CompoundTag var4 = new CompoundTag();
               var4.putByteTag("Slot", (byte)var3);
               this.h[var3].a(var4);
               var2.a((BaseTag)var4);
            }
         }

         var1.putBaseTag("Items", (BaseTag)var2);
      }

   }

   protected void b(CompoundTag var1) {
      this.d = var1.getInteger("Type");
      if(this.d == 2) {
         this.f = var1.getDouble("PushX");
         this.g = var1.getDouble("PushZ");
         this.e = var1.getShort("Fuel");
      } else if(this.d == 1) {
         ListTag var2 = var1.getListTag("Items");
         this.h = new fp[this.c()];

         for(int var3 = 0; var3 < var2.c(); ++var3) {
            CompoundTag var4 = (CompoundTag)var2.a(var3);
            int var5 = var4.getByte("Slot") & 255;
            if(var5 >= 0 && var5 < this.h.length) {
               this.h[var5] = new fp(var4);
            }
         }
      }

   }

   public float i_() {
      return 0.0F;
   }

   public void g(Entity var1) {
      if(!this.as.z) {
         if(var1 != this.aq) {
            if(var1 instanceof LivingEntity && !(var1 instanceof eb) && this.d == 0 && this.az * this.az + this.aB * this.aB > 0.01D && this.aq == null && var1.ar == null) {
               var1.h(this);
            }

            double var2 = var1.aw - this.aw;
            double var4 = var1.ay - this.ay;
            double var6 = var2 * var2 + var4 * var4;
            if(var6 >= 9.999999747378752E-5D) {
               var6 = (double)fi.a(var6);
               var2 /= var6;
               var4 /= var6;
               double var8 = 1.0D / var6;
               if(var8 > 1.0D) {
                  var8 = 1.0D;
               }

               var2 *= var8;
               var4 *= var8;
               var2 *= 0.10000000149011612D;
               var4 *= 0.10000000149011612D;
               var2 *= (double)(1.0F - this.bb);
               var4 *= (double)(1.0F - this.bb);
               var2 *= 0.5D;
               var4 *= 0.5D;
               if(var1 instanceof Minecart) {
                  double var10 = var1.az + this.az;
                  double var12 = var1.aB + this.aB;
                  if(((Minecart)var1).d == 2 && this.d != 2) {
                     this.az *= 0.20000000298023224D;
                     this.aB *= 0.20000000298023224D;
                     this.g(var1.az - var2, 0.0D, var1.aB - var4);
                     var1.az *= 0.699999988079071D;
                     var1.aB *= 0.699999988079071D;
                  } else if(((Minecart)var1).d != 2 && this.d == 2) {
                     var1.az *= 0.20000000298023224D;
                     var1.aB *= 0.20000000298023224D;
                     var1.g(this.az + var2, 0.0D, this.aB + var4);
                     this.az *= 0.699999988079071D;
                     this.aB *= 0.699999988079071D;
                  } else {
                     var10 /= 2.0D;
                     var12 /= 2.0D;
                     this.az *= 0.20000000298023224D;
                     this.aB *= 0.20000000298023224D;
                     this.g(var10 - var2, 0.0D, var12 - var4);
                     var1.az *= 0.20000000298023224D;
                     var1.aB *= 0.20000000298023224D;
                     var1.g(var10 + var2, 0.0D, var12 + var4);
                  }
               } else {
                  this.g(-var2, 0.0D, -var4);
                  var1.g(var2 / 4.0D, 0.0D, var4 / 4.0D);
               }
            }

         }
      }
   }

   public int c() {
      return 27;
   }

   public fp c(int var1) {
      return this.h[var1];
   }

   public fp a(int var1, int var2) {
      if(this.h[var1] != null) {
         fp var3;
         if(this.h[var1].a <= var2) {
            var3 = this.h[var1];
            this.h[var1] = null;
            return var3;
         } else {
            var3 = this.h[var1].a(var2);
            if(this.h[var1].a == 0) {
               this.h[var1] = null;
            }

            return var3;
         }
      } else {
         return null;
      }
   }

   public void a(int var1, fp var2) {
      this.h[var1] = var2;
      if(var2 != null && var2.a > this.o_()) {
         var2.a = this.o_();
      }

   }

   public String d() {
      return "Minecart";
   }

   public int o_() {
      return 64;
   }

   public void h() {}

   public boolean a(eb var1) {
      if(this.d == 0) {
         if(this.aq != null && this.aq instanceof eb && this.aq != var1) {
            return true;
         }

         if(!this.as.z) {
            var1.h(this);
         }
      } else if(this.d == 1) {
         var1.a((hi)this);
      } else if(this.d == 2) {
         fp var2 = var1.e.a();
         if(var2 != null && var2.c == Item.k.aW) {
            if(--var2.a == 0) {
               var1.e.a(var1.e.d, (fp)null);
            }

            this.e += 1200;
         }

         this.f = this.aw - var1.aw;
         this.g = this.ay - var1.ay;
      }

      return true;
   }

   public void a(double var1, double var3, double var5, float var7, float var8, int var9) {
      this.l = var1;
      this.m = var3;
      this.n = var5;
      this.o = (double)var7;
      this.p = (double)var8;
      this.k = var9 + 2;
      this.az = this.q;
      this.aA = this.r;
      this.aB = this.s;
   }

   public void a(double var1, double var3, double var5) {
      this.q = this.az = var1;
      this.r = this.aA = var3;
      this.s = this.aB = var5;
   }

}
