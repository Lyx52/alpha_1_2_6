package mojang;

import java.awt.Canvas;
import mojang.net.minecraft.client.MinecraftApplet;

public class j extends Canvas {

   // $FF: synthetic field
   final MinecraftApplet a;


   public j(MinecraftApplet var1) {
      this.a = var1;
   }

   public synchronized void addNotify() {
      super.addNotify();
      this.a.a();
   }

   public synchronized void removeNotify() {
      this.a.b();
      super.removeNotify();
   }
}
