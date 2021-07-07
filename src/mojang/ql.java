package mojang;

import mojang.entity.monster.Spider;
import org.lwjgl.opengl.GL11;

public class ql extends ec {

   public ql() {
      super(new lm(), 1.0F);
      this.a((gm)(new lm()));
   }

   protected float a(Spider var1) {
      return 180.0F;
   }

   protected boolean a(Spider var1, int var2) {
      if(var2 != 0) {
         return false;
      } else if(var2 != 0) {
         return false;
      } else {
         this.a("/mojang/mob/spider_eyes.png");
         float var3 = (1.0F - var1.a(1.0F)) * 0.5F;
         GL11.glEnable(3042);
         GL11.glDisable(3008);
         GL11.glBlendFunc(770, 771);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, var3);
         return true;
      }
   }
}
