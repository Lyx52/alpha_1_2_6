package mojang;

import mojang.entity.Entity;
import mojang.entity.projectile.Snowball;
import mojang.world.World;

public class by extends Item {

   public by(int var1) {
      super(var1);
      this.aX = 16;
   }

   public fp a(fp var1, World var2, eb var3) {
      --var1.a;
      var2.a(var3, "random.bow", 0.5F, 0.4F / (b.nextFloat() * 0.4F + 0.8F));
      if(!var2.z) {
         var2.a((Entity)(new Snowball(var2, var3)));
      }

      return var1;
   }
}
