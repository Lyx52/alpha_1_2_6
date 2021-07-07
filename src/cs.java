
public class cs implements pk {

   private int a;
   private int b;
   private ha[][] c;
   private cy d;


   public cs(cy var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.d = var1;
      this.a = var2 >> 4;
      this.b = var4 >> 4;
      int var8 = var5 >> 4;
      int var9 = var7 >> 4;
      this.c = new ha[var8 - this.a + 1][var9 - this.b + 1];

      for(int var10 = this.a; var10 <= var8; ++var10) {
         for(int var11 = this.b; var11 <= var9; ++var11) {
            this.c[var10 - this.a][var11 - this.b] = var1.c(var10, var11);
         }
      }

   }

   public int a(int var1, int var2, int var3) {
      if(var2 < 0) {
         return 0;
      } else if(var2 >= 128) {
         return 0;
      } else {
         int var4 = (var1 >> 4) - this.a;
         int var5 = (var3 >> 4) - this.b;
         return this.c[var4][var5].a(var1 & 15, var2, var3 & 15);
      }
   }

   public ji b(int var1, int var2, int var3) {
      int var4 = (var1 >> 4) - this.a;
      int var5 = (var3 >> 4) - this.b;
      return this.c[var4][var5].d(var1 & 15, var2, var3 & 15);
   }

   public float c(int var1, int var2, int var3) {
      return this.d.q.f[this.d(var1, var2, var3)];
   }

   public int d(int var1, int var2, int var3) {
      return this.a(var1, var2, var3, true);
   }

   public int a(int var1, int var2, int var3, boolean var4) {
      if(var1 >= -32000000 && var3 >= -32000000 && var1 < 32000000 && var3 <= 32000000) {
         int var5;
         int var6;
         if(var4) {
            var5 = this.a(var1, var2, var3);
            if(var5 == nq.ak.bh || var5 == nq.aA.bh) {
               var6 = this.a(var1, var2 + 1, var3, false);
               int var7 = this.a(var1 + 1, var2, var3, false);
               int var8 = this.a(var1 - 1, var2, var3, false);
               int var9 = this.a(var1, var2, var3 + 1, false);
               int var10 = this.a(var1, var2, var3 - 1, false);
               if(var7 > var6) {
                  var6 = var7;
               }

               if(var8 > var6) {
                  var6 = var8;
               }

               if(var9 > var6) {
                  var6 = var9;
               }

               if(var10 > var6) {
                  var6 = var10;
               }

               return var6;
            }
         }

         if(var2 < 0) {
            return 0;
         } else if(var2 >= 128) {
            var5 = 15 - this.d.f;
            if(var5 < 0) {
               var5 = 0;
            }

            return var5;
         } else {
            var5 = (var1 >> 4) - this.a;
            var6 = (var3 >> 4) - this.b;
            return this.c[var5][var6].c(var1 & 15, var2, var3 & 15, this.d.f);
         }
      } else {
         return 15;
      }
   }

   public int e(int var1, int var2, int var3) {
      if(var2 < 0) {
         return 0;
      } else if(var2 >= 128) {
         return 0;
      } else {
         int var4 = (var1 >> 4) - this.a;
         int var5 = (var3 >> 4) - this.b;
         return this.c[var4][var5].b(var1 & 15, var2, var3 & 15);
      }
   }

   public hb f(int var1, int var2, int var3) {
      int var4 = this.a(var1, var2, var3);
      return var4 == 0?hb.a:nq.m[var4].bs;
   }

   public boolean g(int var1, int var2, int var3) {
      nq var4 = nq.m[this.a(var1, var2, var3)];
      return var4 == null?false:var4.a();
   }

   public po a() {
      return this.d.a();
   }
}
