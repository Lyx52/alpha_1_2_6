
public class pc extends pp {

   public pc(cy var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
      this.az *= 0.30000001192092896D;
      this.aA = (double)((float)Math.random() * 0.2F + 0.1F);
      this.aB *= 0.30000001192092896D;
      this.i = 1.0F;
      this.j = 1.0F;
      this.k = 1.0F;
      this.b = 19 + this.bd.nextInt(4);
      this.a(0.01F, 0.01F);
      this.h = 0.06F;
      this.f = (int)(8.0D / (Math.random() * 0.8D + 0.2D));
   }

   public void a(is var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      super.a(var1, var2, var3, var4, var5, var6, var7);
   }

   public void e_() {
      this.at = this.aw;
      this.au = this.ax;
      this.av = this.ay;
      this.aA -= (double)this.h;
      this.d(this.az, this.aA, this.aB);
      this.az *= 0.9800000190734863D;
      this.aA *= 0.9800000190734863D;
      this.aB *= 0.9800000190734863D;
      if(this.f-- <= 0) {
         this.J();
      }

      if(this.aH) {
         if(Math.random() < 0.5D) {
            this.J();
         }

         this.az *= 0.699999988079071D;
         this.aB *= 0.699999988079071D;
      }

      hb var1 = this.as.f(fi.b(this.aw), fi.b(this.ax), fi.b(this.ay));
      if(var1.d() || var1.a()) {
         double var2 = (double)((float)(fi.b(this.ax) + 1) - ld.b(this.as.e(fi.b(this.aw), fi.b(this.ax), fi.b(this.ay))));
         if(this.ax < var2) {
            this.J();
         }
      }

   }
}
