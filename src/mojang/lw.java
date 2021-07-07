package mojang;

import java.io.IOException;
import java.util.List;
import java.util.Random;

public abstract class lw {

   private static int a = 0;
   public int an;
   public double ao;
   public boolean ap;
   public lw aq;
   public lw ar;
   public cy as;
   public double at;
   public double au;
   public double av;
   public double aw;
   public double ax;
   public double ay;
   public double az;
   public double aA;
   public double aB;
   public float aC;
   public float aD;
   public float aE;
   public float aF;
   public final co aG;
   public boolean aH;
   public boolean aI;
   public boolean aJ;
   public boolean aK;
   public boolean aL;
   public boolean aM;
   public boolean aN;
   public float aO;
   public float aP;
   public float aQ;
   public float aR;
   public float aS;
   protected boolean aT;
   protected float aU;
   private int b;
   public double aV;
   public double aW;
   public double aX;
   public float aY;
   public float aZ;
   public boolean ba;
   public float bb;
   public boolean bc;
   protected Random bd;
   public int be;
   public int bf;
   public int bg;
   protected int bh;
   protected boolean bi;
   public int bj;
   public int bk;
   private boolean c;
   public String bl;
   protected boolean bm;
   private double d;
   private double e;
   public boolean bn;
   public int bo;
   public int bp;
   public int bq;
   public int br;
   public int bs;
   public int bt;
   public boolean bu;
   public boolean bv;
   public boolean bw;


