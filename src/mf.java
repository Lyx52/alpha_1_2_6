
public class mf extends pc {

   public mf(cy var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6);
      this.h = 0.04F;
      ++this.b;
      if(var10 == 0.0D && (var8 != 0.0D || var12 != 0.0D)) {
         this.az = var8;
         this.aA = var10 + 0.1D;
         this.aB = var12;
      }

   }
}
