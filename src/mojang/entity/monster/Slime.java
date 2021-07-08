package mojang.entity.monster;

import mojang.*;
import mojang.entity.Entity;
import mojang.entity.LivingEntity;
import mojang.entity.NullInterface;
import mojang.tags.CompoundTag;
import mojang.world.World;

import java.io.IOException;

public class Slime extends LivingEntity implements NullInterface {

   public float a;
   public float b;
   private int d = 0;
   public int c = 1;


   public Slime(World var1) {
      super(var1);
      this.image = "/mojang/assets/mob/slime.png";
      this.c = 1 << this.bd.nextInt(3);
      this.aO = 0.0F;
      this.d = this.bd.nextInt(20) + 10;
      this.d(this.c);
   }

   public void d(int var1) {
      this.c = var1;
      this.a(0.6F * (float)var1, 0.6F * (float)var1);
      this.J = var1 * var1;
      this.b(this.aw, this.ax, this.ay);
   }

   public void a(CompoundTag var1) {
      super.a(var1);
      var1.putIntegerTag("Size", this.c - 1);
   }

   public void b(CompoundTag var1) {
      super.b(var1);
      this.c = var1.getInteger("Size") + 1;
   }

   public void e_() throws IOException {
      this.b = this.a;
      boolean var1 = this.aH;
      super.e_();
      if(this.aH && !var1) {
         for(int var2 = 0; var2 < this.c * 8; ++var2) {
            float var3 = this.bd.nextFloat() * 3.1415927F * 2.0F;
            float var4 = this.bd.nextFloat() * 0.5F + 0.5F;
            float var5 = fi.a(var3) * (float)this.c * 0.5F * var4;
            float var6 = fi.b(var3) * (float)this.c * 0.5F * var4;
            this.as.a("slime", this.aw + (double)var5, this.aG.b, this.ay + (double)var6, 0.0D, 0.0D, 0.0D);
         }

         if(this.c > 2) {
            this.as.a(this, "mob.slime", this.h(), ((this.bd.nextFloat() - this.bd.nextFloat()) * 0.2F + 1.0F) / 0.8F);
         }

         this.a = -0.5F;
      }

      this.a *= 0.6F;
   }

   protected void b_() {
      eb var1 = this.as.a(this, 16.0D);
      if(var1 != null) {
         this.b(var1, 10.0F);
      }

      if(this.aH && this.d-- <= 0) {
         this.d = this.bd.nextInt(20) + 10;
         if(var1 != null) {
            this.d /= 3;
         }

         this.ak = true;
         if(this.c > 1) {
            this.as.a(this, "mob.slime", this.h(), ((this.bd.nextFloat() - this.bd.nextFloat()) * 0.2F + 1.0F) * 0.8F);
         }

         this.a = 1.0F;
         this.ah = 1.0F - this.bd.nextFloat() * 2.0F;
         this.ai = (float)(1 * this.c);
      } else {
         this.ak = false;
         if(this.aH) {
            this.ah = this.ai = 0.0F;
         }
      }

   }

   public void J() {
      if(this.c > 1 && this.J == 0) {
         for(int var1 = 0; var1 < 4; ++var1) {
            float var2 = ((float)(var1 % 2) - 0.5F) * (float)this.c / 4.0F;
            float var3 = ((float)(var1 / 2) - 0.5F) * (float)this.c / 4.0F;
            Slime var4 = new Slime(this.as);
            var4.d(this.c / 2);
            var4.c(this.aw + (double)var2, this.ax + 0.5D, this.ay + (double)var3, this.bd.nextFloat() * 360.0F, 0.0F);
            this.as.a((Entity)var4);
         }
      }

      super.J();
   }

   public void b(eb var1) {
      if(this.c > 1 && this.d(var1) && (double)this.e(var1) < 0.6D * (double)this.c && var1.a(this, this.c)) {
         this.as.a(this, "mob.slimeattack", 1.0F, (this.bd.nextFloat() - this.bd.nextFloat()) * 0.2F + 1.0F);
      }

   }

   protected String f_() {
      return "mob.slime";
   }

   protected String f() {
      return "mob.slime";
   }

   protected int g_() {
      return this.c == 1? Item.aK.aW:0;
   }

   public boolean a() {
      ha var1 = this.as.b(fi.b(this.aw), fi.b(this.ay));
      return (this.c == 1 || this.as.k > 0) && this.bd.nextInt(10) == 0 && var1.a(987234911L).nextInt(10) == 0 && this.ax < 16.0D;
   }

   protected float h() {
      return 0.6F;
   }
}
