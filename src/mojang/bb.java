package mojang;

import org.lwjgl.opengl.GL11;

import java.io.IOException;

public class bb extends GraphicsUserInterface {

   public void initButtons() {
      this.buttons.clear();
      this.buttons.add(new Button(1, this.c / 2 - 100, this.d / 4 + 72, "Respawn"));
      this.buttons.add(new Button(2, this.c / 2 - 100, this.d / 4 + 96, "Title menu"));
      if(this.b.i == null) {
         ((Button)this.buttons.get(1)).g = false;
      }

   }

   protected void a(char var1, int var2) {}

   protected void a(Button var1) throws IOException {
      if(var1.f == 0) {
         ;
      }

      if(var1.f == 1) {
         this.b.playerName.r();
         this.b.a((GraphicsUserInterface)null);
      }

      if(var1.f == 2) {
         this.b.a((cy)null);
         this.b.a((GraphicsUserInterface)(new dj()));
      }

   }

   public void a(int var1, int var2, float var3) {
      this.a(0, 0, this.c, this.d, 1615855616, -1602211792);
      GL11.glPushMatrix();
      GL11.glScalef(2.0F, 2.0F, 2.0F);
      this.a(this.g, "Game over!", this.c / 2 / 2, 30, 16777215);
      GL11.glPopMatrix();
      this.a(this.g, "Score: &e" + this.b.playerName.u(), this.c / 2, 100, 16777215);
      super.a(var1, var2, var3);
   }

   public boolean b() {
      return false;
   }
}
