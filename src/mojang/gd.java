package mojang;

import java.util.ArrayList;

public class gd extends nq {

   public gd(int var1, int var2) {
      super(var1, var2, hb.c);
   }

   public void a(cy var1, int var2, int var3, int var4, co var5, ArrayList var6) {
      var6.add(co.b((double)var2, (double)var3, (double)var4, (double)(var2 + 1), (double)var3 + 1.5D, (double)(var4 + 1)));
   }

   public boolean a(cy var1, int var2, int var3, int var4) {
      return var1.a(var2, var3 - 1, var4) == this.bh?false:(!var1.f(var2, var3 - 1, var4).a()?false:super.a(var1, var2, var3, var4));
   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public int g() {
      return 11;
   }
}
