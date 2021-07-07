package mojang;

import java.util.Random;

public class ih extends fy {

   public ih(int var1, int var2) {
      super(var1, var2, hb.r, false);
      this.bt = 0.98F;
      this.b(true);
   }

   public int c() {
      return 1;
   }

   public boolean b(pk var1, int var2, int var3, int var4, int var5) {
      return super.b(var1, var2, var3, var4, 1 - var5);
   }

   public void b(cy var1, int var2, int var3, int var4) {
      hb var5 = var1.f(var2, var3 - 1, var4);
      if(var5.c() || var5.d()) {
         var1.d(var2, var3, var4, A.bh);
      }

   }

   public int a(Random var1) {
      return 0;
   }

   public void a(cy var1, int var2, int var3, int var4, Random var5) {
      if(var1.a(ch.b, var2, var3, var4) > 11 - q[this.bh]) {
         this.b_(var1, var2, var3, var4, var1.e(var2, var3, var4));
         var1.d(var2, var3, var4, B.bh);
      }

   }
}
