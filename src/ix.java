
public class ix implements hi {

   private String a;
   private hi b;
   private hi c;


   public ix(String var1, hi var2, hi var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public int c() {
      return this.b.c() + this.c.c();
   }

   public String d() {
      return this.a;
   }

   public fp c(int var1) {
      return var1 >= this.b.c()?this.c.c(var1 - this.b.c()):this.b.c(var1);
   }

   public fp a(int var1, int var2) {
      return var1 >= this.b.c()?this.c.a(var1 - this.b.c(), var2):this.b.a(var1, var2);
   }

   public void a(int var1, fp var2) {
      if(var1 >= this.b.c()) {
         this.c.a(var1 - this.b.c(), var2);
      } else {
         this.b.a(var1, var2);
      }

   }

   public int o_() {
      return this.b.o_();
   }

   public void h() {
      this.b.h();
      this.c.h();
   }
}
