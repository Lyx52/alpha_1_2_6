package mojang;

class pf extends Thread {

   // $FF: synthetic field
   final jq a;


   pf(jq var1, String var2) {
      super(var2);
      this.a = var1;
   }

   public void run() {
      Object var1 = jq.a;
      synchronized(jq.a) {
         ++jq.b;
      }

      while(true) {
         boolean var11 = false;

         try {
            var11 = true;
            if(jq.a(this.a)) {
               if(!jq.b(this.a)) {
                  jq.c(this.a);
                  continue;
               }

               var11 = false;
               break;
            }

            var11 = false;
            break;
         } finally {
            if(var11) {
               Object var5 = jq.a;
               synchronized(jq.a) {
                  --jq.b;
               }
            }
         }
      }

      var1 = jq.a;
      synchronized(jq.a) {
         --jq.b;
      }
   }
}
