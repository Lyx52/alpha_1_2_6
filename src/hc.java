import java.util.Random;

public class hc extends gm {

   ka a;
   ka[] b = new ka[9];


   public hc() {
      byte var1 = -16;
      this.a = new ka(0, 0);
      this.a.a(-8.0F, -8.0F, -8.0F, 16, 16, 16);
      this.a.b += (float)(24 + var1);
      Random var2 = new Random(1660L);

      for(int var3 = 0; var3 < this.b.length; ++var3) {
         this.b[var3] = new ka(0, 0);
         float var4 = (((float)(var3 % 3) - (float)(var3 / 3 % 2) * 0.5F + 0.25F) / 2.0F * 2.0F - 1.0F) * 5.0F;
         float var5 = ((float)(var3 / 3) / 2.0F * 2.0F - 1.0F) * 5.0F;
         int var6 = var2.nextInt(7) + 8;
         this.b[var3].a(-1.0F, 0.0F, -1.0F, 2, var6, 2);
         this.b[var3].a = var4;
         this.b[var3].c = var5;
         this.b[var3].b = (float)(31 + var1);
      }

   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      for(int var7 = 0; var7 < this.b.length; ++var7) {
         this.b[var7].d = 0.2F * fi.a(var3 * 0.3F + (float)var7) + 0.4F;
      }

   }

   public void b(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.a(var1, var2, var3, var4, var5, var6);
      this.a.a(var6);

      for(int var7 = 0; var7 < this.b.length; ++var7) {
         this.b[var7].a(var6);
      }

   }
}
