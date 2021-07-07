package mojang;

public class jd extends pp {

   private float a;
   private double o;
   private double p;
   private double q;


   public jd(cy var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.az = var8;
      this.aA = var10;
      this.aB = var12;
      this.o = this.aw = var2;
      this.p = this.ax = var4;
      this.q = this.ay = var6;
      float var14 = this.bd.nextFloat() * 0.6F + 0.4F;
      this.a = this.g = this.bd.nextFloat() * 0.2F + 0.5F;
      this.i = this.j = this.k = 1.0F * var14;
      this.j *= 0.3F;
      this.i *= 0.9F;
      this.f = (int)(Math.random() * 10.0D) + 40;
      this.ba = true;
      this.b = (int)(Math.random() * 8.0D);
   }

   public void a(is var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = ((float)this.e + var2) / (float)this.f;
      var8 = 1.0F - var8;
      var8 *= var8;
      var8 = 1.0F - var8;
      this.g = this.a * var8;
      super.a(var1, var2, var3, var4, var5, var6, var7);
   }

   public float a(float var1) {
      float var2 = super.a(var1);
      float var3 = (float)this.e / (float)this.f;
      var3 *= var3;
      var3 *= var3;
      return var2 * (1.0F - var3) + var3;
   }

   public void e_() {
      this.at = this.aw;
      this.au = this.ax;
      this.av = this.ay;
      float var1 = (float)this.e / (float)this.f;
      float var2 = var1;
      var1 = -var1 + var1 * var1 * 2.0F;
      var1 = 1.0F - var1;
      this.aw = this.o + this.az * (double)var1;
      this.ax = this.p + this.aA * (double)var1 + (double)(1.0F - var2);
      this.ay = this.q + this.aB * (double)var1;
      if(this.e++ >= this.f) {
         this.J();
      }

   }
}
