package mojang;

public class dd extends nq {

   protected dd(int var1) {
      super(var1, hb.c);
      this.bg = 59;
   }

   public int a(int var1) {
      return var1 == 1?this.bg - 16:(var1 == 0? x.a(0):(var1 != 2 && var1 != 4?this.bg:this.bg + 1));
   }

   public boolean a(cy var1, int var2, int var3, int var4, eb var5) {
      var5.m();
      return true;
   }
}
