
public class eg {

   private String[][] a = new String[][]{{"XXX", " # ", " # "}, {"X", "#", "#"}, {"XX", "X#", " #"}, {"XX", " #", " #"}};
   private Object[][] b;


   public eg() {
      this.b = new Object[][]{{nq.x, nq.w, dx.m, dx.l, dx.n}, {dx.r, dx.v, dx.e, dx.z, dx.G}, {dx.q, dx.u, dx.d, dx.y, dx.F}, {dx.s, dx.w, dx.f, dx.A, dx.H}, {dx.L, dx.M, dx.N, dx.O, dx.P}};
   }

   public void a(en var1) {
      for(int var2 = 0; var2 < this.b[0].length; ++var2) {
         Object var3 = this.b[0][var2];

         for(int var4 = 0; var4 < this.b.length - 1; ++var4) {
            dx var5 = (dx)this.b[var4 + 1][var2];
            var1.a(new fp(var5), new Object[]{this.a[var4], Character.valueOf('#'), dx.B, Character.valueOf('X'), var3});
         }
      }

   }
}
