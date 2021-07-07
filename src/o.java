
public class o {

   private String[][] a = new String[][]{{"XXX", "X X"}, {"X X", "XXX", "XXX"}, {"XXX", "X X", "X X"}, {"X X", "X X"}};
   private Object[][] b;


   public o() {
      this.b = new Object[][]{{dx.aD, nq.ar, dx.m, dx.l, dx.n}, {dx.T, dx.X, dx.ab, dx.af, dx.aj}, {dx.U, dx.Y, dx.ac, dx.ag, dx.ak}, {dx.V, dx.Z, dx.ad, dx.ah, dx.al}, {dx.W, dx.aa, dx.ae, dx.ai, dx.am}};
   }

   public void a(en var1) {
      for(int var2 = 0; var2 < this.b[0].length; ++var2) {
         Object var3 = this.b[0][var2];

         for(int var4 = 0; var4 < this.b.length - 1; ++var4) {
            dx var5 = (dx)this.b[var4 + 1][var2];
            var1.a(new fp(var5), new Object[]{this.a[var4], Character.valueOf('X'), var3});
         }
      }

   }
}
