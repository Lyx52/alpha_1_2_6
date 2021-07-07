import java.util.Random;

public class oa extends nq {

   protected oa(int var1) {
      super(var1, hb.b);
      this.bg = 87;
      this.b(true);
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.9375F, 1.0F);
      this.d(255);
   }

   public co d(cy var1, int var2, int var3, int var4) {
      return co.b((double)(var2 + 0), (double)(var3 + 0), (double)(var4 + 0), (double)(var2 + 1), (double)(var3 + 1), (double)(var4 + 1));
   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public int a(int var1, int var2) {
      return var1 == 1 && var2 > 0?this.bg - 1:(var1 == 1?this.bg:2);
   }

   public void a(cy var1, int var2, int var3, int var4, Random var5) {
      if(var5.nextInt(5) == 0) {
         if(this.i(var1, var2, var3, var4)) {
            var1.b(var2, var3, var4, 7);
         } else {
            int var6 = var1.e(var2, var3, var4);
            if(var6 > 0) {
               var1.b(var2, var3, var4, var6 - 1);
            } else if(!this.h(var1, var2, var3, var4)) {
               var1.d(var2, var3, var4, nq.v.bh);
            }
         }
      }

   }

   public void b(cy var1, int var2, int var3, int var4, lw var5) {
      if(var1.l.nextInt(4) == 0) {
         var1.d(var2, var3, var4, nq.v.bh);
      }

   }

   private boolean h(cy var1, int var2, int var3, int var4) {
      byte var5 = 0;

      for(int var6 = var2 - var5; var6 <= var2 + var5; ++var6) {
         for(int var7 = var4 - var5; var7 <= var4 + var5; ++var7) {
            if(var1.a(var6, var3 + 1, var7) == nq.az.bh) {
               return true;
            }
         }
      }

      return false;
   }

   private boolean i(cy var1, int var2, int var3, int var4) {
      for(int var5 = var2 - 4; var5 <= var2 + 4; ++var5) {
         for(int var6 = var3; var6 <= var3 + 1; ++var6) {
            for(int var7 = var4 - 4; var7 <= var4 + 4; ++var7) {
               if(var1.f(var5, var6, var7) == hb.f) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public void a(cy var1, int var2, int var3, int var4, int var5) {
      super.a(var1, var2, var3, var4, var5);
      hb var6 = var1.f(var2, var3 + 1, var4);
      if(var6.a()) {
         var1.d(var2, var3, var4, nq.v.bh);
      }

   }

   public int a(int var1, Random var2) {
      return nq.v.a(0, var2);
   }
}
