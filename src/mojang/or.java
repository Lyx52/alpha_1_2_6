package mojang;

class or {

   final int a;
   Object b;
   or c;
   final int d;


   or(int var1, int var2, Object var3, or var4) {
      this.b = var3;
      this.c = var4;
      this.a = var2;
      this.d = var1;
   }

   public final int a() {
      return this.a;
   }

   public final Object b() {
      return this.b;
   }

   public final boolean equals(Object var1) {
      if(!(var1 instanceof or)) {
         return false;
      } else {
         or var2 = (or)var1;
         Integer var3 = Integer.valueOf(this.a());
         Integer var4 = Integer.valueOf(var2.a());
         if(var3 == var4 || var3 != null && var3.equals(var4)) {
            Object var5 = this.b();
            Object var6 = var2.b();
            if(var5 == var6 || var5 != null && var5.equals(var6)) {
               return true;
            }
         }

         return false;
      }
   }

   public final int hashCode() {
      return ge.d(this.a);
   }

   public final String toString() {
      return this.a() + "=" + this.b();
   }
}
