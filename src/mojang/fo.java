package mojang;

public class fo implements hi {

   public fp[] a = new fp[37];
   public fp[] b = new fp[4];
   public fp[] c = new fp[4];
   public int d = 0;
   private eb g;
   public fp e;
   public boolean f = false;


   public fo(eb var1) {
      this.g = var1;
   }

   public fp a() {
      return this.a[this.d];
   }

   private int f(int var1) {
      for(int var2 = 0; var2 < this.a.length; ++var2) {
         if(this.a[var2] != null && this.a[var2].c == var1) {
            return var2;
         }
      }

      return -1;
   }

   private int g(int var1) {
      for(int var2 = 0; var2 < this.a.length; ++var2) {
         if(this.a[var2] != null && this.a[var2].c == var1 && this.a[var2].a < this.a[var2].c() && this.a[var2].a < this.o_()) {
            return var2;
         }
      }

      return -1;
   }

   private int j() {
      for(int var1 = 0; var1 < this.a.length; ++var1) {
         if(this.a[var1] == null) {
            return var1;
         }
      }

      return -1;
   }

   public void a(int var1, boolean var2) {
      int var3 = this.f(var1);
      if(var3 >= 0 && var3 < 9) {
         this.d = var3;
      }
   }

   public void a(int var1) {
      if(var1 > 0) {
         var1 = 1;
      }

      if(var1 < 0) {
         var1 = -1;
      }

      for(this.d -= var1; this.d < 0; this.d += 9) {
         ;
      }

      while(this.d >= 9) {
         this.d -= 9;
      }

   }

   private int b(int var1, int var2) {
      int var3 = this.g(var1);
      if(var3 < 0) {
         var3 = this.j();
      }

      if(var3 < 0) {
         return var2;
      } else {
         if(this.a[var3] == null) {
            this.a[var3] = new fp(var1, 0);
         }

         int var4 = var2;
         if(var2 > this.a[var3].c() - this.a[var3].a) {
            var4 = this.a[var3].c() - this.a[var3].a;
         }

         if(var4 > this.o_() - this.a[var3].a) {
            var4 = this.o_() - this.a[var3].a;
         }

         if(var4 == 0) {
            return var2;
         } else {
            var2 -= var4;
            this.a[var3].a += var4;
            this.a[var3].b = 5;
            return var2;
         }
      }
   }

   public void b() {
      for(int var1 = 0; var1 < this.a.length; ++var1) {
         if(this.a[var1] != null && this.a[var1].b > 0) {
            --this.a[var1].b;
         }
      }

   }

   public boolean b(int var1) {
      int var2 = this.f(var1);
      if(var2 < 0) {
         return false;
      } else {
         if(--this.a[var2].a <= 0) {
            this.a[var2] = null;
         }

         return true;
      }
   }

   public boolean a(fp var1) {
      if(var1.d == 0) {
         var1.a = this.b(var1.c, var1.a);
         if(var1.a == 0) {
            return true;
         }
      }

      int var2 = this.j();
      if(var2 >= 0) {
         this.a[var2] = var1;
         this.a[var2].b = 5;
         return true;
      } else {
         return false;
      }
   }

   public fp a(int var1, int var2) {
      fp[] var3 = this.a;
      if(var1 >= this.a.length) {
         var3 = this.b;
         var1 -= this.a.length;
      }

      if(var3[var1] != null) {
         fp var4;
         if(var3[var1].a <= var2) {
            var4 = var3[var1];
            var3[var1] = null;
            return var4;
         } else {
            var4 = var3[var1].a(var2);
            if(var3[var1].a == 0) {
               var3[var1] = null;
            }

            return var4;
         }
      } else {
         return null;
      }
   }

   public void a(int var1, fp var2) {
      fp[] var3 = this.a;
      if(var1 >= var3.length) {
         var1 -= var3.length;
         var3 = this.b;
      }

      if(var1 >= var3.length) {
         var1 -= var3.length;
         var3 = this.c;
      }

      var3[var1] = var2;
   }

   public float a(nq var1) {
      float var2 = 1.0F;
      if(this.a[this.d] != null) {
         var2 *= this.a[this.d].a(var1);
      }

      return var2;
   }

   public ly a(ly var1) {
      int var2;
      iq var3;
      for(var2 = 0; var2 < this.a.length; ++var2) {
         if(this.a[var2] != null) {
            var3 = new iq();
            var3.a("Slot", (byte)var2);
            this.a[var2].a(var3);
            var1.a((fd)var3);
         }
      }

      for(var2 = 0; var2 < this.b.length; ++var2) {
         if(this.b[var2] != null) {
            var3 = new iq();
            var3.a("Slot", (byte)(var2 + 100));
            this.b[var2].a(var3);
            var1.a((fd)var3);
         }
      }

      for(var2 = 0; var2 < this.c.length; ++var2) {
         if(this.c[var2] != null) {
            var3 = new iq();
            var3.a("Slot", (byte)(var2 + 80));
            this.c[var2].a(var3);
            var1.a((fd)var3);
         }
      }

      return var1;
   }

