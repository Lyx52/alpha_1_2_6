package mojang.entity.monster;

import mojang.world.World;
import mojang.Item;
import mojang.entity.projectile.Arrow;
import mojang.entity.Entity;
import mojang.fi;
import mojang.fp;
import mojang.tags.CompoundTag;

import java.io.IOException;

public class Skeleton extends Monster {

   private static final fp a = new fp(Item.i, 1);


   public Skeleton(World var1) {
      super(var1);
      this.image = "/mojang/assets/mob/skeleton.png";
   }

   protected String d() {
      return "mob.skeleton";
   }

   protected String f_() {
      return "mob.skeletonhurt";
   }

   protected String f() {
      return "mob.skeletonhurt";
   }

   public void k() throws IOException {
      if(this.as.d()) {
         float var1 = this.a(1.0F);
         if(var1 > 0.5F && this.as.i(fi.b(this.aw), fi.b(this.ax), fi.b(this.ay)) && this.bd.nextFloat() * 30.0F < (var1 - 0.4F) * 2.0F) {
            this.bg = 300;
         }
      }

      super.k();
   }

   protected void a(Entity var1, float var2) {
      if(var2 < 10.0F) {
         double var3 = var1.aw - this.aw;
         double var5 = var1.ay - this.ay;
         if(this.P == 0) {
            Arrow var7 = new Arrow(this.as, this);
            ++var7.ax;
            double var8 = var1.ax - 0.20000000298023224D - var7.ax;
            float var10 = fi.a(var3 * var3 + var5 * var5) * 0.2F;
            this.as.a(this, "random.bow", 1.0F, 1.0F / (this.bd.nextFloat() * 0.4F + 0.8F));
            this.as.a((Entity)var7);
            var7.a(var3, var8 + (double)var10, var5, 0.6F, 12.0F);
            this.P = 30;
         }

         this.aC = (float)(Math.atan2(var5, var3) * 180.0D / 3.1415927410125732D) - 90.0F;
         this.h = true;
      }

   }

   public void a(CompoundTag var1) {
      super.a(var1);
   }

   public void b(CompoundTag var1) {
      super.b(var1);
   }

   protected int g_() {
      return Item.j.aW;
   }

   public fp l() {
      return a;
   }

}
