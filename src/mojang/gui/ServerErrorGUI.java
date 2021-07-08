package mojang.gui;

public class ServerErrorGUI extends GraphicsUserInterface {

   private String a;
   private String h;


   public ServerErrorGUI(String var1, String var2) {
      this.a = var1;
      this.h = var2;
   }

   public void g() {}

   protected void a(char var1, int var2) {}

   public void initButtons() {
      this.buttons.clear();
      this.buttons.add(new Button(0, this.c / 2 - 100, this.d / 4 + 120 + 12, "Back to title screen"));
   }

   protected void buttonClicked(Button var1) {
      if(var1.value == 0) {
         this.minecraft.changeGUI((GraphicsUserInterface)(new MinecraftGUI()));
      }

   }

   public void a(int var1, int var2, float var3) {
      this.i();
      this.displayButton(this.g, this.a, this.c / 2, this.d / 2 - 50, 16777215);
      this.displayButton(this.g, this.h, this.c / 2, this.d / 2 - 10, 16777215);
      super.a(var1, var2, var3);
   }
}
