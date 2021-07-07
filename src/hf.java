import java.util.List;

public class hf extends lw {

   public int o = 20;
   public float p;
   public float q;
   public float r;
   public float s = 0.0F;
   public float t = 0.0F;
   protected float u;
   protected float v;
   protected float w;
   protected float x;
   protected boolean y = true;
   protected String z = "/mob/char.png";
   protected boolean A = true;
   protected float B = 0.0F;
   protected String C = null;
   protected float D = 1.0F;
   protected int E = 0;
   protected float F = 0.0F;
   public boolean G = false;
   public float H;
   public float I;
   public int J = 10;
   public int K;
   private int a;
   public int L;
   public int M;
   public float N = 0.0F;
   public int O = 0;
   public int P = 0;
   public float Q;
   public float R;
   protected boolean S = false;
   public int T = -1;
   public float U = (float)(Math.random() * 0.8999999761581421D + 0.10000000149011612D);
   public float V;
   public float W;
   public float X;
   protected int Y;
   protected double Z;
   protected double aa;
   protected double ab;
   protected double ac;
   protected double ad;
   float ae = 0.0F;
   protected int af = 0;
   protected int ag = 0;
   protected float ah;
   protected float ai;
   protected float aj;
   protected boolean ak = false;
   protected float al = 0.0F;
   protected float am = 0.7F;
   private lw b;
   private int c = 0;


   public hf(cy var1) {
      super(var1);
      this.ap = true;
      this.r = (float)(Math.random() + 1.0D) * 0.01F;
      this.b(this.aw, this.ax, this.ay);
      this.p = (float)Math.random() * 12398.0F;
      this.aC = (float)(Math.random() * 3.1415927410125732D * 2.0D);
      this.q = 1.0F;
      this.aZ = 0.5F;
   }

   public boolean d(lw var1) {
      return this.as.a(ao.b(this.aw, this.ax + (double)this.v(), this.ay), ao.b(var1.aw, var1.ax + (double)var1.v(), var1.ay)) == null;
   }

   public String A() {
      return this.z;
   }

   public boolean n_() {
      return !this.aN;
   }

   public boolean d_() {
      return !this.aN;
   }

   public float v() {
      return this.aQ * 0.85F;
   }

   public int b() {
      return 80;
   }

   public void B() {
      this.H = this.I;
      super.B();
      if(this.bd.nextInt(1000) < this.a++) {
         this.a = -this.b();
         String var1 = this.d();
         if(var1 != null) {
            this.as.a(this, var1, this.h(), (this.bd.nextFloat() - this.bd.nextFloat()) * 0.2F + 1.0F);
         }
      }

      if(this.E() && this.O()) {
         this.a((lw)null, 1);
      }

      if(this.bm || this.as.z) {
         this.bg = 0;
      }

      int var8;
      if(this.E() && this.a(hb.f)) {
         --this.bk;
         if(this.bk == -20) {
            this.bk = 0;

            for(var8 = 0; var8 < 8; ++var8) {
               float var2 = this.bd.nextFloat() - this.bd.nextFloat();
               float var3 = this.bd.nextFloat() - this.bd.nextFloat();
               float var4 = this.bd.nextFloat() - this.bd.nextFloat();
               this.as.a("bubble", this.aw + (double)var2, this.ax + (double)var3, this.ay + (double)var4, this.az, this.aA, this.aB);
            }

            this.a((lw)null, 2);
         }

         this.bg = 0;
      } else {
         this.bk = this.bh;
      }

      this.Q = this.R;
      if(this.P > 0) {
         --this.P;
      }

      if(this.L > 0) {
         --this.L;
      }

      if(this.bj > 0) {
         --this.bj;
      }

      if(this.J <= 0) {
         ++this.O;
         if(this.O > 20) {
            this.G();
            this.J();

            for(var8 = 0; var8 < 20; ++var8) {
               double var9 = this.bd.nextGaussian() * 0.02D;
               double var10 = this.bd.nextGaussian() * 0.02D;
               double var6 = this.bd.nextGaussian() * 0.02D;
               this.as.a("explode", this.aw + (double)(this.bd.nextFloat() * this.aP * 2.0F) - (double)this.aP, this.ax + (double)(this.bd.nextFloat() * this.aQ), this.ay + (double)(this.bd.nextFloat() * this.aP * 2.0F) - (double)this.aP, var9, var10, var6);
            }
         }
      }

      this.x = this.w;
      this.t = this.s;
      this.aE = this.aC;
      this.aF = this.aD;
   }

