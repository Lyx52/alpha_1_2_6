
public class op extends ak {

   public boolean a = false;


   public op(cy var1) {
      super(var1);
      this.z = "/mob/pig.png";
      this.a(0.9F, 0.9F);
      this.a = false;
   }

   public void a(iq var1) {
      super.a(var1);
      var1.a("Saddle", this.a);
   }

   public void b(iq var1) {
      super.b(var1);
      this.a = var1.m("Saddle");
   }

   protected String d() {
      return "mob.pig";
   }

   protected String f_() {
      return "mob.pig";
   }

   protected String f() {
      return "mob.pigdeath";
   }

   public boolean a(eb var1) {
      if(this.a) {
         var1.h(this);
         return true;
      } else {
         return false;
      }
   }

   protected int g_() {
      return dx.ao.aW;
   }
}
