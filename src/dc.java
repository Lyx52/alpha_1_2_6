
public class dc extends gm {

   public ka a;
   public ka b;
   public ka c;
   public ka d;
   public ka e;
   public ka f;
   public ka g;
   public boolean h;
   public boolean i;
   public boolean j;


   public dc() {
      this(0.0F);
   }

   public dc(float var1) {
      this(var1, 0.0F);
   }

   public dc(float var1, float var2) {
      this.h = false;
      this.i = false;
      this.j = false;
      this.a = new ka(0, 0);
      this.a.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, var1);
      this.a.a(0.0F, 0.0F + var2, 0.0F);
      this.b = new ka(32, 0);
      this.b.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, var1 + 0.5F);
      this.b.a(0.0F, 0.0F + var2, 0.0F);
      this.c = new ka(16, 16);
      this.c.a(-4.0F, 0.0F, -2.0F, 8, 12, 4, var1);
      this.c.a(0.0F, 0.0F + var2, 0.0F);
      this.d = new ka(40, 16);
      this.d.a(-3.0F, -2.0F, -2.0F, 4, 12, 4, var1);
      this.d.a(-5.0F, 2.0F + var2, 0.0F);
      this.e = new ka(40, 16);
      this.e.g = true;
      this.e.a(-1.0F, -2.0F, -2.0F, 4, 12, 4, var1);
      this.e.a(5.0F, 2.0F + var2, 0.0F);
      this.f = new ka(0, 16);
      this.f.a(-2.0F, 0.0F, -2.0F, 4, 12, 4, var1);
      this.f.a(-2.0F, 12.0F + var2, 0.0F);
      this.g = new ka(0, 16);
      this.g.g = true;
      this.g.a(-2.0F, 0.0F, -2.0F, 4, 12, 4, var1);
      this.g.a(2.0F, 12.0F + var2, 0.0F);
   }

   public void b(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.a(var1, var2, var3, var4, var5, var6);
      this.a.a(var6);
      this.c.a(var6);
      this.d.a(var6);
      this.e.a(var6);
      this.f.a(var6);
      this.g.a(var6);
      this.b.a(var6);
   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.a.e = var4 / 57.295776F;
      this.a.d = var5 / 57.295776F;
      this.b.e = this.a.e;
      this.b.d = this.a.d;
      this.d.d = fi.b(var1 * 0.6662F + 3.1415927F) * 2.0F * var2 * 0.5F;
      this.e.d = fi.b(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
      this.d.f = 0.0F;
      this.e.f = 0.0F;
      this.f.d = fi.b(var1 * 0.6662F) * 1.4F * var2;
      this.g.d = fi.b(var1 * 0.6662F + 3.1415927F) * 1.4F * var2;
      this.f.e = 0.0F;
      this.g.e = 0.0F;
      if(this.l) {
         this.d.d += -0.62831855F;
         this.e.d += -0.62831855F;
         this.f.d = -1.2566371F;
         this.g.d = -1.2566371F;
         this.f.e = 0.31415927F;
         this.g.e = -0.31415927F;
      }

      if(this.h) {
         this.e.d = this.e.d * 0.5F - 0.31415927F;
      }

      if(this.i) {
         this.d.d = this.d.d * 0.5F - 0.31415927F;
      }

      this.d.e = 0.0F;
      this.e.e = 0.0F;
      if(this.k > -9990.0F) {
         float var7 = this.k;
         this.c.e = fi.a(fi.c(var7) * 3.1415927F * 2.0F) * 0.2F;
         this.d.c = fi.a(this.c.e) * 5.0F;
         this.d.a = -fi.b(this.c.e) * 5.0F;
         this.e.c = -fi.a(this.c.e) * 5.0F;
         this.e.a = fi.b(this.c.e) * 5.0F;
         this.d.e += this.c.e;
         this.e.e += this.c.e;
         this.e.d += this.c.e;
         var7 = 1.0F - this.k;
         var7 *= var7;
         var7 *= var7;
         var7 = 1.0F - var7;
         float var8 = fi.a(var7 * 3.1415927F);
         float var9 = fi.a(this.k * 3.1415927F) * -(this.a.d - 0.7F) * 0.75F;
         this.d.d = (float)((double)this.d.d - ((double)var8 * 1.2D + (double)var9));
         this.d.e += this.c.e * 2.0F;
         this.d.f = fi.a(this.k * 3.1415927F) * -0.4F;
      }

      if(this.j) {
         this.c.d = 0.5F;
         this.f.d -= 0.0F;
         this.g.d -= 0.0F;
         this.d.d += 0.4F;
         this.e.d += 0.4F;
         this.f.c = 4.0F;
         this.g.c = 4.0F;
         this.f.b = 9.0F;
         this.g.b = 9.0F;
         this.a.b = 1.0F;
      } else {
         this.c.d = 0.0F;
         this.f.c = 0.0F;
         this.g.c = 0.0F;
         this.f.b = 12.0F;
         this.g.b = 12.0F;
         this.a.b = 0.0F;
      }

      this.d.f += fi.b(var3 * 0.09F) * 0.05F + 0.05F;
      this.e.f -= fi.b(var3 * 0.09F) * 0.05F + 0.05F;
      this.d.d += fi.a(var3 * 0.067F) * 0.05F;
      this.e.d -= fi.a(var3 * 0.067F) * 0.05F;
   }
}
