package mojang;

import java.util.Comparator;

public class fx implements Comparator {

   private lw a;


   public fx(lw var1) {
      this.a = var1;
   }

   public int a(bw var1, bw var2) {
      return var1.a(this.a) < var2.a(this.a)?-1:1;
   }

   @Override
   public int compare(Object o1, Object o2) {
      return this.a((bw)o1, (bw)o2);
   }
}
