package mojang;

import mojang.entity.LivingEntity;
import org.lwjgl.opengl.GL11;

public class m extends ec {

   protected dc a;


   public m(dc var1, float var2) {
      super(var1, var2);
      this.a = var1;
   }

   protected void b(LivingEntity var1, float var2) {
      fp var3 = var1.l();
      if(var3 != null) {
         GL11.glPushMatrix();
         this.a.d.b(0.0625F);
         GL11.glTranslatef(-0.0625F, 0.4375F, 0.0625F);
         float var4;
         if(var3.c < 256 && bk.a(nq.m[var3.c].g())) {
            var4 = 0.5F;
            GL11.glTranslatef(0.0F, 0.1875F, -0.3125F);
            var4 *= 0.75F;
            GL11.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
            GL11.glScalef(var4, -var4, var4);
         } else if(dx.c[var3.c].a()) {
            var4 = 0.625F;
            GL11.glTranslatef(0.0F, 0.1875F, 0.0F);
            GL11.glScalef(var4, -var4, var4);
            GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
         } else {
            var4 = 0.375F;
            GL11.glTranslatef(0.25F, 0.1875F, -0.1875F);
            GL11.glScalef(var4, var4, var4);
            GL11.glRotatef(60.0F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(20.0F, 0.0F, 0.0F, 1.0F);
         }

         this.b.f.a(var3);
         GL11.glPopMatrix();
      }

   }
}
