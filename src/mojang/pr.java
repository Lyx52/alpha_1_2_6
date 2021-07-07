package mojang;

import mojang.entity.animal.Sheep;

public class pr extends ec {

   public pr(gm var1, gm var2, float var3) {
      super(var1, var3);
      this.a(var2);
   }

   protected boolean a(Sheep var1, int var2) {
      this.a("/mojang/mob/sheep_fur.png");
      return var2 == 0 && !var1.a;
   }
}
