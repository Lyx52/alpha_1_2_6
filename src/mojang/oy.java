package mojang;

import java.net.ConnectException;
import java.net.UnknownHostException;

import mojang.gui.GraphicsUserInterface;
import mojang.gui.ServerConnectionGUI;
import mojang.gui.ServerErrorGUI;
import mojang.net.minecraft.client.Minecraft;

public class oy extends Thread {

   final Minecraft a;
   final String b;
   final int c;
   final ServerConnectionGUI d;


   public oy(ServerConnectionGUI var1, Minecraft var2, String var3, int var4) {
      this.d = var1;
      this.a = var2;
      this.b = var3;
      this.c = var4;
   }

   public void run() {
      try {
         ServerConnectionGUI.a(this.d, new ib(this.a, this.b, this.c));
         if(ServerConnectionGUI.a(this.d)) {
            return;
         }

         ServerConnectionGUI.b(this.d).a((BasePacket)(new hw(this.a.i.b)));
      } catch (UnknownHostException var2) {
         if(ServerConnectionGUI.a(this.d)) {
            return;
         }

         this.a.changeGUI((GraphicsUserInterface)(new ServerErrorGUI("Failed to connect to the server", "Unknown host \'" + this.b + "\'")));
      } catch (ConnectException exception) {
         if(ServerConnectionGUI.a(this.d)) {
            return;
         }

         this.a.changeGUI((GraphicsUserInterface)(new ServerErrorGUI("Failed to connect to the server", exception.getMessage())));
      } catch (Exception var4) {
         if(ServerConnectionGUI.a(this.d)) {
            return;
         }

         var4.printStackTrace();
         this.a.changeGUI((GraphicsUserInterface)(new ServerErrorGUI("Failed to connect to the server", var4.toString())));
      }

   }
}
