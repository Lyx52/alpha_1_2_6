package mojang;

import mojang.gui.Button;
import mojang.gui.GraphicsUserInterface;
import mojang.gui.MinecraftGUI;
import mojang.gui.OptionsGUI;
import mojang.world.World;

import java.io.IOException;

public class jl extends GraphicsUserInterface {

   private int a = 0;
   private int h = 0;


   public void initButtons() {
      this.a = 0;
      this.buttons.clear();
      this.buttons.add(new Button(1, this.c / 2 - 100, this.d / 4 + 48, "Save and quit to title"));
      if(this.minecraft.j()) {
         ((Button)this.buttons.get(0)).title = "Disconnect";
      }

      this.buttons.add(new Button(4, this.c / 2 - 100, this.d / 4 + 24, "Back to game"));
      this.buttons.add(new Button(0, this.c / 2 - 100, this.d / 4 + 96, "Options..."));
   }

   protected void buttonClicked(Button var1) {
      if(var1.value == 0) {
         this.minecraft.changeGUI((GraphicsUserInterface)(new OptionsGUI(this, this.minecraft.y)));
      }

      if(var1.value == 1) {
         if(this.minecraft.j()) {
            this.minecraft.world.m();
         }

         this.minecraft.setWorld((World)null);
         this.minecraft.changeGUI((GraphicsUserInterface)(new MinecraftGUI()));
      }

      if(var1.value == 4) {
         this.minecraft.changeGUI((GraphicsUserInterface)null);
         this.minecraft.e();
      }

   }

   public void g() throws IOException {
      super.g();
      ++this.h;
   }

   public void a(int var1, int var2, float var3) {
      this.i();
      boolean var4 = !this.minecraft.world.a(this.a++);
      if(var4 || this.h < 20) {
         float var5 = ((float)(this.h % 10) + var3) / 10.0F;
         var5 = fi.a(var5 * 3.1415927F * 2.0F) * 0.2F + 0.8F;
         int var6 = (int)(255.0F * var5);
         this.b(this.g, "Saving level..", 8, this.d - 16, var6 << 16 | var6 << 8 | var6);
      }

      this.displayButton(this.g, "Game menu", this.c / 2, 40, 16777215);
      super.a(var1, var2, var3);
   }
}
