import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import net.minecraft.client.Minecraft;

public final class gn extends WindowAdapter {

   // $FF: synthetic field
   final Minecraft a;
   // $FF: synthetic field
   final Thread b;


   public gn(Minecraft var1, Thread var2) {
      this.a = var1;
      this.b = var2;
   }

   public void windowClosing(WindowEvent var1) {
      this.a.d();

      try {
         this.b.join();
      } catch (InterruptedException var3) {
         var3.printStackTrace();
      }

      System.exit(0);
   }
}
