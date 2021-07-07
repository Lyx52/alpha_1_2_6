import java.util.HashMap;
import java.util.Map;

public class fq {

   private static Map a = new HashMap();
   private static Map b = new HashMap();
   private static Map c = new HashMap();
   private static Map d = new HashMap();


   private static void a(Class var0, String var1, int var2) {
      a.put(var1, var0);
      b.put(var0, var1);
      c.put(Integer.valueOf(var2), var0);
      d.put(var0, Integer.valueOf(var2));
   }

   public static lw a(String var0, cy var1) {
      lw var2 = null;

      try {
         Class var3 = (Class)a.get(var0);
         if(var3 != null) {
            var2 = (lw)var3.getConstructor(new Class[]{cy.class}).newInstance(new Object[]{var1});
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      return var2;
   }

   public static lw a(iq var0, cy var1) {
      lw var2 = null;

      try {
         Class var3 = (Class)a.get(var0.i("id"));
         if(var3 != null) {
            var2 = (lw)var3.getConstructor(new Class[]{cy.class}).newInstance(new Object[]{var1});
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      if(var2 != null) {
         var2.e(var0);
      } else {
         System.out.println("Skipping Entity with id " + var0.i("id"));
      }

      return var2;
   }

   public static lw a(int var0, cy var1) {
      lw var2 = null;

      try {
         Class var3 = (Class)c.get(Integer.valueOf(var0));
         if(var3 != null) {
            var2 = (lw)var3.getConstructor(new Class[]{cy.class}).newInstance(new Object[]{var1});
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      if(var2 == null) {
         System.out.println("Skipping Entity with id " + var0);
      }

      return var2;
   }

   public static int a(lw var0) {
      return ((Integer)d.get(var0.getClass())).intValue();
   }

   public static String b(lw var0) {
      return (String)b.get(var0.getClass());
   }

   static {
      a(lv.class, "Arrow", 10);
      a(at.class, "Snowball", 11);
      a(eo.class, "Item", 1);
      a(kp.class, "Painting", 9);
      a(hf.class, "Mob", 48);
      a(ef.class, "Monster", 49);
      a(dq.class, "Creeper", 50);
      a(dh.class, "Skeleton", 51);
      a(be.class, "Spider", 52);
      a(ip.class, "Giant", 53);
      a(nt.class, "Zombie", 54);
      a(ns.class, "Slime", 55);
      a(am.class, "Ghast", 56);
      a(pt.class, "PigZombie", 57);
      a(op.class, "Pig", 90);
      a(bx.class, "Sheep", 91);
      a(as.class, "Cow", 92);
      a(ou.class, "Chicken", 93);
      a(kr.class, "PrimedTnt", 20);
      a(gb.class, "FallingSand", 21);
      a(qd.class, "Minecart", 40);
      a(dp.class, "Boat", 41);
   }
}
