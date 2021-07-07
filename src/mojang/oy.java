package mojang;

import java.net.ConnectException;
import java.net.UnknownHostException;
import mojang.net.minecraft.client.Minecraft;

class oy extends Thread {

   // $FF: synthetic field
   final Minecraft a;
   // $FF: synthetic field
   final String b;
   // $FF: synthetic field
   final int c;
   // $FF: synthetic field
   final og d;


   oy(og var1, Minecraft var2, String var3, int var4) {
      this.d = var1;
      this.a = var2;
      this.b = var3;
      this.c = var4;
   }

   public void run() {
      try {
         og.a(this.d, new ib(this.a, this.b, this.c));
         if(og.a(this.d)) {
            return;
         }

         og.b(this.d).a((gk)(new hw(this.a.i.b)));
      } catch (UnknownHostException var2) {
         if(og.a(this.d)) {
            return;
         }

         this.a.a((bp)(new ct("Failed to connect to the server", "Unknown host \'" + this.b + "\'")));
      } catch (ConnectException var3) {
         if(og.a(this.d)) {
            return;
         }

         this.a.a((bp)(new ct("Failed to connect to the server", var3.getMessage())));
      } catch (Exception var4) {
         if(og.a(this.d)) {
            return;
         }

         var4.printStackTrace();
         this.a.a((bp)(new ct("Failed to connect to the server", var4.toString())));
      }

   }
}
