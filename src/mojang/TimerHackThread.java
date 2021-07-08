package mojang;

import mojang.net.minecraft.client.Minecraft;

public class TimerHackThread extends Thread {

   final Minecraft a;


   public TimerHackThread(Minecraft var1, String var2) {
      super(var2);
      this.a = var1;
      this.setDaemon(true);
      this.start();
   }

   public void run() {
      while(this.a.H) {
         try {
            Thread.sleep(2147483647L);
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
      }

   }
}
