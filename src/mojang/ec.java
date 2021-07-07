package mojang;

import org.lwjgl.opengl.GL11;

public class ec extends aq {

   protected gm e;
   protected gm f;


   public ec(gm var1, float var2) {
      this.e = var1;
      this.c = var2;
   }

   public void a(gm var1) {
      this.f = var1;
   }
   @Override
   public void a(lw var0, double var2, double var4, double var6, float var8, float var9) {

      hf var1 = (hf)var0;
      GL11.glPushMatrix();
      GL11.glDisable(2884);
      this.e.k = this.c(var1, var9);
      this.e.l = var1.ar != null || var1.bu;
      if(this.f != null) {
         this.f.l = this.e.l;
      }

      try {
         float var10 = var1.t + (var1.s - var1.t) * var9;
         float var11 = var1.aE + (var1.aC - var1.aE) * var9;
         float var12 = var1.aF + (var1.aD - var1.aF) * var9;
         GL11.glTranslatef((float)var2, (float)var4, (float)var6);
         float var13 = this.d(var1, var9);
         GL11.glRotatef(180.0F - var10, 0.0F, 1.0F, 0.0F);
         float var14;
         if(var1.O > 0) {
            var14 = ((float)var1.O + var9 - 1.0F) / 20.0F * 1.6F;
            var14 = fi.c(var14);
            if(var14 > 1.0F) {
               var14 = 1.0F;
            }

            GL11.glRotatef(var14 * this.a(var1), 0.0F, 0.0F, 1.0F);
         }

         var14 = 0.0625F;
         GL11.glEnable('\u803a');
         GL11.glScalef(-1.0F, -1.0F, 1.0F);
         this.a(var1, var9);
         GL11.glTranslatef(0.0F, -24.0F * var14 - 0.0078125F, 0.0F);
         float var15 = var1.V + (var1.W - var1.V) * var9;
         float var16 = var1.X - var1.W * (1.0F - var9);
         if(var15 > 1.0F) {
            var15 = 1.0F;
         }

         this.a(var1.bl, var1.A());
         GL11.glEnable(3008);
         this.e.b(var16, var15, var13, var11 - var10, var12, var14);

         for(int var17 = 0; var17 < 4; ++var17) {
            if(this.a(var1, var17)) {
               this.f.b(var16, var15, var13, var11 - var10, var12, var14);
               GL11.glDisable(3042);
               GL11.glEnable(3008);
            }
         }

         this.b(var1, var9);
         float var25 = var1.a(var9);
         int var18 = this.a(var1, var25, var9);
         if((var18 >> 24 & 255) > 0 || var1.L > 0 || var1.O > 0) {
            GL11.glDisable(3553);
            GL11.glDisable(3008);
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 771);
            GL11.glDepthFunc(514);
            if(var1.L > 0 || var1.O > 0) {
               GL11.glColor4f(var25, 0.0F, 0.0F, 0.4F);
               this.e.b(var16, var15, var13, var11 - var10, var12, var14);

               for(int var19 = 0; var19 < 4; ++var19) {
                  if(this.a(var1, var19)) {
                     GL11.glColor4f(var25, 0.0F, 0.0F, 0.4F);
                     this.f.b(var16, var15, var13, var11 - var10, var12, var14);
                  }
               }
            }

            if((var18 >> 24 & 255) > 0) {
               float var26 = (float)(var18 >> 16 & 255) / 255.0F;
               float var20 = (float)(var18 >> 8 & 255) / 255.0F;
               float var21 = (float)(var18 & 255) / 255.0F;
               float var22 = (float)(var18 >> 24 & 255) / 255.0F;
               GL11.glColor4f(var26, var20, var21, var22);
               this.e.b(var16, var15, var13, var11 - var10, var12, var14);

               for(int var23 = 0; var23 < 4; ++var23) {
                  if(this.a(var1, var23)) {
                     GL11.glColor4f(var26, var20, var21, var22);
                     this.f.b(var16, var15, var13, var11 - var10, var12, var14);
                  }
               }
            }

            GL11.glDepthFunc(515);
            GL11.glDisable(3042);
            GL11.glEnable(3008);
            GL11.glEnable(3553);
         }

         GL11.glDisable('\u803a');
      } catch (Exception var24) {
         var24.printStackTrace();
      }

      GL11.glEnable(2884);
      GL11.glPopMatrix();
   }

   protected float c(hf var1, float var2) {
      return var1.d(var2);
   }

   protected float d(hf var1, float var2) {
      return (float)var1.be + var2;
   }

   protected void b(hf var1, float var2) {}

   protected boolean a(hf var1, int var2) {
      return false;
   }

   protected float a(hf var1) {
      return 90.0F;
   }

   protected int a(hf var1, float var2, float var3) {
      return 0;
   }

   protected void a(hf var1, float var2) {}
}
