package mojang;

import mojang.world.World;

public class pd extends nq {

   protected pd(int var1) {
      super(var1, hb.j);
      this.bg = 48;
   }

   public void e(World var1, int var2, int var3, int var4) {
      byte var5 = 2;

      for(int var6 = var2 - var5; var6 <= var2 + var5; ++var6) {
         for(int var7 = var3 - var5; var7 <= var3 + var5; ++var7) {
            for(int var8 = var4 - var5; var8 <= var4 + var5; ++var8) {
               if(var1.f(var6, var7, var8) == hb.f) {
                  ;
               }
            }
         }
      }

   }

   public void b(World var1, int var2, int var3, int var4) {
      byte var5 = 2;

      for(int var6 = var2 - var5; var6 <= var2 + var5; ++var6) {
         for(int var7 = var3 - var5; var7 <= var3 + var5; ++var7) {
            for(int var8 = var4 - var5; var8 <= var4 + var5; ++var8) {
               var1.g(var6, var7, var8, var1.a(var6, var7, var8));
            }
         }
      }

   }
}
