package mojang;

import java.io.File;
import mojang.net.minecraft.client.Minecraft;

public class jh extends le {

   public jh(GraphicsUserInterface var1) {
      super(var1);
      this.h = "Delete world";
   }

   public void j() {
      this.buttons.add(new Button(6, this.c / 2 - 100, this.d / 6 + 168, "Cancel"));
   }

   public void c(int var1) {
      String var2 = this.d(var1);
      if(var2 != null) {
         this.b.a((GraphicsUserInterface)(new kn(this, "Are you sure you want to delete this world?", "\'" + var2 + "\' will be lost forever!", var1)));
      }

   }

   public void a(boolean var1, int var2) {
      if(var1) {
         File var3 = Minecraft.b();
         cy.b(var3, this.d(var2));
      }

      this.b.a(this.a);
   }
}
