package mojang;

import java.io.IOException;
import java.util.List;

public class lv extends lw {

   private int c = -1;
   private int d = -1;
   private int e = -1;
   private int f = 0;
   private boolean g = false;
   public int a = 0;
   public hf b;
   private int h;
   private int i = 0;


   public lv(cy var1) {
      super(var1);
      this.a(0.5F, 0.5F);
   }

   public lv(cy var1, double var2, double var4, double var6) {
      super(var1);
      this.a(0.5F, 0.5F);
      this.b(var2, var4, var6);
      this.aO = 0.0F;
   }

   public lv(cy var1, hf var2) {
      super(var1);
      this.b = var2;
      this.a(0.5F, 0.5F);
      this.c(var2.aw, var2.ax + (double)var2.v(), var2.ay, var2.aC, var2.aD);
      this.aw -= (double)(fi.b(this.aC / 180.0F * 3.1415927F) * 0.16F);
      this.ax -= 0.10000000149011612D;
      this.ay -= (double)(fi.a(this.aC / 180.0F * 3.1415927F) * 0.16F);
      this.b(this.aw, this.ax, this.ay);
      this.aO = 0.0F;
      this.az = (double)(-fi.a(this.aC / 180.0F * 3.1415927F) * fi.b(this.aD / 180.0F * 3.1415927F));
      this.aB = (double)(fi.b(this.aC / 180.0F * 3.1415927F) * fi.b(this.aD / 180.0F * 3.1415927F));
      this.aA = (double)(-fi.a(this.aD / 180.0F * 3.1415927F));
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
      this.h = 0;
   }

   public void a(double var1, double var3, double var5) {
      this.az = var1;
      this.aA = var3;
      this.aB = var5;
      if(this.aF == 0.0F && this.aE == 0.0F) {
         float var7 = fi.a(var1 * var1 + var5 * var5);
         this.aE = this.aC = (float)(Math.atan2(var1, var5) * 180.0D / 3.1415927410125732D);
         this.aF = this.aD = (float)(Math.atan2(var3, (double)var7) * 180.0D / 3.1415927410125732D);
      }

   }

