package mojang;

import mojang.entity.*;
import mojang.entity.animal.Chicken;
import mojang.entity.animal.Cow;
import mojang.entity.animal.Pig;
import mojang.entity.animal.Sheep;
import mojang.entity.item.DroppedItem;
import mojang.entity.item.FallingSand;
import mojang.entity.item.Painting;
import mojang.entity.item.PrimedTNT;
import mojang.entity.monster.*;
import mojang.entity.projectile.Arrow;
import mojang.entity.projectile.Snowball;
import mojang.entity.vehicle.Boat;
import mojang.entity.vehicle.Minecart;
import mojang.tags.CompoundTag;

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

   public static Entity a(String var0, cy var1) {
      Entity var2 = null;

      try {
         Class var3 = (Class)a.get(var0);
         if(var3 != null) {
            var2 = (Entity)var3.getConstructor(new Class[]{cy.class}).newInstance(new Object[]{var1});
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      return var2;
   }

   public static Entity a(CompoundTag var0, cy var1) {
      Entity var2 = null;

      try {
         Class var3 = (Class)a.get(var0.getString("id"));
         if(var3 != null) {
            var2 = (Entity)var3.getConstructor(new Class[]{cy.class}).newInstance(new Object[]{var1});
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      if(var2 != null) {
         var2.e(var0);
      } else {
         System.out.println("Skipping Entity with id " + var0.getString("id"));
      }

      return var2;
   }

   public static Entity a(int var0, cy var1) {
      Entity var2 = null;

      try {
         Class var3 = (Class)c.get(Integer.valueOf(var0));
         if(var3 != null) {
            var2 = (Entity)var3.getConstructor(new Class[]{cy.class}).newInstance(new Object[]{var1});
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      if(var2 == null) {
         System.out.println("Skipping Entity with id " + var0);
      }

      return var2;
   }

   public static int a(Entity var0) {
      return ((Integer)d.get(var0.getClass())).intValue();
   }

   public static String b(Entity var0) {
      return (String)b.get(var0.getClass());
   }

   static {
      a(Arrow.class, "Arrow", 10);
      a(Snowball.class, "Snowball", 11);
      a(DroppedItem.class, "Item", 1);
      a(Painting.class, "Painting", 9);
      a(LivingEntity.class, "Mob", 48);
      a(Monster.class, "Monster", 49);
      a(Creeper.class, "Creeper", 50);
      a(Skeleton.class, "Skeleton", 51);
      a(Spider.class, "Spider", 52);
      a(Giant.class, "Giant", 53);
      a(Zombie.class, "Zombie", 54);
      a(Slime.class, "Slime", 55);
      a(Ghast.class, "Ghast", 56);
      a(PigZombie.class, "PigZombie", 57);
      a(Pig.class, "Pig", 90);
      a(Sheep.class, "Sheep", 91);
      a(Cow.class, "Cow", 92);
      a(Chicken.class, "Chicken", 93);
      a(PrimedTNT.class, "PrimedTnt", 20);
      a(FallingSand.class, "FallingSand", 21);
      a(Minecart.class, "Minecart", 40);
      a(Boat.class, "Boat", 41);
   }
}
