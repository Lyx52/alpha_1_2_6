package mojang;

public class kr extends lw {

   public int a;


   public kr(cy var1) {
      super(var1);
      this.a = 0;
      this.ap = true;
      this.a(0.98F, 0.98F);
      this.aO = this.aQ / 2.0F;
   }

   public kr(cy var1, double var2, double var4, double var6) {
      this(var1);
      this.b(var2, var4, var6);
      float var8 = (float)(Math.random() * 3.1415927410125732D * 2.0D);
      this.az = (double)(-fi.a(var8 * 3.1415927F / 180.0F) * 0.02F);
      this.aA = 0.20000000298023224D;
      this.aB = (double)(-fi.b(var8 * 3.1415927F / 180.0F) * 0.02F);
      this.aT = false;
      this.a = 80;
      this.at = var2;
      this.au = var4;
      this.av = var6;
   }

   public boolean n_() {
      return !this.aN;
   }

   public void e_() {
      this.at = this.aw;
      this.au = this.ax;
      this.av = this.ay;
      this.aA -= 0.03999999910593033D;
      this.d(this.az, this.aA, this.aB);
      this.az *= 0.9800000190734863D;
      this.aA *= 0.9800000190734863D;
      this.aB *= 0.9800000190734863D;
      if(this.aH) {
         this.az *= 0.699999988079071D;
         this.aB *= 0.699999988079071D;
         this.aA *= -0.5D;
      }

      if(this.a-- <= 0) {
         this.J();
         this.k();
      } else {
         this.as.a("smoke", this.aw, this.ax + 0.5D, this.ay, 0.0D, 0.0D, 0.0D);
      }

   }

   private void k() {
      float var1 = 4.0F;
      this.as.a((lw)null, this.aw, this.ax, this.ay, var1);
   }

   protected void a(iq var1) {
      var1.a("Fuse", (byte)this.a);
   }

   protected void b(iq var1) {
      this.a = var1.c("Fuse");
   }

   public float i_() {
      return 0.0F;
   }
}
