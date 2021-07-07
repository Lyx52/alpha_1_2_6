package mojang;

public class nv extends dx {

   public nv(int var1) {
      super(var1);
      this.aY = 64;
      this.aX = 1;
   }

   public boolean a(fp var1, eb var2, cy var3, int var4, int var5, int var6, int var7) {
      if(var7 == 0) {
         return false;
      } else if(!var3.f(var4, var5, var6).a()) {
         return false;
      } else {
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

         if(!nq.aD.a(var3, var4, var5, var6)) {
            return false;
         } else {
            if(var7 == 1) {
               var3.b(var4, var5, var6, nq.aD.bh, fi.b((double)((var2.aC + 180.0F) * 16.0F / 360.0F) + 0.5D) & 15);
            } else {
               var3.b(var4, var5, var6, nq.aI.bh, var7);
            }

            --var1.a;
            qc var8 = (qc)var3.b(var4, var5, var6);
            if(var8 != null) {
               var2.a(var8);
            }

            return true;
         }
      }
   }
}