   public lw(cy var1) {
      this.an = a++;
      this.ao = 1.0D;
      this.ap = false;
      this.aG = co.a(0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
      this.aH = false;
      this.aK = false;
      this.aL = false;
      this.aM = true;
      this.aN = false;
      this.aO = 0.0F;
      this.aP = 0.6F;
      this.aQ = 1.8F;
      this.aR = 0.0F;
      this.aS = 0.0F;
      this.aT = true;
      this.aU = 0.0F;
      this.b = 1;
      this.aY = 0.0F;
      this.aZ = 0.0F;
      this.ba = false;
      this.bb = 0.0F;
      this.bc = false;
      this.bd = new Random();
      this.be = 0;
      this.bf = 1;
      this.bg = 0;
      this.bh = 300;
      this.bi = false;
      this.bj = 0;
      this.bk = 300;
      this.c = true;
      this.bm = false;
      this.bn = false;
      this.as = var1;
      this.b(0.0D, 0.0D, 0.0D);
   }

   public boolean equals(Object var1) {
      return var1 instanceof lw?((lw)var1).an == this.an:false;
   }

   public int hashCode() {
      return this.an;
   }

   protected void t() {
      if(this.as != null) {
         while(this.ax > 0.0D) {
            this.b(this.aw, this.ax, this.ay);
            if(this.as.a(this, this.aG).size() == 0) {
               break;
            }

            ++this.ax;
         }

         this.az = this.aA = this.aB = 0.0D;
         this.aD = 0.0F;
      }
   }

   public void J() {
      this.aN = true;
   }

   protected void a(float var1, float var2) {
      this.aP = var1;
      this.aQ = var2;
   }

   protected void c(float var1, float var2) {
      this.aC = var1;
      this.aD = var2;
   }

   public void b(double var1, double var3, double var5) {
      this.aw = var1;
      this.ax = var3;
      this.ay = var5;
      float var7 = this.aP / 2.0F;
      float var8 = this.aQ;
      this.aG.c(var1 - (double)var7, var3 - (double)this.aO + (double)this.aY, var5 - (double)var7, var1 + (double)var7, var3 - (double)this.aO + (double)this.aY + (double)var8, var5 + (double)var7);
   }

   public void d(float var1, float var2) {
      float var3 = this.aD;
      float var4 = this.aC;
      this.aC = (float)((double)this.aC + (double)var1 * 0.15D);
      this.aD = (float)((double)this.aD - (double)var2 * 0.15D);
      if(this.aD < -90.0F) {
         this.aD = -90.0F;
      }

      if(this.aD > 90.0F) {
         this.aD = 90.0F;
      }

      this.aF += this.aD - var3;
      this.aE += this.aC - var4;
   }

   public void e_() throws IOException {
      this.B();
   }

   public void B() {
      if(this.ar != null && this.ar.aN) {
         this.ar = null;
      }

      ++this.be;
      this.aR = this.aS;
      this.at = this.aw;
      this.au = this.ax;
      this.av = this.ay;
      this.aF = this.aD;
      this.aE = this.aC;
      if(this.h_()) {
         if(!this.bi && !this.c) {
            float var1 = fi.a(this.az * this.az * 0.20000000298023224D + this.aA * this.aA + this.aB * this.aB * 0.20000000298023224D) * 0.2F;
            if(var1 > 1.0F) {
               var1 = 1.0F;
            }

            this.as.a(this, "random.splash", var1, 1.0F + (this.bd.nextFloat() - this.bd.nextFloat()) * 0.4F);
            float var2 = (float)fi.b(this.aG.b);

            int var3;
            float var4;
            float var5;
            for(var3 = 0; (float)var3 < 1.0F + this.aP * 20.0F; ++var3) {
               var4 = (this.bd.nextFloat() * 2.0F - 1.0F) * this.aP;
               var5 = (this.bd.nextFloat() * 2.0F - 1.0F) * this.aP;
               this.as.a("bubble", this.aw + (double)var4, (double)(var2 + 1.0F), this.ay + (double)var5, this.az, this.aA - (double)(this.bd.nextFloat() * 0.2F), this.aB);
            }

            for(var3 = 0; (float)var3 < 1.0F + this.aP * 20.0F; ++var3) {
               var4 = (this.bd.nextFloat() * 2.0F - 1.0F) * this.aP;
               var5 = (this.bd.nextFloat() * 2.0F - 1.0F) * this.aP;
               this.as.a("splash", this.aw + (double)var4, (double)(var2 + 1.0F), this.ay + (double)var5, this.az, this.aA, this.aB);
            }
         }

         this.aU = 0.0F;
         this.bi = true;
         this.bg = 0;
      } else {
         this.bi = false;
      }

      if(this.as.z) {
         this.bg = 0;
      } else if(this.bg > 0) {
         if(this.bm) {
            this.bg -= 4;
            if(this.bg < 0) {
               this.bg = 0;
            }
         } else {
            if(this.bg % 20 == 0) {
               this.a((lw)null, 1);
            }

            --this.bg;
         }
      }

      if(this.L()) {
         this.K();
      }

      if(this.ax < -64.0D) {
         this.H();
      }

      this.c = false;
   }

   protected void K() {
      if(!this.bm) {
         this.a((lw)null, 4);
         this.bg = 600;
      }

   }

   protected void H() {
      this.J();
   }

   public boolean c(double var1, double var3, double var5) {
      co var7 = this.aG.c(var1, var3, var5);
      List var8 = this.as.a(this, var7);
      return var8.size() > 0?false:!this.as.b(var7);
   }

   public void d(double var1, double var3, double var5) {
      if(this.ba) {
         this.aG.d(var1, var3, var5);
         this.aw = (this.aG.a + this.aG.d) / 2.0D;
         this.ax = this.aG.b + (double)this.aO - (double)this.aY;
         this.ay = (this.aG.c + this.aG.f) / 2.0D;
      } else {
         double var7 = this.aw;
         double var9 = this.ay;
         double var11 = var1;
         double var13 = var3;
         double var15 = var5;
         co var17 = this.aG.c();
         boolean var18 = this.aH && this.p();
         if(var18) {
            double var19;
            for(var19 = 0.05D; var1 != 0.0D && this.as.a(this, this.aG.c(var1, -1.0D, 0.0D)).size() == 0; var11 = var1) {
               if(var1 < var19 && var1 >= -var19) {
                  var1 = 0.0D;
               } else if(var1 > 0.0D) {
                  var1 -= var19;
               } else {
                  var1 += var19;
               }
            }

            for(; var5 != 0.0D && this.as.a(this, this.aG.c(0.0D, -1.0D, var5)).size() == 0; var15 = var5) {
               if(var5 < var19 && var5 >= -var19) {
                  var5 = 0.0D;
               } else if(var5 > 0.0D) {
                  var5 -= var19;
               } else {
                  var5 += var19;
               }
            }
         }

         List var35 = this.as.a(this, this.aG.a(var1, var3, var5));

         for(int var20 = 0; var20 < var35.size(); ++var20) {
            var3 = ((co)var35.get(var20)).b(this.aG, var3);
         }

         this.aG.d(0.0D, var3, 0.0D);
         if(!this.aM && var13 != var3) {
            var5 = 0.0D;
            var3 = 0.0D;
            var1 = 0.0D;
         }

         boolean var36 = this.aH || var13 != var3 && var13 < 0.0D;

         int var21;
         for(var21 = 0; var21 < var35.size(); ++var21) {
            var1 = ((co)var35.get(var21)).a(this.aG, var1);
         }

         this.aG.d(var1, 0.0D, 0.0D);
         if(!this.aM && var11 != var1) {
            var5 = 0.0D;
            var3 = 0.0D;
            var1 = 0.0D;
         }

         for(var21 = 0; var21 < var35.size(); ++var21) {
            var5 = ((co)var35.get(var21)).c(this.aG, var5);
         }

         this.aG.d(0.0D, 0.0D, var5);
         if(!this.aM && var15 != var5) {
            var5 = 0.0D;
            var3 = 0.0D;
            var1 = 0.0D;
         }

         double var23;
         int var28;
         double var37;
         if(this.aZ > 0.0F && var36 && this.aY < 0.05F && (var11 != var1 || var15 != var5)) {
            var37 = var1;
            var23 = var3;
            double var25 = var5;
            var1 = var11;
            var3 = (double)this.aZ;
            var5 = var15;
            co var27 = this.aG.c();
            this.aG.b(var17);
            var35 = this.as.a(this, this.aG.a(var11, var3, var15));

            for(var28 = 0; var28 < var35.size(); ++var28) {
               var3 = ((co)var35.get(var28)).b(this.aG, var3);
            }

            this.aG.d(0.0D, var3, 0.0D);
            if(!this.aM && var13 != var3) {
               var5 = 0.0D;
               var3 = 0.0D;
               var1 = 0.0D;
            }

            for(var28 = 0; var28 < var35.size(); ++var28) {
               var1 = ((co)var35.get(var28)).a(this.aG, var1);
            }

            this.aG.d(var1, 0.0D, 0.0D);
            if(!this.aM && var11 != var1) {
               var5 = 0.0D;
               var3 = 0.0D;
               var1 = 0.0D;
            }

            for(var28 = 0; var28 < var35.size(); ++var28) {
               var5 = ((co)var35.get(var28)).c(this.aG, var5);
            }

            this.aG.d(0.0D, 0.0D, var5);
            if(!this.aM && var15 != var5) {
               var5 = 0.0D;
               var3 = 0.0D;
               var1 = 0.0D;
            }

            if(var37 * var37 + var25 * var25 >= var1 * var1 + var5 * var5) {
               var1 = var37;
               var3 = var23;
               var5 = var25;
               this.aG.b(var27);
            } else {
               this.aY = (float)((double)this.aY + 0.5D);
            }
         }

         this.aw = (this.aG.a + this.aG.d) / 2.0D;
         this.ax = this.aG.b + (double)this.aO - (double)this.aY;
         this.ay = (this.aG.c + this.aG.f) / 2.0D;
         this.aI = var11 != var1 || var15 != var5;
         this.aJ = var13 != var3;
         this.aH = var13 != var3 && var13 < 0.0D;
         this.aK = this.aI || this.aJ;
         this.a(var3, this.aH);
         if(var11 != var1) {
            this.az = 0.0D;
         }

         if(var13 != var3) {
            this.aA = 0.0D;
         }

         if(var15 != var5) {
            this.aB = 0.0D;
         }

         var37 = this.aw - var7;
         var23 = this.ay - var9;
         int var26;
         int var38;
         int var40;
         if(this.aT && !var18) {
            this.aS = (float)((double)this.aS + (double)fi.a(var37 * var37 + var23 * var23) * 0.6D);
            var38 = fi.b(this.aw);
            var26 = fi.b(this.ax - 0.20000000298023224D - (double)this.aO);
            var40 = fi.b(this.ay);
            var28 = this.as.a(var38, var26, var40);
            if(this.aS > (float)this.b && var28 > 0) {
               ++this.b;
               bi var29 = nq.m[var28].bq;
               if(this.as.a(var38, var26 + 1, var40) == nq.aS.bh) {
                  var29 = nq.aS.bq;
                  this.as.a(this, var29.d(), var29.b() * 0.15F, var29.c());
               } else if(!nq.m[var28].bs.d()) {
                  this.as.a(this, var29.d(), var29.b() * 0.15F, var29.c());
               }

               nq.m[var28].b(this.as, var38, var26, var40, this);
            }
         }

         var38 = fi.b(this.aG.a);
         var26 = fi.b(this.aG.b);
         var40 = fi.b(this.aG.c);
         var28 = fi.b(this.aG.d);
         int var41 = fi.b(this.aG.e);
         int var30 = fi.b(this.aG.f);

         for(int var31 = var38; var31 <= var28; ++var31) {
            for(int var32 = var26; var32 <= var41; ++var32) {
               for(int var33 = var40; var33 <= var30; ++var33) {
                  int var34 = this.as.a(var31, var32, var33);
                  if(var34 > 0) {
                     nq.m[var34].a(this.as, var31, var32, var33, this);
                  }
               }
            }
         }

         this.aY *= 0.4F;
         boolean var39 = this.h_();
         if(this.as.c(this.aG)) {
            this.a((int)1);
            if(!var39) {
               ++this.bg;
               if(this.bg == 0) {
                  this.bg = 300;
               }
            }
         } else if(this.bg <= 0) {
            this.bg = -this.bf;
         }

         if(var39 && this.bg > 0) {
            this.as.a(this, "random.fizz", 0.7F, 1.6F + (this.bd.nextFloat() - this.bd.nextFloat()) * 0.4F);
            this.bg = -this.bf;
         }

      }
   }

   protected void a(double var1, boolean var3) {
      if(var3) {
         if(this.aU > 0.0F) {
            this.c(this.aU);
            this.aU = 0.0F;
         }
      } else if(var1 < 0.0D) {
         this.aU = (float)((double)this.aU - var1);
      }

   }

   public boolean p() {
      return false;
   }

   public co e() {
      return null;
   }

   protected void a(int var1) {
      if(!this.bm) {
         this.a((lw)null, var1);
      }

   }

   protected void c(float var1) {}

   public boolean h_() {
      return this.as.a(this.aG.b(0.0D, -0.4000000059604645D, 0.0D), hb.f, this);
   }

   public boolean a(hb var1) {
      double var2 = this.ax + (double)this.v();
      int var4 = fi.b(this.aw);
      int var5 = fi.d((float)fi.b(var2));
      int var6 = fi.b(this.ay);
      int var7 = this.as.a(var4, var5, var6);
      if(var7 != 0 && nq.m[var7].bs == var1) {
         float var8 = ld.b(this.as.e(var4, var5, var6)) - 0.11111111F;
         float var9 = (float)(var5 + 1) - var8;
         return var2 < (double)var9;
      } else {
         return false;
      }
   }

   public float v() {
      return 0.0F;
   }

   public boolean L() {
      return this.as.a(this.aG.b(0.0D, -0.4000000059604645D, 0.0D), hb.g);
   }

   public void a(float var1, float var2, float var3) {
      float var4 = fi.c(var1 * var1 + var2 * var2);
      if(var4 >= 0.01F) {
         if(var4 < 1.0F) {
            var4 = 1.0F;
         }

         var4 = var3 / var4;
         var1 *= var4;
         var2 *= var4;
         float var5 = fi.a(this.aC * 3.1415927F / 180.0F);
         float var6 = fi.b(this.aC * 3.1415927F / 180.0F);
         this.az += (double)(var1 * var6 - var2 * var5);
         this.aB += (double)(var2 * var6 + var1 * var5);
      }
   }

   public float a(float var1) {
      int var2 = fi.b(this.aw);
      double var3 = (this.aG.e - this.aG.b) * 0.66D;
      int var5 = fi.b(this.ax - (double)this.aO + var3);
      int var6 = fi.b(this.ay);
      return this.as.c(var2, var5, var6);
   }

   public void a(cy var1) {
      this.as = var1;
   }

   public void b(double var1, double var3, double var5, float var7, float var8) {
      this.at = this.aw = var1;
      this.au = this.ax = var3;
      this.av = this.ay = var5;
      this.aE = this.aC = var7;
      this.aF = this.aD = var8;
      this.aY = 0.0F;
      double var9 = (double)(this.aE - var7);
      if(var9 < -180.0D) {
         this.aE += 360.0F;
      }

      if(var9 >= 180.0D) {
         this.aE -= 360.0F;
      }

      this.b(this.aw, this.ax, this.ay);
      this.c(var7, var8);
   }

   public void c(double var1, double var3, double var5, float var7, float var8) {
      this.at = this.aw = var1;
      this.au = this.ax = var3 + (double)this.aO;
      this.av = this.ay = var5;
      this.aC = var7;
      this.aD = var8;
      this.b(this.aw, this.ax, this.ay);
   }

   public float e(lw var1) {
      float var2 = (float)(this.aw - var1.aw);
      float var3 = (float)(this.ax - var1.ax);
      float var4 = (float)(this.ay - var1.ay);
      return fi.c(var2 * var2 + var3 * var3 + var4 * var4);
   }

   public double e(double var1, double var3, double var5) {
      double var7 = this.aw - var1;
      double var9 = this.ax - var3;
      double var11 = this.ay - var5;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public double f(double var1, double var3, double var5) {
      double var7 = this.aw - var1;
      double var9 = this.ax - var3;
      double var11 = this.ay - var5;
      return (double)fi.a(var7 * var7 + var9 * var9 + var11 * var11);
   }

   public double f(lw var1) {
      double var2 = this.aw - var1.aw;
      double var4 = this.ax - var1.ax;
      double var6 = this.ay - var1.ay;
      return var2 * var2 + var4 * var4 + var6 * var6;
   }

   public void b(eb var1) {}

   public void g(lw var1) {
      if(var1.aq != this && var1.ar != this) {
         double var2 = var1.aw - this.aw;
         double var4 = var1.ay - this.ay;
         double var6 = fi.a(var2, var4);
         if(var6 >= 0.009999999776482582D) {
            var6 = (double)fi.a(var6);
            var2 /= var6;
            var4 /= var6;
            double var8 = 1.0D / var6;
            if(var8 > 1.0D) {
               var8 = 1.0D;
            }

            var2 *= var8;
            var4 *= var8;
            var2 *= 0.05000000074505806D;
            var4 *= 0.05000000074505806D;
            var2 *= (double)(1.0F - this.bb);
            var4 *= (double)(1.0F - this.bb);
            this.g(-var2, 0.0D, -var4);
            var1.g(var2, 0.0D, var4);
         }

      }
   }

   public void g(double var1, double var3, double var5) {
      this.az += var1;
      this.aA += var3;
      this.aB += var5;
   }

   protected void M() {
      this.aL = true;
   }

   public boolean a(lw var1, int var2) {
      this.M();
      return false;
   }

   public boolean n_() {
      return false;
   }

   public boolean d_() {
      return false;
   }

   public void c(lw var1, int var2) {}

   public boolean a(ao var1) {
      double var2 = this.aw - var1.a;
      double var4 = this.ax - var1.b;
      double var6 = this.ay - var1.c;
      double var8 = var2 * var2 + var4 * var4 + var6 * var6;
      return this.a(var8);
   }

   public boolean a(double var1) {
      double var3 = this.aG.b();
      var3 *= 64.0D * this.ao;
      return var1 < var3 * var3;
   }

   public String A() {
      return null;
   }

   public boolean c(iq var1) {
      String var2 = this.N();
      if(!this.aN && var2 != null) {
         var1.a("id", var2);
         this.d(var1);
         return true;
      } else {
         return false;
      }
   }

   public void d(iq var1) {
      var1.a("Pos", (fd)this.a(new double[]{this.aw, this.ax, this.ay}));
      var1.a("Motion", (fd)this.a(new double[]{this.az, this.aA, this.aB}));
      var1.a("Rotation", (fd)this.a(new float[]{this.aC, this.aD}));
      var1.a("FallDistance", this.aU);
      var1.a("Fire", (short)this.bg);
      var1.a("Air", (short)this.bk);
      var1.a("OnGround", this.aH);
      this.a(var1);
   }

   public void e(iq var1) {
      ly var2 = var1.l("Pos");
      ly var3 = var1.l("Motion");
      ly var4 = var1.l("Rotation");
      this.b(0.0D, 0.0D, 0.0D);
      this.az = ((mh)var3.a(0)).a;
      this.aA = ((mh)var3.a(1)).a;
      this.aB = ((mh)var3.a(2)).a;
      this.at = this.aV = this.aw = ((mh)var2.a(0)).a;
      this.au = this.aW = this.ax = ((mh)var2.a(1)).a;
      this.av = this.aX = this.ay = ((mh)var2.a(2)).a;
      this.aE = this.aC = ((h)var4.a(0)).a;
      this.aF = this.aD = ((h)var4.a(1)).a;
      this.aU = var1.g("FallDistance");
      this.bg = var1.d("Fire");
      this.bk = var1.d("Air");
      this.aH = var1.m("OnGround");
      this.b(this.aw, this.ax, this.ay);
      this.b(var1);
   }

   protected final String N() {
      return fq.b(this);
   }

   protected abstract void b(iq var1);

   protected abstract void a(iq var1);

   protected ly a(double ... var1) {
      ly var2 = new ly();
      double[] var3 = var1;
      int var4 = var1.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         double var6 = var3[var5];
         var2.a((fd)(new mh(var6)));
      }

      return var2;
   }

   protected ly a(float ... var1) {
      ly var2 = new ly();
      float[] var3 = var1;
      int var4 = var1.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         float var6 = var3[var5];
         var2.a((fd)(new h(var6)));
      }

      return var2;
   }

