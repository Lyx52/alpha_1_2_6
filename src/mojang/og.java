package mojang;

import mojang.net.minecraft.client.Minecraft;

import java.io.IOException;

public class og extends bp {

   private ib a;
   private boolean h = false;


   public og(Minecraft var1, String var2, int var3) {
      var1.a((cy)null);
      (new oy(this, var1, var2, var3)).start();
   }

   public void g() throws IOException {
      if(this.a != null) {
         this.a.a();
      }

   }

   protected void a(char var1, int var2) {}

   public void a() {
      this.e.clear();
      this.e.add(new gh(0, this.c / 2 - 100, this.d / 4 + 120 + 12, "Cancel"));
   }

   protected void a(gh var1) {
      if(var1.f == 0) {
         this.h = true;
         if(this.a != null) {
            this.a.b();
         }

         this.b.a((bp)(new dj()));
      }

   }

   public void a(int var1, int var2, float var3) {
      this.i();
      if(this.a == null) {
         this.a(this.g, "Connecting to the server...", this.c / 2, this.d / 2 - 50, 16777215);
         this.a(this.g, "", this.c / 2, this.d / 2 - 10, 16777215);
      } else {
         this.a(this.g, "Logging in...", this.c / 2, this.d / 2 - 50, 16777215);
         this.a(this.g, this.a.a, this.c / 2, this.d / 2 - 10, 16777215);
      }

      super.a(var1, var2, var3);
   }

   // $FF: synthetic method
   static ib a(og var0, ib var1) {
      return var0.a = var1;
   }

   // $FF: synthetic method
   static boolean a(og var0) {
      return var0.h;
   }

   // $FF: synthetic method
   static ib b(og var0) {
      return var0.a;
   }
}