   public void C() {
      for(int var1 = 0; var1 < 20; ++var1) {
         double var2 = this.bd.nextGaussian() * 0.02D;
         double var4 = this.bd.nextGaussian() * 0.02D;
         double var6 = this.bd.nextGaussian() * 0.02D;
         double var8 = 10.0D;
         this.as.a("explode", this.aw + (double)(this.bd.nextFloat() * this.aP * 2.0F) - (double)this.aP - var2 * var8, this.ax + (double)(this.bd.nextFloat() * this.aQ) - var4 * var8, this.ay + (double)(this.bd.nextFloat() * this.aP * 2.0F) - (double)this.aP - var6 * var8, var2, var4, var6);
      }

   }

   public void s() {
      super.s();
      this.u = this.v;
      this.v = 0.0F;
   }

   public void a(double var1, double var3, double var5, float var7, float var8, int var9) {
      this.aO = 0.0F;
      this.Z = var1;
      this.aa = var3;
      this.ab = var5;
      this.ac = (double)var7;
      this.ad = (double)var8;
      this.Y = var9;
   }

   public void e_() {
      super.e_();
      this.k();
      double var1 = this.aw - this.at;
      double var3 = this.ay - this.av;
      float var5 = fi.a(var1 * var1 + var3 * var3);
      float var6 = this.s;
      float var7 = 0.0F;
      this.u = this.v;
      float var8 = 0.0F;
      if(var5 > 0.05F) {
         var8 = 1.0F;
         var7 = var5 * 3.0F;
         var6 = (float)Math.atan2(var3, var1) * 180.0F / 3.1415927F - 90.0F;
      }

      if(this.I > 0.0F) {
         var6 = this.aC;
      }

      if(!this.aH) {
         var8 = 0.0F;
      }

      this.v += (var8 - this.v) * 0.3F;

      float var9;
      for(var9 = var6 - this.s; var9 < -180.0F; var9 += 360.0F) {
         ;
      }

      while(var9 >= 180.0F) {
         var9 -= 360.0F;
      }

      this.s += var9 * 0.3F;

      float var10;
      for(var10 = this.aC - this.s; var10 < -180.0F; var10 += 360.0F) {
         ;
      }

      while(var10 >= 180.0F) {
         var10 -= 360.0F;
      }

      boolean var11 = var10 < -90.0F || var10 >= 90.0F;
      if(var10 < -75.0F) {
         var10 = -75.0F;
      }

      if(var10 >= 75.0F) {
         var10 = 75.0F;
      }

      this.s = this.aC - var10;
      if(var10 * var10 > 2500.0F) {
         this.s += var10 * 0.2F;
      }

      if(var11) {
         var7 *= -1.0F;
      }

      while(this.aC - this.aE < -180.0F) {
         this.aE -= 360.0F;
      }

      while(this.aC - this.aE >= 180.0F) {
         this.aE += 360.0F;
      }

      while(this.s - this.t < -180.0F) {
         this.t -= 360.0F;
      }

      while(this.s - this.t >= 180.0F) {
         this.t += 360.0F;
      }

      while(this.aD - this.aF < -180.0F) {
         this.aF -= 360.0F;
      }

      while(this.aD - this.aF >= 180.0F) {
         this.aF += 360.0F;
      }

      this.w += var7;
   }

   protected void a(float var1, float var2) {
      super.a(var1, var2);
   }

   public void c(int var1) {
      if(this.J > 0) {
         this.J += var1;
         if(this.J > 20) {
            this.J = 20;
         }

         this.bj = this.o / 2;
      }
   }

   public boolean a(lw var1, int var2) {
      if(this.as.z) {
         return false;
      } else {
         this.ag = 0;
         if(this.J <= 0) {
            return false;
         } else {
            this.W = 1.5F;
            boolean var3 = true;
            if((float)this.bj > (float)this.o / 2.0F) {
               if(var2 <= this.af) {
                  return false;
               }

               this.b(var2 - this.af);
               this.af = var2;
               var3 = false;
            } else {
               this.af = var2;
               this.K = this.J;
               this.bj = this.o;
               this.b(var2);
               this.L = this.M = 10;
            }

            this.N = 0.0F;
            if(var3) {
               this.as.a(this, (byte)2);
               this.M();
               if(var1 != null) {
                  double var4 = var1.aw - this.aw;

                  double var6;
                  for(var6 = var1.ay - this.ay; var4 * var4 + var6 * var6 < 1.0E-4D; var6 = (Math.random() - Math.random()) * 0.01D) {
                     var4 = (Math.random() - Math.random()) * 0.01D;
                  }

                  this.N = (float)(Math.atan2(var6, var4) * 180.0D / 3.1415927410125732D) - this.aC;
                  this.a(var1, var2, var4, var6);
               } else {
                  this.N = (float)((int)(Math.random() * 2.0D) * 180);
               }
            }

            if(this.J <= 0) {
               if(var3) {
                  this.as.a(this, this.f(), this.h(), (this.bd.nextFloat() - this.bd.nextFloat()) * 0.2F + 1.0F);
               }

               this.b(var1);
            } else if(var3) {
               this.as.a(this, this.f_(), this.h(), (this.bd.nextFloat() - this.bd.nextFloat()) * 0.2F + 1.0F);
            }

            return true;
         }
      }
   }

