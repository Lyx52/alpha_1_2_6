package mojang;

public class of extends dz {

   private final ex c;
   public final int e;
   public final int f;


   public of(ex var1, hi var2, int var3, int var4, int var5) {
      super(var2, var3);
      this.c = var1;
      this.e = var4;
      this.f = var5;
   }

   public boolean a(int var1, int var2) {
      int var3 = (this.c.c - this.c.a) / 2;
      int var4 = (this.c.d - this.c.h) / 2;
      var1 -= var3;
      var2 -= var4;
      return var1 >= this.e - 1 && var1 < this.e + 16 + 1 && var2 >= this.f - 1 && var2 < this.f + 16 + 1;
   }
}
