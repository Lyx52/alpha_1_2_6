package mojang;

import mojang.entity.Entity;
import mojang.entity.item.FallingSand;
import org.lwjgl.opengl.GL11;

public class dy extends aq {

   private bk a = new bk();


   public dy() {
      this.c = 0.5F;
   }

   public void a(Entity var0, double var2, double var4, double var6, float var8, float var9) {
      FallingSand var1 = (FallingSand)var0;

      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      this.a("/mojang/terrain.png");
      nq var10 = nq.m[var1.a];
      cy var11 = var1.k();
      GL11.glDisable(2896);
      this.a.a(var10, var11, fi.b(var1.aw), fi.b(var1.ax), fi.b(var1.ay));
      GL11.glEnable(2896);
      GL11.glPopMatrix();
   }
}
