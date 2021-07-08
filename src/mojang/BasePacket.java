package mojang;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public abstract class BasePacket {

   private static Map idToClass = new HashMap();
   private static Map classToId = new HashMap();
   public boolean j = false;


   static void register(int packetID, Class packetClass) {
      if(idToClass.containsKey(Integer.valueOf(packetID))) {
         throw new IllegalArgumentException("Duplicate packet id:" + packetID);
      } else if(classToId.containsKey(packetClass)) {
         throw new IllegalArgumentException("Duplicate packet class:" + packetClass);
      } else {
         idToClass.put(Integer.valueOf(packetID), packetClass);
         classToId.put(packetClass, Integer.valueOf(packetID));
      }
   }

   @SuppressWarnings("deprecation")
   public static BasePacket getPacketByID(int packetID) {
      try {
         Class packetClass = (Class) idToClass.get(Integer.valueOf(packetID));
         return packetClass == null ? null : (BasePacket)packetClass.newInstance();
      } catch (Exception e) {
         e.printStackTrace();
         System.out.println("Skipping packet with id " + packetID);
         return null;
      }
   }

   public final int b() {
      return ((Integer) classToId.get(this.getClass())).intValue();
   }

   public static BasePacket b(DataInputStream var0) throws IOException {
      int var1 = var0.read();
      if(var1 == -1) {
         return null;
      } else {
         BasePacket var2 = getPacketByID(var1);
         if(var2 == null) {
            throw new IOException("Bad packet id " + var1);
         } else {
            var2.a(var0);
            return var2;
         }
      }
   }

   public static void a(BasePacket var0, DataOutputStream var1) throws IOException {
      var1.write(var0.b());
      var0.a(var1);
   }

   public abstract void a(DataInputStream var1) throws IOException;

   public abstract void a(DataOutputStream var1) throws IOException;

   public abstract void a(mo var1) throws IOException;

   public abstract int a();

   static {
      register(0, hl.class);
      register(1, iu.class);
      register(2, hw.class);
      register(3, jr.class);
      register(4, ek.class);
      register(5, p.class);
      register(6, kv.class);
      register(7, a.class);
      register(8, cq.class);
      register(9, jk.class);
      register(10, fa.class);
      register(11, t.class);
      register(12, nz.class);
      register(13, cr.class);
      register(14, gc.class);
      register(15, ed.class);
      register(16, eq.class);
      register(17, mt.class);
      register(18, ii.class);
      register(20, hs.class);
      register(21, id.class);
      register(22, bu.class);
      register(23, lz.class);
      register(24, fv.class);
      register(28, dv.class);
      register(29, li.class);
      register(30, nh.class);
      register(31, md.class);
      register(32, ll.class);
      register(33, kd.class);
      register(34, ky.class);
      register(38, fs.class);
      register(39, io.class);
      register(50, lq.class);
      register(51, ci.class);
      register(52, ov.class);
      register(53, mx.class);
      register(59, py.class);
      register(60, lc.class);
      register(255, qi.class);
   }
}
