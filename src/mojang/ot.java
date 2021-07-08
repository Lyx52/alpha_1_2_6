package mojang;

import mojang.entity.LivingEntity;
import mojang.world.World;

public class ot extends LivingEntity {

   public ot(World var1) {
      super(var1);
   }

   protected void c(float var1) {}

   public void b(float var1, float var2) {
      if(this.h_()) {
         this.a(var1, var2, 0.02F);
         this.d(this.az, this.aA, this.aB);
         this.az *= 0.800000011920929D;
         this.aA *= 0.800000011920929D;
         this.aB *= 0.800000011920929D;
      } else if(this.L()) {
         this.a(var1, var2, 0.02F);
         this.d(this.az, this.aA, this.aB);
         this.az *= 0.5D;
         this.aA *= 0.5D;
         this.aB *= 0.5D;
      } else {
         float var3 = 0.91F;
         if(this.aH) {
            var3 = 0.54600006F;
            int var4 = this.as.a(fi.b(this.aw), fi.b(this.aG.b) - 1, fi.b(this.ay));
            if(var4 > 0) {
               var3 = nq.m[var4].bt * 0.91F;
            }
         }

         float var8 = 0.16277136F / (var3 * var3 * var3);
         this.a(var1, var2, this.aH?0.1F * var8:0.02F);
         var3 = 0.91F;
         if(this.aH) {
            var3 = 0.54600006F;
            int var5 = this.as.a(fi.b(this.aw), fi.b(this.aG.b) - 1, fi.b(this.ay));
            if(var5 > 0) {
               var3 = nq.m[var5].bt * 0.91F;
            }
         }

         this.d(this.az, this.aA, this.aB);
         this.az *= (double)var3;
         this.aA *= (double)var3;
         this.aB *= (double)var3;
      }

      this.V = this.W;
      double var10 = this.aw - this.at;
      double var9 = this.ay - this.av;
      float var7 = fi.a(var10 * var10 + var9 * var9) * 4.0F;
      if(var7 > 1.0F) {
         var7 = 1.0F;
      }

      this.W += (var7 - this.W) * 0.4F;
      this.X += this.W;
   }

   public boolean D() {
      return false;
   }
}
