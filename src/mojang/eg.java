package mojang;

public class eg {

   private String[][] a = new String[][]{{"XXX", " # ", " # "}, {"X", "#", "#"}, {"XX", "X#", " #"}, {"XX", " #", " #"}};
   private Object[][] b;


   public eg() {
      this.b = new Object[][]{{nq.x, nq.w, Item.m, Item.l, Item.n}, {Item.r, Item.v, Item.e, Item.z, Item.G}, {Item.q, Item.u, Item.d, Item.y, Item.F}, {Item.s, Item.w, Item.f, Item.A, Item.H}, {Item.L, Item.M, Item.N, Item.O, Item.P}};
   }

   public void a(en var1) {
      for(int var2 = 0; var2 < this.b[0].length; ++var2) {
         Object var3 = this.b[0][var2];

         for(int var4 = 0; var4 < this.b.length - 1; ++var4) {
            Item var5 = (Item)this.b[var4 + 1][var2];
            var1.a(new fp(var5), new Object[]{this.a[var4], Character.valueOf('#'), Item.B, Character.valueOf('X'), var3});
         }
      }

   }
}
