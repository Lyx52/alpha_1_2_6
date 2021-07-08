package mojang;

public class o {

   private String[][] a = new String[][]{{"XXX", "X X"}, {"X X", "XXX", "XXX"}, {"XXX", "X X", "X X"}, {"X X", "X X"}};
   private Object[][] b;


   public o() {
      this.b = new Object[][]{{Item.aD, nq.ar, Item.m, Item.l, Item.n}, {Item.T, Item.X, Item.ab, Item.af, Item.aj}, {Item.U, Item.Y, Item.ac, Item.ag, Item.ak}, {Item.V, Item.Z, Item.ad, Item.ah, Item.al}, {Item.W, Item.aa, Item.ae, Item.ai, Item.am}};
   }

   public void a(en var1) {
      for(int var2 = 0; var2 < this.b[0].length; ++var2) {
         Object var3 = this.b[0][var2];

         for(int var4 = 0; var4 < this.b.length - 1; ++var4) {
            Item var5 = (Item)this.b[var4 + 1][var2];
            var1.a(new fp(var5), new Object[]{this.a[var4], Character.valueOf('X'), var3});
         }
      }

   }
}
