package mojang;

import mojang.world.World;

public class ee extends pp {

   public ee(World var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.az = var8 + (double)((float)(Math.random() * 2.0D - 1.0D) * 0.05F);
      this.aA = var10 + (double)((float)(Math.random() * 2.0D - 1.0D) * 0.05F);
      this.aB = var12 + (double)((float)(Math.random() * 2.0D - 1.0D) * 0.05F);
      this.i = this.j = this.k = this.bd.nextFloat() * 0.3F + 0.7F;
      this.g = this.bd.nextFloat() * this.bd.nextFloat() * 6.0F + 1.0F;
      this.f = (int)(16.0D / ((double)this.bd.nextFloat() * 0.8D + 0.2D)) + 2;
   }

   public void a(is var1, float var2, float var3, float var4, float var5, float var6, float var7) {
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
      this.az *= 0.8999999761581421D;
      this.aA *= 0.8999999761581421D;
      this.aB *= 0.8999999761581421D;
      if(this.aH) {
         this.az *= 0.699999988079071D;
         this.aB *= 0.699999988079071D;
      }

   }
}
