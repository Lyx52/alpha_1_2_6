
public class ef extends fc implements cz {

   protected int f = 2;


   public ef(cy var1) {
      super(var1);
      this.J = 20;
   }

   public void k() {
      float var1 = this.a(1.0F);
      if(var1 > 0.5F) {
         this.ag += 2;
      }

      super.k();
   }

   public void e_() {
      super.e_();
      if(this.as.k == 0) {
         this.J();
      }

   }

   protected lw c_() {
      eb var1 = this.as.a(this, 16.0D);
      return var1 != null && this.d(var1)?var1:null;
   }

   public boolean a(lw var1, int var2) {
      if(super.a(var1, var2)) {
         if(this.aq != var1 && this.ar != var1) {
            if(var1 != this) {
               this.g = var1;
            }

            return true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   protected void a(lw var1, float var2) {
      if((double)var2 < 2.5D && var1.aG.e > this.aG.b && var1.aG.b < this.aG.e) {
         this.P = 20;
         var1.a(this, this.f);
      }

   }

   protected float a(int var1, int var2, int var3) {
      return 0.5F - this.as.c(var1, var2, var3);
   }

   public void a(iq var1) {
      super.a(var1);
   }

   public void b(iq var1) {
      super.b(var1);
   }

   public boolean a() {
      int var1 = fi.b(this.aw);
      int var2 = fi.b(this.aG.b);
      int var3 = fi.b(this.ay);
      if(this.as.a(ch.a, var1, var2, var3) > this.bd.nextInt(32)) {
         return false;
      } else {
         int var4 = this.as.j(var1, var2, var3);
         return var4 <= this.bd.nextInt(8) && super.a();
      }
   }
}
