package mojang;

import org.lwjgl.opengl.GL11;

public class hm extends aq {

   public void a(lw var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glPushMatrix();
      a(var1.aG, var2 - var1.aV, var4 - var1.aW, var6 - var1.aX);
      GL11.glPopMatrix();
   }
}
