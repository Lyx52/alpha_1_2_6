package mojang;

import java.util.ArrayList;
import java.util.List;

public class ao {

   private static List d = new ArrayList();
   private static int e = 0;
   public double a;
   public double b;
   public double c;


   public static ao a(double var0, double var2, double var4) {
      return new ao(var0, var2, var4);
   }

   public static void a() {
      e = 0;
   }

   public static ao b(double var0, double var2, double var4) {
      if(e >= d.size()) {
         d.add(a(0.0D, 0.0D, 0.0D));
      }

      return ((ao)d.get(e++)).e(var0, var2, var4);
   }

   private ao(double var1, double var3, double var5) {
      if(var1 == -0.0D) {
         var1 = 0.0D;
      }

      if(var3 == -0.0D) {
         var3 = 0.0D;
      }

      if(var5 == -0.0D) {
         var5 = 0.0D;
      }

      this.a = var1;
      this.b = var3;
      this.c = var5;
   }

   private ao e(double var1, double var3, double var5) {
      this.a = var1;
      this.b = var3;
      this.c = var5;
      return this;
   }

   public ao a(ao var1) {
      return b(var1.a - this.a, var1.b - this.b, var1.c - this.c);
   }

   public ao b() {
      double var1 = (double)fi.a(this.a * this.a + this.b * this.b + this.c * this.c);
      return var1 < 1.0E-4D?b(0.0D, 0.0D, 0.0D):b(this.a / var1, this.b / var1, this.c / var1);
   }

   public ao b(ao var1) {
      return b(this.b * var1.c - this.c * var1.b, this.c * var1.a - this.a * var1.c, this.a * var1.b - this.b * var1.a);
   }

   public ao c(double var1, double var3, double var5) {
      return b(this.a + var1, this.b + var3, this.c + var5);
   }

   public double c(ao var1) {
      double var2 = var1.a - this.a;
      double var4 = var1.b - this.b;
      double var6 = var1.c - this.c;
      return (double)fi.a(var2 * var2 + var4 * var4 + var6 * var6);
   }

   public double d(ao var1) {
      double var2 = var1.a - this.a;
      double var4 = var1.b - this.b;
      double var6 = var1.c - this.c;
      return var2 * var2 + var4 * var4 + var6 * var6;
   }

   public double d(double var1, double var3, double var5) {
      double var7 = var1 - this.a;
      double var9 = var3 - this.b;
      double var11 = var5 - this.c;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public double c() {
      return (double)fi.a(this.a * this.a + this.b * this.b + this.c * this.c);
   }

   public ao a(ao var1, double var2) {
      double var4 = var1.a - this.a;
      double var6 = var1.b - this.b;
      double var8 = var1.c - this.c;
      if(var4 * var4 < 1.0000000116860974E-7D) {
         return null;
      } else {
         double var10 = (var2 - this.a) / var4;
         return var10 >= 0.0D && var10 <= 1.0D?b(this.a + var4 * var10, this.b + var6 * var10, this.c + var8 * var10):null;
      }
   }

   public ao b(ao var1, double var2) {
      double var4 = var1.a - this.a;
      double var6 = var1.b - this.b;
      double var8 = var1.c - this.c;
      if(var6 * var6 < 1.0000000116860974E-7D) {
         return null;
      } else {
         double var10 = (var2 - this.b) / var6;
         return var10 >= 0.0D && var10 <= 1.0D?b(this.a + var4 * var10, this.b + var6 * var10, this.c + var8 * var10):null;
      }
   }

   public ao c(ao var1, double var2) {
      double var4 = var1.a - this.a;
      double var6 = var1.b - this.b;
      double var8 = var1.c - this.c;
      if(var8 * var8 < 1.0000000116860974E-7D) {
         return null;
      } else {
         double var10 = (var2 - this.c) / var8;
         return var10 >= 0.0D && var10 <= 1.0D?b(this.a + var4 * var10, this.b + var6 * var10, this.c + var8 * var10):null;
      }
   }

   public String toString() {
      return "(" + this.a + ", " + this.b + ", " + this.c + ")";
   }

   public void a(float var1) {
      float var2 = fi.b(var1);
      float var3 = fi.a(var1);
      double var4 = this.a;
      double var6 = this.b * (double)var2 + this.c * (double)var3;
      double var8 = this.c * (double)var2 - this.b * (double)var3;
      this.a = var4;
      this.b = var6;
      this.c = var8;
   }

   public void b(float var1) {
      float var2 = fi.b(var1);
      float var3 = fi.a(var1);
      double var4 = this.a * (double)var2 + this.c * (double)var3;
      double var6 = this.b;
      double var8 = this.c * (double)var2 - this.a * (double)var3;
      this.a = var4;
      this.b = var6;
      this.c = var8;
   }

}
