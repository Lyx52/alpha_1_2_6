package mojang.entity.monster;

import mojang.world.World;

public class Giant extends Monster {

   public Giant(World var1) {
      super(var1);
      this.image = "/mojang/assets/mob/zombie.png";
      this.am = 0.5F;
      this.f = 50;
      this.J *= 10;
      this.aO *= 6.0F;
      this.a(this.aP * 6.0F, this.aQ * 6.0F);
   }

   protected float a(int var1, int var2, int var3) {
      return this.as.c(var1, var2, var3) - 0.5F;
   }
}
