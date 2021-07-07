package mojang;

import java.util.Random;

public class qh extends nq {

   private int[] a = new int[256];
   private int[] b = new int[256];


   protected qh(int var1, int var2) {
      super(var1, var2, hb.l);
      this.a(x.bh, 5, 20);
      this.a(J.bh, 5, 5);
      this.a(K.bh, 30, 60);
      this.a(an.bh, 30, 20);
      this.a(am.bh, 15, 100);
      this.a(ab.bh, 30, 60);
      this.b(true);
   }

   private void a(int var1, int var2, int var3) {
      this.a[var1] = var2;
      this.b[var1] = var3;
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
      return 3;
   }

   public int a(Random var1) {
      return 0;
   }

   public int d() {
      return 10;
   }

   public void a(cy var1, int var2, int var3, int var4, Random var5) {
      boolean var6 = var1.a(var2, var3 - 1, var4) == bb.bh;
      int var7 = var1.e(var2, var3, var4);
      if(var7 < 15) {
         var1.b(var2, var3, var4, var7 + 1);
         var1.h(var2, var3, var4, this.bh);
      }

      if(!var6 && !this.h(var1, var2, var3, var4)) {
         if(!var1.g(var2, var3 - 1, var4) || var7 > 3) {
            var1.d(var2, var3, var4, 0);
         }

      } else if(!var6 && !this.c((pk)var1, var2, var3 - 1, var4) && var7 == 15 && var5.nextInt(4) == 0) {
         var1.d(var2, var3, var4, 0);
      } else {
         if(var7 % 2 == 0 && var7 > 2) {
            this.a(var1, var2 + 1, var3, var4, 300, var5);
            this.a(var1, var2 - 1, var3, var4, 300, var5);
            this.a(var1, var2, var3 - 1, var4, 250, var5);
            this.a(var1, var2, var3 + 1, var4, 250, var5);
            this.a(var1, var2, var3, var4 - 1, 300, var5);
            this.a(var1, var2, var3, var4 + 1, 300, var5);

            for(int var8 = var2 - 1; var8 <= var2 + 1; ++var8) {
               for(int var9 = var4 - 1; var9 <= var4 + 1; ++var9) {
                  for(int var10 = var3 - 1; var10 <= var3 + 4; ++var10) {
                     if(var8 != var2 || var10 != var3 || var9 != var4) {
                        int var11 = 100;
                        if(var10 > var3 + 1) {
                           var11 += (var10 - (var3 + 1)) * 100;
                        }

                        int var12 = this.i(var1, var8, var10, var9);
                        if(var12 > 0 && var5.nextInt(var11) <= var12) {
                           var1.d(var8, var10, var9, this.bh);
                        }
                     }
                  }
               }
            }
         }

      }
   }

   private void a(cy var1, int var2, int var3, int var4, int var5, Random var6) {
      int var7 = this.b[var1.a(var2, var3, var4)];
      if(var6.nextInt(var5) < var7) {
         boolean var8 = var1.a(var2, var3, var4) == am.bh;
         if(var6.nextInt(2) == 0) {
            var1.d(var2, var3, var4, this.bh);
         } else {
            var1.d(var2, var3, var4, 0);
         }

         if(var8) {
            am.b(var1, var2, var3, var4, 0);
         }
      }

   }

   private boolean h(cy var1, int var2, int var3, int var4) {
      return this.c((pk)var1, var2 + 1, var3, var4)?true:(this.c((pk)var1, var2 - 1, var3, var4)?true:(this.c((pk)var1, var2, var3 - 1, var4)?true:(this.c((pk)var1, var2, var3 + 1, var4)?true:(this.c((pk)var1, var2, var3, var4 - 1)?true:this.c((pk)var1, var2, var3, var4 + 1)))));
   }

   private int i(cy var1, int var2, int var3, int var4) {
      byte var5 = 0;
      if(var1.a(var2, var3, var4) != 0) {
         return 0;
      } else {
         int var6 = this.g(var1, var2 + 1, var3, var4, var5);
         var6 = this.g(var1, var2 - 1, var3, var4, var6);
         var6 = this.g(var1, var2, var3 - 1, var4, var6);
         var6 = this.g(var1, var2, var3 + 1, var4, var6);
         var6 = this.g(var1, var2, var3, var4 - 1, var6);
         var6 = this.g(var1, var2, var3, var4 + 1, var6);
         return var6;
      }
   }

