package mojang;

import java.util.Random;

public class kz extends nq {

   protected kz(int var1, int var2) {
      super(var1, hb.i);
      this.bg = var2;
      float var3 = 0.375F;
      this.a(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, 1.0F, 0.5F + var3);
      this.b(true);
   }

   public void a(cy var1, int var2, int var3, int var4, Random var5) {
      if(var1.a(var2, var3 + 1, var4) == 0) {
         int var6;
         for(var6 = 1; var1.a(var2, var3 - var6, var4) == this.bh; ++var6) {
            ;
         }

         if(var6 < 3) {
            int var7 = var1.e(var2, var3, var4);
            if(var7 == 15) {
               var1.d(var2, var3 + 1, var4, this.bh);
               var1.b(var2, var3, var4, 0);
            } else {
               var1.b(var2, var3, var4, var7 + 1);
            }
         }
      }

   }

   public boolean a(cy var1, int var2, int var3, int var4) {
      int var5 = var1.a(var2, var3 - 1, var4);
      return var5 == this.bh?true:(var5 != u.bh && var5 != v.bh?false:(var1.f(var2 - 1, var3 - 1, var4) == hb.f?true:(var1.f(var2 + 1, var3 - 1, var4) == hb.f?true:(var1.f(var2, var3 - 1, var4 - 1) == hb.f?true:var1.f(var2, var3 - 1, var4 + 1) == hb.f))));
   }

   public void a(cy var1, int var2, int var3, int var4, int var5) {
      this.h(var1, var2, var3, var4);
   }

   protected final void h(cy var1, int var2, int var3, int var4) {
      if(!this.g(var1, var2, var3, var4)) {
         this.b_(var1, var2, var3, var4, var1.e(var2, var3, var4));
         var1.d(var2, var3, var4, 0);
      }

   }

   public boolean g(cy var1, int var2, int var3, int var4) {
      return this.a(var1, var2, var3, var4);
   }

   public co d(cy var1, int var2, int var3, int var4) {
      return null;
   }

   public int a(int var1, Random var2) {
      return dx.aH.aW;
   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public int g() {
      return 1;
   }
}
