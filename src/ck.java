
public class ck extends dc {

   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      super.a(var1, var2, var3, var4, var5, var6);
      float var7 = fi.a(this.k * 3.1415927F);
      float var8 = fi.a((1.0F - (1.0F - this.k) * (1.0F - this.k)) * 3.1415927F);
      this.d.f = 0.0F;
      this.e.f = 0.0F;
      this.d.e = -(0.1F - var7 * 0.6F);
      this.e.e = 0.1F - var7 * 0.6F;
      this.d.d = -1.5707964F;
      this.e.d = -1.5707964F;
      this.d.d -= var7 * 1.2F - var8 * 0.4F;
      this.e.d -= var7 * 1.2F - var8 * 0.4F;
      this.d.f += fi.b(var3 * 0.09F) * 0.05F + 0.05F;
      this.e.f -= fi.b(var3 * 0.09F) * 0.05F + 0.05F;
      this.d.d += fi.a(var3 * 0.067F) * 0.05F;
      this.e.d -= fi.a(var3 * 0.067F) * 0.05F;
   }
}
