package mojang;

public class gt extends dx {

   public gt(int var1, int var2) {
      super(var1);
      this.aX = 1;
      this.aY = 32 << var2;
   }

   public boolean a(fp var1, eb var2, cy var3, int var4, int var5, int var6, int var7) {
      int var8 = var3.a(var4, var5, var6);
      hb var9 = var3.f(var4, var5 + 1, var6);
      if((var9.a() || var8 != nq.u.bh) && var8 != nq.v.bh) {
         return false;
      } else {
         nq var10 = nq.aA;
         var3.a((double)((float)var4 + 0.5F), (double)((float)var5 + 0.5F), (double)((float)var6 + 0.5F), var10.bq.d(), (var10.bq.b() + 1.0F) / 2.0F, var10.bq.c() * 0.8F);
         if(var3.z) {
            return true;
         } else {
            var3.d(var4, var5, var6, var10.bh);
            var1.b(1);
            if(var3.l.nextInt(8) == 0 && var8 == nq.u.bh) {
               byte var11 = 1;

               for(int var12 = 0; var12 < var11; ++var12) {
                  float var13 = 0.7F;
                  float var14 = var3.l.nextFloat() * var13 + (1.0F - var13) * 0.5F;
                  float var15 = 1.2F;
                  float var16 = var3.l.nextFloat() * var13 + (1.0F - var13) * 0.5F;
                  eo var17 = new eo(var3, (double)((float)var4 + var14), (double)((float)var5 + var15), (double)((float)var6 + var16), new fp(Q));
                  var17.c = 10;
                  var3.a((lw)var17);
               }
            }

            return true;
         }
      }
   }

   public boolean a() {
      return true;
   }
}
