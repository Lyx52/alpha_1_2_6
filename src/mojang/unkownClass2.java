package mojang;

final class unkownClass2 {

   public final int a;
   public final int b;


   public unkownClass2(int var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   public boolean equals(Object var1) {
      if(!(var1 instanceof unkownClass2)) {
         return false;
      } else {
         unkownClass2 var2 = (unkownClass2)var1;
         return this.a == var2.a && this.b == var2.b;
      }
   }

   public int hashCode() {
      return this.a << 16 ^ this.b;
   }
}
