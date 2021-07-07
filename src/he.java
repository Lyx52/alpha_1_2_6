
public class he extends nn {

   private boolean[] f = new boolean[10];
   private gq g;


   public he(gq var1) {
      this.g = var1;
   }

   public void a(int var1, boolean var2) {
      byte var3 = -1;
      if(var1 == this.g.k.b) {
         var3 = 0;
      }

      if(var1 == this.g.m.b) {
         var3 = 1;
      }

      if(var1 == this.g.l.b) {
         var3 = 2;
      }

      if(var1 == this.g.n.b) {
         var3 = 3;
      }

      if(var1 == this.g.o.b) {
         var3 = 4;
      }

      if(var1 == this.g.t.b) {
         var3 = 5;
      }

      if(var3 >= 0) {
         this.f[var3] = var2;
      }

   }

   public void a() {
      for(int var1 = 0; var1 < 10; ++var1) {
         this.f[var1] = false;
      }

   }

   public void a(eb var1) {
      this.a = 0.0F;
      this.b = 0.0F;
      if(this.f[0]) {
         ++this.b;
      }

      if(this.f[1]) {
         --this.b;
      }

      if(this.f[2]) {
         ++this.a;
      }

      if(this.f[3]) {
         --this.a;
      }

      this.d = this.f[4];
      this.e = this.f[5];
      if(this.e) {
         this.a = (float)((double)this.a * 0.3D);
         this.b = (float)((double)this.b * 0.3D);
      }

   }
}
