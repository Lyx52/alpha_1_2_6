package mojang;

import mojang.entity.Entity;

import java.util.Comparator;

public class ho implements Comparator {

   private eb a;


   public ho(eb var1) {
      this.a = var1;
   }

   public int a(bw var1, bw var2) {
      boolean var3 = var1.o;
      boolean var4 = var2.o;
      if(var3 && !var4) {
         return 1;
      } else if(var4 && !var3) {
         return -1;
      } else {
         double var5 = (double)var1.a((Entity)this.a);
         double var7 = (double)var2.a((Entity)this.a);
         return var5 < var7?1:(var5 > var7?-1:(var1.w < var2.w?1:-1));
      }
   }

   @Override
   public int compare(Object o1, Object o2) {
      return this.a((bw)o1, (bw)o2);
   }
}
