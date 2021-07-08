package mojang.gui;

import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import mojang.is;
import mojang.ls;
import mojang.net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class GraphicsUserInterface extends GUIComponent {

   protected Minecraft minecraft;
   public int c;
   public int d;
   protected List buttons = new ArrayList();
   public boolean f = false;
   protected ls g;
   private Button cancelButton = null;


   public void a(int var1, int var2, float var3) {
      for(int var4 = 0; var4 < this.buttons.size(); ++var4) {
         Button button = (Button)this.buttons.get(var4);
         button.a(this.minecraft, var1, var2);
      }

   }

   protected void a(char var1, int var2) {
      if(var2 == 1) {
         this.minecraft.changeGUI((GraphicsUserInterface)null);
         this.minecraft.e();
      }

   }

   public static String copyClipboard() {
      try {
         Transferable clipboard = Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object)null);
         if(clipboard != null && clipboard.isDataFlavorSupported(DataFlavor.stringFlavor)) {
            String data = (String)clipboard.getTransferData(DataFlavor.stringFlavor);
            return data;
         }
      } catch (Exception var2) {
         ;
      }

      return null;
   }

   public void updateButtons(int var1, int var2, int var3) throws IOException {
      if(var3 == 0) {
         for(int i = 0; i < this.buttons.size(); ++i) {
            Button button = (Button)this.buttons.get(i);
            if(button.onClick(this.minecraft, var1, var2)) {
               this.cancelButton = button;
               this.minecraft.A.a("random.click", 1.0F, 1.0F);
               this.buttonClicked(button);
            }
         }
      }

   }

   protected void updateCancelButtonState(int mx, int my, int mouseButton) {
      if(this.cancelButton != null && mouseButton == 0) {
         this.cancelButton.onUpdate(mx, my);
         this.cancelButton = null;
      }

   }

   protected void buttonClicked(Button var1) throws IOException {}

   public void initInterface(Minecraft minecraft, int var2, int var3) {
      this.minecraft = minecraft;
      this.g = minecraft.o;
      this.c = var2;
      this.d = var3;
      this.buttons.clear();
      this.initButtons();
   }

   public void initButtons() {}

   public void updateInput() throws IOException {
      while(Mouse.next()) {
         this.updateMouse();
      }

      while(Keyboard.next()) {
         this.updateKeyboard();
      }

   }

   public void updateMouse() throws IOException {
      int mx;
      int my;
      if(Mouse.getEventButtonState()) {
         mx = Mouse.getEventX() * this.c / this.minecraft.c;
         my = this.d - Mouse.getEventY() * this.d / this.minecraft.d - 1;
         this.updateButtons(mx, my, Mouse.getEventButton());
      } else {
         mx = Mouse.getEventX() * this.c / this.minecraft.c;
         my = this.d - Mouse.getEventY() * this.d / this.minecraft.d - 1;
         this.updateCancelButtonState(mx, my, Mouse.getEventButton());
      }

   }

   public void updateKeyboard() {
      if(Keyboard.getEventKeyState()) {
         if(Keyboard.getEventKey() == 87) {
            this.minecraft.h();
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
      if(this.minecraft.world != null) {
         this.a(0, 0, this.c, this.d, -1072689136, -804253680);
      } else {
         this.b(var1);
      }

   }

   public void b(int var1) {
      GL11.glDisable(2896);
      GL11.glDisable(2912);
      is var2 = is.a;
      GL11.glBindTexture(3553, this.minecraft.n.loadTexture("/mojang/assets/gui/background.png"));
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
