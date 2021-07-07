package mojang;

import java.io.File;

public class om extends oz {

   public void a() {
      this.b = new ei(gg.l, 1.0D, 0.0D);
      this.c = true;
      this.d = true;
      this.e = true;
      this.g = -1;
   }

   public ao a(float var1, float var2) {
      return ao.b(0.20000000298023224D, 0.029999999329447746D, 0.029999999329447746D);
   }

   protected void b() {
      float var1 = 0.1F;

      for(int var2 = 0; var2 <= 15; ++var2) {
         float var3 = 1.0F - (float)var2 / 15.0F;
         this.f[var2] = (1.0F - var3) / (var3 * 3.0F + 1.0F) * (1.0F - var1) + var1;
      }

   }

   public bd c() {
      return new kj(this.a, this.a.u);
   }

   public ai a(File var1) {
      File var2 = new File(var1, "DIM-1");
      var2.mkdirs();
      return new mu(var2, true);
   }

   public boolean a(int var1, int var2) {
      int var3 = this.a.a(var1, var2);
      return var3 == nq.z.bh?false:(var3 == 0?false:nq.o[var3]);
   }

   public float a(long var1, float var3) {
      return 0.5F;
   }

   public boolean d() {
      return false;
   }
}
