package mojang.gui;

import java.io.File;
import java.io.IOException;

import mojang.world.World;
import mojang.jg;
import mojang.WorldDeletionGUI;
import mojang.net.minecraft.client.Minecraft;
import mojang.tags.CompoundTag;

public class WorldSelectionGUI extends GraphicsUserInterface {

   protected GraphicsUserInterface rootInterface;
   protected String title = "Select world";
   private boolean i = false;


   public WorldSelectionGUI(GraphicsUserInterface interfaceRoot) {
      this.rootInterface = interfaceRoot;
   }

   public void initButtons() {
      File gameDirectory = Minecraft.getGameDirectory();

      for(int worldIndex = 0; worldIndex < 5; ++worldIndex) {

         // Load level data
         CompoundTag worldData = World.getWorldData(gameDirectory, "World" + (worldIndex + 1));

         if(worldData == null) {
            // If null change button to empty
            this.buttons.add(new Button(worldIndex, this.c / 2 - 100, this.d / 6 + 24 * worldIndex, "- empty -"));
         } else {
            // Else change button to world name
            String worldName = "World " + (worldIndex + 1);
            long worldSize = worldData.getLong("SizeOnDisk");
            worldName = worldName + " (" + (float)(worldSize / 1024L * 100L / 1024L) / 100.0F + " MB)";
            this.buttons.add(new Button(worldIndex, this.c / 2 - 100, this.d / 6 + 24 * worldIndex, worldName));
         }
      }

      this.addStaticButtons();
   }

   protected String d(int var1) {
      File var2 = Minecraft.getGameDirectory();
      return World.getWorldData(var2, "World" + var1) != null?"World" + var1:null;
   }

   public void addStaticButtons() {
      this.buttons.add(new Button(5, this.c / 2 - 100, this.d / 6 + 120 + 12, "Delete world..."));
      this.buttons.add(new Button(6, this.c / 2 - 100, this.d / 6 + 168, "Cancel"));
   }

   protected void buttonClicked(Button button) throws IOException {
      if(button.visible) {
         if(button.value < 5) {
            // World selection buttons
            this.selectWorld(button.value + 1);
         } else if(button.value == 5) {
            // Delete button
            this.minecraft.changeGUI((GraphicsUserInterface)(new WorldDeletionGUI(this)));
         } else if(button.value == 6) {
            // Cancel button
            this.minecraft.changeGUI(this.rootInterface);
         }

      }
   }

   public void selectWorld(int index) throws IOException {
      this.minecraft.changeGUI((GraphicsUserInterface)null);
      if(!this.i) {
         this.i = true;
         this.minecraft.b = new jg(this.minecraft);
         this.minecraft.changeWorld("World" + index);
         this.minecraft.changeGUI((GraphicsUserInterface)null);
      }
   }

   public void a(int var1, int var2, float var3) {
      this.i();
      this.displayButton(this.g, this.title, this.c / 2, 20, 16777215);
      super.a(var1, var2, var3);
   }
}