   public void b(ly var1) {
      this.a = new fp[36];
      this.b = new fp[4];
      this.c = new fp[4];

      for(int var2 = 0; var2 < var1.c(); ++var2) {
         iq var3 = (iq)var1.a(var2);
         int var4 = var3.c("Slot") & 255;
         if(var4 >= 0 && var4 < this.a.length) {
            this.a[var4] = new fp(var3);
         }

         if(var4 >= 80 && var4 < this.c.length + 80) {
            this.c[var4 - 80] = new fp(var3);
         }

         if(var4 >= 100 && var4 < this.b.length + 100) {
            this.b[var4 - 100] = new fp(var3);
         }
      }

   }

   public int c() {
      return this.a.length + 4;
   }

   public fp c(int var1) {
      fp[] var2 = this.a;
      if(var1 >= var2.length) {
         var1 -= var2.length;
         var2 = this.b;
      }

      if(var1 >= var2.length) {
         var1 -= var2.length;
         var2 = this.c;
      }

      return var2[var1];
   }

   public String d() {
      return "Inventory";
   }

   public int o_() {
      return 64;
   }

   public int a(lw var1) {
      fp var2 = this.c(this.d);
      return var2 != null?var2.a(var1):1;
   }

   public boolean b(nq var1) {
      if(var1.bs != hb.d && var1.bs != hb.e && var1.bs != hb.t && var1.bs != hb.s) {
         return true;
      } else {
         fp var2 = this.c(this.d);
         return var2 != null?var2.b(var1):false;
      }
   }

   public fp d(int var1) {
      return this.b[var1];
   }

   public int f() {
      int var1 = 0;
      int var2 = 0;
      int var3 = 0;

      for(int var4 = 0; var4 < this.b.length; ++var4) {
         if(this.b[var4] != null && this.b[var4].a() instanceof oj) {
            int var5 = this.b[var4].d();
            int var6 = this.b[var4].d;
            int var7 = var5 - var6;
            var2 += var7;
            var3 += var5;
            int var8 = ((oj)this.b[var4].a()).bc;
            var1 += var8;
         }
      }

      if(var3 == 0) {
         return 0;
      } else {
         return (var1 - 1) * var2 / var3 + 1;
      }
   }

   public void e(int var1) {
      for(int var2 = 0; var2 < this.b.length; ++var2) {
         if(this.b[var2] != null && this.b[var2].a() instanceof oj) {
            this.b[var2].b(var1);
            if(this.b[var2].a == 0) {
               this.b[var2].a(this.g);
               this.b[var2] = null;
            }
         }
      }

   }

   public void g() {
      int var1;
      for(var1 = 0; var1 < this.a.length; ++var1) {
         if(this.a[var1] != null) {
            this.g.a(this.a[var1], true);
            this.a[var1] = null;
         }
      }

      for(var1 = 0; var1 < this.b.length; ++var1) {
         if(this.b[var1] != null) {
            this.g.a(this.b[var1], true);
            this.b[var1] = null;
         }
      }

   }

   public void h() {
      this.f = true;
   }

   public boolean a(fo var1) {
      int var2;
      for(var2 = 0; var2 < this.a.length; ++var2) {
         if(!this.a(var1.a[var2], this.a[var2])) {
            return false;
         }
      }

      for(var2 = 0; var2 < this.b.length; ++var2) {
         if(!this.a(var1.b[var2], this.b[var2])) {
            return false;
         }
      }

      for(var2 = 0; var2 < this.c.length; ++var2) {
         if(!this.a(var1.c[var2], this.c[var2])) {
            return false;
         }
      }

      return true;
   }

   private boolean a(fp var1, fp var2) {
      return var1 == null && var2 == null?true:(var1 != null && var2 != null?var1.c == var2.c && var1.a == var2.a && var1.d == var2.d:false);
   }

   public fo i() {
      fo var1 = new fo((eb)null);

      int var2;
      for(var2 = 0; var2 < this.a.length; ++var2) {
         var1.a[var2] = this.a[var2] != null?this.a[var2].e():null;
      }

      for(var2 = 0; var2 < this.b.length; ++var2) {
         var1.b[var2] = this.b[var2] != null?this.b[var2].e():null;
      }

      for(var2 = 0; var2 < this.c.length; ++var2) {
         var1.c[var2] = this.c[var2] != null?this.c[var2].e():null;
      }

      return var1;
   }
}
