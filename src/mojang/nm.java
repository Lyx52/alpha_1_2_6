package mojang;

public class nm extends bp {

   private bp h;
   protected String a = "Controls";
   private gq i;
   private int j = -1;


   public nm(bp var1, gq var2) {
      this.h = var1;
      this.i = var2;
   }

   public void a() {
      for(int var1 = 0; var1 < this.i.u.length; ++var1) {
         this.e.add(new r(var1, this.c / 2 - 155 + var1 % 2 * 160, this.d / 6 + 24 * (var1 >> 1), this.i.a(var1)));
      }

      this.e.add(new gh(200, this.c / 2 - 100, this.d / 6 + 168, "Done"));
   }

   protected void a(gh var1) {
      for(int var2 = 0; var2 < this.i.u.length; ++var2) {
         ((gh)this.e.get(var2)).e = this.i.a(var2);
      }

      if(var1.f == 200) {
         this.b.a(this.h);
      } else {
         this.j = var1.f;
         var1.e = "> " + this.i.a(var1.f) + " <";
      }

   }

   protected void a(char var1, int var2) {
      if(this.j >= 0) {
         this.i.a(this.j, var2);
         ((gh)this.e.get(this.j)).e = this.i.a(this.j);
         this.j = -1;
      } else {
         super.a(var1, var2);
      }

   }

   public void a(int var1, int var2, float var3) {
      this.i();
      this.a(this.g, this.a, this.c / 2, 20, 16777215);
      super.a(var1, var2, var3);
   }
}
