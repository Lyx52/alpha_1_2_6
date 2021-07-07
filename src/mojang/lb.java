package mojang;

import mojang.entity.Entity;
import mojang.entity.vehicle.Minecart;

public class lb extends dx {

   public int a;


   public lb(int var1, int var2) {
      super(var1);
      this.aX = 1;
      this.a = var2;
   }

   public boolean a(fp var1, eb var2, cy var3, int var4, int var5, int var6, int var7) {
      int var8 = var3.a(var4, var5, var6);
      if(var8 == nq.aG.bh) {
         if(!var3.z) {
            var3.a((Entity)(new Minecart(var3, (double)((float)var4 + 0.5F), (double)((float)var5 + 0.5F), (double)((float)var6 + 0.5F), this.a)));
         }

         --var1.a;
         return true;
      } else {
         return false;
      }
   }
}
