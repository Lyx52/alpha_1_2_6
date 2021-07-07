package mojang;

import java.io.IOException;
import java.util.List;

public class eb extends hf {

   public fo e = new fo(this);
   public byte f = 0;
   public int g = 0;
   public float h;
   public float i;
   public boolean j = false;
   public int k = 0;
   public String l;
   public int m;
   private int a = 0;
   public hj n = null;


   public eb(cy var1) {
      super(var1);
      this.aO = 1.62F;
      this.c((double)var1.m + 0.5D, (double)(var1.n + 1), (double)var1.o + 0.5D, 0.0F, 0.0F);
      this.J = 20;
      this.C = "humanoid";
      this.B = 180.0F;
      this.bf = 20;
      this.z = "/mojang/mob/char.png";
   }

   public void s() throws IOException {
      super.s();
      this.h = this.i;
      this.i = 0.0F;
   }

   public void t() {
      this.aO = 1.62F;
      this.a(0.6F, 1.8F);
      super.t();
      this.J = 20;
      this.O = 0;
   }

   protected void b_() {
      if(this.j) {
         ++this.k;
         if(this.k == 8) {
            this.k = 0;
            this.j = false;
         }
      } else {
         this.k = 0;
      }

      this.I = (float)this.k / 8.0F;
   }

   public void k() throws IOException {
      if(this.as.k == 0 && this.J < 20 && this.be % 20 * 4 == 0) {
         this.c(1);
      }

      this.e.b();
      this.h = this.i;
      super.k();
      float var1 = fi.a(this.az * this.az + this.aB * this.aB);
      float var2 = (float)Math.atan(-this.aA * 0.20000000298023224D) * 15.0F;
      if(var1 > 0.1F) {
         var1 = 0.1F;
      }

      if(!this.aH || this.J <= 0) {
         var1 = 0.0F;
      }

      if(this.aH || this.J <= 0) {
         var2 = 0.0F;
      }

      this.i += (var1 - this.i) * 0.4F;
      this.R += (var2 - this.R) * 0.8F;
      if(this.J > 0) {
         List var3 = this.as.b((lw)this, this.aG.b(1.0D, 0.0D, 1.0D));
         if(var3 != null) {
            for(int var4 = 0; var4 < var3.size(); ++var4) {
               this.i((lw)var3.get(var4));
            }
         }
      }

   }

   private void i(lw var1) {
      var1.b(this);
   }

   public int u() {
      return this.g;
   }

   public void b(lw var1) {
      super.b(var1);
      this.a(0.2F, 0.2F);
      this.b(this.aw, this.ax, this.ay);
      this.aA = 0.10000000149011612D;
      if(this.l.equals("Notch")) {
         this.a(new fp(dx.h, 1), true);
      }

      this.e.g();
      if(var1 != null) {
         this.az = (double)(-fi.b((this.N + this.aC) * 3.1415927F / 180.0F) * 0.1F);
         this.aB = (double)(-fi.a((this.N + this.aC) * 3.1415927F / 180.0F) * 0.1F);
      } else {
         this.az = this.aB = 0.0D;
      }

      this.aO = 0.1F;
   }

   public void c(lw var1, int var2) {
      this.g += var2;
   }

   public void a(fp var1) {
      this.a(var1, false);
   }

   public void a(fp var1, boolean var2) {
      if(var1 != null) {
         eo var3 = new eo(this.as, this.aw, this.ax - 0.30000001192092896D + (double)this.v(), this.ay, var1);
         var3.c = 40;
         float var4 = 0.1F;
         float var5;
         if(var2) {
            var5 = this.bd.nextFloat() * 0.5F;
            float var6 = this.bd.nextFloat() * 3.1415927F * 2.0F;
            var3.az = (double)(-fi.a(var6) * var5);
            var3.aB = (double)(fi.b(var6) * var5);
            var3.aA = 0.20000000298023224D;
         } else {
            var4 = 0.3F;
            var3.az = (double)(-fi.a(this.aC / 180.0F * 3.1415927F) * fi.b(this.aD / 180.0F * 3.1415927F) * var4);
            var3.aB = (double)(fi.b(this.aC / 180.0F * 3.1415927F) * fi.b(this.aD / 180.0F * 3.1415927F) * var4);
            var3.aA = (double)(-fi.a(this.aD / 180.0F * 3.1415927F) * var4 + 0.1F);
            var4 = 0.02F;
            var5 = this.bd.nextFloat() * 3.1415927F * 2.0F;
            var4 *= this.bd.nextFloat();
            var3.az += Math.cos((double)var5) * (double)var4;
            var3.aA += (double)((this.bd.nextFloat() - this.bd.nextFloat()) * 0.1F);
            var3.aB += Math.sin((double)var5) * (double)var4;
         }

         this.a(var3);
      }
   }

   protected void a(eo var1) {
      this.as.a((lw)var1);
   }

   public float a(nq var1) {
      float var2 = this.e.a(var1);
      if(this.a(hb.f)) {
         var2 /= 5.0F;
      }

      if(!this.aH) {
         var2 /= 5.0F;
      }

      return var2;
   }

   public boolean b(nq var1) {
      return this.e.b(var1);
   }

   public void b(iq var1) {
      super.b(var1);
      ly var2 = var1.l("Inventory");
      this.e.b(var2);
      this.m = var1.e("Dimension");
   }

   public void a(iq var1) {
      super.a(var1);
      var1.a("Inventory", (fd)this.e.a(new ly()));
      var1.a("Dimension", this.m);
   }

   public void a(hi var1) {}

   public void m() {}

   public void b(lw var1, int var2) {}

   public float v() {
      return 0.12F;
   }

   public boolean a(lw var1, int var2) {
      this.ag = 0;
      if(this.J <= 0) {
         return false;
      } else {
         if(var1 instanceof ef || var1 instanceof lv) {
            if(this.as.k == 0) {
               var2 = 0;
            }

            if(this.as.k == 1) {
               var2 = var2 / 3 + 1;
            }

            if(this.as.k == 3) {
               var2 = var2 * 3 / 2;
            }
         }

         return var2 == 0?false:super.a(var1, var2);
      }
   }

   protected void b(int var1) {
      int var2 = 25 - this.e.f();
      int var3 = var1 * var2 + this.a;
      this.e.e(var1);
      var1 = var3 / 25;
      this.a = var3 % 25;
      super.b(var1);
   }

   public void a(lt var1) {}

   public void a(qc var1) {}

   public void a_(lw var1) {
      var1.a(this);
   }

   public fp w() {
      return this.e.a();
   }

   public void x() {
      this.e.a(this.e.d, (fp)null);
   }

   public double y() {
      return (double)(this.aO - 0.5F);
   }

   public void z() {
      this.k = -1;
      this.j = true;
   }

   public void c(lw var1) {
      int var2 = this.e.a(var1);
      if(var2 > 0) {
         var1.a(this, var2);
         fp var3 = this.w();
         if(var3 != null && var1 instanceof hf) {
            var3.a((hf)var1);
            if(var3.a <= 0) {
               var3.a(this);
               this.x();
            }
         }
      }

   }

   public void r() throws IOException {}
}
