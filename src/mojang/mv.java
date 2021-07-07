package mojang;

public class mv {

   private Object[][] a;


   public mv() {
      this.a = new Object[][]{{nq.ah, dx.n}, {nq.ai, dx.m}, {nq.ax, dx.l}};
   }

   public void a(en var1) {
      for(int var2 = 0; var2 < this.a.length; ++var2) {
         nq var3 = (nq)this.a[var2][0];
         dx var4 = (dx)this.a[var2][1];
         var1.a(new fp(var3), new Object[]{"###", "###", "###", Character.valueOf('#'), var4});
         var1.a(new fp(var4, 9), new Object[]{"#", Character.valueOf('#'), var3});
      }

   }
}
