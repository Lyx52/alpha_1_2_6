package mojang.gui;

import mojang.world.World;
import mojang.ib;
import mojang.net.minecraft.client.Minecraft;
import mojang.oy;

import java.io.IOException;

public class ServerConnectionGUI extends GraphicsUserInterface {

   private ib a;
   private boolean h = false;


   public ServerConnectionGUI(Minecraft var1, String var2, int var3) {
      var1.setWorld((World)null);
      (new oy(this, var1, var2, var3)).start();
   }

   public void g() throws IOException {
      if(this.a != null) {
         this.a.a();
      }

   }

   protected void a(char var1, int var2) {}

   public void initButtons() {
      this.buttons.clear();
      this.buttons.add(new Button(0, this.c / 2 - 100, this.d / 4 + 120 + 12, "Cancel"));
   }

   protected void buttonClicked(Button var1) {
      if(var1.value == 0) {
         this.h = true;
         if(this.a != null) {
            this.a.b();
         }

         this.minecraft.changeGUI((GraphicsUserInterface)(new MinecraftGUI()));
      }

   }

   public void a(int var1, int var2, float var3) {
      this.i();
      if(this.a == null) {
         this.displayButton(this.g, "Connecting to the server...", this.c / 2, this.d / 2 - 50, 16777215);
         this.displayButton(this.g, "", this.c / 2, this.d / 2 - 10, 16777215);
      } else {
         this.displayButton(this.g, "Logging in...", this.c / 2, this.d / 2 - 50, 16777215);
         this.displayButton(this.g, this.a.a, this.c / 2, this.d / 2 - 10, 16777215);
      }

      super.a(var1, var2, var3);
   }

   // $FF: synthetic method
   public static ib a(ServerConnectionGUI gui, ib var1) {
      return gui.a = var1;
   }

   // $FF: synthetic method
   public static boolean a(ServerConnectionGUI var0) {
      return var0.h;
   }

   // $FF: synthetic method
   public static ib b(ServerConnectionGUI var0) {
      return var0.a;
   }
}
