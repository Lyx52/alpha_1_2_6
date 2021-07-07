package mojang;

public class ew {

   public ao a;
   public float b;
   public float c;


   public ew(float var1, float var2, float var3, float var4, float var5) {
      this(ao.a((double)var1, (double)var2, (double)var3), var4, var5);
   }

   public ew a(float var1, float var2) {
      return new ew(this, var1, var2);
   }

   public ew(ew var1, float var2, float var3) {
      this.a = var1.a;
      this.b = var2;
      this.c = var3;
   }

   public ew(ao var1, float var2, float var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }
}
