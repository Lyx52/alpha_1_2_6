import org.lwjgl.input.Keyboard;

public class dr extends bp {

   private String a = "";
   private int h = 0;


   public void a() {
      Keyboard.enableRepeatEvents(true);
   }

   public void h() {
      Keyboard.enableRepeatEvents(false);
   }

   public void g() {
      ++this.h;
   }

   protected void a(char var1, int var2) {
      if(var2 == 1) {
         this.b.a((bp)null);
      } else if(var2 == 28) {
         String var3 = this.a.trim();
         if(var3.length() > 0) {
            this.b.g.a(this.a.trim());
         }

         this.b.a((bp)null);
      } else {
         if(var2 == 14 && this.a.length() > 0) {
            this.a = this.a.substring(0, this.a.length() - 1);
         }

         if(" !\"#$%&\'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_\'abcdefghijklmnopqrstuvwxyz{|}~⌂ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»".indexOf(var1) >= 0 && this.a.length() < 100) {
            this.a = this.a + var1;
         }

      }
   }

   public void a(int var1, int var2, float var3) {
      this.a(2, this.d - 14, this.c - 2, this.d - 2, Integer.MIN_VALUE);
      this.b(this.g, "> " + this.a + (this.h / 6 % 2 == 0?"_":""), 4, this.d - 12, 14737632);
   }

   protected void a(int var1, int var2, int var3) {
      if(var3 == 0 && this.b.u.a != null) {
         if(this.a.length() > 0 && !this.a.endsWith(" ")) {
            this.a = this.a + " ";
         }

         this.a = this.a + this.b.u.a;
         byte var4 = 100;
         if(this.a.length() > var4) {
            this.a = this.a.substring(0, var4);
         }
      }

   }
}
