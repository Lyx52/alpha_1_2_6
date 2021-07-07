package mojang;

import java.util.Random;

public class jn extends nq {

   protected jn(int var1, int var2) {
      super(var1, var2, hb.n);
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
   }

   public co d(cy var1, int var2, int var3, int var4) {
      return null;
   }

   public boolean a() {
      return false;
   }

   public nx a(cy var1, int var2, int var3, int var4, ao var5, ao var6) {
      this.a((pk)var1, var2, var3, var4);
      return super.a(var1, var2, var3, var4, var5, var6);
   }

   public void a(pk var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      if(var5 >= 2 && var5 <= 5) {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.625F, 1.0F);
      } else {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
      }

   }

   public int a(int var1, int var2) {
      return var2 >= 6?this.bg - 16:this.bg;
   }

   public boolean b() {
      return false;
   }

   public int g() {
      return 9;
   }

   public int a(Random var1) {
      return 1;
   }

   public boolean a(cy var1, int var2, int var3, int var4) {
      return var1.g(var2, var3 - 1, var4);
   }

   public void e(cy var1, int var2, int var3, int var4) {
      if(!var1.z) {
         var1.b(var2, var3, var4, 15);
         this.h(var1, var2, var3, var4);
      }

   }

   public void a(cy var1, int var2, int var3, int var4, int var5) {
      if(!var1.z) {
         int var6 = var1.e(var2, var3, var4);
         boolean var7 = false;
         if(!var1.g(var2, var3 - 1, var4)) {
            var7 = true;
         }

         if(var6 == 2 && !var1.g(var2 + 1, var3, var4)) {
            var7 = true;
         }

         if(var6 == 3 && !var1.g(var2 - 1, var3, var4)) {
            var7 = true;
         }

         if(var6 == 4 && !var1.g(var2, var3, var4 - 1)) {
            var7 = true;
         }

         if(var6 == 5 && !var1.g(var2, var3, var4 + 1)) {
            var7 = true;
         }

         if(var7) {
            this.b_(var1, var2, var3, var4, var1.e(var2, var3, var4));
            var1.d(var2, var3, var4, 0);
         } else if(var5 > 0 && m[var5].e() && oc.a(new oc(this, var1, var2, var3, var4)) == 3) {
            this.h(var1, var2, var3, var4);
         }

      }
   }

   private void h(cy var1, int var2, int var3, int var4) {
      if(!var1.z) {
         (new oc(this, var1, var2, var3, var4)).a(var1.o(var2, var3, var4));
      }
   }
}
