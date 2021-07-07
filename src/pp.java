
public class pp extends lw {

   protected int b;
   protected float c;
   protected float d;
   protected int e = 0;
   protected int f = 0;
   protected float g;
   protected float h;
   protected float i;
   protected float j;
   protected float k;
   public static double l;
   public static double m;
   public static double n;


   public pp(cy var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1);
      this.a(0.2F, 0.2F);
      this.aO = this.aQ / 2.0F;
      this.b(var2, var4, var6);
      this.i = this.j = this.k = 1.0F;
      this.az = var8 + (double)((float)(Math.random() * 2.0D - 1.0D) * 0.4F);
      this.aA = var10 + (double)((float)(Math.random() * 2.0D - 1.0D) * 0.4F);
      this.aB = var12 + (double)((float)(Math.random() * 2.0D - 1.0D) * 0.4F);
      float var14 = (float)(Math.random() + Math.random() + 1.0D) * 0.15F;
      float var15 = fi.a(this.az * this.az + this.aA * this.aA + this.aB * this.aB);
      this.az = this.az / (double)var15 * (double)var14 * 0.4000000059604645D;
      this.aA = this.aA / (double)var15 * (double)var14 * 0.4000000059604645D + 0.10000000149011612D;
      this.aB = this.aB / (double)var15 * (double)var14 * 0.4000000059604645D;
      this.c = this.bd.nextFloat() * 3.0F;
      this.d = this.bd.nextFloat() * 3.0F;
      this.g = (this.bd.nextFloat() * 0.5F + 0.5F) * 2.0F;
      this.f = (int)(4.0F / (this.bd.nextFloat() * 0.9F + 0.1F));
      this.e = 0;
      this.aT = false;
   }

   public pp b(float var1) {
      this.az *= (double)var1;
      this.aA = (this.aA - 0.10000000149011612D) * (double)var1 + 0.10000000149011612D;
      this.aB *= (double)var1;
      return this;
   }

   public pp d(float var1) {
      this.a(0.2F * var1, 0.2F * var1);
      this.g *= var1;
      return this;
   }

   public void e_() {
      this.at = this.aw;
      this.au = this.ax;
      this.av = this.ay;
      if(this.e++ >= this.f) {
         this.J();
      }

      this.aA -= 0.04D * (double)this.h;
      this.d(this.az, this.aA, this.aB);
      this.az *= 0.9800000190734863D;
      this.aA *= 0.9800000190734863D;
      this.aB *= 0.9800000190734863D;
      if(this.aH) {
         this.az *= 0.699999988079071D;
         this.aB *= 0.699999988079071D;
      }

   }

   public void a(is var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = (float)(this.b % 16) / 16.0F;
      float var9 = var8 + 0.0624375F;
      float var10 = (float)(this.b / 16) / 16.0F;
      float var11 = var10 + 0.0624375F;
      float var12 = 0.1F * this.g;
      float var13 = (float)(this.at + (this.aw - this.at) * (double)var2 - l);
      float var14 = (float)(this.au + (this.ax - this.au) * (double)var2 - m);
      float var15 = (float)(this.av + (this.ay - this.av) * (double)var2 - n);
      float var16 = this.a(var2);
      var1.a(this.i * var16, this.j * var16, this.k * var16);
      var1.a((double)(var13 - var3 * var12 - var6 * var12), (double)(var14 - var4 * var12), (double)(var15 - var5 * var12 - var7 * var12), (double)var8, (double)var11);
      var1.a((double)(var13 - var3 * var12 + var6 * var12), (double)(var14 + var4 * var12), (double)(var15 - var5 * var12 + var7 * var12), (double)var8, (double)var10);
      var1.a((double)(var13 + var3 * var12 + var6 * var12), (double)(var14 + var4 * var12), (double)(var15 + var5 * var12 + var7 * var12), (double)var9, (double)var10);
      var1.a((double)(var13 + var3 * var12 - var6 * var12), (double)(var14 - var4 * var12), (double)(var15 + var5 * var12 - var7 * var12), (double)var9, (double)var11);
   }

   public int l_() {
      return 0;
   }

   public void a(iq var1) {}

   public void b(iq var1) {}
}
