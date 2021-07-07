package mojang;

import java.util.Random;

public class ob extends nq {

   protected ob(int var1, int var2) {
      super(var1, var2, hb.n);
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

   public int g() {
      return 2;
   }

   public boolean a(cy var1, int var2, int var3, int var4) {
      return var1.g(var2 - 1, var3, var4)?true:(var1.g(var2 + 1, var3, var4)?true:(var1.g(var2, var3, var4 - 1)?true:(var1.g(var2, var3, var4 + 1)?true:var1.g(var2, var3 - 1, var4))));
   }

   public void d(cy var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.e(var2, var3, var4);
      if(var5 == 1 && var1.g(var2, var3 - 1, var4)) {
         var6 = 5;
      }

      if(var5 == 2 && var1.g(var2, var3, var4 + 1)) {
         var6 = 4;
      }

      if(var5 == 3 && var1.g(var2, var3, var4 - 1)) {
         var6 = 3;
      }

      if(var5 == 4 && var1.g(var2 + 1, var3, var4)) {
         var6 = 2;
      }

      if(var5 == 5 && var1.g(var2 - 1, var3, var4)) {
         var6 = 1;
      }

      var1.b(var2, var3, var4, var6);
   }

   public void a(cy var1, int var2, int var3, int var4, Random var5) {
      super.a(var1, var2, var3, var4, var5);
      if(var1.e(var2, var3, var4) == 0) {
         this.e(var1, var2, var3, var4);
      }

   }

   public void e(cy var1, int var2, int var3, int var4) {
      if(var1.g(var2 - 1, var3, var4)) {
         var1.b(var2, var3, var4, 1);
      } else if(var1.g(var2 + 1, var3, var4)) {
         var1.b(var2, var3, var4, 2);
      } else if(var1.g(var2, var3, var4 - 1)) {
         var1.b(var2, var3, var4, 3);
      } else if(var1.g(var2, var3, var4 + 1)) {
         var1.b(var2, var3, var4, 4);
      } else if(var1.g(var2, var3 - 1, var4)) {
         var1.b(var2, var3, var4, 5);
      }

      this.h(var1, var2, var3, var4);
   }

   public void a(cy var1, int var2, int var3, int var4, int var5) {
      if(this.h(var1, var2, var3, var4)) {
         int var6 = var1.e(var2, var3, var4);
         boolean var7 = false;
         if(!var1.g(var2 - 1, var3, var4) && var6 == 1) {
            var7 = true;
         }

         if(!var1.g(var2 + 1, var3, var4) && var6 == 2) {
            var7 = true;
         }

         if(!var1.g(var2, var3, var4 - 1) && var6 == 3) {
            var7 = true;
         }

         if(!var1.g(var2, var3, var4 + 1) && var6 == 4) {
            var7 = true;
         }

         if(!var1.g(var2, var3 - 1, var4) && var6 == 5) {
            var7 = true;
         }

         if(var7) {
            this.b_(var1, var2, var3, var4, var1.e(var2, var3, var4));
            var1.d(var2, var3, var4, 0);
         }
      }

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

   public nx a(cy var1, int var2, int var3, int var4, ao var5, ao var6) {
      int var7 = var1.e(var2, var3, var4) & 7;
      float var8 = 0.15F;
      if(var7 == 1) {
         this.a(0.0F, 0.2F, 0.5F - var8, var8 * 2.0F, 0.8F, 0.5F + var8);
      } else if(var7 == 2) {
         this.a(1.0F - var8 * 2.0F, 0.2F, 0.5F - var8, 1.0F, 0.8F, 0.5F + var8);
      } else if(var7 == 3) {
         this.a(0.5F - var8, 0.2F, 0.0F, 0.5F + var8, 0.8F, var8 * 2.0F);
      } else if(var7 == 4) {
         this.a(0.5F - var8, 0.2F, 1.0F - var8 * 2.0F, 0.5F + var8, 0.8F, 1.0F);
      } else {
         var8 = 0.1F;
         this.a(0.5F - var8, 0.0F, 0.5F - var8, 0.5F + var8, 0.6F, 0.5F + var8);
      }

      return super.a(var1, var2, var3, var4, var5, var6);
   }

   public void b(cy var1, int var2, int var3, int var4, Random var5) {
      int var6 = var1.e(var2, var3, var4);
      double var7 = (double)((float)var2 + 0.5F);
      double var9 = (double)((float)var3 + 0.7F);
      double var11 = (double)((float)var4 + 0.5F);
      double var13 = 0.2199999988079071D;
      double var15 = 0.27000001072883606D;
      if(var6 == 1) {
         var1.a("smoke", var7 - var15, var9 + var13, var11, 0.0D, 0.0D, 0.0D);
         var1.a("flame", var7 - var15, var9 + var13, var11, 0.0D, 0.0D, 0.0D);
      } else if(var6 == 2) {
         var1.a("smoke", var7 + var15, var9 + var13, var11, 0.0D, 0.0D, 0.0D);
         var1.a("flame", var7 + var15, var9 + var13, var11, 0.0D, 0.0D, 0.0D);
      } else if(var6 == 3) {
         var1.a("smoke", var7, var9 + var13, var11 - var15, 0.0D, 0.0D, 0.0D);
         var1.a("flame", var7, var9 + var13, var11 - var15, 0.0D, 0.0D, 0.0D);
      } else if(var6 == 4) {
         var1.a("smoke", var7, var9 + var13, var11 + var15, 0.0D, 0.0D, 0.0D);
         var1.a("flame", var7, var9 + var13, var11 + var15, 0.0D, 0.0D, 0.0D);
      } else {
         var1.a("smoke", var7, var9, var11, 0.0D, 0.0D, 0.0D);
         var1.a("flame", var7, var9, var11, 0.0D, 0.0D, 0.0D);
      }

   }
}
