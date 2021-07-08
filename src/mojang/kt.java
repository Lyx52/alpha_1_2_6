package mojang;

import mojang.entity.projectile.Arrow;
import mojang.entity.Entity;
import mojang.world.World;

public class kt extends Item {

   public kt(int var1) {
      super(var1);
      this.aX = 1;
   }

   public fp a(fp var1, World var2, eb var3) {
      if(var3.e.b(j.aW)) {
         var2.a(var3, "random.bow", 1.0F, 1.0F / (b.nextFloat() * 0.4F + 0.8F));
         if(!var2.z) {
            var2.a((Entity)(new Arrow(var2, var3)));
         }
      }

      return var1;
   }
}
