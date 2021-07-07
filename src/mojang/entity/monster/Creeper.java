package mojang.entity.monster;

import mojang.cy;
import mojang.dx;
import mojang.entity.Entity;
import mojang.tags.CompoundTag;

import java.io.IOException;

public class Creeper extends Monster {

   int a;
   int b;
   int c = 30;
   int d = -1;
   int e = -1;


   public Creeper(cy var1) {
      super(var1);
      this.image = "/mojang/mob/creeper.png";
   }

   public void a(CompoundTag var1) {
      super.a(var1);
   }

   public void b(CompoundTag var1) {
      super.b(var1);
   }

   public void a(byte var1) {
      super.a(var1);
      if(var1 == 4) {
         if(this.a == 0) {
            this.as.a(this, "random.fuse", 1.0F, 0.5F);
         }

         this.d = 1;
      }

      if(var1 == 5) {
         this.d = -1;
      }

   }

   public void e_() throws IOException {
      this.b = this.a;
      if(this.as.z) {
         this.a += this.d;
         if(this.a < 0) {
            this.a = 0;
         }

         if(this.a >= this.c) {
            this.a = this.c;
         }
      }

      super.e_();
   }

   protected void b_() {
      if(this.e != this.d) {
         this.e = this.d;
         if(this.d > 0) {
            this.as.a(this, (byte)4);
         } else {
            this.as.a(this, (byte)5);
         }
      }

      this.b = this.a;
      if(this.as.z) {
         super.b_();
      } else {
         if(this.a > 0 && this.d < 0) {
            --this.a;
         }

         if(this.d >= 0) {
            this.d = 2;
         }

         super.b_();
         if(this.d != 1) {
            this.d = -1;
         }
      }

   }

   protected String f_() {
      return "mob.creeper";
   }

   protected String f() {
      return "mob.creeperdeath";
   }

   public void b(Entity var1) {
      super.b(var1);
      if(var1 instanceof Skeleton) {
         this.b(dx.aU.aW + this.bd.nextInt(2), 1);
      }

   }

   protected void a(Entity var1, float var2) {
      if(this.d <= 0 && var2 < 3.0F || this.d > 0 && var2 < 7.0F) {
         if(this.a == 0) {
            this.as.a(this, "random.fuse", 1.0F, 0.5F);
         }

         this.d = 1;
         ++this.a;
         if(this.a == this.c) {
            this.as.a(this, this.aw, this.ax, this.ay, 3.0F);
            this.J();
         }

         this.h = true;
      }

   }

   public float b(float var1) {
      return ((float)this.b + (float)(this.a - this.b) * var1) / (float)(this.c - 2);
   }

   protected int g_() {
      return dx.K.aW;
   }
}
