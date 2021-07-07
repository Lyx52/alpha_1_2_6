package mojang;

public class gb extends lw {

   public int a;
   public int b = 0;


   public gb(cy var1) {
      super(var1);
   }

   public gb(cy var1, float var2, float var3, float var4, int var5) {
      super(var1);
      this.a = var5;
      this.ap = true;
      this.a(0.98F, 0.98F);
      this.aO = this.aQ / 2.0F;
      this.b((double)var2, (double)var3, (double)var4);
      this.az = 0.0D;
      this.aA = 0.0D;
      this.aB = 0.0D;
      this.aT = false;
      this.at = (double)var2;
      this.au = (double)var3;
      this.av = (double)var4;
   }

   public boolean n_() {
      return !this.aN;
   }

   public void e_() {
      if(this.a == 0) {
         this.J();
      } else {
         this.at = this.aw;
         this.au = this.ax;
         this.av = this.ay;
         ++this.b;
         this.aA -= 0.03999999910593033D;
         this.d(this.az, this.aA, this.aB);
         this.az *= 0.9800000190734863D;
         this.aA *= 0.9800000190734863D;
         this.aB *= 0.9800000190734863D;
         int var1 = fi.b(this.aw);
         int var2 = fi.b(this.ax);
         int var3 = fi.b(this.ay);
         if(this.as.a(var1, var2, var3) == this.a) {
            this.as.d(var1, var2, var3, 0);
         }

         if(this.aH) {
            this.az *= 0.699999988079071D;
            this.aB *= 0.699999988079071D;
            this.aA *= -0.5D;
            this.J();
            if(!this.as.a(this.a, var1, var2, var3, true) || !this.as.d(var1, var2, var3, this.a)) {
               this.b(this.a, 1);
            }
         } else if(this.b > 100) {
            this.b(this.a, 1);
            this.J();
         }

      }
   }

   protected void a(iq var1) {
      var1.a("Tile", (byte)this.a);
   }

   protected void b(iq var1) {
      this.a = var1.c("Tile") & 255;
   }

   public float i_() {
      return 0.0F;
   }

   public cy k() {
      return this.as;
   }
}
