package mojang;

import mojang.gui.Button;
import mojang.gui.GraphicsUserInterface;
import mojang.gui.MinecraftGUI;
import mojang.world.World;
import org.lwjgl.opengl.GL11;

import java.io.IOException;

public class bb extends GraphicsUserInterface {

   public void initButtons() {
      this.buttons.clear();
      this.buttons.add(new Button(1, this.c / 2 - 100, this.d / 4 + 72, "Respawn"));
      this.buttons.add(new Button(2, this.c / 2 - 100, this.d / 4 + 96, "Title menu"));
      if(this.minecraft.i == null) {
         ((Button)this.buttons.get(1)).visible = false;
      }

   }

   protected void a(char var1, int var2) {}

   protected void buttonClicked(Button var1) throws IOException {
      if(var1.value == 0) {
         ;
      }

      if(var1.value == 1) {
         this.minecraft.playerName.r();
         this.minecraft.changeGUI((GraphicsUserInterface)null);
      }

      if(var1.value == 2) {
         this.minecraft.setWorld((World)null);
         this.minecraft.changeGUI((GraphicsUserInterface)(new MinecraftGUI()));
      }

   }

   public void a(int var1, int var2, float var3) {
      this.a(0, 0, this.c, this.d, 1615855616, -1602211792);
      GL11.glPushMatrix();
      GL11.glScalef(2.0F, 2.0F, 2.0F);
      this.displayButton(this.g, "Game over!", this.c / 2 / 2, 30, 16777215);
      GL11.glPopMatrix();
      this.displayButton(this.g, "Score: &e" + this.minecraft.playerName.u(), this.c / 2, 100, 16777215);
      super.a(var1, var2, var3);
   }

   public boolean b() {
      return false;
   }
}
