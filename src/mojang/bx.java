package mojang;

public class bx extends ak {

   public boolean a = false;


   public bx(cy var1) {
      super(var1);
      this.z = "/mojang/mob/sheep.png";
      this.a(0.9F, 1.3F);
   }

   public boolean a(lw var1, int var2) {
      if(!this.as.z && !this.a && var1 instanceof hf) {
         this.a = true;
         int var3 = 1 + this.bd.nextInt(3);

         for(int var4 = 0; var4 < var3; ++var4) {
            eo var5 = this.a(nq.ab.bh, 1, 1.0F);
            var5.aA += (double)(this.bd.nextFloat() * 0.05F);
            var5.az += (double)((this.bd.nextFloat() - this.bd.nextFloat()) * 0.1F);
            var5.aB += (double)((this.bd.nextFloat() - this.bd.nextFloat()) * 0.1F);
         }
      }

      return super.a(var1, var2);
   }

   public void a(iq var1) {
      super.a(var1);
      var1.a("Sheared", this.a);
   }

   public void b(iq var1) {
      super.b(var1);
      this.a = var1.m("Sheared");
   }

   protected String d() {
      return "mob.sheep";
   }

   protected String f_() {
      return "mob.sheep";
   }

   protected String f() {
      return "mob.sheep";
   }
}
