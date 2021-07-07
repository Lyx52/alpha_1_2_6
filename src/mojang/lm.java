package mojang;

public class lm extends gm {

   public ka a;
   public ka b;
   public ka c;
   public ka d;
   public ka e;
   public ka f;
   public ka g;
   public ka h;
   public ka i;
   public ka j;
   public ka m;


   public lm() {
      float var1 = 0.0F;
      byte var2 = 15;
      this.a = new ka(32, 4);
      this.a.a(-4.0F, -4.0F, -8.0F, 8, 8, 8, var1);
      this.a.a(0.0F, (float)(0 + var2), -3.0F);
      this.b = new ka(0, 0);
      this.b.a(-3.0F, -3.0F, -3.0F, 6, 6, 6, var1);
      this.b.a(0.0F, (float)var2, 0.0F);
      this.c = new ka(0, 12);
      this.c.a(-5.0F, -4.0F, -6.0F, 10, 8, 12, var1);
      this.c.a(0.0F, (float)(0 + var2), 9.0F);
      this.d = new ka(18, 0);
      this.d.a(-15.0F, -1.0F, -1.0F, 16, 2, 2, var1);
      this.d.a(-4.0F, (float)(0 + var2), 2.0F);
      this.e = new ka(18, 0);
      this.e.a(-1.0F, -1.0F, -1.0F, 16, 2, 2, var1);
      this.e.a(4.0F, (float)(0 + var2), 2.0F);
      this.f = new ka(18, 0);
      this.f.a(-15.0F, -1.0F, -1.0F, 16, 2, 2, var1);
      this.f.a(-4.0F, (float)(0 + var2), 1.0F);
      this.g = new ka(18, 0);
      this.g.a(-1.0F, -1.0F, -1.0F, 16, 2, 2, var1);
      this.g.a(4.0F, (float)(0 + var2), 1.0F);
      this.h = new ka(18, 0);
      this.h.a(-15.0F, -1.0F, -1.0F, 16, 2, 2, var1);
      this.h.a(-4.0F, (float)(0 + var2), 0.0F);
      this.i = new ka(18, 0);
      this.i.a(-1.0F, -1.0F, -1.0F, 16, 2, 2, var1);
      this.i.a(4.0F, (float)(0 + var2), 0.0F);
      this.j = new ka(18, 0);
      this.j.a(-15.0F, -1.0F, -1.0F, 16, 2, 2, var1);
      this.j.a(-4.0F, (float)(0 + var2), -1.0F);
      this.m = new ka(18, 0);
      this.m.a(-1.0F, -1.0F, -1.0F, 16, 2, 2, var1);
      this.m.a(4.0F, (float)(0 + var2), -1.0F);
   }

   public void b(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.a(var1, var2, var3, var4, var5, var6);
      this.a.a(var6);
      this.b.a(var6);
      this.c.a(var6);
      this.d.a(var6);
      this.e.a(var6);
      this.f.a(var6);
      this.g.a(var6);
      this.h.a(var6);
      this.i.a(var6);
      this.j.a(var6);
      this.m.a(var6);
   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.a.e = var4 / 57.295776F;
      this.a.d = var5 / 57.295776F;
      float var7 = 0.7853982F;
      this.d.f = -var7;
      this.e.f = var7;
      this.f.f = -var7 * 0.74F;
      this.g.f = var7 * 0.74F;
      this.h.f = -var7 * 0.74F;
      this.i.f = var7 * 0.74F;
      this.j.f = -var7;
      this.m.f = var7;
      float var8 = -0.0F;
      float var9 = 0.3926991F;
      this.d.e = var9 * 2.0F + var8;
      this.e.e = -var9 * 2.0F - var8;
      this.f.e = var9 * 1.0F + var8;
      this.g.e = -var9 * 1.0F - var8;
      this.h.e = -var9 * 1.0F + var8;
      this.i.e = var9 * 1.0F - var8;
      this.j.e = -var9 * 2.0F + var8;
      this.m.e = var9 * 2.0F - var8;
      float var10 = -(fi.b(var1 * 0.6662F * 2.0F + 0.0F) * 0.4F) * var2;
      float var11 = -(fi.b(var1 * 0.6662F * 2.0F + 3.1415927F) * 0.4F) * var2;
      float var12 = -(fi.b(var1 * 0.6662F * 2.0F + 1.5707964F) * 0.4F) * var2;
      float var13 = -(fi.b(var1 * 0.6662F * 2.0F + 4.712389F) * 0.4F) * var2;
      float var14 = Math.abs(fi.a(var1 * 0.6662F + 0.0F) * 0.4F) * var2;
      float var15 = Math.abs(fi.a(var1 * 0.6662F + 3.1415927F) * 0.4F) * var2;
      float var16 = Math.abs(fi.a(var1 * 0.6662F + 1.5707964F) * 0.4F) * var2;
      float var17 = Math.abs(fi.a(var1 * 0.6662F + 4.712389F) * 0.4F) * var2;
      this.d.e += var10;
      this.e.e += -var10;
      this.f.e += var11;
      this.g.e += -var11;
      this.h.e += var12;
      this.i.e += -var12;
      this.j.e += var13;
      this.m.e += -var13;
      this.d.f += var14;
      this.e.f += -var14;
      this.f.f += var15;
      this.g.f += -var15;
      this.h.f += var16;
      this.i.f += -var16;
      this.j.f += var17;
      this.m.f += -var17;
   }
}
