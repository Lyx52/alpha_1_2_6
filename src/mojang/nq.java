package mojang;

import mojang.entity.item.DroppedItem;
import mojang.entity.Entity;
import mojang.entity.LivingEntity;

import java.util.ArrayList;
import java.util.Random;

public class nq {

   public static final bi d = new bi("stone", 1.0F, 1.0F);
   public static final bi e = new bi("wood", 1.0F, 1.0F);
   public static final bi f = new bi("gravel", 1.0F, 1.0F);
   public static final bi g = new bi("grass", 1.0F, 1.0F);
   public static final bi h = new bi("stone", 1.0F, 1.0F);
   public static final bi i = new bi("stone", 1.0F, 1.5F);
   public static final bi j = new y("stone", 1.0F, 1.0F);
   public static final bi k = new bi("cloth", 1.0F, 1.0F);
   public static final bi l = new w("sand", 1.0F, 1.0F);
   public static final nq[] m = new nq[256];
   public static final boolean[] n = new boolean[256];
   public static final boolean[] o = new boolean[256];
   public static final boolean[] p = new boolean[256];
   public static final int[] q = new int[256];
   public static final boolean[] r = new boolean[256];
   public static final int[] s = new int[256];
   public static final nq t = (new cn(1, 1)).c(1.5F).b(10.0F).a(h);
   public static final os u = (os)(new os(2)).c(0.6F).a(g);
   public static final nq v = (new jf(3, 2)).c(0.5F).a(f);
   public static final nq w = (new nq(4, 16, hb.d)).c(2.0F).b(10.0F).a(h);
   public static final nq x = (new nq(5, 4, hb.c)).c(2.0F).b(5.0F).a(e);
   public static final nq y = (new ej(6, 15)).c(0.0F).a(g);
   public static final nq z = (new nq(7, 17, hb.d)).c(-1.0F).b(6000000.0F).a(h);
   public static final nq A = (new ja(8, hb.f)).c(100.0F).d(3);
   public static final nq B = (new ir(9, hb.f)).c(100.0F).d(3);
   public static final nq C = (new ja(10, hb.g)).c(0.0F).a(1.0F).d(255);
   public static final nq D = (new ir(11, hb.g)).c(100.0F).a(1.0F).d(255);
   public static final nq E = (new dw(12, 18)).c(0.5F).a(l);
   public static final nq F = (new ic(13, 19)).c(0.6F).a(f);
   public static final nq G = (new hz(14, 32)).c(3.0F).b(5.0F).a(h);
   public static final nq H = (new hz(15, 33)).c(3.0F).b(5.0F).a(h);
   public static final nq I = (new hz(16, 34)).c(3.0F).b(5.0F).a(h);
   public static final nq J = (new ny(17)).c(2.0F).a(e);
   public static final km K = (km)(new km(18, 52)).c(0.2F).d(1).a(g);
   public static final nq L = (new pd(19)).c(0.6F).a(g);
   public static final nq M = (new de(20, 49, hb.o, false)).c(0.3F).a(j);
   public static final nq N = null;
   public static final nq O = null;
   public static final nq P = null;
   public static final nq Q = null;
   public static final nq R = null;
   public static final nq S = null;
   public static final nq T = null;
   public static final nq U = null;
   public static final nq V = null;
   public static final nq W = null;
   public static final nq X = null;
   public static final nq Y = null;
   public static final nq Z = null;
   public static final nq aa = null;
   public static final nq ab = (new nq(35, 64, hb.k)).c(0.8F).a(k);
   public static final nq ac = null;
   public static final ok ad = (ok)(new ok(37, 13)).c(0.0F).a(g);
   public static final ok ae = (ok)(new ok(38, 12)).c(0.0F).a(g);
   public static final ok af = (ok)(new mr(39, 29)).c(0.0F).a(g).a(0.125F);
   public static final ok ag = (ok)(new mr(40, 28)).c(0.0F).a(g);
   public static final nq ah = (new e(41, 39)).c(3.0F).b(10.0F).a(i);
   public static final nq ai = (new e(42, 38)).c(5.0F).b(10.0F).a(i);
   public static final nq aj = (new qj(43, true)).c(2.0F).b(10.0F).a(h);
   public static final nq ak = (new qj(44, false)).c(2.0F).b(10.0F).a(h);
   public static final nq al = (new nq(45, 7, hb.d)).c(2.0F).b(10.0F).a(h);
   public static final nq am = (new v(46, 8)).c(0.0F).a(g);
   public static final nq an = (new eh(47, 35)).c(1.5F).a(e);
   public static final nq ao = (new nq(48, 36, hb.d)).c(2.0F).b(10.0F).a(h);
   public static final nq ap = (new cw(49, 37)).c(10.0F).b(2000.0F).a(h);
   public static final nq aq = (new ob(50, 80)).c(0.0F).a(0.9375F).a(e);
   public static final qh ar = (qh)((qh)(new qh(51, 31)).c(0.0F).a(1.0F).a(e));
   public static final nq as = (new br(52, 65)).c(5.0F).a(i);
   public static final nq at = new mb(53, x);
   public static final nq au = (new c(54)).c(2.5F).a(e);
   public static final nq av = (new lu(55, 84)).c(0.0F).a(d);
   public static final nq aw = (new hz(56, 50)).c(3.0F).b(5.0F).a(h);
   public static final nq ax = (new e(57, 40)).c(5.0F).b(10.0F).a(i);
   public static final nq ay = (new dd(58)).c(2.5F).a(e);
   public static final nq az = (new ig(59, 88)).c(0.0F).a(g);
   public static final nq aA = (new oa(60)).c(0.6F).a(f);
   public static final nq aB = (new mj(61, false)).c(3.5F).a(h);
   public static final nq aC = (new mj(62, true)).c(3.5F).a(h).a(0.875F);
   public static final nq aD = (new ni(63, qc.class, true)).c(1.0F).a(e);
   public static final nq aE = (new gv(64, hb.c)).c(3.0F).a(e);
   public static final nq aF = (new ca(65, 83)).c(0.4F).a(e);
   public static final nq aG = (new jn(66, 128)).c(0.7F).a(i);
   public static final nq aH = new mb(67, w);
   public static final nq aI = (new ni(68, qc.class, false)).c(1.0F).a(e);
   public static final nq aJ = (new pl(69, 96)).c(0.5F).a(e);
   public static final nq aK = (new ap(70, t.bg, lg.b)).c(0.5F).a(h);
   public static final nq aL = (new gv(71, hb.e)).c(5.0F).a(i);
   public static final nq aM = (new ap(72, x.bg, lg.a)).c(0.5F).a(e);
   public static final nq aN = (new an(73, 51, false)).c(3.0F).b(5.0F).a(h);
   public static final nq aO = (new an(74, 51, true)).a(0.625F).c(3.0F).b(5.0F).a(h);
   public static final nq aP = (new bo(75, 115, false)).c(0.0F).a(e);
   public static final nq aQ = (new bo(76, 99, true)).c(0.0F).a(0.5F).a(e);
   public static final nq aR = (new iy(77, t.bg)).c(0.5F).a(h);
   public static final nq aS = (new fz(78, 66)).c(0.1F).a(k);
   public static final nq aT = (new ih(79, 67)).c(0.5F).d(3).a(j);
   public static final nq aU = (new s(80, 66)).c(0.2F).a(k);
   public static final nq aV = (new je(81, 70)).c(0.4F).a(k);
   public static final nq aW = (new lj(82, 72)).c(0.6F).a(f);
   public static final nq aX = (new kz(83, 73)).c(0.0F).a(g);
   public static final nq aY = (new dg(84, 74)).c(2.0F).b(10.0F).a(h);
   public static final nq aZ = (new gd(85, 4)).c(2.0F).b(5.0F).a(e);
   public static final nq ba = (new cx(86, 102, false)).c(1.0F).a(e);
   public static final nq bb = (new qb(87, 103)).c(0.4F).a(h);
   public static final nq bc = (new it(88, 104)).c(0.5F).a(l);
   public static final nq bd = (new hk(89, 105, hb.o)).c(0.3F).a(j).a(1.0F);
   public static final x be = (x)((x)(new x(90, 14)).c(-1.0F).a(j).a(0.75F));
   public static final nq bf = (new cx(91, 102, true)).c(1.0F).a(e).a(1.0F);
   public int bg;
   public final int bh;
   protected float bi;
   protected float bj;
   public double bk;
   public double bl;
   public double bm;
   public double bn;
   public double bo;
   public double bp;
   public bi bq;
   public float br;
   public final hb bs;
   public float bt;


