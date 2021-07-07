package mojang;

import java.util.HashMap;
import java.util.Map;
import org.lwjgl.opengl.GL11;

public class u extends fr {

   private Map b = new HashMap();

   @Override
   public void a(ji var0, double var2, double var4, double var6, float var8) {
      bl var1 = (bl)var0;

      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2 + 0.5F, (float)var4, (float)var6 + 0.5F);
      lw var9 = (lw)this.b.get(var1.b);
      if(var9 == null) {
         var9 = fq.a(var1.b, (cy)null);
         this.b.put(var1.b, var9);
      }

      if(var9 != null) {
         var9.a(var1.e);
         float var10 = 0.4375F;
         GL11.glTranslatef(0.0F, 0.4F, 0.0F);
         GL11.glRotatef((float)(var1.d + (var1.c - var1.d) * (double)var8) * 10.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(-30.0F, 1.0F, 0.0F, 0.0F);
         GL11.glTranslatef(0.0F, -0.4F, 0.0F);
         GL11.glScalef(var10, var10, var10);
         var9.c(var2, var4, var6, 0.0F, 0.0F);
         mn.a.a(var9, 0.0D, 0.0D, 0.0D, 0.0F, var8);
      }

      GL11.glPopMatrix();
   }
}
