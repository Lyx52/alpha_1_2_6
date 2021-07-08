package mojang;

import mojang.entity.Entity;
import org.lwjgl.opengl.GL11;

public class gl extends aq {
   @Override
   public void a(Entity var0, double var2, double var4, double var6, float var8, float var9) {
      az var1 = (az)var0;

      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      GL11.glEnable('\u803a');
      float var10 = 2.0F;
      GL11.glScalef(var10 / 1.0F, var10 / 1.0F, var10 / 1.0F);
      int var11 = Item.aB.a((fp)null);
      this.a("/mojang/assets/gui/items.png");
      is var12 = is.a;
      float var13 = (float)(var11 % 16 * 16 + 0) / 256.0F;
      float var14 = (float)(var11 % 16 * 16 + 16) / 256.0F;
      float var15 = (float)(var11 / 16 * 16 + 0) / 256.0F;
      float var16 = (float)(var11 / 16 * 16 + 16) / 256.0F;
      float var17 = 1.0F;
      float var18 = 0.5F;
      float var19 = 0.25F;
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
   }
}
