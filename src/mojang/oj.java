package mojang;

public class oj extends Item {

   private static final int[] be = new int[]{3, 8, 6, 3};
   private static final int[] bf = new int[]{11, 16, 15, 13};
   public final int a;
   public final int bb;
   public final int bc;
   public final int bd;


   public oj(int var1, int var2, int var3, int var4) {
      super(var1);
      this.a = var2;
      this.bb = var4;
      this.bd = var3;
      this.bc = be[var4];
      this.aY = bf[var4] * 3 << var2;
      this.aX = 1;
   }

}
