package mojang;

import mojang.entity.Entity;

public class bt {

   private final b[] b;
   public final int a;
   private int c;


   public bt(b[] var1) {
      this.b = var1;
      this.a = var1.length;
   }

   public void a() {
      ++this.c;
   }

   public boolean b() {
      return this.c >= this.b.length;
   }

   public ao a(Entity var1) {
      double var2 = (double)this.b[this.c].a + (double)((int)(var1.aP + 1.0F)) * 0.5D;
      double var4 = (double)this.b[this.c].b;
      double var6 = (double)this.b[this.c].c + (double)((int)(var1.aP + 1.0F)) * 0.5D;
      return ao.b(var2, var4, var6);
   }
}
