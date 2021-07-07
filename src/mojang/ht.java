package mojang;

import org.lwjgl.opengl.GL11;

public class ht extends ec {

   private gm a;


   public ht(gm var1, gm var2, float var3) {
      super(var1, var3);
      this.a = var2;
   }

   protected boolean a(ns var1, int var2) {
      if(var2 == 0) {
         this.a(this.a);
         GL11.glEnable(2977);
         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 771);
         return true;
      } else {
         if(var2 == 1) {
            GL11.glDisable(3042);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         }

         return false;
      }
   }

   protected void a(ns var1, float var2) {
      float var3 = (var1.b + (var1.a - var1.b) * var2) / ((float)var1.c * 0.5F + 1.0F);
      float var4 = 1.0F / (var3 + 1.0F);
      float var5 = (float)var1.c;
      GL11.glScalef(var4 * var5, 1.0F / var4 * var5, var4 * var5);
   }
}
