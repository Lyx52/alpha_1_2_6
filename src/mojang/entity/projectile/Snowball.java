package mojang.entity.projectile;

import mojang.*;
import mojang.entity.Entity;
import mojang.entity.LivingEntity;
import mojang.tags.CompoundTag;
import mojang.world.World;

import java.io.IOException;
import java.util.List;

public class Snowball extends Entity {

   private int b = -1;
   private int c = -1;
   private int d = -1;
   private int e = 0;
   private boolean f = false;
   public int a = 0;
   private LivingEntity g;
   private int h;
   private int i = 0;


   public Snowball(World var1) {
      super(var1);
      this.a(0.25F, 0.25F);
   }

   public boolean a(double var1) {
      double var3 = this.aG.b() * 4.0D;
      var3 *= 64.0D;
      return var1 < var3 * var3;
   }

   public Snowball(World var1, LivingEntity var2) {
      super(var1);
      this.g = var2;
      this.a(0.25F, 0.25F);
      this.c(var2.aw, var2.ax + (double)var2.v(), var2.ay, var2.aC, var2.aD);
      this.aw -= (double)(fi.b(this.aC / 180.0F * 3.1415927F) * 0.16F);
      this.ax -= 0.10000000149011612D;
      this.ay -= (double)(fi.a(this.aC / 180.0F * 3.1415927F) * 0.16F);
      this.b(this.aw, this.ax, this.ay);
      this.aO = 0.0F;
      float var3 = 0.4F;
      this.az = (double)(-fi.a(this.aC / 180.0F * 3.1415927F) * fi.b(this.aD / 180.0F * 3.1415927F) * var3);
      this.aB = (double)(fi.b(this.aC / 180.0F * 3.1415927F) * fi.b(this.aD / 180.0F * 3.1415927F) * var3);
      this.aA = (double)(-fi.a(this.aD / 180.0F * 3.1415927F) * var3);
      this.a(this.az, this.aA, this.aB, 1.5F, 1.0F);
   }

   public Snowball(World var1, double var2, double var4, double var6) {
      super(var1);
      this.h = 0;
      this.a(0.25F, 0.25F);
      this.b(var2, var4, var6);
      this.aO = 0.0F;
   }

   public void a(double var1, double var3, double var5, float var7, float var8) {
      float var9 = fi.a(var1 * var1 + var3 * var3 + var5 * var5);
      var1 /= (double)var9;
      var3 /= (double)var9;
      var5 /= (double)var9;
      var1 += this.bd.nextGaussian() * 0.007499999832361937D * (double)var8;
      var3 += this.bd.nextGaussian() * 0.007499999832361937D * (double)var8;
      var5 += this.bd.nextGaussian() * 0.007499999832361937D * (double)var8;
      var1 *= (double)var7;
      var3 *= (double)var7;
      var5 *= (double)var7;
      this.az = var1;
      this.aA = var3;
      this.aB = var5;
      float var10 = fi.a(var1 * var1 + var5 * var5);
      this.aE = this.aC = (float)(Math.atan2(var1, var5) * 180.0D / 3.1415927410125732D);
      this.aF = this.aD = (float)(Math.atan2(var3, (double)var10) * 180.0D / 3.1415927410125732D);
      this.h = 0;
   }

   public void a(double var1, double var3, double var5) {
      this.az = var1;
      this.aA = var3;
      this.aB = var5;
      if(this.aF == 0.0F && this.aE == 0.0F) {
         float var7 = fi.a(var1 * var1 + var5 * var5);
         this.aE = this.aC = (float)(Math.atan2(var1, var5) * 180.0D / 3.1415927410125732D);
         this.aF = this.aD = (float)(Math.atan2(var3, (double)var7) * 180.0D / 3.1415927410125732D);
      }

   }

