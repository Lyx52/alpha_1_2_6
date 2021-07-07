package mojang;

import mojang.entity.Entity;

public class bj extends dx {

   public bj(int var1) {
      super(var1);
      this.aY = 64;
   }

   public boolean a() {
      return true;
   }

   public boolean b() {
      return true;
   }

   public fp a(fp var1, cy var2, eb var3) {
      if(var3.n != null) {
         int var4 = var3.n.k();
         var1.b(var4);
         var3.z();
      } else {
         var2.a(var3, "random.bow", 0.5F, 0.4F / (b.nextFloat() * 0.4F + 0.8F));
         if(!var2.z) {
            var2.a((Entity)(new hj(var2, var3)));
         }

         var3.z();
      }

      return var1;
   }
}
