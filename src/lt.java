
public class lt extends ji implements hi {

   private fp[] a = new fp[3];
   private int b = 0;
   private int c = 0;
   private int d = 0;


   public int c() {
      return this.a.length;
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
            return var3;
         } else {
            var3 = this.a[var1].a(var2);
            if(this.a[var1].a == 0) {
               this.a[var1] = null;
            }

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
         byte var5 = var4.c("Slot");
         if(var5 >= 0 && var5 < this.a.length) {
            this.a[var5] = new fp(var4);
         }
      }

      this.b = var1.d("BurnTime");
      this.d = var1.d("CookTime");
      this.c = this.a(this.a[1]);
   }

   public void b(iq var1) {
      super.b(var1);
      var1.a("BurnTime", (short)this.b);
      var1.a("CookTime", (short)this.d);
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

   public int a(int var1) {
      return this.d * var1 / 200;
   }

   public int b(int var1) {
      if(this.c == 0) {
         this.c = 200;
      }

      return this.b * var1 / this.c;
   }

   public boolean a() {
      return this.b > 0;
   }

   public void b() {
      boolean var1 = this.b > 0;
      boolean var2 = false;
      if(this.b > 0) {
         --this.b;
      }

      if(!this.e.z) {
         if(this.b == 0 && this.j()) {
            this.c = this.b = this.a(this.a[1]);
            if(this.b > 0) {
               var2 = true;
               if(this.a[1] != null) {
                  --this.a[1].a;
                  if(this.a[1].a == 0) {
                     this.a[1] = null;
                  }
               }
            }
         }

         if(this.a() && this.j()) {
            ++this.d;
            if(this.d == 200) {
               this.d = 0;
               this.i();
               var2 = true;
            }
         } else {
            this.d = 0;
         }

         if(var1 != this.b > 0) {
            var2 = true;
            mj.a(this.b > 0, this.e, this.f, this.g, this.h);
         }
      }

      if(var2) {
         this.h();
      }

   }

   private boolean j() {
      if(this.a[0] == null) {
         return false;
      } else {
         int var1 = this.d(this.a[0].a().aW);
         return var1 < 0?false:(this.a[2] == null?true:(this.a[2].c != var1?false:(this.a[2].a < this.o_() && this.a[2].a < this.a[2].c()?true:this.a[2].a < dx.c[var1].c())));
      }
   }

   public void i() {
      if(this.j()) {
         int var1 = this.d(this.a[0].a().aW);
         if(this.a[2] == null) {
            this.a[2] = new fp(var1, 1);
         } else if(this.a[2].c == var1) {
            ++this.a[2].a;
         }

         --this.a[0].a;
         if(this.a[0].a <= 0) {
            this.a[0] = null;
         }

      }
   }

   private int d(int var1) {
      return var1 == nq.H.bh?dx.m.aW:(var1 == nq.G.bh?dx.n.aW:(var1 == nq.aw.bh?dx.l.aW:(var1 == nq.E.bh?nq.M.bh:(var1 == dx.ao.aW?dx.ap.aW:(var1 == dx.aS.aW?dx.aT.aW:(var1 == nq.w.bh?nq.t.bh:(var1 == dx.aG.aW?dx.aF.aW:-1)))))));
   }

   private int a(fp var1) {
      if(var1 == null) {
         return 0;
      } else {
         int var2 = var1.a().aW;
         return var2 < 256 && nq.m[var2].bs == hb.c?300:(var2 == dx.B.aW?100:(var2 == dx.k.aW?1600:(var2 == dx.aw.aW?20000:0)));
      }
   }
}