   public void g() {
      this.L = this.M = 10;
      this.N = 0.0F;
   }

   protected void b(int var1) {
      this.J -= var1;
   }

   protected float h() {
      return 1.0F;
   }

   protected String d() {
      return null;
   }

   protected String f_() {
      return "random.hurt";
   }

   protected String f() {
      return "random.hurt";
   }

   public void a(lw var1, int var2, double var3, double var5) {
      float var7 = fi.a(var3 * var3 + var5 * var5);
      float var8 = 0.4F;
      this.az /= 2.0D;
      this.aA /= 2.0D;
      this.aB /= 2.0D;
      this.az -= var3 / (double)var7 * (double)var8;
      this.aA += 0.4000000059604645D;
      this.aB -= var5 / (double)var7 * (double)var8;
      if(this.aA > 0.4000000059604645D) {
         this.aA = 0.4000000059604645D;
      }

   }

   public void b(lw var1) {
      if(this.E > 0 && var1 != null) {
         var1.c(this, this.E);
      }

      this.S = true;
      if(!this.as.z) {
         int var2 = this.g_();
         if(var2 > 0) {
            int var3 = this.bd.nextInt(3);

            for(int var4 = 0; var4 < var3; ++var4) {
               this.b(var2, 1);
            }
         }
      }

      this.as.a(this, (byte)3);
   }

   protected int g_() {
      return 0;
   }

   protected void c(float var1) {
      int var2 = (int)Math.ceil((double)(var1 - 3.0F));
      if(var2 > 0) {
         this.a((lw)null, var2);
         int var3 = this.as.a(fi.b(this.aw), fi.b(this.ax - 0.20000000298023224D - (double)this.aO), fi.b(this.ay));
         if(var3 > 0) {
            bi var4 = nq.m[var3].bq;
            this.as.a(this, var4.d(), var4.b() * 0.5F, var4.c() * 0.75F);
         }
      }

   }

   public void b(float var1, float var2) {
      double var3;
      if(this.h_()) {
         var3 = this.ax;
         this.a(var1, var2, 0.02F);
         this.d(this.az, this.aA, this.aB);
         this.az *= 0.800000011920929D;
         this.aA *= 0.800000011920929D;
         this.aB *= 0.800000011920929D;
         this.aA -= 0.02D;
         if(this.aI && this.c(this.az, this.aA + 0.6000000238418579D - this.ax + var3, this.aB)) {
            this.aA = 0.30000001192092896D;
         }
      } else if(this.L()) {
         var3 = this.ax;
         this.a(var1, var2, 0.02F);
         this.d(this.az, this.aA, this.aB);
         this.az *= 0.5D;
         this.aA *= 0.5D;
         this.aB *= 0.5D;
         this.aA -= 0.02D;
         if(this.aI && this.c(this.az, this.aA + 0.6000000238418579D - this.ax + var3, this.aB)) {
            this.aA = 0.30000001192092896D;
         }
      } else {
         float var8 = 0.91F;
         if(this.aH) {
            var8 = 0.54600006F;
            int var4 = this.as.a(fi.b(this.aw), fi.b(this.aG.b) - 1, fi.b(this.ay));
            if(var4 > 0) {
               var8 = nq.m[var4].bt * 0.91F;
            }
         }

         float var9 = 0.16277136F / (var8 * var8 * var8);
         this.a(var1, var2, this.aH?0.1F * var9:0.02F);
         var8 = 0.91F;
         if(this.aH) {
            var8 = 0.54600006F;
            int var5 = this.as.a(fi.b(this.aw), fi.b(this.aG.b) - 1, fi.b(this.ay));
            if(var5 > 0) {
               var8 = nq.m[var5].bt * 0.91F;
            }
         }

         if(this.D()) {
            this.aU = 0.0F;
            if(this.aA < -0.15D) {
               this.aA = -0.15D;
            }
         }

         this.d(this.az, this.aA, this.aB);
         if(this.aI && this.D()) {
            this.aA = 0.2D;
         }

         this.aA -= 0.08D;
         this.aA *= 0.9800000190734863D;
         this.az *= (double)var8;
         this.aB *= (double)var8;
      }

      this.V = this.W;
      var3 = this.aw - this.at;
      double var10 = this.ay - this.av;
      float var7 = fi.a(var3 * var3 + var10 * var10) * 4.0F;
      if(var7 > 1.0F) {
         var7 = 1.0F;
      }

      this.W += (var7 - this.W) * 0.4F;
      this.X += this.W;
   }

