package mojang;

import mojang.gui.Button;
import mojang.net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class oh extends Button {

   public float i = 1.0F;
   public boolean j = false;
   private int l = 0;


   public oh(int var1, int var2, int var3, int var4, String var5, float var6) {
      super(var1, var2, var3, 150, 20, var5);
      this.l = var4;
      this.i = var6;
   }

   protected int a(boolean var1) {
      return 0;
   }

   protected void b(Minecraft var1, int var2, int var3) {
      if(this.h) {
         if(this.j) {
            this.i = (float)(var2 - (this.buttonX + 4)) / (float)(this.buttonWidth - 8);
            if(this.i < 0.0F) {
               this.i = 0.0F;
            }

            if(this.i > 1.0F) {
               this.i = 1.0F;
            }

            var1.y.a(this.l, this.i);
            this.title = var1.y.d(this.l);
         }

         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         this.b(this.buttonX + (int)(this.i * (float)(this.buttonWidth - 8)), this.buttonY, 0, 66, 4, 20);
         this.b(this.buttonX + (int)(this.i * (float)(this.buttonWidth - 8)) + 4, this.buttonY, 196, 66, 4, 20);
      }
   }

   public boolean onClick(Minecraft minecaft, int mx, int my) {
      if(super.onClick(minecaft, mx, my)) {
         this.i = (float)(mx - (this.buttonX + 4)) / (float)(this.buttonWidth - 8);
         if(this.i < 0.0F) {
            this.i = 0.0F;
         }

         if(this.i > 1.0F) {
            this.i = 1.0F;
         }

         minecaft.y.a(this.l, this.i);
         this.title = minecaft.y.d(this.l);
         this.j = true;
         return true;
      } else {
         return false;
      }
   }

   public void onUpdate(int mx, int my) {
      this.j = false;
   }
}
