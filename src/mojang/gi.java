package mojang;

import mojang.net.minecraft.client.Minecraft;

public class gi extends Thread {

   // $FF: synthetic field
   final Minecraft a;


   public gi(Minecraft var1, String var2) {
      super(var2);
      this.a = var1;
      this.setDaemon(true);
      this.start();
   }

   public void run() {
      while(this.a.H) {
         try {
            Thread.sleep(2147483647L);
         } catch (InterruptedException var2) {
            ;
         }
      }

   }
}
