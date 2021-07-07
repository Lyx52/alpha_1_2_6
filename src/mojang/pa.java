package mojang;

public class pa {

   private String[][] a = new String[][]{{"X", "X", "#"}};
   private Object[][] b;


   public pa() {
      this.b = new Object[][]{{nq.x, nq.w, dx.m, dx.l, dx.n}, {dx.p, dx.t, dx.o, dx.x, dx.E}};
   }

   public void a(en var1) {
      for(int var2 = 0; var2 < this.b[0].length; ++var2) {
         Object var3 = this.b[0][var2];

         for(int var4 = 0; var4 < this.b.length - 1; ++var4) {
            dx var5 = (dx)this.b[var4 + 1][var2];
            var1.a(new fp(var5), new Object[]{this.a[var4], Character.valueOf('#'), dx.B, Character.valueOf('X'), var3});
         }
      }

      var1.a(new fp(dx.i, 1), new Object[]{" #X", "# X", " #X", Character.valueOf('X'), dx.I, Character.valueOf('#'), dx.B});
      var1.a(new fp(dx.j, 4), new Object[]{"X", "#", "Y", Character.valueOf('Y'), dx.J, Character.valueOf('X'), dx.an, Character.valueOf('#'), dx.B});
   }
}
