package mojang.entity.monster;

import mojang.*;
import mojang.entity.Entity;
import mojang.entity.NullInterface;

public class Ghast extends ot implements NullInterface {

   public int a = 0;
   public double b;
   public double c;
   public double d;
   private Entity g = null;
   private int h = 0;
   public int e = 0;
   public int f = 0;


   public Ghast(cy var1) {
      super(var1);
      this.image = "/mojang/mob/ghast.png";
      this.a(4.0F, 4.0F);
      this.bm = true;
   }

   protected void b_() {
      if(this.as.k == 0) {
         this.J();
      }

      this.e = this.f;
      double var1 = this.b - this.aw;
      double var3 = this.c - this.ax;
      double var5 = this.d - this.ay;
      double var7 = (double) fi.a(var1 * var1 + var3 * var3 + var5 * var5);
      if(var7 < 1.0D || var7 > 60.0D) {
         this.b = this.aw + (double)((this.bd.nextFloat() * 2.0F - 1.0F) * 16.0F);
         this.c = this.ax + (double)((this.bd.nextFloat() * 2.0F - 1.0F) * 16.0F);
         this.d = this.ay + (double)((this.bd.nextFloat() * 2.0F - 1.0F) * 16.0F);
      }

      if(this.a-- <= 0) {
         this.a += this.bd.nextInt(5) + 2;
         if(this.a(this.b, this.c, this.d, var7)) {
            this.az += var1 / var7 * 0.1D;
            this.aA += var3 / var7 * 0.1D;
            this.aB += var5 / var7 * 0.1D;
         } else {
            this.b = this.aw;
            this.c = this.ax;
            this.d = this.ay;
         }
      }

      if(this.g != null && this.g.aN) {
         this.g = null;
      }

      if(this.g == null || this.h-- <= 0) {
         this.g = this.as.a(this, 100.0D);
         if(this.g != null) {
            this.h = 20;
         }
      }

      double var9 = 64.0D;
      if(this.g != null && this.g.f(this) < var9 * var9) {
         double var11 = this.g.aw - this.aw;
         double var13 = this.g.aG.b + (double)(this.g.aQ / 2.0F) - (this.ax + (double)(this.aQ / 2.0F));
         double var15 = this.g.ay - this.ay;
         this.s = this.aC = -((float)Math.atan2(var11, var15)) * 180.0F / 3.1415927F;
         if(this.d(this.g)) {
            if(this.f == 10) {
               this.as.a(this, "mob.ghast.charge", this.h(), (this.bd.nextFloat() - this.bd.nextFloat()) * 0.2F + 1.0F);
            }

            ++this.f;
            if(this.f == 20) {
               this.as.a(this, "mob.ghast.fireball", this.h(), (this.bd.nextFloat() - this.bd.nextFloat()) * 0.2F + 1.0F);
               mojang.az var17 = new az(this.as, this, var11, var13, var15);
               double var18 = 4.0D;
               mojang.ao var20 = this.f(1.0F);
               var17.aw = this.aw + var20.a * var18;
               var17.ax = this.ax + (double)(this.aQ / 2.0F) + 0.5D;
               var17.ay = this.ay + var20.c * var18;
               this.as.a((Entity)var17);
               this.f = -40;
            }
         } else if(this.f > 0) {
            --this.f;
         }
      } else {
         this.s = this.aC = -((float)Math.atan2(this.az, this.aB)) * 180.0F / 3.1415927F;
         if(this.f > 0) {
            --this.f;
         }
      }

      this.image = this.f > 10? "/mojang/mob/ghast_fire.png" : "/mojang/mob/ghast.png";
   }

   private boolean a(double var1, double var3, double var5, double var7) {
      double var9 = (this.b - this.aw) / var7;
      double var11 = (this.c - this.ax) / var7;
      double var13 = (this.d - this.ay) / var7;
      co var15 = this.aG.c();

      for(int var16 = 1; (double)var16 < var7; ++var16) {
         var15.d(var9, var11, var13);
         if(this.as.a((Entity)this, var15).size() > 0) {
            return false;
         }
      }

      return true;
   }

   protected String d() {
      return "mob.ghast.moan";
   }

   protected String f_() {
      return "mob.ghast.scream";
   }

   protected String f() {
      return "mob.ghast.death";
   }

   protected int g_() {
      return dx.K.aW;
   }

   protected float h() {
      return 10.0F;
   }

   public boolean a() {
      return this.bd.nextInt(20) == 0 && super.a() && this.as.k > 0;
   }

   public int i() {
      return 1;
   }
}
