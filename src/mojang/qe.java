package mojang;

import mojang.entity.Entity;
import mojang.entity.item.Painting;
import mojang.world.World;

public class qe extends Item {

   public qe(int var1) {
      super(var1);
      this.aY = 64;
   }

   public boolean a(fp var1, eb var2, World var3, int var4, int var5, int var6, int var7) {
      if(var7 == 0) {
         return false;
      } else if(var7 == 1) {
         return false;
      } else {
         byte var8 = 0;
         if(var7 == 4) {
            var8 = 1;
         }

         if(var7 == 3) {
            var8 = 2;
         }

         if(var7 == 5) {
            var8 = 3;
         }

         Painting var9 = new Painting(var3, var4, var5, var6, var8);
         if(var9.k()) {
            var3.a((Entity)var9);
            --var1.a;
         }

         return true;
      }
   }
}
