package mojang;

import mojang.gui.Button;
import mojang.gui.GraphicsUserInterface;
import mojang.gui.TexturePackButton;

public class kn extends GraphicsUserInterface {

   private GraphicsUserInterface a;
   private String h;
   private String i;
   private int j;


   public kn(GraphicsUserInterface var1, String var2, String var3, int var4) {
      this.a = var1;
      this.h = var2;
      this.i = var3;
      this.j = var4;
   }

   public void initButtons() {
      this.buttons.add(new TexturePackButton(0, this.c / 2 - 155 + 0, this.d / 6 + 96, "Yes"));
      this.buttons.add(new TexturePackButton(1, this.c / 2 - 155 + 160, this.d / 6 + 96, "No"));
   }

   protected void buttonClicked(Button var1) {
      this.a.a(var1.value == 0, this.j);
   }

   public void a(int var1, int var2, float var3) {
      this.i();
      this.displayButton(this.g, this.h, this.c / 2, 70, 16777215);
      this.displayButton(this.g, this.i, this.c / 2, 90, 16777215);
      super.a(var1, var2, var3);
   }
}
