package mojang;

import mojang.world.World;

public class qk extends Item {

   private int a;


   public qk(int var1, int var2) {
      super(var1);
      this.a = var2;
      this.aX = 1;
   }

   public fp a(fp var1, World var2, eb var3) {
      --var1.a;
      var3.c(this.a);
      return var1;
   }
}
