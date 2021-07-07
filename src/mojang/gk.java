package mojang;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public abstract class gk {

   private static Map a = new HashMap();
   private static Map b = new HashMap();
   public boolean j = false;


   static void a(int var0, Class var1) {
      if(a.containsKey(Integer.valueOf(var0))) {
         throw new IllegalArgumentException("Duplicate packet id:" + var0);
      } else if(b.containsKey(var1)) {
         throw new IllegalArgumentException("Duplicate packet class:" + var1);
      } else {
         a.put(Integer.valueOf(var0), var1);
         b.put(var1, Integer.valueOf(var0));
      }
   }

   @SuppressWarnings("deprecation")
   public static gk a(int var0) {
      try {
         Class var1 = (Class)a.get(Integer.valueOf(var0));
         return var1 == null?null:(gk)var1.newInstance();
      } catch (Exception var2) {
         var2.printStackTrace();
         System.out.println("Skipping packet with id " + var0);
         return null;
      }
   }

   public final int b() {
      return ((Integer)b.get(this.getClass())).intValue();
   }

   public static gk b(DataInputStream var0) throws IOException {
      int var1 = var0.read();
      if(var1 == -1) {
         return null;
      } else {
         gk var2 = a(var1);
         if(var2 == null) {
            throw new IOException("Bad packet id " + var1);
         } else {
            var2.a(var0);
            return var2;
         }
      }
   }

   public static void a(gk var0, DataOutputStream var1) throws IOException {
      var1.write(var0.b());
      var0.a(var1);
   }

   public abstract void a(DataInputStream var1) throws IOException;

   public abstract void a(DataOutputStream var1) throws IOException;

   public abstract void a(mo var1) throws IOException;

   public abstract int a();

   static {
      a(0, hl.class);
      a(1, iu.class);
      a(2, hw.class);
      a(3, jr.class);
      a(4, ek.class);
      a(5, p.class);
      a(6, kv.class);
      a(7, a.class);
      a(8, cq.class);
      a(9, jk.class);
      a(10, fa.class);
      a(11, t.class);
      a(12, nz.class);
      a(13, cr.class);
      a(14, gc.class);
      a(15, ed.class);
      a(16, eq.class);
      a(17, mt.class);
      a(18, ii.class);
      a(20, hs.class);
      a(21, id.class);
      a(22, bu.class);
      a(23, lz.class);
      a(24, fv.class);
      a(28, dv.class);
      a(29, li.class);
      a(30, nh.class);
      a(31, md.class);
      a(32, ll.class);
      a(33, kd.class);
      a(34, ky.class);
      a(38, fs.class);
      a(39, io.class);
      a(50, lq.class);
      a(51, ci.class);
      a(52, ov.class);
      a(53, mx.class);
      a(59, py.class);
      a(60, lc.class);
      a(255, qi.class);
   }
}
