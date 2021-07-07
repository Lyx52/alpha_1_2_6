package mojang;

class ph extends Thread {

   // $FF: synthetic field
   final jq a;


   ph(jq var1, String var2) {
      super(var2);
      this.a = var1;
   }

   public void run() {
      Object var1 = jq.a;
      synchronized(jq.a) {
         ++jq.c;
      }

      while(true) {
         boolean var11 = false;

         try {
            var11 = true;
            if(!jq.a(this.a)) {
               var11 = false;
               break;
            }

            jq.d(this.a);
         } finally {
            if(var11) {
               Object var5 = jq.a;
               synchronized(jq.a) {
                  --jq.c;
               }
            }
         }
      }

      var1 = jq.a;
      synchronized(jq.a) {
         --jq.c;
      }
   }
}
