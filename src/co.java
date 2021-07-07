import java.util.ArrayList;
import java.util.List;

public class co {

   private static List g = new ArrayList();
   private static int h = 0;
   public double a;
   public double b;
   public double c;
   public double d;
   public double e;
   public double f;


   public static co a(double var0, double var2, double var4, double var6, double var8, double var10) {
      return new co(var0, var2, var4, var6, var8, var10);
   }

   public static void a() {
      h = 0;
   }

   public static co b(double var0, double var2, double var4, double var6, double var8, double var10) {
      if(h >= g.size()) {
         g.add(a(0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D));
      }

      return ((co)g.get(h++)).c(var0, var2, var4, var6, var8, var10);
   }

   private co(double var1, double var3, double var5, double var7, double var9, double var11) {
      this.a = var1;
      this.b = var3;
      this.c = var5;
      this.d = var7;
      this.e = var9;
      this.f = var11;
   }

   public co c(double var1, double var3, double var5, double var7, double var9, double var11) {
      this.a = var1;
      this.b = var3;
      this.c = var5;
      this.d = var7;
      this.e = var9;
      this.f = var11;
      return this;
   }

   public co a(double var1, double var3, double var5) {
      double var7 = this.a;
      double var9 = this.b;
      double var11 = this.c;
      double var13 = this.d;
      double var15 = this.e;
      double var17 = this.f;
      if(var1 < 0.0D) {
         var7 += var1;
      }

      if(var1 > 0.0D) {
         var13 += var1;
      }

      if(var3 < 0.0D) {
         var9 += var3;
      }

      if(var3 > 0.0D) {
         var15 += var3;
      }

      if(var5 < 0.0D) {
         var11 += var5;
      }

      if(var5 > 0.0D) {
         var17 += var5;
      }

      return b(var7, var9, var11, var13, var15, var17);
   }

   public co b(double var1, double var3, double var5) {
      double var7 = this.a - var1;
      double var9 = this.b - var3;
      double var11 = this.c - var5;
      double var13 = this.d + var1;
      double var15 = this.e + var3;
      double var17 = this.f + var5;
      return b(var7, var9, var11, var13, var15, var17);
   }

   public co c(double var1, double var3, double var5) {
      return b(this.a + var1, this.b + var3, this.c + var5, this.d + var1, this.e + var3, this.f + var5);
   }

   public double a(co var1, double var2) {
      if(var1.e > this.b && var1.b < this.e) {
         if(var1.f > this.c && var1.c < this.f) {
            double var4;
            if(var2 > 0.0D && var1.d <= this.a) {
               var4 = this.a - var1.d;
               if(var4 < var2) {
                  var2 = var4;
               }
            }

            if(var2 < 0.0D && var1.a >= this.d) {
               var4 = this.d - var1.a;
               if(var4 > var2) {
                  var2 = var4;
               }
            }

            return var2;
         } else {
            return var2;
         }
      } else {
         return var2;
      }
   }

   public double b(co var1, double var2) {
      if(var1.d > this.a && var1.a < this.d) {
         if(var1.f > this.c && var1.c < this.f) {
            double var4;
            if(var2 > 0.0D && var1.e <= this.b) {
               var4 = this.b - var1.e;
               if(var4 < var2) {
                  var2 = var4;
               }
            }

            if(var2 < 0.0D && var1.b >= this.e) {
               var4 = this.e - var1.b;
               if(var4 > var2) {
                  var2 = var4;
               }
            }

            return var2;
         } else {
            return var2;
         }
      } else {
         return var2;
      }
   }

   public double c(co var1, double var2) {
      if(var1.d > this.a && var1.a < this.d) {
         if(var1.e > this.b && var1.b < this.e) {
            double var4;
            if(var2 > 0.0D && var1.f <= this.c) {
               var4 = this.c - var1.f;
               if(var4 < var2) {
                  var2 = var4;
               }
            }

            if(var2 < 0.0D && var1.c >= this.f) {
               var4 = this.f - var1.c;
               if(var4 > var2) {
                  var2 = var4;
               }
            }

            return var2;
         } else {
            return var2;
         }
      } else {
         return var2;
      }
   }

