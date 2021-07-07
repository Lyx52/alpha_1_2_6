import org.lwjgl.opengl.GL11;

public class jw extends aq {

   public void a(hj var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      GL11.glEnable('\u803a');
      GL11.glScalef(0.5F, 0.5F, 0.5F);
      byte var10 = 1;
      byte var11 = 2;
      this.a("/particles.png");
      is var12 = is.a;
      float var13 = (float)(var10 * 8 + 0) / 128.0F;
      float var14 = (float)(var10 * 8 + 8) / 128.0F;
      float var15 = (float)(var11 * 8 + 0) / 128.0F;
      float var16 = (float)(var11 * 8 + 8) / 128.0F;
      float var17 = 1.0F;
      float var18 = 0.5F;
      float var19 = 0.5F;
      GL11.glRotatef(180.0F - this.b.i, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(-this.b.j, 1.0F, 0.0F, 0.0F);
      var12.b();
      var12.b(0.0F, 1.0F, 0.0F);
      var12.a((double)(0.0F - var18), (double)(0.0F - var19), 0.0D, (double)var13, (double)var16);
      var12.a((double)(var17 - var18), (double)(0.0F - var19), 0.0D, (double)var14, (double)var16);
      var12.a((double)(var17 - var18), (double)(1.0F - var19), 0.0D, (double)var14, (double)var15);
      var12.a((double)(0.0F - var18), (double)(1.0F - var19), 0.0D, (double)var13, (double)var15);
      var12.a();
      GL11.glDisable('\u803a');
      GL11.glPopMatrix();
      if(var1.b != null) {
         float var20 = (var1.b.aE + (var1.b.aC - var1.b.aE) * var9) * 3.1415927F / 180.0F;
         float var21 = (var1.b.aF + (var1.b.aD - var1.b.aF) * var9) * 3.1415927F / 180.0F;
         double var22 = (double)fi.a(var20);
         double var24 = (double)fi.b(var20);
         double var26 = (double)fi.a(var21);
         double var28 = (double)fi.b(var21);
         double var30 = var1.b.at + (var1.b.aw - var1.b.at) * (double)var9 - var24 * 0.7D - var22 * 0.5D * var28;
         double var32 = var1.b.au + (var1.b.ax - var1.b.au) * (double)var9 - var26 * 0.5D;
         double var34 = var1.b.av + (var1.b.ay - var1.b.av) * (double)var9 - var22 * 0.7D + var24 * 0.5D * var28;
         if(this.b.k.y) {
            var20 = (var1.b.t + (var1.b.s - var1.b.t) * var9) * 3.1415927F / 180.0F;
            var22 = (double)fi.a(var20);
            var24 = (double)fi.b(var20);
            var30 = var1.b.at + (var1.b.aw - var1.b.at) * (double)var9 - var24 * 0.35D - var22 * 0.85D;
            var32 = var1.b.au + (var1.b.ax - var1.b.au) * (double)var9 - 0.45D;
            var34 = var1.b.av + (var1.b.ay - var1.b.av) * (double)var9 - var22 * 0.35D + var24 * 0.85D;
         }

         double var36 = var1.at + (var1.aw - var1.at) * (double)var9;
         double var38 = var1.au + (var1.ax - var1.au) * (double)var9 + 0.25D;
         double var40 = var1.av + (var1.ay - var1.av) * (double)var9;
         double var42 = (double)((float)(var30 - var36));
         double var44 = (double)((float)(var32 - var38));
         double var46 = (double)((float)(var34 - var40));
         GL11.glDisable(3553);
         GL11.glDisable(2896);
         var12.a(3);
         var12.b(0);
         byte var48 = 16;

         for(int var49 = 0; var49 <= var48; ++var49) {
            float var50 = (float)var49 / (float)var48;
            var12.a(var2 + var42 * (double)var50, var4 + var44 * (double)(var50 * var50 + var50) * 0.5D + 0.25D, var6 + var46 * (double)var50);
         }

         var12.a();
         GL11.glEnable(2896);
         GL11.glEnable(3553);
      }

   }
}
