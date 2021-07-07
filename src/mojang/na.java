package mojang;

class na extends of {

   // $FF: synthetic field
   final int c;
   // $FF: synthetic field
   final ne d;


   na(ne var1, ex var2, hi var3, int var4, int var5, int var6, int var7) {
      super(var2, var3, var4, var5, var6);
      this.d = var1;
      this.c = var7;
   }

   public int e() {
      return 1;
   }

   public boolean a(fp var1) {
      if(var1.a() instanceof oj) {
         return ((oj)var1.a()).bb == this.c;
      } else {
         System.out.println(var1.a().aW + ", " + this.c);
         return var1.a().aW == nq.ba.bh?this.c == 0:false;
      }
   }

   public int c() {
      return 15 + this.c * 16;
   }
}
