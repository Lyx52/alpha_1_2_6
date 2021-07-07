package mojang;

public class hx implements hi {

   private fp[] a;
   private int b;
   private ax c;


   public hx(ax var1, int var2, int var3) {
      this.b = var2 * var3;
      this.a = new fp[this.b];
      this.c = var1;
   }

   public hx(ax var1, fp[] var2) {
      this.b = var2.length;
      this.a = var2;
      this.c = var1;
   }

   public int c() {
      return this.b;
   }

   public fp c(int var1) {
      return this.a[var1];
   }

   public String d() {
      return "Crafting";
   }

   public fp a(int var1, int var2) {
      if(this.a[var1] != null) {
         fp var3;
         if(this.a[var1].a <= var2) {
            var3 = this.a[var1];
            this.a[var1] = null;
            this.c.a((hi)this);
            return var3;
         } else {
            var3 = this.a[var1].a(var2);
            if(this.a[var1].a == 0) {
               this.a[var1] = null;
            }

            this.c.a((hi)this);
            return var3;
         }
      } else {
         return null;
      }
   }

   public void a(int var1, fp var2) {
      this.a[var1] = var2;
      this.c.a((hi)this);
   }

   public int o_() {
      return 64;
   }

   public void h() {}
}
