package mojang;

import mojang.entity.Entity;
import mojang.entity.LivingEntity;
import mojang.tags.CompoundTag;

import java.io.IOException;
import java.util.List;

public class az extends Entity {

   private int e = -1;
   private int f = -1;
   private int g = -1;
   private int h = 0;
   private boolean i = false;
   public int a = 0;
   private LivingEntity j;
   private int k;
   private int l = 0;
   public double b;
   public double c;
   public double d;


   public az(cy var1) {
      super(var1);
      this.a(1.0F, 1.0F);
   }

   public boolean a(double var1) {
      double var3 = this.aG.b() * 4.0D;
      var3 *= 64.0D;
      return var1 < var3 * var3;
   }

   public az(cy var1, LivingEntity var2, double var3, double var5, double var7) {
      super(var1);
      this.j = var2;
      this.a(1.0F, 1.0F);
      this.c(var2.aw, var2.ax, var2.ay, var2.aC, var2.aD);
      this.b(this.aw, this.ax, this.ay);
      this.aO = 0.0F;
      this.az = this.aA = this.aB = 0.0D;
      var3 += this.bd.nextGaussian() * 0.4D;
      var5 += this.bd.nextGaussian() * 0.4D;
      var7 += this.bd.nextGaussian() * 0.4D;
      double var9 = (double)fi.a(var3 * var3 + var5 * var5 + var7 * var7);
      this.b = var3 / var9 * 0.1D;
      this.c = var5 / var9 * 0.1D;
      this.d = var7 / var9 * 0.1D;
   }

   public void e_() throws IOException {
      super.e_();
      this.bg = 10;
      if(this.a > 0) {
         --this.a;
      }

      if(this.i) {
         int var1 = this.as.a(this.e, this.f, this.g);
         if(var1 == this.h) {
            ++this.k;
            if(this.k == 1200) {
               this.J();
            }

            return;
         }

         this.i = false;
         this.az *= (double)(this.bd.nextFloat() * 0.2F);
         this.aA *= (double)(this.bd.nextFloat() * 0.2F);
         this.aB *= (double)(this.bd.nextFloat() * 0.2F);
         this.k = 0;
         this.l = 0;
      } else {
         ++this.l;
      }

      ao var15 = mojang.ao.b(this.aw, this.ax, this.ay);
      ao var2 = mojang.ao.b(this.aw + this.az, this.ax + this.aA, this.ay + this.aB);
      nx var3 = this.as.a(var15, var2);
      var15 = mojang.ao.b(this.aw, this.ax, this.ay);
      var2 = mojang.ao.b(this.aw + this.az, this.ax + this.aA, this.ay + this.aB);
      if(var3 != null) {
         var2 = mojang.ao.b(var3.f.a, var3.f.b, var3.f.c);
      }

      Entity var4 = null;
      List var5 = this.as.b((Entity)this, this.aG.a(this.az, this.aA, this.aB).b(1.0D, 1.0D, 1.0D));
      double var6 = 0.0D;

      for(int var8 = 0; var8 < var5.size(); ++var8) {
         Entity var9 = (Entity)var5.get(var8);
         if(var9.n_() && (var9 != this.j || this.l >= 25)) {
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

      if(var3 != null) {
         if(var3.g != null && var3.g.a(this.j, 0)) {
            ;
         }

         this.as.a((Entity)null, this.aw, this.ax, this.ay, 1.0F, true);
         this.J();
      }

      this.aw += this.az;
      this.ax += this.aA;
      this.ay += this.aB;
      float var16 = fi.a(this.az * this.az + this.aB * this.aB);
      this.aC = (float)(Math.atan2(this.az, this.aB) * 180.0D / 3.1415927410125732D);

      for(this.aD = (float)(Math.atan2(this.aA, (double)var16) * 180.0D / 3.1415927410125732D); this.aD - this.aF < -180.0F; this.aF -= 360.0F) {
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
      float var17 = 0.95F;
      if(this.h_()) {
         for(int var18 = 0; var18 < 4; ++var18) {
            float var19 = 0.25F;
            this.as.a("bubble", this.aw - this.az * (double)var19, this.ax - this.aA * (double)var19, this.ay - this.aB * (double)var19, this.az, this.aA, this.aB);
         }

         var17 = 0.8F;
      }

      this.az += this.b;
      this.aA += this.c;
      this.aB += this.d;
      this.az *= (double)var17;
      this.aA *= (double)var17;
      this.aB *= (double)var17;
      this.as.a("smoke", this.aw, this.ax + 0.5D, this.ay, 0.0D, 0.0D, 0.0D);
      this.b(this.aw, this.ax, this.ay);
   }

   public void a(CompoundTag var1) {
      var1.putShortTag("xTile", (short)this.e);
      var1.putShortTag("yTile", (short)this.f);
      var1.putShortTag("zTile", (short)this.g);
      var1.putByteTag("inTile", (byte)this.h);
      var1.putByteTag("shake", (byte)this.a);
      var1.putByteTag("inGround", (byte)(this.i?1:0));
   }

   public void b(CompoundTag var1) {
      this.e = var1.getShort("xTile");
      this.f = var1.getShort("yTile");
      this.g = var1.getShort("zTile");
      this.h = var1.getByte("inTile") & 255;
      this.a = var1.getByte("shake") & 255;
      this.i = var1.getByte("inGround") == 1;
   }

   public boolean n_() {
      return true;
   }

   public float k_() {
      return 1.0F;
   }

   public boolean a(Entity var1, int var2) {
      this.M();
      if(var1 != null) {
         ao var3 = var1.I();
         if(var3 != null) {
            this.az = var3.a;
            this.aA = var3.b;
            this.aB = var3.c;
            this.b = this.az * 0.1D;
            this.c = this.aA * 0.1D;
            this.d = this.aB * 0.1D;
         }

         return true;
      } else {
         return false;
      }
   }

   public float i_() {
      return 0.0F;
   }
}
