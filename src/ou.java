
public class ou extends ak {

   public boolean a = false;
   public float b = 0.0F;
   public float c = 0.0F;
   public float d;
   public float e;
   public float f = 1.0F;
   public int i;


   public ou(cy var1) {
      super(var1);
      this.z = "/mob/chicken.png";
      this.a(0.3F, 0.4F);
      this.J = 4;
      this.i = this.bd.nextInt(6000) + 6000;
   }

   public void k() {
      super.k();
      this.e = this.b;
      this.d = this.c;
      this.c = (float)((double)this.c + (double)(this.aH?-1:4) * 0.3D);
      if(this.c < 0.0F) {
         this.c = 0.0F;
      }

      if(this.c > 1.0F) {
         this.c = 1.0F;
      }

      if(!this.aH && this.f < 1.0F) {
         this.f = 1.0F;
      }

      this.f = (float)((double)this.f * 0.9D);
      if(!this.aH && this.aA < 0.0D) {
         this.aA *= 0.6D;
      }

      this.b += this.f * 2.0F;
      if(!this.as.z && --this.i <= 0) {
         this.as.a(this, "mob.chickenplop", 1.0F, (this.bd.nextFloat() - this.bd.nextFloat()) * 0.2F + 1.0F);
         this.b(dx.aN.aW, 1);
         this.i = this.bd.nextInt(6000) + 6000;
      }

   }

   protected void c(float var1) {}

   public void a(iq var1) {
      super.a(var1);
   }

   public void b(iq var1) {
      super.b(var1);
   }

   protected String d() {
      return "mob.chicken";
   }

   protected String f_() {
      return "mob.chickenhurt";
   }

   protected String f() {
      return "mob.chickenhurt";
   }

   protected int g_() {
      return dx.J.aW;
   }
}
