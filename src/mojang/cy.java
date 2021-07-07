package mojang;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class cy implements pk {

   public boolean a;
   private List A;
   public List b;
   private List B;
   private TreeSet C;
   private Set D;
   public List c;
   public List d;
   public long e;
   private long E;
   public int f;
   protected int g;
   protected int h;
   public boolean i;
   private long F;
   protected int j;
   public int k;
   public Random l;
   public int m;
   public int n;
   public int o;
   public boolean p;
   public final oz q;
   protected List r;
   private bd G;
   public File s;
   public File t;
   public long u;
   private iq H;
   public long v;
   public final String w;
   public boolean x;
   private ArrayList I;
   private int J;
   static int y = 0;
   private Set K;
   private int L;
   private List M;
   public boolean z;


   public static iq a(File var0, String var1) {
      File var2 = new File(var0, "saves");
      File var3 = new File(var2, var1);
      if(!var3.exists()) {
         return null;
      } else {
         File var4 = new File(var3, "level.dat");
         if(var4.exists()) {
            try {
               iq var5 = ab.a((InputStream)(new FileInputStream(var4)));
               iq var6 = var5.k("Data");
               return var6;
            } catch (Exception var7) {
               var7.printStackTrace();
            }
         }

         return null;
      }
   }

   public static void b(File var0, String var1) {
      File var2 = new File(var0, "saves");
      File var3 = new File(var2, var1);
      if(var3.exists()) {
         a(var3.listFiles());
         var3.delete();
      }
   }

   private static void a(File[] var0) {
      for(int var1 = 0; var1 < var0.length; ++var1) {
         if(var0[var1].isDirectory()) {
            a(var0[var1].listFiles());
         }

         var0[var1].delete();
      }

   }

   public po a() {
      return this.q.b;
   }

   public cy(File var1, String var2) throws IOException {
      this(var1, var2, (new Random()).nextLong());
   }

   public cy(String var1, oz var2, long var3) throws IOException {
      this.a = false;
      this.A = new ArrayList();
      this.b = new ArrayList();
      this.B = new ArrayList();
      this.C = new TreeSet();
      this.D = new HashSet();
      this.c = new ArrayList();
      this.d = new ArrayList();
      this.e = 0L;
      this.E = 16777215L;
      this.f = 0;
      this.g = (new Random()).nextInt();
      this.h = 1013904223;
      this.i = false;
      this.F = System.currentTimeMillis();
      this.j = 40;
      this.l = new Random();
      this.p = false;
      this.r = new ArrayList();
      this.u = 0L;
      this.v = 0L;
      this.I = new ArrayList();
      this.J = 0;
      this.K = new HashSet();
      this.L = this.l.nextInt(12000);
      this.M = new ArrayList();
      this.z = false;
      this.w = var1;
      this.u = var3;
      this.q = var2;
      var2.a(this);
      this.G = this.a(this.t);
      this.h();
   }

   public cy(cy var1, oz var2) throws IOException {
      this.a = false;
      this.A = new ArrayList();
      this.b = new ArrayList();
      this.B = new ArrayList();
      this.C = new TreeSet();
      this.D = new HashSet();
      this.c = new ArrayList();
      this.d = new ArrayList();
      this.e = 0L;
      this.E = 16777215L;
      this.f = 0;
      this.g = (new Random()).nextInt();
      this.h = 1013904223;
      this.i = false;
      this.F = System.currentTimeMillis();
      this.j = 40;
      this.l = new Random();
      this.p = false;
      this.r = new ArrayList();
      this.u = 0L;
      this.v = 0L;
      this.I = new ArrayList();
      this.J = 0;
      this.K = new HashSet();
      this.L = this.l.nextInt(12000);
      this.M = new ArrayList();
      this.z = false;
      this.F = var1.F;
      this.s = var1.s;
      this.t = var1.t;
      this.w = var1.w;
      this.u = var1.u;
      this.e = var1.e;
      this.m = var1.m;
      this.n = var1.n;
      this.o = var1.o;
      this.v = var1.v;
      this.q = var2;
      var2.a(this);
      this.G = this.a(this.t);
      this.h();
   }

   public cy(File var1, String var2, long var3) throws IOException {
      this(var1, var2, var3, (oz)null);
   }

   public cy(File var1, String var2, long var3, oz var5) throws IOException {
      this.a = false;
      this.A = new ArrayList();
      this.b = new ArrayList();
      this.B = new ArrayList();
      this.C = new TreeSet();
      this.D = new HashSet();
      this.c = new ArrayList();
      this.d = new ArrayList();
      this.e = 0L;
      this.E = 16777215L;
      this.f = 0;
      this.g = (new Random()).nextInt();
      this.h = 1013904223;
      this.i = false;
      this.F = System.currentTimeMillis();
      this.j = 40;
      this.l = new Random();
      this.p = false;
      this.r = new ArrayList();
      this.u = 0L;
      this.v = 0L;
      this.I = new ArrayList();
      this.J = 0;
      this.K = new HashSet();
      this.L = this.l.nextInt(12000);
      this.M = new ArrayList();
      this.z = false;
      this.s = var1;
      this.w = var2;
      var1.mkdirs();
      this.t = new File(var1, var2);
      this.t.mkdirs();

      try {
         File var6 = new File(this.t, "session.lock");
         DataOutputStream var7 = new DataOutputStream(new FileOutputStream(var6));

         try {
            var7.writeLong(this.F);
         } finally {
            var7.close();
         }
      } catch (IOException var16) {
         var16.printStackTrace();
         throw new RuntimeException("Failed to check session lock, aborting");
      }

      Object var17 = new oz();
      File var18 = new File(this.t, "level.dat");
      this.p = !var18.exists();
      if(var18.exists()) {
         try {
            iq var8 = ab.a((InputStream)(new FileInputStream(var18)));
            iq var9 = var8.k("Data");
            this.u = var9.f("RandomSeed");
            this.m = var9.e("SpawnX");
            this.n = var9.e("SpawnY");
            this.o = var9.e("SpawnZ");
            this.e = var9.f("Time");
            this.v = var9.f("SizeOnDisk");
            if(var9.b("Player")) {
               this.H = var9.k("Player");
               int var10 = this.H.e("Dimension");
               if(var10 == -1) {
                  var17 = new om();
               }
            }
         } catch (Exception var14) {
            var14.printStackTrace();
         }
      }

      if(var5 != null) {
         var17 = var5;
      }

      boolean var19 = false;
      if(this.u == 0L) {
         this.u = var3;
         var19 = true;
      }

      this.q = (oz)var17;
      this.q.a(this);
      this.G = this.a(this.t);
      if(var19) {
         this.x = true;
         this.m = 0;
         this.n = 64;

         for(this.o = 0; !this.q.a(this.m, this.o); this.o += this.l.nextInt(64) - this.l.nextInt(64)) {
            this.m += this.l.nextInt(64) - this.l.nextInt(64);
         }

         this.x = false;
      }

      this.h();
   }

   protected bd a(File var1) throws IOException {
      return new gs(this, this.q.a(var1), this.q.c());
   }

   public void b() {
      if(this.n <= 0) {
         this.n = 64;
      }

      while(this.a(this.m, this.o) == 0) {
         this.m += this.l.nextInt(8) - this.l.nextInt(8);
         this.o += this.l.nextInt(8) - this.l.nextInt(8);
      }

   }

   public int a(int var1, int var2) {
      int var3;
      for(var3 = 63; this.a(var1, var3 + 1, var2) != 0; ++var3) {
         ;
      }

      return this.a(var1, var3, var2);
   }

   public void c() {}

   public void a(eb var1) {
      try {
         if(this.H != null) {
            var1.e(this.H);
            this.H = null;
         }

         this.a((lw)var1);
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }

   public void a(boolean var1, pu var2) {
      if(this.G.b()) {
         if(var2 != null) {
            var2.b("Saving level");
         }

         this.p();
         if(var2 != null) {
            var2.d("Saving chunks");
         }

         this.G.a(var1, var2);
      }
   }

   private void p() {
      this.n();
      iq var1 = new iq();
      var1.a("RandomSeed", this.u);
      var1.a("SpawnX", this.m);
      var1.a("SpawnY", this.n);
      var1.a("SpawnZ", this.o);
      var1.a("Time", this.e);
      var1.a("SizeOnDisk", this.v);
      var1.a("LastPlayed", System.currentTimeMillis());
      eb var2 = null;
      if(this.d.size() > 0) {
         var2 = (eb)this.d.get(0);
      }

      iq var3;
      if(var2 != null) {
         var3 = new iq();
         var2.d(var3);
         var1.a("Player", var3);
      }

      var3 = new iq();
      var3.a("Data", (fd)var1);

      try {
         File var4 = new File(this.t, "level.dat_new");
         File var5 = new File(this.t, "level.dat_old");
         File var6 = new File(this.t, "level.dat");
         ab.a(var3, (OutputStream)(new FileOutputStream(var4)));
         if(var5.exists()) {
            var5.delete();
         }

         var6.renameTo(var5);
         if(var6.exists()) {
            var6.delete();
         }

         var4.renameTo(var6);
         if(var4.exists()) {
            var4.delete();
         }
      } catch (Exception var7) {
         var7.printStackTrace();
      }

   }

   public boolean a(int var1) {
      if(!this.G.b()) {
         return true;
      } else {
         if(var1 == 0) {
            this.p();
         }

         return this.G.a(false, (pu)null);
      }
   }

   public int a(int var1, int var2, int var3) {
      return var1 >= -32000000 && var3 >= -32000000 && var1 < 32000000 && var3 <= 32000000?(var2 < 0?0:(var2 >= 128?0:this.c(var1 >> 4, var3 >> 4).a(var1 & 15, var2, var3 & 15))):0;
   }

   public boolean d(int var1, int var2, int var3) {
      return var2 >= 0 && var2 < 128?this.g(var1 >> 4, var3 >> 4):false;
   }

   public boolean a(int var1, int var2, int var3, int var4, int var5, int var6) {
      if(var5 >= 0 && var2 < 128) {
         var1 >>= 4;
         var2 >>= 4;
         var3 >>= 4;
         var4 >>= 4;
         var5 >>= 4;
         var6 >>= 4;

         for(int var7 = var1; var7 <= var4; ++var7) {
            for(int var8 = var3; var8 <= var6; ++var8) {
               if(!this.g(var7, var8)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean g(int var1, int var2) {
      return this.G.a(var1, var2);
   }

   public ha b(int var1, int var2) {
      return this.c(var1 >> 4, var2 >> 4);
   }

   public ha c(int var1, int var2) {
      return this.G.b(var1, var2);
   }

   public boolean a(int var1, int var2, int var3, int var4, int var5) {
      if(var1 >= -32000000 && var3 >= -32000000 && var1 < 32000000 && var3 <= 32000000) {
         if(var2 < 0) {
            return false;
         } else if(var2 >= 128) {
            return false;
         } else {
            ha var6 = this.c(var1 >> 4, var3 >> 4);
            return var6.a(var1 & 15, var2, var3 & 15, var4, var5);
         }
      } else {
         return false;
      }
   }

   public boolean a(int var1, int var2, int var3, int var4) {
      if(var1 >= -32000000 && var3 >= -32000000 && var1 < 32000000 && var3 <= 32000000) {
         if(var2 < 0) {
            return false;
         } else if(var2 >= 128) {
            return false;
         } else {
            ha var5 = this.c(var1 >> 4, var3 >> 4);
            return var5.a(var1 & 15, var2, var3 & 15, var4);
         }
      } else {
         return false;
      }
   }

   public hb f(int var1, int var2, int var3) {
      int var4 = this.a(var1, var2, var3);
      return var4 == 0?hb.a:nq.m[var4].bs;
   }

   public int e(int var1, int var2, int var3) {
      if(var1 >= -32000000 && var3 >= -32000000 && var1 < 32000000 && var3 <= 32000000) {
         if(var2 < 0) {
            return 0;
         } else if(var2 >= 128) {
            return 0;
         } else {
            ha var4 = this.c(var1 >> 4, var3 >> 4);
            var1 &= 15;
            var3 &= 15;
            return var4.b(var1, var2, var3);
         }
      } else {
         return 0;
      }
   }

   public void b(int var1, int var2, int var3, int var4) {
      if(this.c(var1, var2, var3, var4)) {
         this.e(var1, var2, var3, this.a(var1, var2, var3));
      }

   }

   public boolean c(int var1, int var2, int var3, int var4) {
      if(var1 >= -32000000 && var3 >= -32000000 && var1 < 32000000 && var3 <= 32000000) {
         if(var2 < 0) {
            return false;
         } else if(var2 >= 128) {
            return false;
         } else {
            ha var5 = this.c(var1 >> 4, var3 >> 4);
            var1 &= 15;
            var3 &= 15;
            var5.b(var1, var2, var3, var4);
            return true;
         }
      } else {
         return false;
      }
   }

   public boolean d(int var1, int var2, int var3, int var4) {
      if(this.a(var1, var2, var3, var4)) {
         this.e(var1, var2, var3, var4);
         return true;
      } else {
         return false;
      }
   }

   public boolean b(int var1, int var2, int var3, int var4, int var5) {
      if(this.a(var1, var2, var3, var4, var5)) {
         this.e(var1, var2, var3, var4);
         return true;
      } else {
         return false;
      }
   }

   public void h(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.r.size(); ++var4) {
         ((jv)this.r.get(var4)).a(var1, var2, var3);
      }

   }

   protected void e(int var1, int var2, int var3, int var4) {
      this.h(var1, var2, var3);
      this.g(var1, var2, var3, var4);
   }

   public void f(int var1, int var2, int var3, int var4) {
      if(var3 > var4) {
         int var5 = var4;
         var4 = var3;
         var3 = var5;
      }

      this.b(var1, var3, var2, var1, var4, var2);
   }

   public void b(int var1, int var2, int var3, int var4, int var5, int var6) {
      for(int var7 = 0; var7 < this.r.size(); ++var7) {
         ((jv)this.r.get(var7)).b(var1, var2, var3, var4, var5, var6);
      }

   }

   public void g(int var1, int var2, int var3, int var4) {
      this.l(var1 - 1, var2, var3, var4);
      this.l(var1 + 1, var2, var3, var4);
      this.l(var1, var2 - 1, var3, var4);
      this.l(var1, var2 + 1, var3, var4);
      this.l(var1, var2, var3 - 1, var4);
      this.l(var1, var2, var3 + 1, var4);
   }

   private void l(int var1, int var2, int var3, int var4) {
      if(!this.i && !this.z) {
         nq var5 = nq.m[this.a(var1, var2, var3)];
         if(var5 != null) {
            var5.a(this, var1, var2, var3, var4);
         }

      }
   }

   public boolean i(int var1, int var2, int var3) {
      return this.c(var1 >> 4, var3 >> 4).c(var1 & 15, var2, var3 & 15);
   }

   public int j(int var1, int var2, int var3) {
      return this.a(var1, var2, var3, true);
   }

   public int a(int var1, int var2, int var3, boolean var4) {
      if(var1 >= -32000000 && var3 >= -32000000 && var1 < 32000000 && var3 <= 32000000) {
         int var5;
         if(var4) {
            var5 = this.a(var1, var2, var3);
            if(var5 == nq.ak.bh || var5 == nq.aA.bh) {
               int var6 = this.a(var1, var2 + 1, var3, false);
               int var7 = this.a(var1 + 1, var2, var3, false);
               int var8 = this.a(var1 - 1, var2, var3, false);
               int var9 = this.a(var1, var2, var3 + 1, false);
               int var10 = this.a(var1, var2, var3 - 1, false);
               if(var7 > var6) {
                  var6 = var7;
               }

               if(var8 > var6) {
                  var6 = var8;
               }

               if(var9 > var6) {
                  var6 = var9;
               }

               if(var10 > var6) {
                  var6 = var10;
               }

               return var6;
            }
         }

         if(var2 < 0) {
            return 0;
         } else if(var2 >= 128) {
            var5 = 15 - this.f;
            if(var5 < 0) {
               var5 = 0;
            }

            return var5;
         } else {
            ha var11 = this.c(var1 >> 4, var3 >> 4);
            var1 &= 15;
            var3 &= 15;
            return var11.c(var1, var2, var3, this.f);
         }
      } else {
         return 15;
      }
   }

   public boolean k(int var1, int var2, int var3) {
      if(var1 >= -32000000 && var3 >= -32000000 && var1 < 32000000 && var3 <= 32000000) {
         if(var2 < 0) {
            return false;
         } else if(var2 >= 128) {
            return true;
         } else if(!this.g(var1 >> 4, var3 >> 4)) {
            return false;
         } else {
            ha var4 = this.c(var1 >> 4, var3 >> 4);
            var1 &= 15;
            var3 &= 15;
            return var4.c(var1, var2, var3);
         }
      } else {
         return false;
      }
   }

   public int d(int var1, int var2) {
      if(var1 >= -32000000 && var2 >= -32000000 && var1 < 32000000 && var2 <= 32000000) {
         if(!this.g(var1 >> 4, var2 >> 4)) {
            return 0;
         } else {
            ha var3 = this.c(var1 >> 4, var2 >> 4);
            return var3.b(var1 & 15, var2 & 15);
         }
      } else {
         return 0;
      }
   }

   public void a(ch var1, int var2, int var3, int var4, int var5) {
      if(!this.q.e || var1 != ch.a) {
         if(this.d(var2, var3, var4)) {
            if(var1 == ch.a) {
               if(this.k(var2, var3, var4)) {
                  var5 = 15;
               }
            } else if(var1 == ch.b) {
               int var6 = this.a(var2, var3, var4);
               if(nq.s[var6] > var5) {
                  var5 = nq.s[var6];
               }
            }

            if(this.a(var1, var2, var3, var4) != var5) {
               this.a(var1, var2, var3, var4, var2, var3, var4);
            }

         }
      }
   }

   public int a(ch var1, int var2, int var3, int var4) {
      if(var3 >= 0 && var3 < 128 && var2 >= -32000000 && var4 >= -32000000 && var2 < 32000000 && var4 <= 32000000) {
         int var5 = var2 >> 4;
         int var6 = var4 >> 4;
         if(!this.g(var5, var6)) {
            return 0;
         } else {
            ha var7 = this.c(var5, var6);
            return var7.a(var1, var2 & 15, var3, var4 & 15);
         }
      } else {
         return var1.c;
      }
   }

   public void b(ch var1, int var2, int var3, int var4, int var5) {
      if(var2 >= -32000000 && var4 >= -32000000 && var2 < 32000000 && var4 <= 32000000) {
         if(var3 >= 0) {
            if(var3 < 128) {
               if(this.g(var2 >> 4, var4 >> 4)) {
                  ha var6 = this.c(var2 >> 4, var4 >> 4);
                  var6.a(var1, var2 & 15, var3, var4 & 15, var5);

                  for(int var7 = 0; var7 < this.r.size(); ++var7) {
                     ((jv)this.r.get(var7)).a(var2, var3, var4);
                  }

               }
            }
         }
      }
   }

   public float c(int var1, int var2, int var3) {
      return this.q.f[this.j(var1, var2, var3)];
   }

   public boolean d() {
      return this.f < 4;
   }

   public nx a(ao var1, ao var2) {
      return this.a(var1, var2, false);
   }

   public nx a(ao var1, ao var2, boolean var3) {
      if(!Double.isNaN(var1.a) && !Double.isNaN(var1.b) && !Double.isNaN(var1.c)) {
         if(!Double.isNaN(var2.a) && !Double.isNaN(var2.b) && !Double.isNaN(var2.c)) {
            int var4 = fi.b(var2.a);
            int var5 = fi.b(var2.b);
            int var6 = fi.b(var2.c);
            int var7 = fi.b(var1.a);
            int var8 = fi.b(var1.b);
            int var9 = fi.b(var1.c);
            int var10 = 200;

            while(var10-- >= 0) {
               if(Double.isNaN(var1.a) || Double.isNaN(var1.b) || Double.isNaN(var1.c)) {
                  return null;
               }

               if(var7 == var4 && var8 == var5 && var9 == var6) {
                  return null;
               }

               double var11 = 999.0D;
               double var13 = 999.0D;
               double var15 = 999.0D;
               if(var4 > var7) {
                  var11 = (double)var7 + 1.0D;
               }

               if(var4 < var7) {
                  var11 = (double)var7 + 0.0D;
               }

               if(var5 > var8) {
                  var13 = (double)var8 + 1.0D;
               }

               if(var5 < var8) {
                  var13 = (double)var8 + 0.0D;
               }

               if(var6 > var9) {
                  var15 = (double)var9 + 1.0D;
               }

               if(var6 < var9) {
                  var15 = (double)var9 + 0.0D;
               }

               double var17 = 999.0D;
               double var19 = 999.0D;
               double var21 = 999.0D;
               double var23 = var2.a - var1.a;
               double var25 = var2.b - var1.b;
               double var27 = var2.c - var1.c;
               if(var11 != 999.0D) {
                  var17 = (var11 - var1.a) / var23;
               }

               if(var13 != 999.0D) {
                  var19 = (var13 - var1.b) / var25;
               }

               if(var15 != 999.0D) {
                  var21 = (var15 - var1.c) / var27;
               }

               boolean var29 = false;
               byte var35;
               if(var17 < var19 && var17 < var21) {
                  if(var4 > var7) {
                     var35 = 4;
                  } else {
                     var35 = 5;
                  }

                  var1.a = var11;
                  var1.b += var25 * var17;
                  var1.c += var27 * var17;
               } else if(var19 < var21) {
                  if(var5 > var8) {
                     var35 = 0;
                  } else {
                     var35 = 1;
                  }

                  var1.a += var23 * var19;
                  var1.b = var13;
                  var1.c += var27 * var19;
               } else {
                  if(var6 > var9) {
                     var35 = 2;
                  } else {
                     var35 = 3;
                  }

                  var1.a += var23 * var21;
                  var1.b += var25 * var21;
                  var1.c = var15;
               }

               ao var30 = ao.b(var1.a, var1.b, var1.c);
               var7 = (int)(var30.a = (double)fi.b(var1.a));
               if(var35 == 5) {
                  --var7;
                  ++var30.a;
               }

               var8 = (int)(var30.b = (double)fi.b(var1.b));
               if(var35 == 1) {
                  --var8;
                  ++var30.b;
               }

               var9 = (int)(var30.c = (double)fi.b(var1.c));
               if(var35 == 3) {
                  --var9;
                  ++var30.c;
               }

               int var31 = this.a(var7, var8, var9);
               int var32 = this.e(var7, var8, var9);
               nq var33 = nq.m[var31];
               if(var31 > 0 && var33.a(var32, var3)) {
                  nx var34 = var33.a(this, var7, var8, var9, var1, var2);
                  if(var34 != null) {
                     return var34;
                  }
               }
            }

            return null;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public void a(lw var1, String var2, float var3, float var4) {
      for(int var5 = 0; var5 < this.r.size(); ++var5) {
         ((jv)this.r.get(var5)).a(var2, var1.aw, var1.ax - (double)var1.aO, var1.ay, var3, var4);
      }

   }

   public void a(double var1, double var3, double var5, String var7, float var8, float var9) {
      for(int var10 = 0; var10 < this.r.size(); ++var10) {
         ((jv)this.r.get(var10)).a(var7, var1, var3, var5, var8, var9);
      }

   }

   public void a(String var1, int var2, int var3, int var4) {
      for(int var5 = 0; var5 < this.r.size(); ++var5) {
         ((jv)this.r.get(var5)).a(var1, var2, var3, var4);
      }

   }

   public void a(String var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      for(int var14 = 0; var14 < this.r.size(); ++var14) {
         ((jv)this.r.get(var14)).a(var1, var2, var4, var6, var8, var10, var12);
      }

   }

   public boolean a(lw var1) {
      int var2 = fi.b(var1.aw / 16.0D);
      int var3 = fi.b(var1.ay / 16.0D);
      boolean var4 = false;
      if(var1 instanceof eb) {
         var4 = true;
      }

      if(!var4 && !this.g(var2, var3)) {
         return false;
      } else {
         if(var1 instanceof eb) {
            this.d.add((eb)var1);
            System.out.println("Player count: " + this.d.size());
         }

         this.c(var2, var3).a(var1);
         this.b.add(var1);
         this.b(var1);
         return true;
      }
   }

   protected void b(lw var1) {
      for(int var2 = 0; var2 < this.r.size(); ++var2) {
         ((jv)this.r.get(var2)).a(var1);
      }

   }

   protected void c(lw var1) {
      for(int var2 = 0; var2 < this.r.size(); ++var2) {
         ((jv)this.r.get(var2)).b(var1);
      }

   }

   public void d(lw var1) {
      var1.J();
      if(var1 instanceof eb) {
         this.d.remove((eb)var1);
      }

   }

   public void a(jv var1) {
      this.r.add(var1);
   }

   public void b(jv var1) {
      this.r.remove(var1);
   }

   public List a(lw var1, co var2) {
      this.I.clear();
      int var3 = fi.b(var2.a);
      int var4 = fi.b(var2.d + 1.0D);
      int var5 = fi.b(var2.b);
      int var6 = fi.b(var2.e + 1.0D);
      int var7 = fi.b(var2.c);
      int var8 = fi.b(var2.f + 1.0D);

      for(int var9 = var3; var9 < var4; ++var9) {
         for(int var10 = var7; var10 < var8; ++var10) {
            if(this.d(var9, 64, var10)) {
               for(int var11 = var5 - 1; var11 < var6; ++var11) {
                  nq var12 = nq.m[this.a(var9, var11, var10)];
                  if(var12 != null) {
                     var12.a(this, var9, var11, var10, var2, this.I);
                  }
               }
            }
         }
      }

      double var14 = 0.25D;
      List var15 = this.b(var1, var2.b(var14, var14, var14));

      for(int var16 = 0; var16 < var15.size(); ++var16) {
         co var13 = ((lw)var15.get(var16)).e();
         if(var13 != null && var13.a(var2)) {
            this.I.add(var13);
         }

         var13 = var1.a((lw)var15.get(var16));
         if(var13 != null && var13.a(var2)) {
            this.I.add(var13);
         }
      }

      return this.I;
   }

   public int a(float var1) {
      float var2 = this.b(var1);
      float var3 = 1.0F - (fi.b(var2 * 3.1415927F * 2.0F) * 2.0F + 0.5F);
      if(var3 < 0.0F) {
         var3 = 0.0F;
      }

      if(var3 > 1.0F) {
         var3 = 1.0F;
      }

      return (int)(var3 * 11.0F);
   }

   public ao a(lw var1, float var2) {
      float var3 = this.b(var2);
      float var4 = fi.b(var3 * 3.1415927F * 2.0F) * 2.0F + 0.5F;
      if(var4 < 0.0F) {
         var4 = 0.0F;
      }

      if(var4 > 1.0F) {
         var4 = 1.0F;
      }

      int var5 = fi.b(var1.aw);
      int var6 = fi.b(var1.ay);
      float var7 = (float)this.a().b(var5, var6);
      int var8 = this.a().a(var5, var6).a(var7);
      float var9 = (float)(var8 >> 16 & 255) / 255.0F;
      float var10 = (float)(var8 >> 8 & 255) / 255.0F;
      float var11 = (float)(var8 & 255) / 255.0F;
      var9 *= var4;
      var10 *= var4;
      var11 *= var4;
      return ao.b((double)var9, (double)var10, (double)var11);
   }

   public float b(float var1) {
      return this.q.a(this.e, var1);
   }

   public ao c(float var1) {
      float var2 = this.b(var1);
      float var3 = fi.b(var2 * 3.1415927F * 2.0F) * 2.0F + 0.5F;
      if(var3 < 0.0F) {
         var3 = 0.0F;
      }

      if(var3 > 1.0F) {
         var3 = 1.0F;
      }

      float var4 = (float)(this.E >> 16 & 255L) / 255.0F;
      float var5 = (float)(this.E >> 8 & 255L) / 255.0F;
      float var6 = (float)(this.E & 255L) / 255.0F;
      var4 *= var3 * 0.9F + 0.1F;
      var5 *= var3 * 0.9F + 0.1F;
      var6 *= var3 * 0.85F + 0.15F;
      return ao.b((double)var4, (double)var5, (double)var6);
   }

   public ao d(float var1) {
      float var2 = this.b(var1);
      return this.q.a(var2, var1);
   }

   public int e(int var1, int var2) {
      ha var3 = this.b(var1, var2);

      int var4;
      for(var4 = 127; this.f(var1, var4, var2).c() && var4 > 0; --var4) {
         ;
      }

      var1 &= 15;

      for(var2 &= 15; var4 > 0; --var4) {
         int var5 = var3.a(var1, var4, var2);
         if(var5 != 0 && (nq.m[var5].bs.c() || nq.m[var5].bs.d())) {
            return var4 + 1;
         }
      }

      return -1;
   }

   public int f(int var1, int var2) {
      return this.b(var1, var2).b(var1 & 15, var2 & 15);
   }

   public float e(float var1) {
      float var2 = this.b(var1);
      float var3 = 1.0F - (fi.b(var2 * 3.1415927F * 2.0F) * 2.0F + 0.75F);
      if(var3 < 0.0F) {
         var3 = 0.0F;
      }

      if(var3 > 1.0F) {
         var3 = 1.0F;
      }

      return var3 * var3 * 0.5F;
   }

   public void h(int var1, int var2, int var3, int var4) {
      kq var5 = new kq(var1, var2, var3, var4);
      byte var6 = 8;
      if(this.a) {
         if(this.a(var5.a - var6, var5.b - var6, var5.c - var6, var5.a + var6, var5.b + var6, var5.c + var6)) {
            int var7 = this.a(var5.a, var5.b, var5.c);
            if(var7 == var5.d && var7 > 0) {
               nq.m[var7].a(this, var5.a, var5.b, var5.c, this.l);
            }
         }

      } else {
         if(this.a(var1 - var6, var2 - var6, var3 - var6, var1 + var6, var2 + var6, var3 + var6)) {
            if(var4 > 0) {
               var5.a((long)nq.m[var4].d() + this.e);
            }

            if(!this.D.contains(var5)) {
               this.D.add(var5);
               this.C.add(var5);
            }
         }

      }
   }

   public void e() throws IOException {
      this.b.removeAll(this.B);

      int var1;
      lw var2;
      int var3;
      int var4;
      for(var1 = 0; var1 < this.B.size(); ++var1) {
         var2 = (lw)this.B.get(var1);
         var3 = var2.bo;
         var4 = var2.bq;
         if(var2.bn && this.g(var3, var4)) {
            this.c(var3, var4).b(var2);
         }
      }

      for(var1 = 0; var1 < this.B.size(); ++var1) {
         this.c((lw)this.B.get(var1));
      }

      this.B.clear();

      for(var1 = 0; var1 < this.b.size(); ++var1) {
         var2 = (lw)this.b.get(var1);
         if(var2.ar != null) {
            if(!var2.ar.aN && var2.ar.aq == var2) {
               continue;
            }

            var2.ar.aq = null;
            var2.ar = null;
         }

         if(!var2.aN) {
            this.e(var2);
         }

         if(var2.aN) {
            var3 = var2.bo;
            var4 = var2.bq;
            if(var2.bn && this.g(var3, var4)) {
               this.c(var3, var4).b(var2);
            }

            this.b.remove(var1--);
            this.c(var2);
         }
      }

      for(var1 = 0; var1 < this.c.size(); ++var1) {
         ji var5 = (ji)this.c.get(var1);
         var5.b();
      }

   }

   public void e(lw var1) throws IOException {
      this.a(var1, true);
   }

   public void a(lw var1, boolean var2) throws IOException {
      int var3 = fi.b(var1.aw);
      int var4 = fi.b(var1.ay);
      byte var5 = 16;
      if(var2 || this.a(var3 - var5, 0, var4 - var5, var3 + var5, 128, var4 + var5)) {
         var1.aV = var1.aw;
         var1.aW = var1.ax;
         var1.aX = var1.ay;
         var1.aE = var1.aC;
         var1.aF = var1.aD;
         if(var2 && var1.bn) {
            if(var1.ar != null) {
               var1.s();
            } else {
               var1.e_();
            }
         }

         if(Double.isNaN(var1.aw) || Double.isInfinite(var1.aw)) {
            var1.aw = var1.aV;
         }

         if(Double.isNaN(var1.ax) || Double.isInfinite(var1.ax)) {
            var1.ax = var1.aW;
         }

         if(Double.isNaN(var1.ay) || Double.isInfinite(var1.ay)) {
            var1.ay = var1.aX;
         }

         if(Double.isNaN((double)var1.aD) || Double.isInfinite((double)var1.aD)) {
            var1.aD = var1.aF;
         }

         if(Double.isNaN((double)var1.aC) || Double.isInfinite((double)var1.aC)) {
            var1.aC = var1.aE;
         }

         int var6 = fi.b(var1.aw / 16.0D);
         int var7 = fi.b(var1.ax / 16.0D);
         int var8 = fi.b(var1.ay / 16.0D);
         if(!var1.bn || var1.bo != var6 || var1.bp != var7 || var1.bq != var8) {
            if(var1.bn && this.g(var1.bo, var1.bq)) {
               this.c(var1.bo, var1.bq).a(var1, var1.bp);
            }

            if(this.g(var6, var8)) {
               var1.bn = true;
               this.c(var6, var8).a(var1);
            } else {
               var1.bn = false;
            }
         }

         if(var2 && var1.bn && var1.aq != null) {
            if(!var1.aq.aN && var1.aq.ar == var1) {
               this.e(var1.aq);
            } else {
               var1.aq.ar = null;
               var1.aq = null;
            }
         }

      }
   }

   public boolean a(co var1) {
      List var2 = this.b((lw)null, var1);

      for(int var3 = 0; var3 < var2.size(); ++var3) {
         lw var4 = (lw)var2.get(var3);
         if(!var4.aN && var4.ap) {
            return false;
         }
      }

      return true;
   }

   public boolean b(co var1) {
      int var2 = fi.b(var1.a);
      int var3 = fi.b(var1.d + 1.0D);
      int var4 = fi.b(var1.b);
      int var5 = fi.b(var1.e + 1.0D);
      int var6 = fi.b(var1.c);
      int var7 = fi.b(var1.f + 1.0D);
      if(var1.a < 0.0D) {
         --var2;
      }

      if(var1.b < 0.0D) {
         --var4;
      }

      if(var1.c < 0.0D) {
         --var6;
      }

      for(int var8 = var2; var8 < var3; ++var8) {
         for(int var9 = var4; var9 < var5; ++var9) {
            for(int var10 = var6; var10 < var7; ++var10) {
               nq var11 = nq.m[this.a(var8, var9, var10)];
               if(var11 != null && var11.bs.d()) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public boolean c(co var1) {
      int var2 = fi.b(var1.a);
      int var3 = fi.b(var1.d + 1.0D);
      int var4 = fi.b(var1.b);
      int var5 = fi.b(var1.e + 1.0D);
      int var6 = fi.b(var1.c);
      int var7 = fi.b(var1.f + 1.0D);

      for(int var8 = var2; var8 < var3; ++var8) {
         for(int var9 = var4; var9 < var5; ++var9) {
            for(int var10 = var6; var10 < var7; ++var10) {
               int var11 = this.a(var8, var9, var10);
               if(var11 == nq.ar.bh || var11 == nq.C.bh || var11 == nq.D.bh) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public boolean a(co var1, hb var2, lw var3) {
      int var4 = fi.b(var1.a);
      int var5 = fi.b(var1.d + 1.0D);
      int var6 = fi.b(var1.b);
      int var7 = fi.b(var1.e + 1.0D);
      int var8 = fi.b(var1.c);
      int var9 = fi.b(var1.f + 1.0D);
      boolean var10 = false;
      ao var11 = ao.b(0.0D, 0.0D, 0.0D);

      for(int var12 = var4; var12 < var5; ++var12) {
         for(int var13 = var6; var13 < var7; ++var13) {
            for(int var14 = var8; var14 < var9; ++var14) {
               nq var15 = nq.m[this.a(var12, var13, var14)];
               if(var15 != null && var15.bs == var2) {
                  double var16 = (double)((float)(var13 + 1) - ld.b(this.e(var12, var13, var14)));
                  if((double)var7 >= var16) {
                     var10 = true;
                     var15.a(this, var12, var13, var14, var3, var11);
                  }
               }
            }
         }
      }

      if(var11.c() > 0.0D) {
         var11 = var11.b();
         double var18 = 0.004D;
         var3.az += var11.a * var18;
         var3.aA += var11.b * var18;
         var3.aB += var11.c * var18;
      }

      return var10;
   }

   public boolean a(co var1, hb var2) {
      int var3 = fi.b(var1.a);
      int var4 = fi.b(var1.d + 1.0D);
      int var5 = fi.b(var1.b);
      int var6 = fi.b(var1.e + 1.0D);
      int var7 = fi.b(var1.c);
      int var8 = fi.b(var1.f + 1.0D);

      for(int var9 = var3; var9 < var4; ++var9) {
         for(int var10 = var5; var10 < var6; ++var10) {
            for(int var11 = var7; var11 < var8; ++var11) {
               nq var12 = nq.m[this.a(var9, var10, var11)];
               if(var12 != null && var12.bs == var2) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public boolean b(co var1, hb var2) {
      int var3 = fi.b(var1.a);
      int var4 = fi.b(var1.d + 1.0D);
      int var5 = fi.b(var1.b);
      int var6 = fi.b(var1.e + 1.0D);
      int var7 = fi.b(var1.c);
      int var8 = fi.b(var1.f + 1.0D);

      for(int var9 = var3; var9 < var4; ++var9) {
         for(int var10 = var5; var10 < var6; ++var10) {
            for(int var11 = var7; var11 < var8; ++var11) {
               nq var12 = nq.m[this.a(var9, var10, var11)];
               if(var12 != null && var12.bs == var2) {
                  int var13 = this.e(var9, var10, var11);
                  double var14 = (double)(var10 + 1);
                  if(var13 < 8) {
                     var14 = (double)(var10 + 1) - (double)var13 / 8.0D;
                  }

                  if(var14 >= var1.b) {
                     return true;
                  }
               }
            }
         }
      }

      return false;
   }

   public ks a(lw var1, double var2, double var4, double var6, float var8) {
      return this.a(var1, var2, var4, var6, var8, false);
   }

   public ks a(lw var1, double var2, double var4, double var6, float var8, boolean var9) {
      ks var10 = new ks(this, var1, var2, var4, var6, var8);
      var10.a = var9;
      var10.a();
      var10.b();
      return var10;
   }

   public float a(ao var1, co var2) {
      double var3 = 1.0D / ((var2.d - var2.a) * 2.0D + 1.0D);
      double var5 = 1.0D / ((var2.e - var2.b) * 2.0D + 1.0D);
      double var7 = 1.0D / ((var2.f - var2.c) * 2.0D + 1.0D);
      int var9 = 0;
      int var10 = 0;

      for(float var11 = 0.0F; var11 <= 1.0F; var11 = (float)((double)var11 + var3)) {
         for(float var12 = 0.0F; var12 <= 1.0F; var12 = (float)((double)var12 + var5)) {
            for(float var13 = 0.0F; var13 <= 1.0F; var13 = (float)((double)var13 + var7)) {
               double var14 = var2.a + (var2.d - var2.a) * (double)var11;
               double var16 = var2.b + (var2.e - var2.b) * (double)var12;
               double var18 = var2.c + (var2.f - var2.c) * (double)var13;
               if(this.a(ao.b(var14, var16, var18), var1) == null) {
                  ++var9;
               }

               ++var10;
            }
         }
      }

      return (float)var9 / (float)var10;
   }

   public void i(int var1, int var2, int var3, int var4) {
      if(var4 == 0) {
         --var2;
      }

      if(var4 == 1) {
         ++var2;
      }

      if(var4 == 2) {
         --var3;
      }

      if(var4 == 3) {
         ++var3;
      }

      if(var4 == 4) {
         --var1;
      }

      if(var4 == 5) {
         ++var1;
      }

      if(this.a(var1, var2, var3) == nq.ar.bh) {
         this.a((double)((float)var1 + 0.5F), (double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), "random.fizz", 0.5F, 2.6F + (this.l.nextFloat() - this.l.nextFloat()) * 0.8F);
         this.d(var1, var2, var3, 0);
      }

   }

   public lw a(Class var1) {
      return null;
   }

   public String f() {
      return "All: " + this.b.size();
   }

   public ji b(int var1, int var2, int var3) {
      ha var4 = this.c(var1 >> 4, var3 >> 4);
      return var4 != null?var4.d(var1 & 15, var2, var3 & 15):null;
   }

   public void a(int var1, int var2, int var3, ji var4) {
      ha var5 = this.c(var1 >> 4, var3 >> 4);
      if(var5 != null) {
         var5.a(var1 & 15, var2, var3 & 15, var4);
      }

   }

   public void l(int var1, int var2, int var3) {
      ha var4 = this.c(var1 >> 4, var3 >> 4);
      if(var4 != null) {
         var4.e(var1 & 15, var2, var3 & 15);
      }

   }

   public boolean g(int var1, int var2, int var3) {
      nq var4 = nq.m[this.a(var1, var2, var3)];
      return var4 == null?false:var4.a();
   }

   public void a(pu var1) {
      this.a(true, var1);
   }

   public boolean g() {
      if(this.J >= 50) {
         return false;
      } else {
         ++this.J;

         boolean var2;
         try {
            int var1 = 5000;

            while(this.A.size() > 0) {
               --var1;
               if(var1 <= 0) {
                  var2 = true;
                  return var2;
               }

               ((mc)this.A.remove(this.A.size() - 1)).a(this);
            }

            var2 = false;
         } finally {
            --this.J;
         }

         return var2;
      }
   }

   public void a(ch var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.a(var1, var2, var3, var4, var5, var6, var7, true);
   }

   public void a(ch var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
      if(!this.q.e || var1 != ch.a) {
         ++y;
         if(y == 50) {
            --y;
         } else {
            int var9 = (var5 + var2) / 2;
            int var10 = (var7 + var4) / 2;
            if(!this.d(var9, 64, var10)) {
               --y;
            } else {
               int var11 = this.A.size();
               if(var8) {
                  int var12 = 4;
                  if(var12 > var11) {
                     var12 = var11;
                  }

                  for(int var13 = 0; var13 < var12; ++var13) {
                     mc var14 = (mc)this.A.get(this.A.size() - var13 - 1);
                     if(var14.a == var1 && var14.a(var2, var3, var4, var5, var6, var7)) {
                        --y;
                        return;
                     }
                  }
               }

               this.A.add(new mc(var1, var2, var3, var4, var5, var6, var7));
               if(this.A.size() > 100000) {
                  this.A.clear();
               }

               --y;
            }
         }
      }
   }

   public void h() {
      int var1 = this.a(1.0F);
      if(var1 != this.f) {
         this.f = var1;
      }

   }

   public void i() throws IOException {
      bg.a(this);
      this.G.a();
      int var1 = this.a(1.0F);
      if(var1 != this.f) {
         this.f = var1;

         for(int var2 = 0; var2 < this.r.size(); ++var2) {
            ((jv)this.r.get(var2)).e();
         }
      }

      ++this.e;
      if(this.e % (long)this.j == 0L) {
         this.a(false, (pu)null);
      }

      this.a(false);
      this.j();
   }

   protected void j() {
      this.K.clear();

      int var3;
      int var4;
      int var6;
      int var7;
      for(int var1 = 0; var1 < this.d.size(); ++var1) {
         eb var2 = (eb)this.d.get(var1);
         var3 = fi.b(var2.aw / 16.0D);
         var4 = fi.b(var2.ay / 16.0D);
         byte var5 = 9;

         for(var6 = -var5; var6 <= var5; ++var6) {
            for(var7 = -var5; var7 <= var5; ++var7) {
               this.K.add(new qm(var6 + var3, var7 + var4));
            }
         }
      }

      if(this.L > 0) {
         --this.L;
      }

      Iterator var12 = this.K.iterator();

      while(var12.hasNext()) {
         qm var13 = (qm)var12.next();
         var3 = var13.a * 16;
         var4 = var13.b * 16;
         ha var14 = this.c(var13.a, var13.b);
         int var8;
         int var9;
         int var10;
         if(this.L == 0) {
            this.g = this.g * 3 + this.h;
            var6 = this.g >> 2;
            var7 = var6 & 15;
            var8 = var6 >> 8 & 15;
            var9 = var6 >> 16 & 127;
            var10 = var14.a(var7, var9, var8);
            var7 += var3;
            var8 += var4;
            if(var10 == 0 && this.j(var7, var9, var8) <= this.l.nextInt(8) && this.a(ch.a, var7, var9, var8) <= 0) {
               eb var11 = this.a((double)var7 + 0.5D, (double)var9 + 0.5D, (double)var8 + 0.5D, 8.0D);
               if(var11 != null && var11.e((double)var7 + 0.5D, (double)var9 + 0.5D, (double)var8 + 0.5D) > 4.0D) {
                  this.a((double)var7 + 0.5D, (double)var9 + 0.5D, (double)var8 + 0.5D, "ambient.cave.cave", 0.7F, 0.8F + this.l.nextFloat() * 0.2F);
                  this.L = this.l.nextInt(12000) + 6000;
               }
            }
         }

         for(var6 = 0; var6 < 80; ++var6) {
            this.g = this.g * 3 + this.h;
            var7 = this.g >> 2;
            var8 = var7 & 15;
            var9 = var7 >> 8 & 15;
            var10 = var7 >> 16 & 127;
            byte var15 = var14.b[var8 << 11 | var9 << 7 | var10];
            if(nq.n[var15]) {
               nq.m[var15].a(this, var8 + var3, var10, var9 + var4, this.l);
            }
         }
      }

   }

   public boolean a(boolean var1) {
      int var2 = this.C.size();
      if(var2 != this.D.size()) {
         throw new IllegalStateException("TickNextTick list out of synch");
      } else {
         if(var2 > 1000) {
            var2 = 1000;
         }

         for(int var3 = 0; var3 < var2; ++var3) {
            kq var4 = (kq)this.C.first();
            if(!var1 && var4.e > this.e) {
               break;
            }

            this.C.remove(var4);
            this.D.remove(var4);
            byte var5 = 8;
            if(this.a(var4.a - var5, var4.b - var5, var4.c - var5, var4.a + var5, var4.b + var5, var4.c + var5)) {
               int var6 = this.a(var4.a, var4.b, var4.c);
               if(var6 == var4.d && var6 > 0) {
                  nq.m[var6].a(this, var4.a, var4.b, var4.c, this.l);
               }
            }
         }

         return this.C.size() != 0;
      }
   }

   public void m(int var1, int var2, int var3) {
      byte var4 = 16;
      Random var5 = new Random();

      for(int var6 = 0; var6 < 1000; ++var6) {
         int var7 = var1 + this.l.nextInt(var4) - this.l.nextInt(var4);
         int var8 = var2 + this.l.nextInt(var4) - this.l.nextInt(var4);
         int var9 = var3 + this.l.nextInt(var4) - this.l.nextInt(var4);
         int var10 = this.a(var7, var8, var9);
         if(var10 > 0) {
            nq.m[var10].b(this, var7, var8, var9, var5);
         }
      }

   }

   public List b(lw var1, co var2) {
      this.M.clear();
      int var3 = fi.b((var2.a - 2.0D) / 16.0D);
      int var4 = fi.b((var2.d + 2.0D) / 16.0D);
      int var5 = fi.b((var2.c - 2.0D) / 16.0D);
      int var6 = fi.b((var2.f + 2.0D) / 16.0D);

      for(int var7 = var3; var7 <= var4; ++var7) {
         for(int var8 = var5; var8 <= var6; ++var8) {
            if(this.g(var7, var8)) {
               this.c(var7, var8).a(var1, var2, this.M);
            }
         }
      }

      return this.M;
   }

   public List a(Class var1, co var2) {
      int var3 = fi.b((var2.a - 2.0D) / 16.0D);
      int var4 = fi.b((var2.d + 2.0D) / 16.0D);
      int var5 = fi.b((var2.c - 2.0D) / 16.0D);
      int var6 = fi.b((var2.f + 2.0D) / 16.0D);
      ArrayList var7 = new ArrayList();

      for(int var8 = var3; var8 <= var4; ++var8) {
         for(int var9 = var5; var9 <= var6; ++var9) {
            if(this.g(var8, var9)) {
               this.c(var8, var9).a(var1, var2, var7);
            }
         }
      }

      return var7;
   }

   public List k() {
      return this.b;
   }

   public void b(int var1, int var2, int var3, ji var4) {
      if(this.d(var1, var2, var3)) {
         this.b(var1, var3).g();
      }

      for(int var5 = 0; var5 < this.r.size(); ++var5) {
         ((jv)this.r.get(var5)).a(var1, var2, var3, var4);
      }

   }

   public int b(Class var1) {
      int var2 = 0;

      for(int var3 = 0; var3 < this.b.size(); ++var3) {
         lw var4 = (lw)this.b.get(var3);
         if(var1.isAssignableFrom(var4.getClass())) {
            ++var2;
         }
      }

      return var2;
   }

   public void a(List var1) {
      this.b.addAll(var1);

      for(int var2 = 0; var2 < var1.size(); ++var2) {
         this.b((lw)var1.get(var2));
      }

   }

   public void b(List var1) {
      this.B.addAll(var1);
   }

   public void l() {
      while(this.G.a()) {
         ;
      }

   }

   public boolean a(int var1, int var2, int var3, int var4, boolean var5) {
      int var6 = this.a(var2, var3, var4);
      nq var7 = nq.m[var6];
      nq var8 = nq.m[var1];
      co var9 = var8.d(this, var2, var3, var4);
      if(var5) {
         var9 = null;
      }

      return var9 != null && !this.a(var9)?false:(var7 != nq.A && var7 != nq.B && var7 != nq.C && var7 != nq.D && var7 != nq.ar && var7 != nq.aS?var1 > 0 && var7 == null && var8.a(this, var2, var3, var4):true);
   }

   public bt a(lw var1, lw var2, float var3) {
      int var4 = fi.b(var1.aw);
      int var5 = fi.b(var1.ax);
      int var6 = fi.b(var1.ay);
      int var7 = (int)(var3 + 16.0F);
      int var8 = var4 - var7;
      int var9 = var5 - var7;
      int var10 = var6 - var7;
      int var11 = var4 + var7;
      int var12 = var5 + var7;
      int var13 = var6 + var7;
      cs var14 = new cs(this, var8, var9, var10, var11, var12, var13);
      return (new dm(var14)).a(var1, var2, var3);
   }

   public bt a(lw var1, int var2, int var3, int var4, float var5) {
      int var6 = fi.b(var1.aw);
      int var7 = fi.b(var1.ax);
      int var8 = fi.b(var1.ay);
      int var9 = (int)(var5 + 8.0F);
      int var10 = var6 - var9;
      int var11 = var7 - var9;
      int var12 = var8 - var9;
      int var13 = var6 + var9;
      int var14 = var7 + var9;
      int var15 = var8 + var9;
      cs var16 = new cs(this, var10, var11, var12, var13, var14, var15);
      return (new dm(var16)).a(var1, var2, var3, var4, var5);
   }

   public boolean j(int var1, int var2, int var3, int var4) {
      int var5 = this.a(var1, var2, var3);
      return var5 == 0?false:nq.m[var5].c(this, var1, var2, var3, var4);
   }

   public boolean n(int var1, int var2, int var3) {
      return this.j(var1, var2 - 1, var3, 0)?true:(this.j(var1, var2 + 1, var3, 1)?true:(this.j(var1, var2, var3 - 1, 2)?true:(this.j(var1, var2, var3 + 1, 3)?true:(this.j(var1 - 1, var2, var3, 4)?true:this.j(var1 + 1, var2, var3, 5)))));
   }

   public boolean k(int var1, int var2, int var3, int var4) {
      if(this.g(var1, var2, var3)) {
         return this.n(var1, var2, var3);
      } else {
         int var5 = this.a(var1, var2, var3);
         return var5 == 0?false:nq.m[var5].c((pk)this, var1, var2, var3, var4);
      }
   }

   public boolean o(int var1, int var2, int var3) {
      return this.k(var1, var2 - 1, var3, 0)?true:(this.k(var1, var2 + 1, var3, 1)?true:(this.k(var1, var2, var3 - 1, 2)?true:(this.k(var1, var2, var3 + 1, 3)?true:(this.k(var1 - 1, var2, var3, 4)?true:this.k(var1 + 1, var2, var3, 5)))));
   }

   public eb a(lw var1, double var2) {
      return this.a(var1.aw, var1.ax, var1.ay, var2);
   }

   public eb a(double var1, double var3, double var5, double var7) {
      double var9 = -1.0D;
      eb var11 = null;

      for(int var12 = 0; var12 < this.d.size(); ++var12) {
         eb var13 = (eb)this.d.get(var12);
         double var14 = var13.e(var1, var3, var5);
         if((var7 < 0.0D || var14 < var7 * var7) && (var9 == -1.0D || var14 < var9)) {
            var9 = var14;
            var11 = var13;
         }
      }

      return var11;
   }

   public void a(int var1, int var2, int var3, int var4, int var5, int var6, byte[] var7) {
      int var8 = var1 >> 4;
      int var9 = var3 >> 4;
      int var10 = var1 + var4 - 1 >> 4;
      int var11 = var3 + var6 - 1 >> 4;
      int var12 = 0;
      int var13 = var2;
      int var14 = var2 + var5;
      if(var2 < 0) {
         var13 = 0;
      }

      if(var14 > 128) {
         var14 = 128;
      }

      for(int var15 = var8; var15 <= var10; ++var15) {
         int var16 = var1 - var15 * 16;
         int var17 = var1 + var4 - var15 * 16;
         if(var16 < 0) {
            var16 = 0;
         }

         if(var17 > 16) {
            var17 = 16;
         }

         for(int var18 = var9; var18 <= var11; ++var18) {
            int var19 = var3 - var18 * 16;
            int var20 = var3 + var6 - var18 * 16;
            if(var19 < 0) {
               var19 = 0;
            }

            if(var20 > 16) {
               var20 = 16;
            }

            var12 = this.c(var15, var18).a(var7, var16, var13, var19, var17, var14, var20, var12);
            this.b(var15 * 16 + var16, var13, var18 * 16 + var19, var15 * 16 + var17, var14, var18 * 16 + var20);
         }
      }

   }

   public void m() {}

   public void n() {
      try {
         File var1 = new File(this.t, "session.lock");
         DataInputStream var2 = new DataInputStream(new FileInputStream(var1));

         try {
            if(var2.readLong() != this.F) {
               throw new np("The save is being accessed from another location, aborting");
            }
         } finally {
            var2.close();
         }

      } catch (IOException var7) {
         throw new np("Failed to check session lock, aborting");
      }
   }

   public void a(long var1) {
      this.e = var1;
   }

   public void f(lw var1) {
      int var2 = fi.b(var1.aw / 16.0D);
      int var3 = fi.b(var1.ay / 16.0D);
      byte var4 = 2;

      for(int var5 = var2 - var4; var5 <= var2 + var4; ++var5) {
         for(int var6 = var3 - var4; var6 <= var3 + var4; ++var6) {
            this.c(var5, var6);
         }
      }

      if(!this.b.contains(var1)) {
         this.b.add(var1);
      }

   }

   public boolean a(eb var1, int var2, int var3, int var4) {
      return true;
   }

   public void a(lw var1, byte var2) {}

   public void o() {
      this.b.removeAll(this.B);

      int var1;
      lw var2;
      int var3;
      int var4;
      for(var1 = 0; var1 < this.B.size(); ++var1) {
         var2 = (lw)this.B.get(var1);
         var3 = var2.bo;
         var4 = var2.bq;
         if(var2.bn && this.g(var3, var4)) {
            this.c(var3, var4).b(var2);
         }
      }

      for(var1 = 0; var1 < this.B.size(); ++var1) {
         this.c((lw)this.B.get(var1));
      }

      this.B.clear();

      for(var1 = 0; var1 < this.b.size(); ++var1) {
         var2 = (lw)this.b.get(var1);
         if(var2.ar != null) {
            if(!var2.ar.aN && var2.ar.aq == var2) {
               continue;
            }

            var2.ar.aq = null;
            var2.ar = null;
         }

         if(var2.aN) {
            var3 = var2.bo;
            var4 = var2.bq;
            if(var2.bn && this.g(var3, var4)) {
               this.c(var3, var4).b(var2);
            }

            this.b.remove(var1--);
            this.c(var2);
         }
      }

   }

}
