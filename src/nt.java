
public class nt extends ef {

   public nt(cy var1) {
      super(var1);
      this.z = "/mob/zombie.png";
      this.am = 0.5F;
      this.f = 5;
   }

   public void k() {
      if(this.as.d()) {
         float var1 = this.a(1.0F);
         if(var1 > 0.5F && this.as.i(fi.b(this.aw), fi.b(this.ax), fi.b(this.ay)) && this.bd.nextFloat() * 30.0F < (var1 - 0.4F) * 2.0F) {
            this.bg = 300;
         }
      }

      super.k();
   }

   protected String d() {
      return "mob.zombie";
   }

   protected String f_() {
      return "mob.zombiehurt";
   }

   protected String f() {
      return "mob.zombiedeath";
   }

   protected int g_() {
      return dx.J.aW;
   }
}
