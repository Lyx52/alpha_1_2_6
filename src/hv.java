import java.io.File;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class hv extends cy {

   private LinkedList A = new LinkedList();
   private ib B;
   private nr C;
   private boolean D = false;
   private ge E = new ge();
   private Set F = new HashSet();
   private Set G = new HashSet();


   public hv(ib var1, long var2, int var4) {
      super("MpServer", oz.a(var4), var2);
      this.B = var1;
      this.m = 8;
      this.n = 64;
      this.o = 8;
   }

   public void i() {
      ++this.e;
      int var1 = this.a(1.0F);
      int var2;
      if(var1 != this.f) {
         this.f = var1;

         for(var2 = 0; var2 < this.r.size(); ++var2) {
            ((jv)this.r.get(var2)).e();
         }
      }

      for(var2 = 0; var2 < 10 && !this.G.isEmpty(); ++var2) {
         lw var3 = (lw)this.G.iterator().next();
         if(!this.b.contains(var3)) {
            this.a(var3);
         }
      }

      this.B.a();

      for(var2 = 0; var2 < this.A.size(); ++var2) {
         ms var4 = (ms)this.A.get(var2);
         if(--var4.d == 0) {
            super.a(var4.a, var4.b, var4.c, var4.e, var4.f);
            super.h(var4.a, var4.b, var4.c);
            this.A.remove(var2--);
         }
      }

   }

   public void c(int var1, int var2, int var3, int var4, int var5, int var6) {
      for(int var7 = 0; var7 < this.A.size(); ++var7) {
         ms var8 = (ms)this.A.get(var7);
         if(var8.a >= var1 && var8.b >= var2 && var8.c >= var3 && var8.a <= var4 && var8.b <= var5 && var8.c <= var6) {
            this.A.remove(var7--);
         }
      }

   }

   protected bd a(File var1) {
      this.C = new nr(this);
      return this.C;
   }

   public void b() {
      this.m = 8;
      this.n = 64;
      this.o = 8;
   }

   protected void j() {}

   public void h(int var1, int var2, int var3, int var4) {}

   public boolean a(boolean var1) {
      return false;
   }

   public void a(int var1, int var2, boolean var3) {
      if(var3) {
         this.C.d(var1, var2);
      } else {
         this.C.c(var1, var2);
      }

      if(!var3) {
         this.b(var1 * 16, 0, var2 * 16, var1 * 16 + 15, 128, var2 * 16 + 15);
      }

   }

   public boolean a(lw var1) {
      boolean var2 = super.a(var1);
      this.F.add(var1);
      if(!var2) {
         this.G.add(var1);
      }

      return var2;
   }

   public void d(lw var1) {
      super.d(var1);
      this.F.remove(var1);
   }

   protected void b(lw var1) {
      super.b(var1);
      if(this.G.contains(var1)) {
         this.G.remove(var1);
      }

   }

   protected void c(lw var1) {
      super.c(var1);
      if(this.F.contains(var1)) {
         this.G.add(var1);
      }

   }

   public void a(int var1, lw var2) {
      lw var3 = this.b(var1);
      if(var3 != null) {
         this.d(var3);
      }

      this.F.add(var2);
      var2.an = var1;
      if(!this.a(var2)) {
         this.G.add(var2);
      }

      this.E.a(var1, var2);
   }

   public lw b(int var1) {
      return (lw)this.E.a(var1);
   }

   public lw c(int var1) {
      lw var2 = (lw)this.E.b(var1);
      if(var2 != null) {
         this.F.remove(var2);
         this.d(var2);
      }

      return var2;
   }

   public boolean c(int var1, int var2, int var3, int var4) {
      int var5 = this.a(var1, var2, var3);
      int var6 = this.e(var1, var2, var3);
      if(super.c(var1, var2, var3, var4)) {
         this.A.add(new ms(this, var1, var2, var3, var5, var6));
         return true;
      } else {
         return false;
      }
   }

   public boolean a(int var1, int var2, int var3, int var4, int var5) {
      int var6 = this.a(var1, var2, var3);
      int var7 = this.e(var1, var2, var3);
      if(super.a(var1, var2, var3, var4, var5)) {
         this.A.add(new ms(this, var1, var2, var3, var6, var7));
         return true;
      } else {
         return false;
      }
   }

   public boolean a(int var1, int var2, int var3, int var4) {
      int var5 = this.a(var1, var2, var3);
      int var6 = this.e(var1, var2, var3);
      if(super.a(var1, var2, var3, var4)) {
         this.A.add(new ms(this, var1, var2, var3, var5, var6));
         return true;
      } else {
         return false;
      }
   }

   public boolean c(int var1, int var2, int var3, int var4, int var5) {
      this.c(var1, var2, var3, var1, var2, var3);
      if(super.a(var1, var2, var3, var4, var5)) {
         this.e(var1, var2, var3, var4);
         return true;
      } else {
         return false;
      }
   }

   public void b(int var1, int var2, int var3, ji var4) {
      if(!this.D) {
         this.B.a((gk)(new py(var1, var2, var3, var4)));
      }
   }

   public void m() {
      this.B.a((gk)(new qi("Quitting")));
   }
}