   public float i_() {
      return this.aQ / 2.0F;
   }

   public eo b(int var1, int var2) {
      return this.a(var1, var2, 0.0F);
   }

   public eo a(int var1, int var2, float var3) {
      eo var4 = new eo(this.as, this.aw, this.ax + (double)var3, this.ay, new fp(var1, var2));
      var4.c = 10;
      this.as.a((lw)var4);
      return var4;
   }

   public boolean E() {
      return !this.aN;
   }

   public boolean O() {
      int var1 = fi.b(this.aw);
      int var2 = fi.b(this.ax + (double)this.v());
      int var3 = fi.b(this.ay);
      return this.as.g(var1, var2, var3);
   }

   public boolean a(eb var1) {
      return false;
   }

   public co a(lw var1) {
      return null;
   }

   public void s() throws IOException {
      if(this.ar.aN) {
         this.ar = null;
      } else {
         this.az = 0.0D;
         this.aA = 0.0D;
         this.aB = 0.0D;
         this.e_();
         this.ar.j_();
         this.e += (double)(this.ar.aC - this.ar.aE);

         for(this.d += (double)(this.ar.aD - this.ar.aF); this.e >= 180.0D; this.e -= 360.0D) {
            ;
         }

         while(this.e < -180.0D) {
            this.e += 360.0D;
         }

         while(this.d >= 180.0D) {
            this.d -= 360.0D;
         }

         while(this.d < -180.0D) {
            this.d += 360.0D;
         }

         double var1 = this.e * 0.5D;
         double var3 = this.d * 0.5D;
         float var5 = 10.0F;
         if(var1 > (double)var5) {
            var1 = (double)var5;
         }

         if(var1 < (double)(-var5)) {
            var1 = (double)(-var5);
         }

         if(var3 > (double)var5) {
            var3 = (double)var5;
         }

         if(var3 < (double)(-var5)) {
            var3 = (double)(-var5);
         }

         this.e -= var1;
         this.d -= var3;
         this.aC = (float)((double)this.aC + var1);
         this.aD = (float)((double)this.aD + var3);
      }
   }

