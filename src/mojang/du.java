package mojang;

import mojang.gui.Button;
import mojang.gui.GraphicsUserInterface;

import java.io.IOException;

public class du extends GraphicsUserInterface {

   private ib a;
   private int h = 0;


   public du(ib var1) {
      this.a = var1;
   }

   protected void a(char var1, int var2) {}

   public void initButtons() {
      this.buttons.clear();
   }

   public void g() throws IOException {
      ++this.h;
      if(this.h % 20 == 0) {
         this.a.a((BasePacket)(new hl()));
      }

      if(this.a != null) {
         this.a.a();
      }

   }

   protected void buttonClicked(Button var1) {}

   public void a(int var1, int var2, float var3) {
      this.b(0);
      this.displayButton(this.g, "Downloading terrain", this.c / 2, this.d / 2 - 50, 16777215);
      super.a(var1, var2, var3);
   }
}
