package mojang;

import java.io.IOException;

public class jl extends bp {

   private int a = 0;
   private int h = 0;


   public void a() {
      this.a = 0;
      this.e.clear();
      this.e.add(new gh(1, this.c / 2 - 100, this.d / 4 + 48, "Save and quit to title"));
      if(this.b.j()) {
         ((gh)this.e.get(0)).e = "Disconnect";
      }

      this.e.add(new gh(4, this.c / 2 - 100, this.d / 4 + 24, "Back to game"));
      this.e.add(new gh(0, this.c / 2 - 100, this.d / 4 + 96, "Options..."));
   }

   protected void a(gh var1) {
      if(var1.f == 0) {
         this.b.a((bp)(new bf(this, this.b.y)));
      }

      if(var1.f == 1) {
         if(this.b.j()) {
            this.b.e.m();
         }

         this.b.a((cy)null);
         this.b.a((bp)(new dj()));
      }

      if(var1.f == 4) {
         this.b.a((bp)null);
         this.b.e();
      }

   }

   public void g() throws IOException {
      super.g();
      ++this.h;
   }

   public void a(int var1, int var2, float var3) {
      this.i();
      boolean var4 = !this.b.e.a(this.a++);
      if(var4 || this.h < 20) {
         float var5 = ((float)(this.h % 10) + var3) / 10.0F;
         var5 = fi.a(var5 * 3.1415927F * 2.0F) * 0.2F + 0.8F;
         int var6 = (int)(255.0F * var5);
         this.b(this.g, "Saving level..", 8, this.d - 16, var6 << 16 | var6 << 8 | var6);
      }

      this.a(this.g, "Game menu", this.c / 2, 40, 16777215);
      super.a(var1, var2, var3);
   }
}