   public void j_() {
      this.aq.b(this.aw, this.ax + this.j() + this.aq.y(), this.ay);
   }

   public double y() {
      return (double)this.aO;
   }

   public double j() {
      return (double)this.aQ * 0.75D;
   }

   public void h(lw var1) {
      this.d = 0.0D;
      this.e = 0.0D;
      if(var1 == null) {
         if(this.ar != null) {
            this.c(this.ar.aw, this.ar.aG.b + (double)this.ar.aQ, this.ar.ay, this.aC, this.aD);
            this.ar.aq = null;
         }

         this.ar = null;
      } else if(this.ar == var1) {
         this.ar.aq = null;
         this.ar = null;
         this.c(var1.aw, var1.aG.b + (double)var1.aQ, var1.ay, this.aC, this.aD);
      } else {
         if(this.ar != null) {
            this.ar.aq = null;
         }

         if(var1.aq != null) {
            var1.aq.ar = null;
         }

         this.ar = var1;
         var1.aq = this;
      }
   }

   public void a(double var1, double var3, double var5, float var7, float var8, int var9) {
      this.b(var1, var3, var5);
      this.c(var7, var8);
   }

   public float k_() {
      return 0.1F;
   }

   public ao I() {
      return null;
   }

   public void q() {}

   public void a(double var1, double var3, double var5) {
      this.az = var1;
      this.aA = var3;
      this.aB = var5;
   }

   public void a(byte var1) {}

   public void g() {}

}
