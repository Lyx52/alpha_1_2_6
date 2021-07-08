package mojang;

public class pa {

   private String[][] a = new String[][]{{"X", "X", "#"}};
   private Object[][] b;


   public pa() {
      this.b = new Object[][]{{nq.x, nq.w, Item.m, Item.l, Item.n}, {Item.p, Item.t, Item.o, Item.x, Item.E}};
   }

   public void a(en var1) {
      for(int var2 = 0; var2 < this.b[0].length; ++var2) {
         Object var3 = this.b[0][var2];

         for(int var4 = 0; var4 < this.b.length - 1; ++var4) {
            Item var5 = (Item)this.b[var4 + 1][var2];
            var1.a(new fp(var5), new Object[]{this.a[var4], Character.valueOf('#'), Item.B, Character.valueOf('X'), var3});
         }
      }

      var1.a(new fp(Item.i, 1), new Object[]{" #X", "# X", " #X", Character.valueOf('X'), Item.I, Character.valueOf('#'), Item.B});
      var1.a(new fp(Item.j, 4), new Object[]{"X", "#", "Y", Character.valueOf('Y'), Item.J, Character.valueOf('X'), Item.an, Character.valueOf('#'), Item.B});
   }
}
