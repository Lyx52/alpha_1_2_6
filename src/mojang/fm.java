package mojang;

import mojang.world.World;

import java.util.Random;

public class fm extends js {

   public boolean a(World var1, Random var2, int var3, int var4, int var5) {
      for(int var6 = 0; var6 < 20; ++var6) {
         int var7 = var3 + var2.nextInt(4) - var2.nextInt(4);
         int var8 = var4;
         int var9 = var5 + var2.nextInt(4) - var2.nextInt(4);
         if(var1.a(var7, var4, var9) == 0 && (var1.f(var7 - 1, var4 - 1, var9) == hb.f || var1.f(var7 + 1, var4 - 1, var9) == hb.f || var1.f(var7, var4 - 1, var9 - 1) == hb.f || var1.f(var7, var4 - 1, var9 + 1) == hb.f)) {
            int var10 = 2 + var2.nextInt(var2.nextInt(3) + 1);

            for(int var11 = 0; var11 < var10; ++var11) {
               if(nq.aX.g(var1, var7, var8 + var11, var9)) {
                  var1.a(var7, var8 + var11, var9, nq.aX.bh);
               }
            }
         }
      }

      return true;
   }
}
