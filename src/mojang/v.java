package mojang;

import java.util.Random;

public class v extends nq {

   public v(int var1, int var2) {
      super(var1, var2, hb.p);
   }

   public int a(int var1) {
      return var1 == 0?this.bg + 2:(var1 == 1?this.bg + 1:this.bg);
   }

   public void a(cy var1, int var2, int var3, int var4, int var5) {
      if(var5 > 0 && m[var5].e() && var1.o(var2, var3, var4)) {
         this.b(var1, var2, var3, var4, 0);
         var1.d(var2, var3, var4, 0);
      }

   }

   public int a(Random var1) {
      return 0;
   }

   public void c(cy var1, int var2, int var3, int var4) {
      kr var5 = new kr(var1, (double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F));
      var5.a = var1.l.nextInt(var5.a / 4) + var5.a / 8;
      var1.a((lw)var5);
   }

   public void b(cy var1, int var2, int var3, int var4, int var5) {
      if(!var1.z) {
         kr var6 = new kr(var1, (double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F));
         var1.a((lw)var6);
         var1.a(var6, "random.fuse", 1.0F, 1.0F);
      }
   }
}
