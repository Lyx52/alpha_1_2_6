import java.util.Random;

public class qj extends nq {

   private boolean a;


   public qj(int var1, boolean var2) {
      super(var1, 6, hb.d);
      this.a = var2;
      if(!var2) {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
      }

      this.d(255);
   }

   public int a(int var1) {
      return var1 <= 1?6:5;
   }

   public boolean a() {
      return this.a;
   }

   public void a(cy var1, int var2, int var3, int var4, int var5) {
      if(this == nq.ak) {
         ;
      }
   }

   public void e(cy var1, int var2, int var3, int var4) {
      if(this != nq.ak) {
         super.e(var1, var2, var3, var4);
      }

      int var5 = var1.a(var2, var3 - 1, var4);
      if(var5 == ak.bh) {
         var1.d(var2, var3, var4, 0);
         var1.d(var2, var3 - 1, var4, nq.aj.bh);
      }

   }

   public int a(int var1, Random var2) {
      return nq.ak.bh;
   }

   public boolean b() {
      return this.a;
   }

   public boolean b(pk var1, int var2, int var3, int var4, int var5) {
      if(this != nq.ak) {
         super.b(var1, var2, var3, var4, var5);
      }

      return var5 == 1?true:(!super.b(var1, var2, var3, var4, var5)?false:(var5 == 0?true:var1.a(var2, var3, var4) != this.bh));
   }
}
