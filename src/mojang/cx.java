package mojang;

public class cx extends nq {

   private boolean a;


   protected cx(int var1, int var2, boolean var3) {
      super(var1, hb.w);
      this.bg = var2;
      this.b(true);
      this.a = var3;
   }

   public int a(int var1, int var2) {
      if(var1 == 1) {
         return this.bg;
      } else if(var1 == 0) {
         return this.bg;
      } else {
         int var3 = this.bg + 1 + 16;
         if(this.a) {
            ++var3;
         }

         return var2 == 0 && var1 == 2?var3:(var2 == 1 && var1 == 5?var3:(var2 == 2 && var1 == 3?var3:(var2 == 3 && var1 == 4?var3:this.bg + 16)));
      }
   }

   public int a(int var1) {
      return var1 == 1?this.bg:(var1 == 0?this.bg:(var1 == 3?this.bg + 1 + 16:this.bg + 16));
   }

   public void e(cy var1, int var2, int var3, int var4) {
      super.e(var1, var2, var3, var4);
   }

   public boolean a(cy var1, int var2, int var3, int var4) {
      int var5 = var1.a(var2, var3, var4);
      return (var5 == 0 || m[var5].bs.d()) && var1.g(var2, var3 - 1, var4);
   }

   public void a(cy var1, int var2, int var3, int var4, hf var5) {
      int var6 = fi.b((double)(var5.aC * 4.0F / 360.0F) + 0.5D) & 3;
      var1.b(var2, var3, var4, var6);
   }
}
