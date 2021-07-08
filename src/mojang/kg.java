package mojang;

import mojang.entity.Entity;
import mojang.entity.LivingEntity;

public class kg extends Item {

   private int a;


   public kg(int var1, int var2) {
      super(var1);
      this.aX = 1;
      this.aY = 32 << var2;
      if(var2 == 3) {
         this.aY *= 4;
      }

      this.a = 4 + var2 * 2;
   }

   public float a(fp var1, nq var2) {
      return 1.5F;
   }

   public void a(fp var1, LivingEntity var2) {
      var1.b(1);
   }

   public void a(fp var1, int var2, int var3, int var4, int var5) {
      var1.b(2);
   }

   public int a(Entity var1) {
      return this.a;
   }

   public boolean a() {
      return true;
   }
}
