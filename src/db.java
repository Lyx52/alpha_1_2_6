
public class db extends pp {

   private float a;


   public db(cy var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
      this.az *= 0.800000011920929D;
      this.aA *= 0.800000011920929D;
      this.aB *= 0.800000011920929D;
      this.aA = (double)(this.bd.nextFloat() * 0.4F + 0.05F);
      this.i = this.j = this.k = 1.0F;
      this.g *= this.bd.nextFloat() * 2.0F + 0.2F;
      this.a = this.g;
      this.f = (int)(16.0D / (Math.random() * 0.8D + 0.2D));
      this.ba = false;
      this.b = 49;
   }

   public float a(float var1) {
      return 1.0F;
   }

   public void a(is var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = ((float)this.e + var2) / (float)this.f;
      this.g = this.a * (1.0F - var8 * var8);
      super.a(var1, var2, var3, var4, var5, var6, var7);
   }

   public void e_() {
      this.at = this.aw;
      this.au = this.ax;
      this.av = this.ay;
      if(this.e++ >= this.f) {
         this.J();
      }

      float var1 = (float)this.e / (float)this.f;
      if(this.bd.nextFloat() > var1) {
         this.as.a("smoke", this.aw, this.ax, this.ay, this.az, this.aA, this.aB);
      }

      this.aA -= 0.03D;
      this.d(this.az, this.aA, this.aB);
      this.az *= 0.9990000128746033D;
      this.aA *= 0.9990000128746033D;
      this.aB *= 0.9990000128746033D;
      if(this.aH) {
         this.az *= 0.699999988079071D;
         this.aB *= 0.699999988079071D;
      }

   }
}
