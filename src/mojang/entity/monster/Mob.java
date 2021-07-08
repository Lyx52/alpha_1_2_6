package mojang.entity.monster;

import mojang.world.World;
import mojang.entity.Entity;
import mojang.entity.LivingEntity;
import mojang.fi;

public class Mob extends LivingEntity {

   private mojang.bt a;
   protected Entity g;
   protected boolean h = false;


   public Mob(World var1) {
      super(var1);
   }

   protected void b_() {
      this.h = false;
      float var1 = 16.0F;
      if(this.g == null) {
         this.g = this.c_();
         if(this.g != null) {
            this.a = this.as.a(this, this.g, var1);
         }
      } else if(!this.g.E()) {
         this.g = null;
      } else {
         float var2 = this.g.e((Entity)this);
         if(this.d(this.g)) {
            this.a(this.g, var2);
         }
      }

      if(!this.h && this.g != null && (this.a == null || this.bd.nextInt(20) == 0)) {
         this.a = this.as.a(this, this.g, var1);
      } else if(this.a == null && this.bd.nextInt(80) == 0 || this.bd.nextInt(80) == 0) {
         boolean var21 = false;
         int var3 = -1;
         int var4 = -1;
         int var5 = -1;
         float var6 = -99999.0F;

         for(int var7 = 0; var7 < 10; ++var7) {
            int var8 = fi.b(this.aw + (double)this.bd.nextInt(13) - 6.0D);
            int var9 = fi.b(this.ax + (double)this.bd.nextInt(7) - 3.0D);
            int var10 = fi.b(this.ay + (double)this.bd.nextInt(13) - 6.0D);
            float var11 = this.a(var8, var9, var10);
            if(var11 > var6) {
               var6 = var11;
               var3 = var8;
               var4 = var9;
               var5 = var10;
               var21 = true;
            }
         }

         if(var21) {
            this.a = this.as.a(this, var3, var4, var5, 10.0F);
         }
      }

      int var22 = fi.b(this.aG.b);
      boolean var23 = this.h_();
      boolean var24 = this.L();
      this.aD = 0.0F;
      if(this.a != null && this.bd.nextInt(100) != 0) {
         mojang.ao var25 = this.a.a(this);
         double var26 = (double)(this.aP * 2.0F);

         while(var25 != null && var25.d(this.aw, var25.b, this.ay) < var26 * var26) {
            this.a.a();
            if(this.a.b()) {
               var25 = null;
               this.a = null;
            } else {
               var25 = this.a.a(this);
            }
         }

         this.ak = false;
         if(var25 != null) {
            double var27 = var25.a - this.aw;
            double var28 = var25.c - this.ay;
            double var12 = var25.b - (double)var22;
            float var14 = (float)(Math.atan2(var28, var27) * 180.0D / 3.1415927410125732D) - 90.0F;
            float var15 = var14 - this.aC;

            for(this.ai = this.am; var15 < -180.0F; var15 += 360.0F) {
               ;
            }

            while(var15 >= 180.0F) {
               var15 -= 360.0F;
            }

            if(var15 > 30.0F) {
               var15 = 30.0F;
            }

            if(var15 < -30.0F) {
               var15 = -30.0F;
            }

            this.aC += var15;
            if(this.h && this.g != null) {
               double var16 = this.g.aw - this.aw;
               double var18 = this.g.ay - this.ay;
               float var20 = this.aC;
               this.aC = (float)(Math.atan2(var18, var16) * 180.0D / 3.1415927410125732D) - 90.0F;
               var15 = (var20 - this.aC + 90.0F) * 3.1415927F / 180.0F;
               this.ah = -fi.a(var15) * this.ai * 1.0F;
               this.ai = fi.b(var15) * this.ai * 1.0F;
            }

            if(var12 > 0.0D) {
               this.ak = true;
            }
         }

         if(this.g != null) {
            this.b(this.g, 30.0F);
         }

         if(this.aI) {
            this.ak = true;
         }

         if(this.bd.nextFloat() < 0.8F && (var23 || var24)) {
            this.ak = true;
         }

      } else {
         super.b_();
         this.a = null;
      }
   }

   protected void a(Entity var1, float var2) {}

   protected float a(int var1, int var2, int var3) {
      return 0.0F;
   }

   protected Entity c_() {
      return null;
   }

   public boolean a() {
      int var1 = fi.b(this.aw);
      int var2 = fi.b(this.aG.b);
      int var3 = fi.b(this.ay);
      return super.a() && this.a(var1, var2, var3) >= 0.0F;
   }
}
