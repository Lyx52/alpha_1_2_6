package mojang.entity.animal;

import mojang.world.World;
import mojang.Item;
import mojang.eb;
import mojang.tags.CompoundTag;

public class Pig extends Animal {

   public boolean a = false;


   public Pig(World var1) {
      super(var1);
      this.image = "/mojang/assets/mob/pig.png";
      this.a(0.9F, 0.9F);
      this.a = false;
   }

   public void a(CompoundTag var1) {
      super.a(var1);
      var1.putBooleanTag("Saddle", this.a);
   }

   public void b(CompoundTag var1) {
      super.b(var1);
      this.a = var1.getBoolean("Saddle");
   }

   protected String d() {
      return "mob.pig";
   }

   protected String f_() {
      return "mob.pig";
   }

   protected String f() {
      return "mob.pigdeath";
   }

   public boolean a(eb var1) {
      if(this.a) {
         var1.h(this);
         return true;
      } else {
         return false;
      }
   }

   protected int g_() {
      return Item.ao.aW;
   }
}