   public void e_() throws IOException {
      super.e_();
      if(this.aF == 0.0F && this.aE == 0.0F) {
         float var1 = fi.a(this.az * this.az + this.aB * this.aB);
         this.aE = this.aC = (float)(Math.atan2(this.az, this.aB) * 180.0D / 3.1415927410125732D);
         this.aF = this.aD = (float)(Math.atan2(this.aA, (double)var1) * 180.0D / 3.1415927410125732D);
      }

      if(this.a > 0) {
         --this.a;
      }

      if(this.g) {
         int var15 = this.as.a(this.c, this.d, this.e);
         if(var15 == this.f) {
            ++this.h;
            if(this.h == 1200) {
               this.J();
            }

            return;
         }

         this.g = false;
         this.az *= (double)(this.bd.nextFloat() * 0.2F);
         this.aA *= (double)(this.bd.nextFloat() * 0.2F);
         this.aB *= (double)(this.bd.nextFloat() * 0.2F);
         this.h = 0;
         this.i = 0;
      } else {
         ++this.i;
      }

      ao var16 = mojang.ao.b(this.aw, this.ax, this.ay);
      ao var2 = mojang.ao.b(this.aw + this.az, this.ax + this.aA, this.ay + this.aB);
      nx var3 = this.as.a(var16, var2);
      var16 = mojang.ao.b(this.aw, this.ax, this.ay);
      var2 = mojang.ao.b(this.aw + this.az, this.ax + this.aA, this.ay + this.aB);
      if(var3 != null) {
         var2 = mojang.ao.b(var3.f.a, var3.f.b, var3.f.c);
      }

      lw var4 = null;
      List var5 = this.as.b((lw)this, this.aG.a(this.az, this.aA, this.aB).b(1.0D, 1.0D, 1.0D));
      double var6 = 0.0D;

      float var10;
      for(int var8 = 0; var8 < var5.size(); ++var8) {
         lw var9 = (lw)var5.get(var8);
         if(var9.n_() && (var9 != this.b || this.i >= 5)) {
            var10 = 0.3F;
            co var11 = var9.aG.b((double)var10, (double)var10, (double)var10);
            nx var12 = var11.a(var16, var2);
            if(var12 != null) {
               double var13 = var16.c(var12.f);
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

      float var17;
      if(var3 != null) {
         if(var3.g != null) {
            if(var3.g.a(this.b, 4)) {
               this.as.a(this, "random.drr", 1.0F, 1.2F / (this.bd.nextFloat() * 0.2F + 0.9F));
               this.J();
            } else {
               this.az *= -0.10000000149011612D;
               this.aA *= -0.10000000149011612D;
               this.aB *= -0.10000000149011612D;
               this.aC += 180.0F;
               this.aE += 180.0F;
               this.i = 0;
            }
         } else {
            this.c = var3.b;
            this.d = var3.c;
            this.e = var3.d;
            this.f = this.as.a(this.c, this.d, this.e);
            this.az = (double)((float)(var3.f.a - this.aw));
            this.aA = (double)((float)(var3.f.b - this.ax));
            this.aB = (double)((float)(var3.f.c - this.ay));
            var17 = fi.a(this.az * this.az + this.aA * this.aA + this.aB * this.aB);
            this.aw -= this.az / (double)var17 * 0.05000000074505806D;
            this.ax -= this.aA / (double)var17 * 0.05000000074505806D;
            this.ay -= this.aB / (double)var17 * 0.05000000074505806D;
            this.as.a(this, "random.drr", 1.0F, 1.2F / (this.bd.nextFloat() * 0.2F + 0.9F));
            this.g = true;
            this.a = 7;
         }
      }

      this.aw += this.az;
      this.ax += this.aA;
      this.ay += this.aB;
      var17 = fi.a(this.az * this.az + this.aB * this.aB);
      this.aC = (float)(Math.atan2(this.az, this.aB) * 180.0D / 3.1415927410125732D);

      for(this.aD = (float)(Math.atan2(this.aA, (double)var17) * 180.0D / 3.1415927410125732D); this.aD - this.aF < -180.0F; this.aF -= 360.0F) {
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
      float var18 = 0.99F;
      var10 = 0.03F;
      if(this.h_()) {
         for(int var19 = 0; var19 < 4; ++var19) {
            float var20 = 0.25F;
            this.as.a("bubble", this.aw - this.az * (double)var20, this.ax - this.aA * (double)var20, this.ay - this.aB * (double)var20, this.az, this.aA, this.aB);
         }

         var18 = 0.8F;
      }

      this.az *= (double)var18;
      this.aA *= (double)var18;
      this.aB *= (double)var18;
      this.aA -= (double)var10;
      this.b(this.aw, this.ax, this.ay);
   }

   public void a(iq var1) {
      var1.a("xTile", (short)this.c);
      var1.a("yTile", (short)this.d);
      var1.a("zTile", (short)this.e);
      var1.a("inTile", (byte)this.f);
      var1.a("shake", (byte)this.a);
      var1.a("inGround", (byte)(this.g?1:0));
   }

   public void b(iq var1) {
      this.c = var1.d("xTile");
      this.d = var1.d("yTile");
      this.e = var1.d("zTile");
      this.f = var1.c("inTile") & 255;
      this.a = var1.c("shake") & 255;
      this.g = var1.c("inGround") == 1;
   }

   public void b(eb var1) {
      if(!this.as.z) {
         if(this.g && this.b == var1 && this.a <= 0 && var1.e.a(new fp(dx.j.aW, 1))) {
            this.as.a(this, "random.pop", 0.2F, ((this.bd.nextFloat() - this.bd.nextFloat()) * 0.7F + 1.0F) * 2.0F);
            var1.b(this, 1);
            this.J();
         }

      }
   }

   public float i_() {
      return 0.0F;
   }
}
