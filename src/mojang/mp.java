package mojang;

import mojang.entity.item.DroppedItem;
import mojang.entity.Entity;
import mojang.net.minecraft.client.Minecraft;
import mojang.world.World;

import java.io.IOException;

public class mp extends bq {

   private ib bx;
   private int by = 0;
   private double bz;
   private double bA;
   private double bB;
   private double bC;
   private float bD;
   private float bE;
   private fo bF = new fo((eb)null);
   private boolean bG = false;
   private boolean bH = false;
   private int bI = 0;


   public mp(Minecraft var1, World var2, ea var3, ib var4) {
      super(var1, var2, var3, 0);
      this.bx = var4;
   }

   public boolean a(Entity var1, int var2) {
      return false;
   }

   public void c(int var1) {}

   public void e_() throws IOException {
      if(this.as.d(fi.b(this.aw), 64, fi.b(this.ay))) {
         super.e_();
         this.P();
      }
   }

   public void o() {}

   public void P() {
      if(this.by++ == 20) {
         this.Q();
         this.by = 0;
      }

      boolean var1 = this.p();
      if(var1 != this.bH) {
         if(var1) {
            this.bx.a((BasePacket)(new ii(this, 104)));
         } else {
            this.bx.a((BasePacket)(new ii(this, 105)));
         }

         this.bH = var1;
      }

      double var2 = this.aw - this.bz;
      double var4 = this.aG.b - this.bA;
      double var6 = this.ax - this.bB;
      double var8 = this.ay - this.bC;
      double var10 = (double)(this.aC - this.bD);
      double var12 = (double)(this.aD - this.bE);
      boolean var14 = var4 != 0.0D || var6 != 0.0D || var2 != 0.0D || var8 != 0.0D;
      boolean var15 = var10 != 0.0D || var12 != 0.0D;
      if(this.ar != null) {
         if(var15) {
            this.bx.a((BasePacket)(new t(this.az, -999.0D, -999.0D, this.aB, this.aH)));
         } else {
            this.bx.a((BasePacket)(new cr(this.az, -999.0D, -999.0D, this.aB, this.aC, this.aD, this.aH)));
         }

         var14 = false;
      } else if(var14 && var15) {
         this.bx.a((BasePacket)(new cr(this.aw, this.aG.b, this.ax, this.ay, this.aC, this.aD, this.aH)));
         this.bI = 0;
      } else if(var14) {
         this.bx.a((BasePacket)(new t(this.aw, this.aG.b, this.ax, this.ay, this.aH)));
         this.bI = 0;
      } else if(var15) {
         this.bx.a((BasePacket)(new nz(this.aC, this.aD, this.aH)));
         this.bI = 0;
      } else {
         this.bx.a((BasePacket)(new fa(this.aH)));
         if(this.bG == this.aH && this.bI <= 20) {
            ++this.bI;
         } else {
            this.bI = 0;
         }
      }

      this.bG = this.aH;
      if(var14) {
         this.bz = this.aw;
         this.bA = this.aG.b;
         this.bB = this.ax;
         this.bC = this.ay;
      }

      if(var15) {
         this.bD = this.aC;
         this.bE = this.aD;
      }

   }

   private void Q() {
      if(!this.e.a(this.bF)) {
         this.bx.a((BasePacket)(new p(-1, this.e.a)));
         this.bx.a((BasePacket)(new p(-2, this.e.c)));
         this.bx.a((BasePacket)(new p(-3, this.e.b)));
         this.bF = this.e.i();
      }

   }

   protected void a(DroppedItem var1) {
      id var2 = new id(var1);
      this.bx.a((BasePacket)var2);
      var1.aw = (double)var2.b / 32.0D;
      var1.ax = (double)var2.c / 32.0D;
      var1.ay = (double)var2.d / 32.0D;
      var1.az = (double)var2.e / 128.0D;
      var1.aA = (double)var2.f / 128.0D;
      var1.aB = (double)var2.g / 128.0D;
   }

   public void a(String var1) {
      this.bx.a((BasePacket)(new jr(var1)));
   }

   public void z() {
      super.z();
      this.bx.a((BasePacket)(new ii(this, 1)));
   }

   public void r() {
      this.Q();
      this.bx.a((BasePacket)(new jk()));
   }

   protected void b(int var1) {
      this.J -= var1;
   }
}
