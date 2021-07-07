package mojang;

public class ij extends gm {

   public ka d = new ka(0, 0);
   public ka e;
   public ka f;
   public ka g;
   public ka h;
   public ka i;


   public ij(int var1, float var2) {
      this.d.a(-4.0F, -4.0F, -8.0F, 8, 8, 8, var2);
      this.d.a(0.0F, (float)(18 - var1), -6.0F);
      this.e = new ka(28, 8);
      this.e.a(-5.0F, -10.0F, -7.0F, 10, 16, 8, var2);
      this.e.a(0.0F, (float)(17 - var1), 2.0F);
      this.f = new ka(0, 16);
      this.f.a(-2.0F, 0.0F, -2.0F, 4, var1, 4, var2);
      this.f.a(-3.0F, (float)(24 - var1), 7.0F);
      this.g = new ka(0, 16);
      this.g.a(-2.0F, 0.0F, -2.0F, 4, var1, 4, var2);
      this.g.a(3.0F, (float)(24 - var1), 7.0F);
      this.h = new ka(0, 16);
      this.h.a(-2.0F, 0.0F, -2.0F, 4, var1, 4, var2);
      this.h.a(-3.0F, (float)(24 - var1), -5.0F);
      this.i = new ka(0, 16);
      this.i.a(-2.0F, 0.0F, -2.0F, 4, var1, 4, var2);
      this.i.a(3.0F, (float)(24 - var1), -5.0F);
   }

   public void b(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.a(var1, var2, var3, var4, var5, var6);
      this.d.a(var6);
      this.e.a(var6);
      this.f.a(var6);
      this.g.a(var6);
      this.h.a(var6);
      this.i.a(var6);
   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.d.d = -(var5 / 57.295776F);
      this.d.e = var4 / 57.295776F;
      this.e.d = 1.5707964F;
      this.f.d = fi.b(var1 * 0.6662F) * 1.4F * var2;
      this.g.d = fi.b(var1 * 0.6662F + 3.1415927F) * 1.4F * var2;
      this.h.d = fi.b(var1 * 0.6662F + 3.1415927F) * 1.4F * var2;
      this.i.d = fi.b(var1 * 0.6662F) * 1.4F * var2;
   }
}
