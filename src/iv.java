import net.minecraft.client.Minecraft;

public class iv {

   protected final Minecraft a;
   public boolean b = false;


   public iv(Minecraft var1) {
      this.a = var1;
   }

   public void a(cy var1) {}

   public void a(int var1, int var2, int var3, int var4) {
      this.b(var1, var2, var3, var4);
   }

   public boolean b(int var1, int var2, int var3, int var4) {
      this.a.h.a(var1, var2, var3);
      cy var5 = this.a.e;
      nq var6 = nq.m[var5.a(var1, var2, var3)];
      int var7 = var5.e(var1, var2, var3);
      boolean var8 = var5.d(var1, var2, var3, 0);
      if(var6 != null && var8) {
         this.a.A.b(var6.bq.a(), (float)var1 + 0.5F, (float)var2 + 0.5F, (float)var3 + 0.5F, (var6.bq.b() + 1.0F) / 2.0F, var6.bq.c() * 0.8F);
         var6.b(var5, var1, var2, var3, var7);
      }

      return var8;
   }

   public void c(int var1, int var2, int var3, int var4) {}

   public void a() {}

   public void a(float var1) {}

   public float b() {
      return 5.0F;
   }

   public boolean a(eb var1, cy var2, fp var3) {
      int var4 = var3.a;
      fp var5 = var3.a(var2, var1);
      if(var5 == var3 && (var5 == null || var5.a == var4)) {
         return false;
      } else {
         var1.e.a[var1.e.d] = var5;
         if(var5.a == 0) {
            var1.e.a[var1.e.d] = null;
         }

         return true;
      }
   }

   public void a(eb var1) {}

   public void c() {}

   public boolean d() {
      return true;
   }

   public void b(eb var1) {}

   public boolean a(eb var1, cy var2, fp var3, int var4, int var5, int var6, int var7) {
      int var8 = var2.a(var4, var5, var6);
      return var8 > 0 && nq.m[var8].a(var2, var4, var5, var6, var1)?true:(var3 == null?false:var3.a(var1, var2, var4, var5, var6, var7));
   }

   public eb b(cy var1) {
      return new bq(this.a, var1, this.a.i, var1.q.g);
   }

   public void a(eb var1, lw var2) {
      var1.a_(var2);
   }

   public void b(eb var1, lw var2) {
      var1.c(var2);
   }
}
