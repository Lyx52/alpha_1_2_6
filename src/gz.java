import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.lwjgl.opengl.GL11;

public class gz {

   private Map m = new HashMap();
   public static gz a = new gz();
   private ls n;
   public static double b;
   public static double c;
   public static double d;
   public fu e;
   public cy f;
   public eb g;
   public float h;
   public float i;
   public double j;
   public double k;
   public double l;


   private gz() {
      this.m.put(qc.class, new jx());
      this.m.put(bl.class, new u());
      Iterator var1 = this.m.values().iterator();

      while(var1.hasNext()) {
         fr var2 = (fr)var1.next();
         var2.a(this);
      }

   }

   public fr a(Class var1) {
      fr var2 = (fr)this.m.get(var1);
      if(var2 == null && var1 != ji.class) {
         var2 = this.a(var1.getSuperclass());
         this.m.put(var1, var2);
      }

      return var2;
   }

   public boolean a(ji var1) {
      return this.b(var1) != null;
   }

   public fr b(ji var1) {
      return var1 == null?null:this.a(var1.getClass());
   }

   public void a(cy var1, fu var2, ls var3, eb var4, float var5) {
      this.f = var1;
      this.e = var2;
      this.g = var4;
      this.n = var3;
      this.h = var4.aE + (var4.aC - var4.aE) * var5;
      this.i = var4.aF + (var4.aD - var4.aF) * var5;
      this.j = var4.aV + (var4.aw - var4.aV) * (double)var5;
      this.k = var4.aW + (var4.ax - var4.aW) * (double)var5;
      this.l = var4.aX + (var4.ay - var4.aX) * (double)var5;
   }

   public void a(ji var1, float var2) {
      if(var1.a(this.j, this.k, this.l) < 4096.0D) {
         float var3 = this.f.c(var1.f, var1.g, var1.h);
         GL11.glColor3f(var3, var3, var3);
         this.a(var1, (double)var1.f - b, (double)var1.g - c, (double)var1.h - d, var2);
      }

   }

   public void a(ji var1, double var2, double var4, double var6, float var8) {
      fr var9 = this.b(var1);
      if(var9 != null) {
         var9.a(var1, var2, var4, var6, var8);
      }

   }

   public ls a() {
      return this.n;
   }

}
