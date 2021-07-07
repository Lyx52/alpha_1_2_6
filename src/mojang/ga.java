package mojang;

public class ga extends ji implements hi {

   private fp[] a = new fp[36];


   public int c() {
      return 27;
   }

   public fp c(int var1) {
      return this.a[var1];
   }

   public fp a(int var1, int var2) {
      if(this.a[var1] != null) {
         fp var3;
         if(this.a[var1].a <= var2) {
            var3 = this.a[var1];
            this.a[var1] = null;
            this.h();
            return var3;
         } else {
            var3 = this.a[var1].a(var2);
            if(this.a[var1].a == 0) {
               this.a[var1] = null;
            }

            this.h();
            return var3;
         }
      } else {
         return null;
      }
   }

   public void a(int var1, fp var2) {
      this.a[var1] = var2;
      if(var2 != null && var2.a > this.o_()) {
         var2.a = this.o_();
      }

      this.h();
   }

   public String d() {
      return "Chest";
   }

   public void a(iq var1) {
      super.a(var1);
      ly var2 = var1.l("Items");
      this.a = new fp[this.c()];

      for(int var3 = 0; var3 < var2.c(); ++var3) {
         iq var4 = (iq)var2.a(var3);
         int var5 = var4.c("Slot") & 255;
         if(var5 >= 0 && var5 < this.a.length) {
            this.a[var5] = new fp(var4);
         }
      }

   }

   public void b(iq var1) {
      super.b(var1);
      ly var2 = new ly();

      for(int var3 = 0; var3 < this.a.length; ++var3) {
         if(this.a[var3] != null) {
            iq var4 = new iq();
            var4.a("Slot", (byte)var3);
            this.a[var3].a(var4);
            var2.a((fd)var4);
         }
      }

      var1.a("Items", (fd)var2);
   }

   public int o_() {
      return 64;
   }
}
