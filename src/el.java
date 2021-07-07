
public class el extends ij {

   ka a;
   ka b;
   ka c;


   public el() {
      super(12, 0.0F);
      this.d = new ka(0, 0);
      this.d.a(-4.0F, -4.0F, -6.0F, 8, 8, 6, 0.0F);
      this.d.a(0.0F, 4.0F, -8.0F);
      this.b = new ka(22, 0);
      this.b.a(-4.0F, -5.0F, -4.0F, 1, 3, 1, 0.0F);
      this.b.a(0.0F, 3.0F, -7.0F);
      this.c = new ka(22, 0);
      this.c.a(4.0F, -5.0F, -4.0F, 1, 3, 1, 0.0F);
      this.c.a(0.0F, 3.0F, -7.0F);
      this.a = new ka(52, 0);
      this.a.a(-2.0F, -3.0F, 0.0F, 4, 6, 2, 0.0F);
      this.a.a(0.0F, 14.0F, 6.0F);
      this.a.d = 1.5707964F;
      this.e = new ka(18, 4);
      this.e.a(-6.0F, -10.0F, -7.0F, 12, 18, 10, 0.0F);
      this.e.a(0.0F, 5.0F, 2.0F);
      --this.f.a;
      ++this.g.a;
      this.f.c += 0.0F;
      this.g.c += 0.0F;
      --this.h.a;
      ++this.i.a;
      --this.h.c;
      --this.i.c;
   }

   public void b(float var1, float var2, float var3, float var4, float var5, float var6) {
      super.b(var1, var2, var3, var4, var5, var6);
      this.b.a(var6);
      this.c.a(var6);
      this.a.a(var6);
   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      super.a(var1, var2, var3, var4, var5, var6);
      this.b.e = this.d.e;
      this.b.d = this.d.d;
      this.c.e = this.d.e;
      this.c.d = this.d.d;
   }
}
