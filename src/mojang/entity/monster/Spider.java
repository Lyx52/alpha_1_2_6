package mojang.entity.monster;

import mojang.world.World;
import mojang.Item;
import mojang.entity.Entity;
import mojang.fi;
import mojang.tags.CompoundTag;

public class Spider extends Monster {

   public Spider(World var1) {
      super(var1);
      this.image = "/mojang/assets/mob/spider.png";
      this.a(1.4F, 0.9F);
      this.am = 0.8F;
   }

   public double j() {
      return (double)this.aQ * 0.75D - 0.5D;
   }

   protected Entity c_() {
      float var1 = this.a(1.0F);
      if(var1 < 0.5F) {
         double var2 = 16.0D;
         return this.as.a(this, var2);
      } else {
         return null;
      }
   }

   protected String d() {
      return "mob.spider";
   }

   protected String f_() {
      return "mob.spider";
   }

   protected String f() {
      return "mob.spiderdeath";
   }

   protected void a(Entity var1, float var2) {
      float var3 = this.a(1.0F);
      if(var3 > 0.5F && this.bd.nextInt(100) == 0) {
         this.g = null;
      } else {
         if(var2 > 2.0F && var2 < 6.0F && this.bd.nextInt(10) == 0) {
            if(this.aH) {
               double var4 = var1.aw - this.aw;
               double var6 = var1.ay - this.ay;
               float var8 = fi.a(var4 * var4 + var6 * var6);
               this.az = var4 / (double)var8 * 0.5D * 0.800000011920929D + this.az * 0.20000000298023224D;
               this.aB = var6 / (double)var8 * 0.5D * 0.800000011920929D + this.aB * 0.20000000298023224D;
               this.aA = 0.4000000059604645D;
            }
         } else {
            super.a(var1, var2);
         }

      }
   }

   public void a(CompoundTag var1) {
      super.a(var1);
   }

   public void b(CompoundTag var1) {
      super.b(var1);
   }

   protected int g_() {
      return Item.I.aW;
   }
}
