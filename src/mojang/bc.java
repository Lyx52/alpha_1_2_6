package mojang;

import mojang.entity.LivingEntity;

public class bc extends dx {

   private int a;


   public bc(int var1) {
      super(var1);
      this.a = var1 + 256;
      this.a(nq.m[var1 + 256].a(2));
   }

   public boolean a(fp var1, eb var2, cy var3, int var4, int var5, int var6, int var7) {
      if(var3.a(var4, var5, var6) == nq.aS.bh) {
         var7 = 0;
      } else {
         if(var7 == 0) {
            --var5;
         }

         if(var7 == 1) {
            ++var5;
         }

         if(var7 == 2) {
            --var6;
         }

         if(var7 == 3) {
            ++var6;
         }

         if(var7 == 4) {
            --var4;
         }

         if(var7 == 5) {
            ++var4;
         }
      }

      if(var1.a == 0) {
         return false;
      } else {
         if(var3.a(this.a, var4, var5, var6, false)) {
            nq var8 = nq.m[this.a];
            if(var3.d(var4, var5, var6, this.a)) {
               nq.m[this.a].d(var3, var4, var5, var6, var7);
               nq.m[this.a].a(var3, var4, var5, var6, (LivingEntity)var2);
               var3.a((double)((float)var4 + 0.5F), (double)((float)var5 + 0.5F), (double)((float)var6 + 0.5F), var8.bq.d(), (var8.bq.b() + 1.0F) / 2.0F, var8.bq.c() * 0.8F);
               --var1.a;
            }
         }

         return true;
      }
   }
}
