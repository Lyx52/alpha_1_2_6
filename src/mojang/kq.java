package mojang;

public class kq implements Comparable {

   private static long f = 0L;
   public int a;
   public int b;
   public int c;
   public int d;
   public long e;
   private long g;


   public kq(int var1, int var2, int var3, int var4) {
      this.g = (long)(f++);
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   public boolean equals(Object var1) {
      if(!(var1 instanceof kq)) {
         return false;
      } else {
         kq var2 = (kq)var1;
         return this.a == var2.a && this.b == var2.b && this.c == var2.c && this.d == var2.d;
      }
   }

   public int hashCode() {
      return (this.a * 128 * 1024 + this.c * 128 + this.b) * 256 + this.d;
   }

   public kq a(long var1) {
      this.e = var1;
      return this;
   }
   @Override
   public int compareTo(Object o) {
      return this.a((kq)o);
   }
   public int a(kq var1) {
      return this.e < var1.e?-1:(this.e > var1.e?1:(this.g < var1.g?-1:(this.g > var1.g?1:0)));
   }
}