   protected nq(int slot, hb var2) {
      this.bq = d;
      this.br = 1.0F;
      this.bt = 0.6F;
      if(m[slot] != null) {
         throw new IllegalArgumentException("Slot " + slot + " is already occupied by " + m[slot] + " when adding " + this);
      } else {
         this.bs = var2;
         m[slot] = this;
         this.bh = slot;
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
         o[slot] = this.a();
         q[slot] = this.a()?255:0;
         r[slot] = this.i();
         p[slot] = false;
      }
   }

   protected nq(int var1, int var2, hb var3) {
      this(var1, var3);
      this.bg = var2;
   }

   protected nq a(bi var1) {
      this.bq = var1;
      return this;
   }

   protected nq d(int var1) {
      q[this.bh] = var1;
      return this;
   }

   protected nq a(float var1) {
      s[this.bh] = (int)(15.0F * var1);
      return this;
   }

   protected nq b(float var1) {
      this.bj = var1 * 3.0F;
      return this;
   }

   private boolean i() {
      return false;
   }

   public boolean b() {
      return true;
   }

   public int g() {
      return 0;
   }

   protected nq c(float var1) {
      this.bi = var1;
      if(this.bj < var1 * 5.0F) {
         this.bj = var1 * 5.0F;
      }

      return this;
   }

