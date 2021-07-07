package mojang;

import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import mojang.net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class bp extends nb {

   protected Minecraft b;
   public int c;
   public int d;
   protected List e = new ArrayList();
   public boolean f = false;
   protected ls g;
   private gh a = null;


   public void a(int var1, int var2, float var3) {
      for(int var4 = 0; var4 < this.e.size(); ++var4) {
         gh var5 = (gh)this.e.get(var4);
         var5.a(this.b, var1, var2);
      }

   }

   protected void a(char var1, int var2) {
      if(var2 == 1) {
         this.b.a((bp)null);
         this.b.e();
      }

   }

   public static String c() {
      try {
         Transferable var0 = Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object)null);
         if(var0 != null && var0.isDataFlavorSupported(DataFlavor.stringFlavor)) {
            String var1 = (String)var0.getTransferData(DataFlavor.stringFlavor);
            return var1;
         }
      } catch (Exception var2) {
         ;
      }

      return null;
   }

   protected void a(int var1, int var2, int var3) throws IOException {
      if(var3 == 0) {
         for(int var4 = 0; var4 < this.e.size(); ++var4) {
            gh var5 = (gh)this.e.get(var4);
            if(var5.c(this.b, var1, var2)) {
               this.a = var5;
               this.b.A.a("random.click", 1.0F, 1.0F);
               this.a(var5);
            }
         }
      }

   }

   protected void b(int var1, int var2, int var3) {
      if(this.a != null && var3 == 0) {
         this.a.a(var1, var2);
         this.a = null;
      }

   }

   protected void a(gh var1) throws IOException {}

   public void a(Minecraft var1, int var2, int var3) {
      this.b = var1;
      this.g = var1.o;
      this.c = var2;
      this.d = var3;
      this.e.clear();
      this.a();
   }

   public void a() {}

   public void d() throws IOException {
      while(Mouse.next()) {
         this.e();
      }

      while(Keyboard.next()) {
         this.f();
      }

   }

   public void e() throws IOException {
      int var1;
      int var2;
      if(Mouse.getEventButtonState()) {
         var1 = Mouse.getEventX() * this.c / this.b.c;
         var2 = this.d - Mouse.getEventY() * this.d / this.b.d - 1;
         this.a(var1, var2, Mouse.getEventButton());
      } else {
         var1 = Mouse.getEventX() * this.c / this.b.c;
         var2 = this.d - Mouse.getEventY() * this.d / this.b.d - 1;
         this.b(var1, var2, Mouse.getEventButton());
      }

   }

   public void f() {
      if(Keyboard.getEventKeyState()) {
         if(Keyboard.getEventKey() == 87) {
            this.b.h();
            return;
         }

         this.a(Keyboard.getEventCharacter(), Keyboard.getEventKey());
      }

   }

   public void g() throws IOException {}

   public void h() {}

   public void i() {
      this.a(0);
   }

   public void a(int var1) {
      if(this.b.e != null) {
         this.a(0, 0, this.c, this.d, -1072689136, -804253680);
      } else {
         this.b(var1);
      }

   }

   public void b(int var1) {
      GL11.glDisable(2896);
      GL11.glDisable(2912);
      is var2 = is.a;
      GL11.glBindTexture(3553, this.b.n.a("/mojang/gui/background.png"));
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      float var3 = 32.0F;
      var2.b();
      var2.b(4210752);
      var2.a(0.0D, (double)this.d, 0.0D, 0.0D, (double)((float)this.d / var3 + (float)var1));
      var2.a((double)this.c, (double)this.d, 0.0D, (double)((float)this.c / var3), (double)((float)this.d / var3 + (float)var1));
      var2.a((double)this.c, 0.0D, 0.0D, (double)((float)this.c / var3), (double)(0 + var1));
      var2.a(0.0D, 0.0D, 0.0D, 0.0D, (double)(0 + var1));
      var2.a();
   }

   public boolean b() {
      return true;
   }

   public void a(boolean var1, int var2) {}
}
