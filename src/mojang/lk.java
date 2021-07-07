package mojang;

import mojang.entity.LivingEntity;
import mojang.entity.animal.Pig;

public class lk extends dx {

   public lk(int var1) {
      super(var1);
      this.aX = 1;
      this.aY = 64;
   }

   public void b(fp var1, LivingEntity var2) {
      if(var2 instanceof Pig) {
         Pig var3 = (Pig)var2;
         if(!var3.a) {
            var3.a = true;
            --var1.a;
         }
      }

   }

   public void a(fp var1, LivingEntity var2) {
      this.b(var1, var2);
   }
}