   public boolean h() {
      return false;
   }

   public boolean c(pk var1, int var2, int var3, int var4) {
      return this.a[var1.a(var2, var3, var4)] > 0;
   }

   public int g(cy var1, int var2, int var3, int var4, int var5) {
      int var6 = this.a[var1.a(var2, var3, var4)];
      return var6 > var5?var6:var5;
   }

   public boolean a(cy var1, int var2, int var3, int var4) {
      return var1.g(var2, var3 - 1, var4) || this.h(var1, var2, var3, var4);
   }

   public void a(cy var1, int var2, int var3, int var4, int var5) {
      if(!var1.g(var2, var3 - 1, var4) && !this.h(var1, var2, var3, var4)) {
         var1.d(var2, var3, var4, 0);
      }
   }

   public void e(cy var1, int var2, int var3, int var4) {
      if(var1.a(var2, var3 - 1, var4) != ap.bh || !be.a_(var1, var2, var3, var4)) {
         if(!var1.g(var2, var3 - 1, var4) && !this.h(var1, var2, var3, var4)) {
            var1.d(var2, var3, var4, 0);
         } else {
            var1.h(var2, var3, var4, this.bh);
         }
      }
   }

   public void b(cy var1, int var2, int var3, int var4, Random var5) {
      if(var5.nextInt(24) == 0) {
         var1.a((double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), "fire.fire", 1.0F + var5.nextFloat(), var5.nextFloat() * 0.7F + 0.3F);
      }

      int var6;
      float var7;
      float var8;
      float var9;
      if(!var1.g(var2, var3 - 1, var4) && !ar.c((pk)var1, var2, var3 - 1, var4)) {
         if(ar.c((pk)var1, var2 - 1, var3, var4)) {
            for(var6 = 0; var6 < 2; ++var6) {
               var7 = (float)var2 + var5.nextFloat() * 0.1F;
               var8 = (float)var3 + var5.nextFloat();
               var9 = (float)var4 + var5.nextFloat();
               var1.a("largesmoke", (double)var7, (double)var8, (double)var9, 0.0D, 0.0D, 0.0D);
            }
         }

         if(ar.c((pk)var1, var2 + 1, var3, var4)) {
            for(var6 = 0; var6 < 2; ++var6) {
               var7 = (float)(var2 + 1) - var5.nextFloat() * 0.1F;
               var8 = (float)var3 + var5.nextFloat();
               var9 = (float)var4 + var5.nextFloat();
               var1.a("largesmoke", (double)var7, (double)var8, (double)var9, 0.0D, 0.0D, 0.0D);
            }
         }

         if(ar.c((pk)var1, var2, var3, var4 - 1)) {
            for(var6 = 0; var6 < 2; ++var6) {
               var7 = (float)var2 + var5.nextFloat();
               var8 = (float)var3 + var5.nextFloat();
               var9 = (float)var4 + var5.nextFloat() * 0.1F;
               var1.a("largesmoke", (double)var7, (double)var8, (double)var9, 0.0D, 0.0D, 0.0D);
            }
         }

         if(ar.c((pk)var1, var2, var3, var4 + 1)) {
            for(var6 = 0; var6 < 2; ++var6) {
               var7 = (float)var2 + var5.nextFloat();
               var8 = (float)var3 + var5.nextFloat();
               var9 = (float)(var4 + 1) - var5.nextFloat() * 0.1F;
               var1.a("largesmoke", (double)var7, (double)var8, (double)var9, 0.0D, 0.0D, 0.0D);
            }
         }

         if(ar.c((pk)var1, var2, var3 + 1, var4)) {
            for(var6 = 0; var6 < 2; ++var6) {
               var7 = (float)var2 + var5.nextFloat();
               var8 = (float)(var3 + 1) - var5.nextFloat() * 0.1F;
               var9 = (float)var4 + var5.nextFloat();
               var1.a("largesmoke", (double)var7, (double)var8, (double)var9, 0.0D, 0.0D, 0.0D);
            }
         }
      } else {
         for(var6 = 0; var6 < 3; ++var6) {
            var7 = (float)var2 + var5.nextFloat();
            var8 = (float)var3 + var5.nextFloat() * 0.5F + 0.5F;
            var9 = (float)var4 + var5.nextFloat();
            var1.a("largesmoke", (double)var7, (double)var8, (double)var9, 0.0D, 0.0D, 0.0D);
         }
      }

   }
}
