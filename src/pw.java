
public class pw extends dx {

   public pw(int var1) {
      super(var1);
      this.aX = 1;
      this.aY = 64;
   }

   public boolean a(fp var1, eb var2, cy var3, int var4, int var5, int var6, int var7) {
      if(var7 == 0) {
         --var5;
      }

      if(var7 == 1) {
         ++var5;
      }

      if(var7 == 2) {
         --var6;
      }

      if(var7 == 3) {
         ++var6;
      }

      if(var7 == 4) {
         --var4;
      }

      if(var7 == 5) {
         ++var4;
      }

      int var8 = var3.a(var4, var5, var6);
      if(var8 == 0) {
         var3.a((double)var4 + 0.5D, (double)var5 + 0.5D, (double)var6 + 0.5D, "fire.ignite", 1.0F, b.nextFloat() * 0.4F + 0.8F);
         var3.d(var4, var5, var6, nq.ar.bh);
      }

      var1.b(1);
      return true;
   }
}