   public boolean D() {
      int var1 = fi.b(this.aw);
      int var2 = fi.b(this.aG.b);
      int var3 = fi.b(this.ay);
      return this.as.a(var1, var2, var3) == nq.aF.bh || this.as.a(var1, var2 + 1, var3) == nq.aF.bh;
   }

   public void a(iq var1) {
      var1.a("Health", (short)this.J);
      var1.a("HurtTime", (short)this.L);
      var1.a("DeathTime", (short)this.O);
      var1.a("AttackTime", (short)this.P);
   }

   public void b(iq var1) {
      this.J = var1.d("Health");
      if(!var1.b("Health")) {
         this.J = 10;
      }

      this.L = var1.d("HurtTime");
      this.O = var1.d("DeathTime");
      this.P = var1.d("AttackTime");
   }

   public boolean E() {
      return !this.aN && this.J > 0;
   }

   public void k() {
      if(this.Y > 0) {
         double var1 = this.aw + (this.Z - this.aw) / (double)this.Y;
         double var3 = this.ax + (this.aa - this.ax) / (double)this.Y;
         double var5 = this.ay + (this.ab - this.ay) / (double)this.Y;

         double var7;
         for(var7 = this.ac - (double)this.aC; var7 < -180.0D; var7 += 360.0D) {
            ;
         }

         while(var7 >= 180.0D) {
            var7 -= 360.0D;
         }

         this.aC = (float)((double)this.aC + var7 / (double)this.Y);
         this.aD = (float)((double)this.aD + (this.ad - (double)this.aD) / (double)this.Y);
         --this.Y;
         this.b(var1, var3, var5);
         this.c(this.aC, this.aD);
      }

      if(this.J <= 0) {
         this.ak = false;
         this.ah = 0.0F;
         this.ai = 0.0F;
         this.aj = 0.0F;
      } else if(!this.G) {
         this.b_();
      }

      boolean var9 = this.h_();
      boolean var2 = this.L();
      if(this.ak) {
         if(var9) {
            this.aA += 0.03999999910593033D;
         } else if(var2) {
            this.aA += 0.03999999910593033D;
         } else if(this.aH) {
            this.F();
         }
      }

      this.ah *= 0.98F;
      this.ai *= 0.98F;
      this.aj *= 0.9F;
      this.b(this.ah, this.ai);
      List var10 = this.as.b((lw)this, this.aG.b(0.20000000298023224D, 0.0D, 0.20000000298023224D));
      if(var10 != null && var10.size() > 0) {
         for(int var4 = 0; var4 < var10.size(); ++var4) {
            lw var11 = (lw)var10.get(var4);
            if(var11.d_()) {
               var11.g(this);
            }
         }
      }

   }

   protected void F() {
      this.aA = 0.41999998688697815D;
   }

   protected void b_() {
      ++this.ag;
      eb var1 = this.as.a(this, -1.0D);
      if(var1 != null) {
         double var2 = var1.aw - this.aw;
         double var4 = var1.ax - this.ax;
         double var6 = var1.ay - this.ay;
         double var8 = var2 * var2 + var4 * var4 + var6 * var6;
         if(var8 > 16384.0D) {
            this.J();
         }

         if(this.ag > 600 && this.bd.nextInt(800) == 0) {
            if(var8 < 1024.0D) {
               this.ag = 0;
            } else {
               this.J();
            }
         }
      }

      this.ah = 0.0F;
      this.ai = 0.0F;
      float var10 = 8.0F;
      if(this.bd.nextFloat() < 0.02F) {
         var1 = this.as.a(this, (double)var10);
         if(var1 != null) {
            this.b = var1;
            this.c = 10 + this.bd.nextInt(20);
         } else {
            this.aj = (this.bd.nextFloat() - 0.5F) * 20.0F;
         }
      }

      if(this.b != null) {
         this.b(this.b, 10.0F);
         if(this.c-- <= 0 || this.b.aN || this.b.f(this) > (double)(var10 * var10)) {
            this.b = null;
         }
      } else {
         if(this.bd.nextFloat() < 0.05F) {
            this.aj = (this.bd.nextFloat() - 0.5F) * 20.0F;
         }

         this.aC += this.aj;
         this.aD = this.al;
      }

      boolean var3 = this.h_();
      boolean var11 = this.L();
      if(var3 || var11) {
         this.ak = this.bd.nextFloat() < 0.8F;
      }

   }