   protected void b(boolean var1) {
      n[this.bh] = var1;
   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.bk = (double)var1;
      this.bl = (double)var2;
      this.bm = (double)var3;
      this.bn = (double)var4;
      this.bo = (double)var5;
      this.bp = (double)var6;
   }

   public float d(pk var1, int var2, int var3, int var4) {
      return var1.c(var2, var3, var4);
   }

   public boolean b(pk var1, int var2, int var3, int var4, int var5) {
      return var5 == 0 && this.bl > 0.0D?true:(var5 == 1 && this.bo < 1.0D?true:(var5 == 2 && this.bm > 0.0D?true:(var5 == 3 && this.bp < 1.0D?true:(var5 == 4 && this.bk > 0.0D?true:(var5 == 5 && this.bn < 1.0D?true:!var1.g(var2, var3, var4))))));
   }

   public int a(pk var1, int var2, int var3, int var4, int var5) {
      return this.a(var5, var1.e(var2, var3, var4));
   }

   public int a(int var1, int var2) {
      return this.a(var1);
   }

   public int a(int var1) {
      return this.bg;
   }

   public co f(cy var1, int var2, int var3, int var4) {
      return co.b((double)var2 + this.bk, (double)var3 + this.bl, (double)var4 + this.bm, (double)var2 + this.bn, (double)var3 + this.bo, (double)var4 + this.bp);
   }

   public void a(cy var1, int var2, int var3, int var4, co var5, ArrayList var6) {
      co var7 = this.d(var1, var2, var3, var4);
      if(var7 != null && var5.a(var7)) {
         var6.add(var7);
      }

   }

   public co d(cy var1, int var2, int var3, int var4) {
      return co.b((double)var2 + this.bk, (double)var3 + this.bl, (double)var4 + this.bm, (double)var2 + this.bn, (double)var3 + this.bo, (double)var4 + this.bp);
   }

   public boolean a() {
      return true;
   }

   public boolean a(int var1, boolean var2) {
      return this.h();
   }

   public boolean h() {
      return true;
   }

   public void a(cy var1, int var2, int var3, int var4, Random var5) {}

   public void b(cy var1, int var2, int var3, int var4, Random var5) {}

   public void b(cy var1, int var2, int var3, int var4, int var5) {}

   public void a(cy var1, int var2, int var3, int var4, int var5) {}

   public int d() {
      return 10;
   }

   public void e(cy var1, int var2, int var3, int var4) {}

   public void b(cy var1, int var2, int var3, int var4) {}

   public int a(Random var1) {
      return 1;
   }

   public int a(int var1, Random var2) {
      return this.bh;
   }

   public float a(eb var1) {
      return this.bi < 0.0F?0.0F:(!var1.b(this)?1.0F / this.bi / 100.0F:var1.a(this) / this.bi / 30.0F);
   }

   public void b_(cy var1, int var2, int var3, int var4, int var5) {
      this.a(var1, var2, var3, var4, var5, 1.0F);
   }

   public void a(cy var1, int var2, int var3, int var4, int var5, float var6) {
      if(!var1.z) {
         int var7 = this.a(var1.l);

         for(int var8 = 0; var8 < var7; ++var8) {
            if(var1.l.nextFloat() <= var6) {
               int var9 = this.a(var5, var1.l);
               if(var9 > 0) {
                  float var10 = 0.7F;
                  double var11 = (double)(var1.l.nextFloat() * var10) + (double)(1.0F - var10) * 0.5D;
                  double var13 = (double)(var1.l.nextFloat() * var10) + (double)(1.0F - var10) * 0.5D;
                  double var15 = (double)(var1.l.nextFloat() * var10) + (double)(1.0F - var10) * 0.5D;
                  DroppedItem var17 = new DroppedItem(var1, (double)var2 + var11, (double)var3 + var13, (double)var4 + var15, new fp(var9));
                  var17.c = 10;
                  var1.a((Entity)var17);
               }
            }
         }

      }
   }

