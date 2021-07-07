package mojang;

import java.util.Random;

public class fz extends nq {

   protected fz(int var1, int var2) {
      super(var1, var2, hb.s);
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
      this.b(true);
   }

   public co d(cy var1, int var2, int var3, int var4) {
      return null;
   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public boolean a(cy var1, int var2, int var3, int var4) {
      int var5 = var1.a(var2, var3 - 1, var4);
      return var5 != 0 && m[var5].a()?var1.f(var2, var3 - 1, var4).c():false;
   }

   public void a(cy var1, int var2, int var3, int var4, int var5) {
      this.h(var1, var2, var3, var4);
   }

   private boolean h(cy var1, int var2, int var3, int var4) {
      if(!this.a(var1, var2, var3, var4)) {
         this.b_(var1, var2, var3, var4, var1.e(var2, var3, var4));
         var1.d(var2, var3, var4, 0);
         return false;
      } else {
         return true;
      }
   }

   public void a_(cy var1, int var2, int var3, int var4, int var5) {
      int var6 = dx.aB.aW;
      float var7 = 0.7F;
      double var8 = (double)(var1.l.nextFloat() * var7) + (double)(1.0F - var7) * 0.5D;
      double var10 = (double)(var1.l.nextFloat() * var7) + (double)(1.0F - var7) * 0.5D;
      double var12 = (double)(var1.l.nextFloat() * var7) + (double)(1.0F - var7) * 0.5D;
      eo var14 = new eo(var1, (double)var2 + var8, (double)var3 + var10, (double)var4 + var12, new fp(var6));
      var14.c = 10;
      var1.a((lw)var14);
      var1.d(var2, var3, var4, 0);
   }

   public int a(int var1, Random var2) {
      return dx.aB.aW;
   }

   public int a(Random var1) {
      return 0;
   }

   public void a(cy var1, int var2, int var3, int var4, Random var5) {
      if(var1.a(ch.b, var2, var3, var4) > 11) {
         this.b_(var1, var2, var3, var4, var1.e(var2, var3, var4));
         var1.d(var2, var3, var4, 0);
      }

   }

   public boolean b(pk var1, int var2, int var3, int var4, int var5) {
      hb var6 = var1.f(var2, var3, var4);
      return var5 == 1?true:(var6 == this.bs?false:super.b(var1, var2, var3, var4, var5));
   }
}
