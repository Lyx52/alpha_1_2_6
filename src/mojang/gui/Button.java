package mojang.gui;

import mojang.ls;
import mojang.net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class Button extends GUIComponent {

   protected int buttonWidth;
   protected int buttonHeight;
   public int buttonX;
   public int buttonY;
   public String title;
   public int value;
   public boolean visible;
   public boolean h;


   public Button(int var1, int var2, int var3, String var4) {
      this(var1, var2, var3, 200, 20, var4);
   }

   protected Button(int var1, int var2, int var3, int var4, int var5, String var6) {
      this.buttonWidth = 200;
      this.buttonHeight = 20;
      this.visible = true;
      this.h = true;
      this.value = var1;
      this.buttonX = var2;
      this.buttonY = var3;
      this.buttonWidth = var4;
      this.buttonHeight = var5;
      this.title = var6;
   }

   protected int a(boolean var1) {
      byte var2 = 1;
      if(!this.visible) {
         var2 = 0;
      } else if(var1) {
         var2 = 2;
      }

      return var2;
   }

   public void a(Minecraft var1, int var2, int var3) {
      if(this.h) {
         ls var4 = var1.o;
         GL11.glBindTexture(3553, var1.n.loadTexture("/mojang/assets/gui/gui.png"));
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         boolean var5 = var2 >= this.buttonX && var3 >= this.buttonY && var2 < this.buttonX + this.buttonWidth && var3 < this.buttonY + this.buttonHeight;
         int var6 = this.a(var5);
         this.b(this.buttonX, this.buttonY, 0, 46 + var6 * 20, this.buttonWidth / 2, this.buttonHeight);
         this.b(this.buttonX + this.buttonWidth / 2, this.buttonY, 200 - this.buttonWidth / 2, 46 + var6 * 20, this.buttonWidth / 2, this.buttonHeight);
         this.b(var1, var2, var3);
         if(!this.visible) {
            this.displayButton(var4, this.title, this.buttonX + this.buttonWidth / 2, this.buttonY + (this.buttonHeight - 8) / 2, -6250336);
         } else if(var5) {
            this.displayButton(var4, this.title, this.buttonX + this.buttonWidth / 2, this.buttonY + (this.buttonHeight - 8) / 2, 16777120);
         } else {
            this.displayButton(var4, this.title, this.buttonX + this.buttonWidth / 2, this.buttonY + (this.buttonHeight - 8) / 2, 14737632);
         }

      }
   }

   protected void b(Minecraft var1, int var2, int var3) {}

   public void onUpdate(int mx, int my) {}

   public boolean onClick(Minecraft minecaft, int mx, int my) {
      return this.visible && mx >= this.buttonX && my >= this.buttonY && mx < this.buttonX + this.buttonWidth && my < this.buttonY + this.buttonHeight;
   }
}
