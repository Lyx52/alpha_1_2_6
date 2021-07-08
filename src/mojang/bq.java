package mojang;

import mojang.entity.Entity;
import mojang.entity.LivingEntity;
import mojang.gui.GraphicsUserInterface;
import mojang.net.minecraft.client.Minecraft;
import mojang.tags.CompoundTag;
import mojang.world.World;

import java.io.IOException;

public class bq extends eb {

   public nn a;
   private Minecraft bx;
   public int b = 20;
   private boolean by = false;
   public float c;
   public float d;


   public bq(Minecraft var1, World var2, ea var3, int var4) {
      super(var2);
      this.bx = var1;
      this.m = var4;
      if(var3 != null && var3.b != null && var3.b.length() > 0) {
         this.bl = "http://www.minecraft.net/skin/" + var3.b + ".png";
         System.out.println("Loading texture " + this.bl);
      }

      this.l = var3.b;
   }

   public void b_() {
      super.b_();
      this.ah = this.a.a;
      this.ai = this.a.b;
      this.ak = this.a.d;
   }

   public void k() throws IOException {
      this.d = this.c;
      if(this.by) {
         if(this.c == 0.0F) {
            this.bx.A.a("portal.trigger", 1.0F, this.bd.nextFloat() * 0.4F + 0.8F);
         }

         this.c += 0.0125F;
         if(this.c >= 1.0F) {
            this.c = 1.0F;
            this.b = 10;
            this.bx.A.a("portal.travel", 1.0F, this.bd.nextFloat() * 0.4F + 0.8F);
            this.bx.k();
         }

         this.by = false;
      } else {
         if(this.c > 0.0F) {
            this.c -= 0.05F;
         }

         if(this.c < 0.0F) {
            this.c = 0.0F;
         }
      }

      if(this.b > 0) {
         --this.b;
      }

      this.a.a(this);
      if(this.a.e && this.aY < 0.2F) {
         this.aY = 0.2F;
      }

      super.k();
   }

   public void m_() {
      this.a.a();
   }

   public void a(int var1, boolean var2) {
      this.a.a(var1, var2);
   }

   public void a(CompoundTag var1) {
      super.a(var1);
      var1.putIntegerTag("Score", this.g);
   }

   public void b(CompoundTag var1) {
      super.b(var1);
      this.g = var1.getInteger("Score");
   }

   public void a(hi var1) {
      this.bx.changeGUI((GraphicsUserInterface)(new er(this.e, var1)));
   }

   public void a(qc var1) {
      this.bx.changeGUI((GraphicsUserInterface)(new pv(var1)));
   }

   public void m() {
      this.bx.changeGUI((GraphicsUserInterface)(new jc(this.e)));
   }

   public void a(lt var1) {
      this.bx.changeGUI((GraphicsUserInterface)(new jj(this.e, var1)));
   }

   public void b(Entity var1, int var2) {
      this.bx.h.a((pp)(new cm(this.bx.world, var1, this, -0.5F)));
   }

   public int n() {
      return this.e.f();
   }

   public void a_(Entity var1) {
      if(!var1.a((eb)this)) {
         fp var2 = this.w();
         if(var2 != null && var1 instanceof LivingEntity) {
            var2.b((LivingEntity)var1);
            if(var2.a <= 0) {
               var2.a((eb)this);
               this.x();
            }
         }

      }
   }

   public void a(String var1) {}

   public void o() {}

   public boolean p() {
      return this.a.e;
   }

   public void q() {
      if(this.b > 0) {
         this.b = 10;
      } else {
         this.by = true;
      }
   }

   public void a_(int var1) {
      int var2 = this.J - var1;
      if(var2 <= 0) {
         this.J = var1;
      } else {
         this.af = var2;
         this.K = this.J;
         this.bj = this.o;
         this.b(var2);
         this.L = this.M = 10;
      }

   }

   public void r() throws IOException {
      this.bx.p();
   }
}
