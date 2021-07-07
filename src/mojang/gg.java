package mojang;

import java.awt.Color;

public class gg {

   public static final gg a = (new gg()).b(588342).a("Rainforest").a(2094168);
   public static final gg b = (new ml()).b(522674).a("Swampland").a(9154376);
   public static final gg c = (new gg()).b(10215459).a("Seasonal Forest");
   public static final gg d = (new gg()).b(353825).a("Forest").a(5159473);
   public static final gg e = (new di()).b(14278691).a("Savanna");
   public static final gg f = (new gg()).b(10595616).a("Shrubland");
   public static final gg g = (new gg()).b(3060051).a("Taiga").b().a(8107825);
   public static final gg h = (new di()).b(16421912).a("Desert");
   public static final gg i = (new di()).b(16767248).a("Plains");
   public static final gg j = (new di()).b(16772499).a("Ice Desert").b().a(12899129);
   public static final gg k = (new gg()).b(5762041).a("Tundra").b().a(12899129);
   public static final gg l = (new k()).b(16711680).a("Hell");
   public String m;
   public int n;
   public byte o;
   public byte p;
   public int q;
   protected Class[] r;
   protected Class[] s;
   private static gg[] t = new gg[4096];


   public gg() {
      this.o = (byte)nq.u.bh;
      this.p = (byte)nq.v.bh;
      this.q = 5169201;
      this.r = new Class[]{be.class, nt.class, dh.class, dq.class};
      this.s = new Class[]{bx.class, op.class, ou.class, as.class};
   }

   public static void a() {
      for(int var0 = 0; var0 < 64; ++var0) {
         for(int var1 = 0; var1 < 64; ++var1) {
            t[var0 + var1 * 64] = a((float)var0 / 63.0F, (float)var1 / 63.0F);
         }
      }

      h.o = h.p = (byte)nq.E.bh;
      j.o = j.p = (byte)nq.E.bh;
   }

   protected gg b() {
      return this;
   }

   protected gg a(String var1) {
      this.m = var1;
      return this;
   }

   protected gg a(int var1) {
      this.q = var1;
      return this;
   }

   protected gg b(int var1) {
      this.n = var1;
      return this;
   }

   public static gg a(double var0, double var2) {
      int var4 = (int)(var0 * 63.0D);
      int var5 = (int)(var2 * 63.0D);
      return t[var4 + var5 * 64];
   }

   public static gg a(float var0, float var1) {
      var1 *= var0;
      return var0 < 0.1F?k:(var1 < 0.2F?(var0 < 0.5F?k:(var0 < 0.95F?e:h)):(var1 > 0.5F && var0 < 0.7F?b:(var0 < 0.5F?g:(var0 < 0.97F?(var1 < 0.35F?f:d):(var1 < 0.45F?i:(var1 < 0.9F?c:a))))));
   }

   public int a(float var1) {
      var1 /= 3.0F;
      if(var1 < -1.0F) {
         var1 = -1.0F;
      }

      if(var1 > 1.0F) {
         var1 = 1.0F;
      }

      return Color.getHSBColor(0.62222224F - var1 * 0.05F, 0.5F + var1 * 0.1F, 1.0F).getRGB();
   }

   public Class[] a(gy var1) {
      return var1 == gy.a?this.r:(var1 == gy.b?this.s:null);
   }

   static {
      a();
   }
}
