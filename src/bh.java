
public class bh extends pp {

   public bh(cy var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.i = 1.0F;
      this.j = 1.0F;
      this.k = 1.0F;
      this.b = 32;
      this.a(0.02F, 0.02F);
      this.g *= this.bd.nextFloat() * 0.6F + 0.2F;
      this.az = var8 * 0.20000000298023224D + (double)((float)(Math.random() * 2.0D - 1.0D) * 0.02F);
      this.aA = var10 * 0.20000000298023224D + (double)((float)(Math.random() * 2.0D - 1.0D) * 0.02F);
      this.aB = var12 * 0.20000000298023224D + (double)((float)(Math.random() * 2.0D - 1.0D) * 0.02F);
      this.f = (int)(8.0D / (Math.random() * 0.8D + 0.2D));
   }

   public void e_() {
      this.at = this.aw;
      this.au = this.ax;
      this.av = this.ay;
      this.aA += 0.002D;
      this.d(this.az, this.aA, this.aB);
      this.az *= 0.8500000238418579D;
      this.aA *= 0.8500000238418579D;
      this.aB *= 0.8500000238418579D;
      if(this.as.f(fi.b(this.aw), fi.b(this.ax), fi.b(this.ay)) != hb.f) {
         this.J();
      }

      if(this.f-- <= 0) {
         this.J();
      }

   }
}
