import java.util.Arrays;

public class ei extends po {

   private gg e;
   private double f;
   private double g;


   public ei(gg var1, double var2, double var4) {
      this.e = var1;
      this.f = var2;
      this.g = var4;
   }

   public gg a(qm var1) {
      return this.e;
   }

   public gg a(int var1, int var2) {
      return this.e;
   }

   public double b(int var1, int var2) {
      return this.f;
   }

   public gg[] a(int var1, int var2, int var3, int var4) {
      this.d = this.a(this.d, var1, var2, var3, var4);
      return this.d;
   }

   public double[] a(double[] var1, int var2, int var3, int var4, int var5) {
      if(var1 == null || var1.length < var4 * var5) {
         var1 = new double[var4 * var5];
      }

      Arrays.fill(var1, 0, var4 * var5, this.f);
      return var1;
   }

   public gg[] a(gg[] var1, int var2, int var3, int var4, int var5) {
      if(var1 == null || var1.length < var4 * var5) {
         var1 = new gg[var4 * var5];
         this.a = new double[var4 * var5];
         this.b = new double[var4 * var5];
      }

      Arrays.fill(var1, 0, var4 * var5, this.e);
      Arrays.fill(this.b, 0, var4 * var5, this.g);
      Arrays.fill(this.a, 0, var4 * var5, this.f);
      return var1;
   }
}
