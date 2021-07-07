
public class fn extends ax {

   public hx a = new hx(this, 3, 3);
   public hi b = new oq();


   public void a(hi var1) {
      int[] var2 = new int[9];

      for(int var3 = 0; var3 < 3; ++var3) {
         for(int var4 = 0; var4 < 3; ++var4) {
            int var5 = var3 + var4 * 3;
            fp var6 = this.a.c(var5);
            if(var6 == null) {
               var2[var5] = -1;
            } else {
               var2[var5] = var6.c;
            }
         }
      }

      this.b.a(0, en.a().a(var2));
   }

   public void a(eb var1) {
      super.a(var1);

      for(int var2 = 0; var2 < 9; ++var2) {
         fp var3 = this.a.c(var2);
         if(var3 != null) {
            var1.a(var3);
         }
      }

   }
}
