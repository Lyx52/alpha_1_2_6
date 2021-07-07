
class pe extends Thread {

   // $FF: synthetic field
   final jq a;


   pe(jq var1) {
      this.a = var1;
   }

   public void run() {
      try {
         Thread.sleep(5000L);
         if(jq.e(this.a).isAlive()) {
            try {
               jq.e(this.a).stop();
            } catch (Throwable var3) {
               ;
            }
         }

         if(jq.f(this.a).isAlive()) {
            try {
               jq.f(this.a).stop();
            } catch (Throwable var2) {
               ;
            }
         }
      } catch (InterruptedException var4) {
         var4.printStackTrace();
      }

   }
}
