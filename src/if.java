
final class if {

   public final int a;
   public final int b;


   public if(int var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   public boolean equals(Object var1) {
      if(!(var1 instanceof if)) {
         return false;
      } else {
         if var2 = (if)var1;
         return this.a == var2.a && this.b == var2.b;
      }
   }

   public int hashCode() {
      return this.a << 16 ^ this.b;
   }
}
