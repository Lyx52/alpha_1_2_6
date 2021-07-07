
public class as extends ak {

   public boolean a = false;


   public as(cy var1) {
      super(var1);
      this.z = "/mob/cow.png";
      this.a(0.9F, 1.3F);
   }

   public void a(iq var1) {
      super.a(var1);
   }

   public void b(iq var1) {
      super.b(var1);
   }

   protected String d() {
      return "mob.cow";
   }

   protected String f_() {
      return "mob.cowhurt";
   }

   protected String f() {
      return "mob.cowhurt";
   }

   protected float h() {
      return 0.4F;
   }

   protected int g_() {
      return dx.aD.aW;
   }

   public boolean a(eb var1) {
      fp var2 = var1.e.a();
      if(var2 != null && var2.c == dx.au.aW) {
         var1.e.a(var1.e.d, new fp(dx.aE));
         return true;
      } else {
         return false;
      }
   }
}
