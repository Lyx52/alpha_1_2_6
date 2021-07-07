package mojang;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.lwjgl.opengl.GL11;

public class mn {

   private Map o = new HashMap();
   public static mn a = new mn();
   private ls p;
   public static double b;
   public static double c;
   public static double d;
   public fu e;
   public ku f;
   public cy g;
   public eb h;
   public float i;
   public float j;
   public gq k;
   public double l;
   public double m;
   public double n;


   private mn() {
      this.o.put(be.class, new ql());
      this.o.put(op.class, new hp(new cj(), new cj(0.5F), 0.7F));
      this.o.put(bx.class, new pr(new ia(), new cg(), 0.7F));
      this.o.put(as.class, new nu(new el(), 0.7F));
      this.o.put(ou.class, new fk(new mk(), 0.3F));
      this.o.put(dq.class, new g());
      this.o.put(dh.class, new m(new gu(), 0.5F));
      this.o.put(nt.class, new m(new ck(), 0.5F));
      this.o.put(ns.class, new ht(new ik(16), new ik(0), 0.25F));
      this.o.put(eb.class, new ce());
      this.o.put(ip.class, new pz(new ck(), 0.5F, 6.0F));
      this.o.put(am.class, new jz());
      this.o.put(hf.class, new ec(new dc(), 0.5F));
      this.o.put(lw.class, new hm());
      this.o.put(kp.class, new cf());
      this.o.put(lv.class, new hn());
      this.o.put(at.class, new fb());
      this.o.put(az.class, new gl());
      this.o.put(eo.class, new af());
      this.o.put(kr.class, new jb());
      this.o.put(gb.class, new dy());
      this.o.put(qd.class, new mi());
      this.o.put(dp.class, new da());
      this.o.put(hj.class, new jw());
      Iterator var1 = this.o.values().iterator();

      while(var1.hasNext()) {
         aq var2 = (aq)var1.next();
         var2.a(this);
      }

   }

   public aq a(Class var1) {
      aq var2 = (aq)this.o.get(var1);
      if(var2 == null && var1 != lw.class) {
         var2 = this.a(var1.getSuperclass());
         this.o.put(var1, var2);
      }

      return var2;
   }

   public aq a(lw var1) {
      return this.a(var1.getClass());
   }

   public void a(cy var1, fu var2, ls var3, eb var4, gq var5, float var6) {
      this.g = var1;
      this.e = var2;
      this.k = var5;
      this.h = var4;
      this.p = var3;
      this.i = var4.aE + (var4.aC - var4.aE) * var6;
      this.j = var4.aF + (var4.aD - var4.aF) * var6;
      this.l = var4.aV + (var4.aw - var4.aV) * (double)var6;
      this.m = var4.aW + (var4.ax - var4.aW) * (double)var6;
      this.n = var4.aX + (var4.ay - var4.aX) * (double)var6;
   }

   public void a(lw var1, float var2) {
      double var3 = var1.aV + (var1.aw - var1.aV) * (double)var2;
      double var5 = var1.aW + (var1.ax - var1.aW) * (double)var2;
      double var7 = var1.aX + (var1.ay - var1.aX) * (double)var2;
      float var9 = var1.aE + (var1.aC - var1.aE) * var2;
      float var10 = var1.a(var2);
      GL11.glColor3f(var10, var10, var10);
      this.a(var1, var3 - b, var5 - c, var7 - d, var9, var2);
   }

   public void a(lw var1, double var2, double var4, double var6, float var8, float var9) {
      aq var10 = this.a(var1);
      if(var10 != null) {
         var10.a(var1, var2, var4, var6, var8, var9);
         var10.b(var1, var2, var4, var6, var8, var9);
      }

   }

   public void a(cy var1) {
      this.g = var1;
   }

   public double a(double var1, double var3, double var5) {
      double var7 = var1 - this.l;
      double var9 = var3 - this.m;
      double var11 = var5 - this.n;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public ls a() {
      return this.p;
   }

}
