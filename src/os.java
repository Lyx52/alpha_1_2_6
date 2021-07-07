import java.util.Random;

public class os extends nq {

   protected os(int var1) {
      super(var1, hb.b);
      this.bg = 3;
      this.b(true);
   }

   public int a(pk var1, int var2, int var3, int var4, int var5) {
      if(var5 == 1) {
         return 0;
      } else if(var5 == 0) {
         return 2;
      } else {
         hb var6 = var1.f(var2, var3 + 1, var4);
         return var6 != hb.s && var6 != hb.t?3:68;
      }
   }

   public int b(pk var1, int var2, int var3, int var4) {
      var1.a().a(var2, var4, 1, 1);
      double var5 = var1.a().a[0];
      double var7 = var1.a().b[0];
      return ev.a(var5, var7);
   }

   public void a(cy var1, int var2, int var3, int var4, Random var5) {
      if(var1.j(var2, var3 + 1, var4) < 4 && var1.f(var2, var3 + 1, var4).b()) {
         if(var5.nextInt(4) != 0) {
            return;
         }

         var1.d(var2, var3, var4, nq.v.bh);
      } else if(var1.j(var2, var3 + 1, var4) >= 9) {
         int var6 = var2 + var5.nextInt(3) - 1;
         int var7 = var3 + var5.nextInt(5) - 3;
         int var8 = var4 + var5.nextInt(3) - 1;
         if(var1.a(var6, var7, var8) == nq.v.bh && var1.j(var6, var7 + 1, var8) >= 4 && !var1.f(var6, var7 + 1, var8).b()) {
            var1.d(var6, var7, var8, nq.u.bh);
         }
      }

   }

   public int a(int var1, Random var2) {
      return nq.v.a(0, var2);
   }
}
