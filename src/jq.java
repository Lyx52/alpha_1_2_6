import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class jq {

   public static final Object a = new Object();
   public static int b;
   public static int c;
   private Object d = new Object();
   private Socket e;
   private final SocketAddress f;
   private DataInputStream g;
   private DataOutputStream h;
   private boolean i = true;
   private List j = Collections.synchronizedList(new ArrayList());
   private List k = Collections.synchronizedList(new ArrayList());
   private List l = Collections.synchronizedList(new ArrayList());
   private mo m;
   private boolean n = false;
   private Thread o;
   private Thread p;
   private boolean q = false;
   private String r = "";
   private int s = 0;
   private int t = 0;
   private int u = 0;


   public jq(Socket var1, String var2, mo var3) {
      this.e = var1;
      this.f = var1.getRemoteSocketAddress();
      this.m = var3;
      var1.setTrafficClass(24);
      this.g = new DataInputStream(var1.getInputStream());
      this.h = new DataOutputStream(var1.getOutputStream());
      this.p = new pf(this, var2 + " read thread");
      this.o = new ph(this, var2 + " write thread");
      this.p.start();
      this.o.start();
   }

   public void a(gk var1) {
      if(!this.n) {
         Object var2 = this.d;
         synchronized(this.d) {
            this.t += var1.a() + 1;
            if(var1.j) {
               this.l.add(var1);
            } else {
               this.k.add(var1);
            }

         }
      }
   }

   private void b() {
      try {
         boolean var1 = true;
         gk var2;
         Object var3;
         if(!this.k.isEmpty()) {
            var1 = false;
            var3 = this.d;
            synchronized(this.d) {
               var2 = (gk)this.k.remove(0);
               this.t -= var2.a() + 1;
            }

            gk.a(var2, this.h);
         }

         if((var1 || this.u-- <= 0) && !this.l.isEmpty()) {
            var1 = false;
            var3 = this.d;
            synchronized(this.d) {
               var2 = (gk)this.l.remove(0);
               this.t -= var2.a() + 1;
            }

            gk.a(var2, this.h);
            this.u = 50;
         }

         if(var1) {
            Thread.sleep(10L);
         }
      } catch (InterruptedException var8) {
         ;
      } catch (Exception var9) {
         if(!this.q) {
            this.a(var9);
         }
      }

   }

   private void c() {
      try {
         gk var1 = gk.b(this.g);
         if(var1 != null) {
            this.j.add(var1);
         } else {
            this.a("End of stream");
         }
      } catch (Exception var2) {
         if(!this.q) {
            this.a(var2);
         }
      }

   }

   private void a(Exception var1) {
      var1.printStackTrace();
      this.a("Internal exception: " + var1.toString());
   }

   public void a(String var1) {
      if(this.i) {
         this.q = true;
         this.r = var1;
         (new pe(this)).start();
         this.i = false;

         try {
            this.g.close();
            this.g = null;
         } catch (Throwable var5) {
            ;
         }

         try {
            this.h.close();
            this.h = null;
         } catch (Throwable var4) {
            ;
         }

         try {
            this.e.close();
            this.e = null;
         } catch (Throwable var3) {
            ;
         }

      }
   }

   public void a() {
      if(this.t > 1048576) {
         this.a("Send buffer overflow");
      }

      if(this.j.isEmpty()) {
         if(this.s++ == 1200) {
            this.a("Timed out");
         }
      } else {
         this.s = 0;
      }

      int var1 = 100;

      while(!this.j.isEmpty() && var1-- >= 0) {
         gk var2 = (gk)this.j.remove(0);
         var2.a(this.m);
      }

      if(this.q && this.j.isEmpty()) {
         this.m.a(this.r);
      }

   }

   // $FF: synthetic method
   static boolean a(jq var0) {
      return var0.i;
   }

   // $FF: synthetic method
   static boolean b(jq var0) {
      return var0.n;
   }

   // $FF: synthetic method
   static void c(jq var0) {
      var0.c();
   }

   // $FF: synthetic method
   static void d(jq var0) {
      var0.b();
   }

   // $FF: synthetic method
   static Thread e(jq var0) {
      return var0.p;
   }

   // $FF: synthetic method
   static Thread f(jq var0) {
      return var0.o;
   }

}
