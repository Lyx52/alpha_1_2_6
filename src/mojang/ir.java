package mojang;

import java.util.Random;

public class ir extends ld {

   protected ir(int var1, hb var2) {
      super(var1, var2);
      this.b(false);
      if(var2 == hb.g) {
         this.b(true);
      }

   }

   public void a(cy var1, int var2, int var3, int var4, int var5) {
      super.a(var1, var2, var3, var4, var5);
      if(var1.a(var2, var3, var4) == this.bh) {
         this.j(var1, var2, var3, var4);
      }

   }

   private void j(cy var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      var1.i = true;
      var1.a(var2, var3, var4, this.bh - 1, var5);
      var1.b(var2, var3, var4, var2, var3, var4);
      var1.h(var2, var3, var4, this.bh - 1);
      var1.i = false;
   }

   public void a(cy var1, int var2, int var3, int var4, Random var5) {
      if(this.bs == hb.g) {
         int var6 = var5.nextInt(3);

         for(int var7 = 0; var7 < var6; ++var7) {
            var2 += var5.nextInt(3) - 1;
            ++var3;
            var4 += var5.nextInt(3) - 1;
            int var8 = var1.a(var2, var3, var4);
            if(var8 == 0) {
               if(this.k(var1, var2 - 1, var3, var4) || this.k(var1, var2 + 1, var3, var4) || this.k(var1, var2, var3, var4 - 1) || this.k(var1, var2, var3, var4 + 1) || this.k(var1, var2, var3 - 1, var4) || this.k(var1, var2, var3 + 1, var4)) {
                  var1.d(var2, var3, var4, ar.bh);
                  return;
               }
            } else if(m[var8].bs.c()) {
               return;
            }
         }
      }

   }

   private boolean k(cy var1, int var2, int var3, int var4) {
      return var1.f(var2, var3, var4).e();
   }
}
