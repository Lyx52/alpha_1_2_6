
public class cb extends dx {

   private nq[] bb;
   private float bc = 4.0F;
   private int bd;
   protected int a;


   public cb(int var1, int var2, int var3, nq[] var4) {
      super(var1);
      this.a = var3;
      this.bb = var4;
      this.aX = 1;
      this.aY = 32 << var3;
      if(var3 == 3) {
         this.aY *= 4;
      }

      this.bc = (float)((var3 + 1) * 2);
      this.bd = var2 + var3;
   }

   public float a(fp var1, nq var2) {
      for(int var3 = 0; var3 < this.bb.length; ++var3) {
         if(this.bb[var3] == var2) {
            return this.bc;
         }
      }

      return 1.0F;
   }

   public void a(fp var1, hf var2) {
      var1.b(2);
   }

   public void a(fp var1, int var2, int var3, int var4, int var5) {
      var1.b(1);
   }

   public int a(lw var1) {
      return this.bd;
   }

   public boolean a() {
      return true;
   }
}
