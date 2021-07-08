package mojang;

import mojang.entity.Entity;
import mojang.world.World;

public class it extends nq {

   public it(int var1, int var2) {
      super(var1, var2, hb.m);
   }

   public co d(World var1, int var2, int var3, int var4) {
      float var5 = 0.125F;
      return co.b((double)var2, (double)var3, (double)var4, (double)(var2 + 1), (double)((float)(var3 + 1) - var5), (double)(var4 + 1));
   }

   public void a(World var1, int var2, int var3, int var4, Entity var5) {
      var5.az *= 0.4D;
      var5.aB *= 0.4D;
   }
}
