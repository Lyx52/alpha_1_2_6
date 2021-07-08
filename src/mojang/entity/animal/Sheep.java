package mojang.entity.animal;

import mojang.world.World;
import mojang.entity.item.DroppedItem;
import mojang.entity.Entity;
import mojang.entity.LivingEntity;
import mojang.nq;
import mojang.tags.CompoundTag;

public class Sheep extends Animal {

   public boolean a = false;


   public Sheep(World var1) {
      super(var1);
      this.image = "/mojang/assets/mob/sheep.png";
      this.a(0.9F, 1.3F);
   }

   public boolean a(Entity var1, int var2) {
      if(!this.as.z && !this.a && var1 instanceof LivingEntity) {
         this.a = true;
         int var3 = 1 + this.bd.nextInt(3);

         for(int var4 = 0; var4 < var3; ++var4) {
            DroppedItem var5 = this.a(nq.ab.bh, 1, 1.0F);
            var5.aA += (double)(this.bd.nextFloat() * 0.05F);
            var5.az += (double)((this.bd.nextFloat() - this.bd.nextFloat()) * 0.1F);
            var5.aB += (double)((this.bd.nextFloat() - this.bd.nextFloat()) * 0.1F);
         }
      }

      return super.a(var1, var2);
   }

   public void a(CompoundTag var1) {
      super.a(var1);
      var1.putBooleanTag("Sheared", this.a);
   }

   public void b(CompoundTag var1) {
      super.b(var1);
      this.a = var1.getBoolean("Sheared");
   }

   protected String d() {
      return "mob.sheep";
   }

   protected String f_() {
      return "mob.sheep";
   }

   protected String f() {
      return "mob.sheep";
   }
}
