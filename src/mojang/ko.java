package mojang;

import mojang.world.World;

public class ko extends pp {

   private float a;


   public ko(World var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.az = this.az * 0.009999999776482582D + var8;
      this.aA = this.aA * 0.009999999776482582D + var10;
      this.aB = this.aB * 0.009999999776482582D + var12;
      double var10000 = var2 + (double)((this.bd.nextFloat() - this.bd.nextFloat()) * 0.05F);
      var10000 = var4 + (double)((this.bd.nextFloat() - this.bd.nextFloat()) * 0.05F);
      var10000 = var6 + (double)((this.bd.nextFloat() - this.bd.nextFloat()) * 0.05F);
      this.a = this.g;
      this.i = this.j = this.k = 1.0F;
      this.f = (int)(8.0D / (Math.random() * 0.8D + 0.2D)) + 4;
      this.ba = true;
      this.b = 48;
   }

   public void a(is var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = ((float)this.e + var2) / (float)this.f;
      this.g = this.a * (1.0F - var8 * var8 * 0.5F);
      super.a(var1, var2, var3, var4, var5, var6, var7);
   }

   public float a(float var1) {
      float var2 = ((float)this.e + var1) / (float)this.f;
      if(var2 < 0.0F) {
         var2 = 0.0F;
      }

      if(var2 > 1.0F) {
         var2 = 1.0F;
      }

      float var3 = super.a(var1);
      return var3 * var2 + (1.0F - var2);
   }

   public void e_() {
      this.at = this.aw;
      this.au = this.ax;
      this.av = this.ay;
      if(this.e++ >= this.f) {
         this.J();
      }

      this.d(this.az, this.aA, this.aB);
      this.az *= 0.9599999785423279D;
      this.aA *= 0.9599999785423279D;
      this.aB *= 0.9599999785423279D;
      if(this.aH) {
         this.az *= 0.699999988079071D;
         this.aB *= 0.699999988079071D;
      }

   }
}
