package mojang;

import org.lwjgl.opengl.GL11;

public class ce extends ec {

   private dc a;
   private dc g;
   private dc h;
   private static final String[] i = new String[]{"cloth", "chain", "iron", "diamond", "gold"};


   public ce() {
      super(new dc(0.0F), 0.5F);
      this.a = (dc)this.e;
      this.g = new dc(1.0F);
      this.h = new dc(0.5F);
   }

   protected boolean a(eb var1, int var2) {
      fp var3 = var1.e.d(3 - var2);
      if(var3 != null) {
         dx var4 = var3.a();
         if(var4 instanceof oj) {
            oj var5 = (oj)var4;
            this.a("/mojang/armor/" + i[var5.bd] + "_" + (var2 == 2?2:1) + ".png");
            dc var6 = var2 == 2?this.h:this.g;
            var6.a.h = var2 == 0;
            var6.b.h = var2 == 0;
            var6.c.h = var2 == 1 || var2 == 2;
            var6.d.h = var2 == 1;
            var6.e.h = var2 == 1;
            var6.f.h = var2 == 2 || var2 == 3;
            var6.g.h = var2 == 2 || var2 == 3;
            this.a(var6);
            return true;
         }
      }

      return false;
   }

   public void a(eb var1, double var2, double var4, double var6, float var8, float var9) {
      fp var10 = var1.e.a();
      this.g.i = this.h.i = this.a.i = var10 != null;
      this.g.j = this.h.j = this.a.j = var1.p();
      double var11 = var4 - (double)var1.aO;
      if(var1.bw) {
         var11 -= 0.125D;
      }

      super.a((hf)var1, var2, var11, var6, var8, var9);
      this.g.j = this.h.j = this.a.j = false;
      this.g.i = this.h.i = this.a.i = false;
      float var13 = 1.6F;
      float var14 = 0.016666668F * var13;
      float var15 = var1.e(this.b.h);
      float var16 = var1.p()?32.0F:64.0F;
      if(var15 < var16) {
         var14 = (float)((double)var14 * (Math.sqrt((double)var15) / 2.0D));
         ls var17 = this.a();
         GL11.glPushMatrix();
         GL11.glTranslatef((float)var2 + 0.0F, (float)var4 + 2.3F, (float)var6);
         GL11.glNormal3f(0.0F, 1.0F, 0.0F);
         GL11.glRotatef(-this.b.i, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(this.b.j, 1.0F, 0.0F, 0.0F);
         GL11.glScalef(-var14, -var14, var14);
         String var18 = var1.l;
         GL11.glDisable(2896);
         is var19;
         int var20;
         if(!var1.p()) {
            GL11.glDepthMask(false);
            GL11.glDisable(2929);
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 771);
            var19 = is.a;
            GL11.glDisable(3553);
            var19.b();
            var20 = var17.a(var18) / 2;
            var19.a(0.0F, 0.0F, 0.0F, 0.25F);
            var19.a((double)(-var20 - 1), -1.0D, 0.0D);
            var19.a((double)(-var20 - 1), 8.0D, 0.0D);
            var19.a((double)(var20 + 1), 8.0D, 0.0D);
            var19.a((double)(var20 + 1), -1.0D, 0.0D);
            var19.a();
            GL11.glEnable(3553);
            var17.b(var18, -var17.a(var18) / 2, 0, 553648127);
            GL11.glEnable(2929);
            GL11.glDepthMask(true);
            var17.b(var18, -var17.a(var18) / 2, 0, -1);
            GL11.glEnable(2896);
            GL11.glDisable(3042);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glPopMatrix();
         } else {
            GL11.glTranslatef(0.0F, 0.25F / var14, 0.0F);
            GL11.glDepthMask(false);
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 771);
            var19 = is.a;
            GL11.glDisable(3553);
            var19.b();
            var20 = var17.a(var18) / 2;
            var19.a(0.0F, 0.0F, 0.0F, 0.25F);
            var19.a((double)(-var20 - 1), -1.0D, 0.0D);
            var19.a((double)(-var20 - 1), 8.0D, 0.0D);
            var19.a((double)(var20 + 1), 8.0D, 0.0D);
            var19.a((double)(var20 + 1), -1.0D, 0.0D);
            var19.a();
            GL11.glEnable(3553);
            GL11.glDepthMask(true);
            var17.b(var18, -var17.a(var18) / 2, 0, 553648127);
            GL11.glEnable(2896);
            GL11.glDisable(3042);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glPopMatrix();
         }
      }

   }

   protected void a(eb var1, float var2) {
      fp var3 = var1.e.d(3);
      if(var3 != null && var3.a().aW < 256) {
         GL11.glPushMatrix();
         this.a.a.b(0.0625F);
         if(bk.a(nq.m[var3.c].g())) {
            float var4 = 0.625F;
            GL11.glTranslatef(0.0F, -0.25F, 0.0F);
            GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
            GL11.glScalef(var4, -var4, var4);
         }

         this.b.f.a(var3);
         GL11.glPopMatrix();
      }

      fp var6 = var1.e.a();
      if(var6 != null) {
         GL11.glPushMatrix();
         this.a.d.b(0.0625F);
         GL11.glTranslatef(-0.0625F, 0.4375F, 0.0625F);
         if(var1.n != null) {
            var6 = new fp(dx.B.aW);
         }

         float var5;
         if(var6.c < 256 && bk.a(nq.m[var6.c].g())) {
            var5 = 0.5F;
            GL11.glTranslatef(0.0F, 0.1875F, -0.3125F);
            var5 *= 0.75F;
            GL11.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
            GL11.glScalef(var5, -var5, var5);
         } else if(dx.c[var6.c].a()) {
            var5 = 0.625F;
            if(dx.c[var6.c].b()) {
               GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
               GL11.glTranslatef(0.0F, -0.125F, 0.0F);
            }

            GL11.glTranslatef(0.0F, 0.1875F, 0.0F);
            GL11.glScalef(var5, -var5, var5);
            GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
         } else {
            var5 = 0.375F;
            GL11.glTranslatef(0.25F, 0.1875F, -0.1875F);
            GL11.glScalef(var5, var5, var5);
            GL11.glRotatef(60.0F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(20.0F, 0.0F, 0.0F, 1.0F);
         }

         this.b.f.a(var6);
         GL11.glPopMatrix();
      }

   }

   protected void b(eb var1, float var2) {
      float var3 = 0.9375F;
      GL11.glScalef(var3, var3, var3);
   }

   public void b() {
      this.a.k = 0.0F;
      this.a.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
      this.a.d.a(0.0625F);
   }

}
