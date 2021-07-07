package mojang;

public class kl {

   private int b;
   private int c;
   public int a;


   public kl(int var1, int var2) {
      this.b = var1;
      this.c = var2;

      for(this.a = 1; this.b / (this.a + 1) >= 320 && this.c / (this.a + 1) >= 240; ++this.a) {
         ;
      }

      this.b /= this.a;
      this.c /= this.a;
   }

   public int a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }
}