   public float a(Entity var1) {
      return this.bj / 5.0F;
   }

   public nx a(cy var1, int var2, int var3, int var4, ao var5, ao var6) {
      this.a((pk)var1, var2, var3, var4);
      var5 = var5.c((double)(-var2), (double)(-var3), (double)(-var4));
      var6 = var6.c((double)(-var2), (double)(-var3), (double)(-var4));
      ao var7 = var5.a(var6, this.bk);
      ao var8 = var5.a(var6, this.bn);
      ao var9 = var5.b(var6, this.bl);
      ao var10 = var5.b(var6, this.bo);
      ao var11 = var5.c(var6, this.bm);
      ao var12 = var5.c(var6, this.bp);
      if(!this.a(var7)) {
         var7 = null;
      }

      if(!this.a(var8)) {
         var8 = null;
      }

      if(!this.b(var9)) {
         var9 = null;
      }

      if(!this.b(var10)) {
         var10 = null;
      }

      if(!this.c(var11)) {
         var11 = null;
      }

      if(!this.c(var12)) {
         var12 = null;
      }

      ao var13 = null;
      if(var7 != null && (var13 == null || var5.c(var7) < var5.c(var13))) {
         var13 = var7;
      }

      if(var8 != null && (var13 == null || var5.c(var8) < var5.c(var13))) {
         var13 = var8;
      }

      if(var9 != null && (var13 == null || var5.c(var9) < var5.c(var13))) {
         var13 = var9;
      }

      if(var10 != null && (var13 == null || var5.c(var10) < var5.c(var13))) {
         var13 = var10;
      }

      if(var11 != null && (var13 == null || var5.c(var11) < var5.c(var13))) {
         var13 = var11;
      }

      if(var12 != null && (var13 == null || var5.c(var12) < var5.c(var13))) {
         var13 = var12;
      }

      if(var13 == null) {
         return null;
      } else {
         byte var14 = -1;
         if(var13 == var7) {
            var14 = 4;
         }

         if(var13 == var8) {
            var14 = 5;
         }

         if(var13 == var9) {
            var14 = 0;
         }

         if(var13 == var10) {
            var14 = 1;
         }

         if(var13 == var11) {
            var14 = 2;
         }

         if(var13 == var12) {
            var14 = 3;
         }

         return new nx(var2, var3, var4, var14, var13.c((double)var2, (double)var3, (double)var4));
      }
   }

   private boolean a(ao var1) {
      return var1 == null?false:var1.b >= this.bl && var1.b <= this.bo && var1.c >= this.bm && var1.c <= this.bp;
   }

   private boolean b(ao var1) {
      return var1 == null?false:var1.a >= this.bk && var1.a <= this.bn && var1.c >= this.bm && var1.c <= this.bp;
   }

   private boolean c(ao var1) {
      return var1 == null?false:var1.a >= this.bk && var1.a <= this.bn && var1.b >= this.bl && var1.b <= this.bo;
   }

   public void c(cy var1, int var2, int var3, int var4) {}

   public int c() {
      return 0;
   }

   public boolean a(cy var1, int var2, int var3, int var4) {
      int var5 = var1.a(var2, var3, var4);
      return var5 == 0 || m[var5].bs.d();
   }

   public boolean a(cy var1, int var2, int var3, int var4, eb var5) {
      return false;
   }

   public void b(cy var1, int var2, int var3, int var4, Entity var5) {}

   public void d(cy var1, int var2, int var3, int var4, int var5) {}

   public void b(cy var1, int var2, int var3, int var4, eb var5) {}

   public void a(cy var1, int var2, int var3, int var4, Entity var5, ao var6) {}

   public void a(pk var1, int var2, int var3, int var4) {}

   public int b(pk var1, int var2, int var3, int var4) {
      return 16777215;
   }

   public boolean c(pk var1, int var2, int var3, int var4, int var5) {
      return false;
   }

   public boolean e() {
      return false;
   }

   public void a(cy var1, int var2, int var3, int var4, Entity var5) {}

   public boolean c(cy var1, int var2, int var3, int var4, int var5) {
      return false;
   }

   public void f() {}

   public void a_(cy var1, int var2, int var3, int var4, int var5) {
      this.b_(var1, var2, var3, var4, var5);
   }

   public boolean g(cy var1, int var2, int var3, int var4) {
      return true;
   }

   public void a(cy var1, int var2, int var3, int var4, LivingEntity var5) {}

   static {
      for(int var0 = 0; var0 < 256; ++var0) {
         if(m[var0] != null) {
            dx.c[var0] = new bc(var0 - 256);
         }
      }

   }
}
