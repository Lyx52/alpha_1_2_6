
public class eo extends lw {

   public fp a;
   private int e;
   public int b = 0;
   public int c;
   private int f = 5;
   public float d = (float)(Math.random() * 3.141592653589793D * 2.0D);


   public eo(cy var1, double var2, double var4, double var6, fp var8) {
      super(var1);
      this.a(0.25F, 0.25F);
      this.aO = this.aQ / 2.0F;
      this.b(var2, var4, var6);
      this.a = var8;
      this.aC = (float)(Math.random() * 360.0D);
      this.az = (double)((float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D));
      this.aA = 0.20000000298023224D;
      this.aB = (double)((float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D));
      this.aT = false;
   }

   public eo(cy var1) {
      super(var1);
      this.a(0.25F, 0.25F);
      this.aO = this.aQ / 2.0F;
   }

   public void e_() {
      super.e_();
      if(this.c > 0) {
         --this.c;
      }

      this.at = this.aw;
      this.au = this.ax;
      this.av = this.ay;
      this.aA -= 0.03999999910593033D;
      if(this.as.f(fi.b(this.aw), fi.b(this.ax), fi.b(this.ay)) == hb.g) {
         this.aA = 0.20000000298023224D;
         this.az = (double)((this.bd.nextFloat() - this.bd.nextFloat()) * 0.2F);
         this.aB = (double)((this.bd.nextFloat() - this.bd.nextFloat()) * 0.2F);
         this.as.a(this, "random.fizz", 0.4F, 2.0F + this.bd.nextFloat() * 0.4F);
      }

      this.h(this.aw, this.ax, this.ay);
      this.h_();
      this.d(this.az, this.aA, this.aB);
      float var1 = 0.98F;
      if(this.aH) {
         var1 = 0.58800006F;
         int var2 = this.as.a(fi.b(this.aw), fi.b(this.aG.b) - 1, fi.b(this.ay));
         if(var2 > 0) {
            var1 = nq.m[var2].bt * 0.98F;
         }
      }

      this.az *= (double)var1;
      this.aA *= 0.9800000190734863D;
      this.aB *= (double)var1;
      if(this.aH) {
         this.aA *= -0.5D;
      }

      ++this.e;
      ++this.b;
      if(this.b >= 6000) {
         this.J();
      }

   }

   public boolean h_() {
      return this.as.a(this.aG, hb.f, this);
   }

   private boolean h(double var1, double var3, double var5) {
      int var7 = fi.b(var1);
      int var8 = fi.b(var3);
      int var9 = fi.b(var5);
      double var10 = var1 - (double)var7;
      double var12 = var3 - (double)var8;
      double var14 = var5 - (double)var9;
      if(nq.o[this.as.a(var7, var8, var9)]) {
         boolean var16 = !nq.o[this.as.a(var7 - 1, var8, var9)];
         boolean var17 = !nq.o[this.as.a(var7 + 1, var8, var9)];
         boolean var18 = !nq.o[this.as.a(var7, var8 - 1, var9)];
         boolean var19 = !nq.o[this.as.a(var7, var8 + 1, var9)];
         boolean var20 = !nq.o[this.as.a(var7, var8, var9 - 1)];
         boolean var21 = !nq.o[this.as.a(var7, var8, var9 + 1)];
         byte var22 = -1;
         double var23 = 9999.0D;
         if(var16 && var10 < var23) {
            var23 = var10;
            var22 = 0;
         }

         if(var17 && 1.0D - var10 < var23) {
            var23 = 1.0D - var10;
            var22 = 1;
         }

         if(var18 && var12 < var23) {
            var23 = var12;
            var22 = 2;
         }

         if(var19 && 1.0D - var12 < var23) {
            var23 = 1.0D - var12;
            var22 = 3;
         }

         if(var20 && var14 < var23) {
            var23 = var14;
            var22 = 4;
         }

         if(var21 && 1.0D - var14 < var23) {
            var23 = 1.0D - var14;
            var22 = 5;
         }

         float var25 = this.bd.nextFloat() * 0.2F + 0.1F;
         if(var22 == 0) {
            this.az = (double)(-var25);
         }

         if(var22 == 1) {
            this.az = (double)var25;
         }

         if(var22 == 2) {
            this.aA = (double)(-var25);
         }

         if(var22 == 3) {
            this.aA = (double)var25;
         }

         if(var22 == 4) {
            this.aB = (double)(-var25);
         }

         if(var22 == 5) {
            this.aB = (double)var25;
         }
      }

      return false;
   }

   protected void a(int var1) {
      this.a((lw)null, var1);
   }

   public boolean a(lw var1, int var2) {
      this.M();
      this.f -= var2;
      if(this.f <= 0) {
         this.J();
      }

      return false;
   }

   public void a(iq var1) {
      var1.a("Health", (short)((byte)this.f));
      var1.a("Age", (short)this.b);
      var1.a("Item", this.a.a(new iq()));
   }

   public void b(iq var1) {
      this.f = var1.d("Health") & 255;
      this.b = var1.d("Age");
      iq var2 = var1.k("Item");
      this.a = new fp(var2);
   }

   public void b(eb var1) {
      if(!this.as.z) {
         int var2 = this.a.a;
         if(this.c == 0 && var1.e.a(this.a)) {
            this.as.a(this, "random.pop", 0.2F, ((this.bd.nextFloat() - this.bd.nextFloat()) * 0.7F + 1.0F) * 2.0F);
            var1.b(this, var2);
            this.J();
         }

      }
   }
}
