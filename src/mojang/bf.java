package mojang;

public class bf extends bp {

   private bp h;
   protected String a = "Options";
   private gq i;


   public bf(bp var1, gq var2) {
      this.h = var1;
      this.i = var2;
   }

   public void a() {
      for(int var1 = 0; var1 < this.i.w; ++var1) {
         int var2 = this.i.b(var1);
         if(var2 == 0) {
            this.e.add(new r(var1, this.c / 2 - 155 + var1 % 2 * 160, this.d / 6 + 24 * (var1 >> 1), this.i.d(var1)));
         } else {
            this.e.add(new oh(var1, this.c / 2 - 155 + var1 % 2 * 160, this.d / 6 + 24 * (var1 >> 1), var1, this.i.d(var1), this.i.c(var1)));
         }
      }

      this.e.add(new gh(100, this.c / 2 - 100, this.d / 6 + 120 + 12, "Controls..."));
      this.e.add(new gh(200, this.c / 2 - 100, this.d / 6 + 168, "Done"));
   }

   protected void a(gh var1) {
      if(var1.g) {
         if(var1.f < 100) {
            this.i.b(var1.f, 1);
            var1.e = this.i.d(var1.f);
         }

         if(var1.f == 100) {
            this.b.y.b();
            this.b.a((bp)(new nm(this, this.i)));
         }

         if(var1.f == 200) {
            this.b.y.b();
            this.b.a(this.h);
         }

      }
   }

   public void a(int var1, int var2, float var3) {
      this.i();
      this.a(this.g, this.a, this.c / 2, 20, 16777215);
      super.a(var1, var2, var3);
   }
}
