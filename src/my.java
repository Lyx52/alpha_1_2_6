
class my extends Thread {

   // $FF: synthetic field
   final ah a;


   my(ah var1) {
      this.a = var1;
   }

   public void run() {
      while(ah.a(this.a)) {
         this.a.d();

         try {
            Thread.sleep(1L);
         } catch (Exception var2) {
            ;
         }
      }

   }
}
