import org.lwjgl.opengl.GL11;

public class cm extends pp {

   private lw a;
   private lw o;
   private int p = 0;
   private int q = 0;
   private float r;


   public cm(cy var1, lw var2, lw var3, float var4) {
      super(var1, var2.aw, var2.ax, var2.ay, var2.az, var2.aA, var2.aB);
      this.a = var2;
      this.o = var3;
      this.q = 3;
      this.r = var4;
   }

   public void a(is var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = ((float)this.p + var2) / (float)this.q;
      var8 *= var8;
      double var9 = this.a.aw;
      double var11 = this.a.ax;
      double var13 = this.a.ay;
      double var15 = this.o.aV + (this.o.aw - this.o.aV) * (double)var2;
      double var17 = this.o.aW + (this.o.ax - this.o.aW) * (double)var2 + (double)this.r;
      double var19 = this.o.aX + (this.o.ay - this.o.aX) * (double)var2;
      double var21 = var9 + (var15 - var9) * (double)var8;
      double var23 = var11 + (var17 - var11) * (double)var8;
      double var25 = var13 + (var19 - var13) * (double)var8;
      int var27 = fi.b(var21);
      int var28 = fi.b(var23 + (double)(this.aO / 2.0F));
      int var29 = fi.b(var25);
      float var30 = this.as.c(var27, var28, var29);
      var21 -= l;
      var23 -= m;
      var25 -= n;
      GL11.glColor4f(var30, var30, var30, 1.0F);
      mn.a.a(this.a, (double)((float)var21), (double)((float)var23), (double)((float)var25), this.a.aC, var2);
   }

   public void e_() {
      ++this.p;
      if(this.p == this.q) {
         this.J();
      }

   }

   public int l_() {
      return 3;
   }
}
