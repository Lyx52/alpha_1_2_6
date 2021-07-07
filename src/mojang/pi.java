package mojang;

public class pi extends pp {

   float a;


   public pi(cy var1, double var2, double var4, double var6) {
      this(var1, var2, var4, var6, 1.0F);
   }

   public pi(cy var1, double var2, double var4, double var6, float var8) {
      super(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
      this.az *= 0.10000000149011612D;
      this.aA *= 0.10000000149011612D;
      this.aB *= 0.10000000149011612D;
      this.i = this.j = this.k = (float)(Math.random() * 0.30000001192092896D);
      this.g *= 0.75F;
      this.g *= var8;
      this.a = this.g;
      this.f = (int)(8.0D / (Math.random() * 0.8D + 0.2D));
      this.f = (int)((float)this.f * var8);
      this.ba = false;
   }

   public void a(is var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = ((float)this.e + var2) / (float)this.f * 32.0F;
      if(var8 < 0.0F) {
         var8 = 0.0F;
      }

      if(var8 > 1.0F) {
         var8 = 1.0F;
      }

      this.g = this.a * var8;
      super.a(var1, var2, var3, var4, var5, var6, var7);
   }

   public void e_() {
      this.at = this.aw;
      this.au = this.ax;
      this.av = this.ay;
      if(this.e++ >= this.f) {
         this.J();
      }

      this.b = 7 - this.e * 8 / this.f;
      this.aA += 0.004D;
      this.d(this.az, this.aA, this.aB);
      if(this.ax == this.au) {
         this.az *= 1.1D;
         this.aB *= 1.1D;
      }

      this.az *= 0.9599999785423279D;
      this.aA *= 0.9599999785423279D;
      this.aB *= 0.9599999785423279D;
      if(this.aH) {
         this.az *= 0.699999988079071D;
         this.aB *= 0.699999988079071D;
      }

   }
}
