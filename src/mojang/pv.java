package mojang;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class pv extends GraphicsUserInterface {

   protected String a = "Edit sign message:";
   private qc h;
   private int i;
   private int j = 0;


   public pv(qc var1) {
      this.h = var1;
   }

   public void initButtons() {
      this.buttons.clear();
      Keyboard.enableRepeatEvents(true);
      this.buttons.add(new Button(0, this.c / 2 - 100, this.d / 4 + 120, "Done"));
   }

   public void h() {
      Keyboard.enableRepeatEvents(false);
   }

   public void g() {
      ++this.i;
   }

   protected void a(Button var1) {
      if(var1.g) {
         if(var1.f == 0) {
            this.h.h();
            this.b.a((GraphicsUserInterface)null);
         }

      }
   }

   protected void a(char var1, int var2) {
      if(var2 == 200) {
         this.j = this.j - 1 & 3;
      }

      if(var2 == 208 || var2 == 28) {
         this.j = this.j + 1 & 3;
      }

      if(var2 == 14 && this.h.a[this.j].length() > 0) {
         this.h.a[this.j] = this.h.a[this.j].substring(0, this.h.a[this.j].length() - 1);
      }

      if(" !\"#$%&\'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_\'abcdefghijklmnopqrstuvwxyz{|}~⌂ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»".indexOf(var1) >= 0 && this.h.a[this.j].length() < 15) {
         this.h.a[this.j] = this.h.a[this.j] + var1;
      }

   }

   public void a(int var1, int var2, float var3) {
      this.i();
      this.a(this.g, this.a, this.c / 2, 40, 16777215);
      GL11.glPushMatrix();
      GL11.glTranslatef((float)(this.c / 2), (float)(this.d / 2), 50.0F);
      float var4 = 93.75F;
      GL11.glScalef(-var4, -var4, -var4);
      GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
      nq var5 = this.h.g();
      if(var5 == nq.aD) {
         float var6 = (float)(this.h.f() * 360) / 16.0F;
         GL11.glRotatef(var6, 0.0F, 1.0F, 0.0F);
         GL11.glTranslatef(0.0F, 0.3125F, 0.0F);
      } else {
         int var8 = this.h.f();
         float var7 = 0.0F;
         if(var8 == 2) {
            var7 = 180.0F;
         }

         if(var8 == 4) {
            var7 = 90.0F;
         }

         if(var8 == 5) {
            var7 = -90.0F;
         }

         GL11.glRotatef(var7, 0.0F, 1.0F, 0.0F);
         GL11.glTranslatef(0.0F, 0.3125F, 0.0F);
      }

      if(this.i / 6 % 2 == 0) {
         this.h.b = this.j;
      }

      gz.a.a(this.h, -0.5D, -0.75D, -0.5D, 0.0F);
      this.h.b = -1;
      GL11.glPopMatrix();
      super.a(var1, var2, var3);
   }
}
