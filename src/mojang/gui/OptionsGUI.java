package mojang.gui;

import mojang.OptionsManager;
import mojang.nm;
import mojang.oh;

public class OptionsGUI extends GraphicsUserInterface {

   private GraphicsUserInterface rootInterface;
   protected String title = "Options";
   private OptionsManager optionsManager;


   public OptionsGUI(GraphicsUserInterface rootInterface, OptionsManager optionsManager) {
      this.rootInterface = rootInterface;
      this.optionsManager = optionsManager;
   }

   public void initButtons() {
      for(int var1 = 0; var1 < this.optionsManager.buttonCount; ++var1) {
         int var2 = this.optionsManager.b(var1);
         if(var2 == 0) {
            this.buttons.add(new TexturePackButton(var1, this.c / 2 - 155 + var1 % 2 * 160, this.d / 6 + 24 * (var1 >> 1), this.optionsManager.d(var1)));
         } else {
            this.buttons.add(new oh(var1, this.c / 2 - 155 + var1 % 2 * 160, this.d / 6 + 24 * (var1 >> 1), var1, this.optionsManager.d(var1), this.optionsManager.c(var1)));
         }
      }

      this.buttons.add(new Button(100, this.c / 2 - 100, this.d / 6 + 120 + 12, "Controls..."));
      this.buttons.add(new Button(200, this.c / 2 - 100, this.d / 6 + 168, "Done"));
   }

   protected void buttonClicked(Button var1) {
      if(var1.visible) {
         if(var1.value < 100) {
            this.optionsManager.b(var1.value, 1);
            var1.title = this.optionsManager.d(var1.value);
         }

         if(var1.value == 100) {
            this.minecraft.y.b();
            this.minecraft.changeGUI((GraphicsUserInterface)(new nm(this, this.optionsManager)));
         }

         if(var1.value == 200) {
            this.minecraft.y.b();
            this.minecraft.changeGUI(this.rootInterface);
         }

      }
   }

   public void a(int var1, int var2, float var3) {
      this.i();
      this.displayButton(this.g, this.title, this.c / 2, 20, 16777215);
      super.a(var1, var2, var3);
   }
}
