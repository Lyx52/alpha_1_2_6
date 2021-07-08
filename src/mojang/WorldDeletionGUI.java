package mojang;

import java.io.File;

import mojang.gui.Button;
import mojang.gui.GraphicsUserInterface;
import mojang.gui.WorldSelectionGUI;
import mojang.net.minecraft.client.Minecraft;
import mojang.world.World;

public class WorldDeletionGUI extends WorldSelectionGUI {

   public WorldDeletionGUI(GraphicsUserInterface userInterface) {
      super(userInterface);
      this.title = "Delete world";
   }

   public void addStaticButtons() {
      this.buttons.add(new Button(6, this.c / 2 - 100, this.d / 6 + 168, "Cancel"));
   }

   public void selectWorld(int index) {
      String var2 = this.d(index);
      if(var2 != null) {
         this.minecraft.changeGUI((GraphicsUserInterface)(new kn(this, "Are you sure you want to delete this world?", "\'" + var2 + "\' will be lost forever!", index)));
      }

   }

   public void a(boolean var1, int var2) {
      if(var1) {
         File var3 = Minecraft.getGameDirectory();
         World.b(var3, this.d(var2));
      }

      this.minecraft.changeGUI(this.rootInterface);
   }
}
