package mojang;

import java.io.File;
import java.io.IOException;

import mojang.net.minecraft.client.Minecraft;

public class le extends bp {

   protected bp a;
   protected String h = "Select world";
   private boolean i = false;


   public le(bp var1) {
      this.a = var1;
   }

   public void a() {
      File var1 = Minecraft.b();

      for(int var2 = 0; var2 < 5; ++var2) {
         iq var3 = cy.a(var1, "World" + (var2 + 1));
         if(var3 == null) {
            this.e.add(new gh(var2, this.c / 2 - 100, this.d / 6 + 24 * var2, "- empty -"));
         } else {
            String var4 = "World " + (var2 + 1);
            long var5 = var3.f("SizeOnDisk");
            var4 = var4 + " (" + (float)(var5 / 1024L * 100L / 1024L) / 100.0F + " MB)";
            this.e.add(new gh(var2, this.c / 2 - 100, this.d / 6 + 24 * var2, var4));
         }
      }

      this.j();
   }

   protected String d(int var1) {
      File var2 = Minecraft.b();
      return cy.a(var2, "World" + var1) != null?"World" + var1:null;
   }

   public void j() {
      this.e.add(new gh(5, this.c / 2 - 100, this.d / 6 + 120 + 12, "Delete world..."));
      this.e.add(new gh(6, this.c / 2 - 100, this.d / 6 + 168, "Cancel"));
   }

   protected void a(gh var1) throws IOException {
      if(var1.g) {
         if(var1.f < 5) {
            this.c(var1.f + 1);
         } else if(var1.f == 5) {
            this.b.a((bp)(new jh(this)));
         } else if(var1.f == 6) {
            this.b.a(this.a);
         }

      }
   }

   public void c(int var1) throws IOException {
      this.b.a((bp)null);
      if(!this.i) {
         this.i = true;
         this.b.b = new jg(this.b);
         this.b.b("World" + var1);
         this.b.a((bp)null);
      }
   }

   public void a(int var1, int var2, float var3) {
      this.i();
      this.a(this.g, this.h, this.c / 2, 20, 16777215);
      super.a(var1, var2, var3);
   }
}
