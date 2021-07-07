package mojang;

public final class fp {

   public int a;
   public int b;
   public int c;
   public int d;


   public fp(nq var1) {
      this(var1, 1);
   }

   public fp(nq var1, int var2) {
      this(var1.bh, var2);
   }

   public fp(dx var1) {
      this(var1, 1);
   }

   public fp(dx var1, int var2) {
      this(var1.aW, var2);
   }

   public fp(int var1) {
      this(var1, 1);
   }

   public fp(int var1, int var2) {
      this.a = 0;
      this.c = var1;
      this.a = var2;
   }

   public fp(int var1, int var2, int var3) {
      this.a = 0;
      this.c = var1;
      this.a = var2;
      this.d = var3;
   }

   public fp(iq var1) {
      this.a = 0;
      this.b(var1);
   }

   public fp a(int var1) {
      this.a -= var1;
      return new fp(this.c, var1, this.d);
   }

   public dx a() {
      return dx.c[this.c];
   }

   public int b() {
      return this.a().a(this);
   }

   public boolean a(eb var1, cy var2, int var3, int var4, int var5, int var6) {
      return this.a().a(this, var1, var2, var3, var4, var5, var6);
   }

   public float a(nq var1) {
      return this.a().a(this, var1);
   }

   public fp a(cy var1, eb var2) {
      return this.a().a(this, var1, var2);
   }

   public iq a(iq var1) {
      var1.a("id", (short)this.c);
      var1.a("Count", (byte)this.a);
      var1.a("Damage", (short)this.d);
      return var1;
   }

   public void b(iq var1) {
      this.c = var1.d("id");
      this.a = var1.c("Count");
      this.d = var1.d("Damage");
   }

   public int c() {
      return this.a().c();
   }

   public int d() {
      return dx.c[this.c].d();
   }

   public void b(int var1) {
      this.d += var1;
      if(this.d > this.d()) {
         --this.a;
         if(this.a < 0) {
            this.a = 0;
         }

         this.d = 0;
      }

   }

   public void a(hf var1) {
      dx.c[this.c].a(this, var1);
   }

   public void a(int var1, int var2, int var3, int var4) {
      dx.c[this.c].a(this, var1, var2, var3, var4);
   }

   public int a(lw var1) {
      return dx.c[this.c].a(var1);
   }

   public boolean b(nq var1) {
      return dx.c[this.c].a(var1);
   }

   public void a(eb var1) {}

   public void b(hf var1) {
      dx.c[this.c].b(this, var1);
   }

   public fp e() {
      return new fp(this.c, this.a, this.d);
   }
}