   public boolean a(co var1) {
      return var1.d > this.a && var1.a < this.d?(var1.e > this.b && var1.b < this.e?var1.f > this.c && var1.c < this.f:false):false;
   }

   public co d(double var1, double var3, double var5) {
      this.a += var1;
      this.b += var3;
      this.c += var5;
      this.d += var1;
      this.e += var3;
      this.f += var5;
      return this;
   }

   public boolean a(ao var1) {
      return var1.a > this.a && var1.a < this.d?(var1.b > this.b && var1.b < this.e?var1.c > this.c && var1.c < this.f:false):false;
   }

   public double b() {
      double var1 = this.d - this.a;
      double var3 = this.e - this.b;
      double var5 = this.f - this.c;
      return (var1 + var3 + var5) / 3.0D;
   }

   public co c() {
      return b(this.a, this.b, this.c, this.d, this.e, this.f);
   }

   public nx a(ao var1, ao var2) {
      ao var3 = var1.a(var2, this.a);
      ao var4 = var1.a(var2, this.d);
      ao var5 = var1.b(var2, this.b);
      ao var6 = var1.b(var2, this.e);
      ao var7 = var1.c(var2, this.c);
      ao var8 = var1.c(var2, this.f);
      if(!this.b(var3)) {
         var3 = null;
      }

      if(!this.b(var4)) {
         var4 = null;
      }

      if(!this.c(var5)) {
         var5 = null;
      }

      if(!this.c(var6)) {
         var6 = null;
      }

      if(!this.d(var7)) {
         var7 = null;
      }

      if(!this.d(var8)) {
         var8 = null;
      }

      ao var9 = null;
      if(var3 != null && (var9 == null || var1.d(var3) < var1.d(var9))) {
         var9 = var3;
      }

      if(var4 != null && (var9 == null || var1.d(var4) < var1.d(var9))) {
         var9 = var4;
      }

      if(var5 != null && (var9 == null || var1.d(var5) < var1.d(var9))) {
         var9 = var5;
      }

      if(var6 != null && (var9 == null || var1.d(var6) < var1.d(var9))) {
         var9 = var6;
      }

      if(var7 != null && (var9 == null || var1.d(var7) < var1.d(var9))) {
         var9 = var7;
      }

      if(var8 != null && (var9 == null || var1.d(var8) < var1.d(var9))) {
         var9 = var8;
      }

      if(var9 == null) {
         return null;
      } else {
         byte var10 = -1;
         if(var9 == var3) {
            var10 = 4;
         }

         if(var9 == var4) {
            var10 = 5;
         }

         if(var9 == var5) {
            var10 = 0;
         }

         if(var9 == var6) {
            var10 = 1;
         }

         if(var9 == var7) {
            var10 = 2;
         }

         if(var9 == var8) {
            var10 = 3;
         }

         return new nx(0, 0, 0, var10, var9);
      }
   }

   private boolean b(ao var1) {
      return var1 == null?false:var1.b >= this.b && var1.b <= this.e && var1.c >= this.c && var1.c <= this.f;
   }

   private boolean c(ao var1) {
      return var1 == null?false:var1.a >= this.a && var1.a <= this.d && var1.c >= this.c && var1.c <= this.f;
   }

   private boolean d(ao var1) {
      return var1 == null?false:var1.a >= this.a && var1.a <= this.d && var1.b >= this.b && var1.b <= this.e;
   }

   public void b(co var1) {
      this.a = var1.a;
      this.b = var1.b;
      this.c = var1.c;
      this.d = var1.d;
      this.e = var1.e;
      this.f = var1.f;
   }

}