   public void e_() throws IOException {
      this.aV = this.aw;
      this.aW = this.ax;
      this.aX = this.ay;
      super.e_();
      if(this.a > 0) {
         --this.a;
      }

      if(this.f) {
         int var1 = this.as.a(this.b, this.c, this.d);
         if(var1 == this.e) {
            ++this.h;
            if(this.h == 1200) {
               this.J();
            }

            return;
         }

         this.f = false;
         this.az *= (double)(this.bd.nextFloat() * 0.2F);
         this.aA *= (double)(this.bd.nextFloat() * 0.2F);
         this.aB *= (double)(this.bd.nextFloat() * 0.2F);
         this.h = 0;
         this.i = 0;
      } else {
         ++this.i;
      }

      mojang.ao var15 = mojang.ao.b(this.aw, this.ax, this.ay);
      ao var2 = mojang.ao.b(this.aw + this.az, this.ax + this.aA, this.ay + this.aB);
      nx var3 = this.as.a(var15, var2);
      var15 = mojang.ao.b(this.aw, this.ax, this.ay);
      var2 = mojang.ao.b(this.aw + this.az, this.ax + this.aA, this.ay + this.aB);
      if(var3 != null) {
         var2 = mojang.ao.b(var3.f.a, var3.f.b, var3.f.c);
      }

      if(!this.as.z) {
         Entity var4 = null;
         List var5 = this.as.b((Entity)this, this.aG.a(this.az, this.aA, this.aB).b(1.0D, 1.0D, 1.0D));
         double var6 = 0.0D;

         for(int var8 = 0; var8 < var5.size(); ++var8) {
            Entity var9 = (Entity)var5.get(var8);
            if(var9.n_() && (var9 != this.g || this.i >= 5)) {
               float var10 = 0.3F;
               co var11 = var9.aG.b((double)var10, (double)var10, (double)var10);
               nx var12 = var11.a(var15, var2);
               if(var12 != null) {
                  double var13 = var15.c(var12.f);
                  if(var13 < var6 || var6 == 0.0D) {
                     var4 = var9;
                     var6 = var13;
                  }
               }
            }
         }

         if(var4 != null) {
            var3 = new nx(var4);
         }
      }

      if(var3 != null) {
         if(var3.g != null && var3.g.a(this.g, 0)) {
            ;
         }

         for(int var16 = 0; var16 < 8; ++var16) {
            this.as.a("snowballpoof", this.aw, this.ax, this.ay, 0.0D, 0.0D, 0.0D);
         }

         this.J();
      }

      this.aw += this.az;
      this.ax += this.aA;
      this.ay += this.aB;
      float var17 = fi.a(this.az * this.az + this.aB * this.aB);
      this.aC = (float)(Math.atan2(this.az, this.aB) * 180.0D / 3.1415927410125732D);

      for(this.aD = (float)(Math.atan2(this.aA, (double)var17) * 180.0D / 3.1415927410125732D); this.aD - this.aF < -180.0F; this.aF -= 360.0F) {
         ;
      }

      while(this.aD - this.aF >= 180.0F) {
         this.aF += 360.0F;
      }

      while(this.aC - this.aE < -180.0F) {
         this.aE -= 360.0F;
      }

      while(this.aC - this.aE >= 180.0F) {
         this.aE += 360.0F;
      }

      this.aD = this.aF + (this.aD - this.aF) * 0.2F;
      this.aC = this.aE + (this.aC - this.aE) * 0.2F;
      float var18 = 0.99F;
      float var19 = 0.03F;
      if(this.h_()) {
         for(int var7 = 0; var7 < 4; ++var7) {
            float var20 = 0.25F;
            this.as.a("bubble", this.aw - this.az * (double)var20, this.ax - this.aA * (double)var20, this.ay - this.aB * (double)var20, this.az, this.aA, this.aB);
         }

         var18 = 0.8F;
      }

      this.az *= (double)var18;
      this.aA *= (double)var18;
      this.aB *= (double)var18;
      this.aA -= (double)var19;
      this.b(this.aw, this.ax, this.ay);
   }

   public void a(CompoundTag var1) {
      var1.putShortTag("xTile", (short)this.b);
      var1.putShortTag("yTile", (short)this.c);
      var1.putShortTag("zTile", (short)this.d);
      var1.putByteTag("inTile", (byte)this.e);
      var1.putByteTag("shake", (byte)this.a);
      var1.putByteTag("inGround", (byte)(this.f?1:0));
   }

   public void b(CompoundTag var1) {
      this.b = var1.getShort("xTile");
      this.c = var1.getShort("yTile");
      this.d = var1.getShort("zTile");
      this.e = var1.getByte("inTile") & 255;
      this.a = var1.getByte("shake") & 255;
      this.f = var1.getByte("inGround") == 1;
   }

   public void b(eb var1) {
      if(this.f && this.g == var1 && this.a <= 0 && var1.e.a(new fp(Item.j.aW, 1))) {
         this.as.a(this, "random.pop", 0.2F, ((this.bd.nextFloat() - this.bd.nextFloat()) * 0.7F + 1.0F) * 2.0F);
         var1.b(this, 1);
         this.J();
      }

   }

   public float i_() {
      return 0.0F;
   }
}