   public void b(lw var1, float var2) {
      double var3 = var1.aw - this.aw;
      double var7 = var1.ay - this.ay;
      double var5;
      if(var1 instanceof hf) {
         hf var9 = (hf)var1;
         var5 = var9.ax + (double)var9.v() - (this.ax + (double)this.v());
      } else {
         var5 = (var1.aG.b + var1.aG.e) / 2.0D - (this.ax + (double)this.v());
      }

      double var13 = (double)fi.a(var3 * var3 + var7 * var7);
      float var11 = (float)(Math.atan2(var7, var3) * 180.0D / 3.1415927410125732D) - 90.0F;
      float var12 = (float)(Math.atan2(var5, var13) * 180.0D / 3.1415927410125732D);
      this.aD = -this.b(this.aD, var12, var2);
      this.aC = this.b(this.aC, var11, var2);
   }

   private float b(float var1, float var2, float var3) {
      float var4;
      for(var4 = var2 - var1; var4 < -180.0F; var4 += 360.0F) {
         ;
      }

      while(var4 >= 180.0F) {
         var4 -= 360.0F;
      }

      if(var4 > var3) {
         var4 = var3;
      }

      if(var4 < -var3) {
         var4 = -var3;
      }

      return var1 + var4;
   }

   public void G() {}

   public boolean a() {
      return this.as.a(this.aG) && this.as.a((lw)this, this.aG).size() == 0 && !this.as.b(this.aG);
   }

   protected void H() {
      this.a((lw)null, 4);
   }

   public float d(float var1) {
      float var2 = this.I - this.H;
      if(var2 < 0.0F) {
         ++var2;
      }

      return this.H + var2 * var1;
   }

   public ao e(float var1) {
      if(var1 == 1.0F) {
         return ao.b(this.aw, this.ax, this.ay);
      } else {
         double var2 = this.at + (this.aw - this.at) * (double)var1;
         double var4 = this.au + (this.ax - this.au) * (double)var1;
         double var6 = this.av + (this.ay - this.av) * (double)var1;
         return ao.b(var2, var4, var6);
      }
   }

   public ao I() {
      return this.f(1.0F);
   }

   public ao f(float var1) {
      float var2;
      float var3;
      float var4;
      float var5;
      if(var1 == 1.0F) {
         var2 = fi.b(-this.aC * 0.017453292F - 3.1415927F);
         var3 = fi.a(-this.aC * 0.017453292F - 3.1415927F);
         var4 = -fi.b(-this.aD * 0.017453292F);
         var5 = fi.a(-this.aD * 0.017453292F);
         return ao.b((double)(var3 * var4), (double)var5, (double)(var2 * var4));
      } else {
         var2 = this.aF + (this.aD - this.aF) * var1;
         var3 = this.aE + (this.aC - this.aE) * var1;
         var4 = fi.b(-var3 * 0.017453292F - 3.1415927F);
         var5 = fi.a(-var3 * 0.017453292F - 3.1415927F);
         float var6 = -fi.b(-var2 * 0.017453292F);
         float var7 = fi.a(-var2 * 0.017453292F);
         return ao.b((double)(var5 * var6), (double)var7, (double)(var4 * var6));
      }
   }

   public nx a(double var1, float var3) {
      ao var4 = this.e(var3);
      ao var5 = this.f(var3);
      ao var6 = var4.c(var5.a * var1, var5.b * var1, var5.c * var1);
      return this.as.a(var4, var6);
   }

   public int i() {
      return 4;
   }

   public fp l() {
      return null;
   }

   public void a(byte var1) {
      if(var1 == 2) {
         this.W = 1.5F;
         this.bj = this.o;
         this.L = this.M = 10;
         this.N = 0.0F;
         this.as.a(this, this.f_(), this.h(), (this.bd.nextFloat() - this.bd.nextFloat()) * 0.2F + 1.0F);
         this.a((lw)null, 0);
      } else if(var1 == 3) {
         this.as.a(this, this.f(), this.h(), (this.bd.nextFloat() - this.bd.nextFloat()) * 0.2F + 1.0F);
         this.J = 0;
         this.b((lw)null);
      } else {
         super.a(var1);
      }

   }
}
