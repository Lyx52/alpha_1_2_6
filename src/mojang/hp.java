package mojang;

import mojang.entity.animal.Pig;

public class hp extends ec {

   public hp(gm var1, gm var2, float var3) {
      super(var1, var3);
      this.a(var2);
   }

   protected boolean a(Pig var1, int var2) {
      this.a("/mojang/mob/saddle.png");
      return var2 == 0 && var1.a;
   }
}
