package mojang;

import mojang.entity.Entity;
import mojang.world.World;

import java.io.IOException;

public class ps extends eb {

   private int b;
   private double c;
   private double d;
   private double bx;
   private double by;
   private double bz;
   float a = 0.0F;


   public ps(World var1, String var2) {
      super(var1);
      this.l = var2;
      this.aO = 0.0F;
      this.aZ = 0.0F;
      if(var2 != null && var2.length() > 0) {
         this.bl = "http://www.minecraft.net/skin/" + var2 + ".png";
         System.out.println("Loading texture " + this.bl);
      }

      this.ba = true;
      this.ao = 10.0D;
   }

   public boolean a(Entity var1, int var2) {
      return true;
   }

   public void a(double var1, double var3, double var5, float var7, float var8, int var9) {
      this.aO = 0.0F;
      this.c = var1;
      this.d = var3;
      this.bx = var5;
      this.by = (double)var7;
      this.bz = (double)var8;
      this.b = var9;
   }

   public void e_() throws IOException {
      super.e_();
      this.V = this.W;
      double var1 = this.aw - this.at;
      double var3 = this.ay - this.av;
      float var5 = fi.a(var1 * var1 + var3 * var3) * 4.0F;
      if(var5 > 1.0F) {
         var5 = 1.0F;
      }

      this.W += (var5 - this.W) * 0.4F;
      this.X += this.W;
   }

   public float i_() {
      return 0.0F;
   }

   public void k() {
      super.b_();
      if(this.b > 0) {
         double var1 = this.aw + (this.c - this.aw) / (double)this.b;
         double var3 = this.ax + (this.d - this.ax) / (double)this.b;
         double var5 = this.ay + (this.bx - this.ay) / (double)this.b;

         double var7;
         for(var7 = this.by - (double)this.aC; var7 < -180.0D; var7 += 360.0D) {
            ;
         }

         while(var7 >= 180.0D) {
            var7 -= 360.0D;
         }

         this.aC = (float)((double)this.aC + var7 / (double)this.b);
         this.aD = (float)((double)this.aD + (this.bz - (double)this.aD) / (double)this.b);
         --this.b;
         this.b(var1, var3, var5);
         this.c(this.aC, this.aD);
      }

      this.h = this.i;
      float var9 = fi.a(this.az * this.az + this.aB * this.aB);
      float var2 = (float)Math.atan(-this.aA * 0.20000000298023224D) * 15.0F;
      if(var9 > 0.1F) {
         var9 = 0.1F;
      }

      if(!this.aH || this.J <= 0) {
         var9 = 0.0F;
      }

      if(this.aH || this.J <= 0) {
         var2 = 0.0F;
      }

      this.i += (var9 - this.i) * 0.4F;
      this.R += (var2 - this.R) * 0.8F;
   }

   public boolean p() {
      return this.bw;
   }
}
