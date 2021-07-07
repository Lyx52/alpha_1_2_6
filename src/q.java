
public class q extends ax {

   public hx a;
   public hi b = new oq();


   public q(fp[] var1) {
      this.a = new hx(this, var1);
      this.a((hi)this.a);
   }

   public void a(hi var1) {
      int[] var2 = new int[9];

      for(int var3 = 0; var3 < 3; ++var3) {
         for(int var4 = 0; var4 < 3; ++var4) {
            int var5 = -1;
            if(var3 < 2 && var4 < 2) {
               fp var6 = this.a.c(var3 + var4 * 2);
               if(var6 != null) {
                  var5 = var6.c;
               }
            }

            var2[var3 + var4 * 3] = var5;
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
