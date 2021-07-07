package mojang;

public abstract class lh extends nq {

   protected lh(int var1, hb var2) {
      super(var1, var2);
      p[var1] = true;
   }

   protected lh(int var1, int var2, hb var3) {
      super(var1, var2, var3);
   }

   public void e(cy var1, int var2, int var3, int var4) {
      super.e(var1, var2, var3, var4);
      var1.a(var2, var3, var4, this.a_());
   }

   public void b(cy var1, int var2, int var3, int var4) {
      super.b(var1, var2, var3, var4);
      var1.l(var2, var3, var4);
   }

   protected abstract ji a_();
}
