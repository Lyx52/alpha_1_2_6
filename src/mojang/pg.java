package mojang;

import mojang.entity.Entity;
import mojang.net.minecraft.client.Minecraft;
import mojang.world.World;

public class pg extends iv {

   private int c = -1;
   private int d = -1;
   private int e = -1;
   private float f = 0.0F;
   private float g = 0.0F;
   private float h = 0.0F;
   private int i = 0;
   private boolean j = false;
   private ib k;
   private int l = 0;


   public pg(Minecraft var1, ib var2) {
      super(var1);
      this.k = var2;
   }

   public void a(eb var1) {
      var1.aC = -180.0F;
   }

   public boolean b(int var1, int var2, int var3, int var4) {
      this.k.a((BasePacket)(new gc(3, var1, var2, var3, var4)));
      int var5 = this.a.world.a(var1, var2, var3);
      this.a.world.e(var1, var2, var3);
      boolean var7 = super.b(var1, var2, var3, var4);
      fp var8 = this.a.playerName.w();
      if(var8 != null) {
         var8.a(var5, var1, var2, var3);
         if(var8.a == 0) {
            var8.a((eb)this.a.playerName);
            this.a.playerName.x();
         }
      }

      return var7;
   }

   public void a(int var1, int var2, int var3, int var4) {
      this.j = true;
      this.k.a((BasePacket)(new gc(0, var1, var2, var3, var4)));
      int var5 = this.a.world.a(var1, var2, var3);
      if(var5 > 0 && this.f == 0.0F) {
         nq.m[var5].b(this.a.world, var1, var2, var3, (eb)this.a.playerName);
      }

      if(var5 > 0 && nq.m[var5].a((eb)this.a.playerName) >= 1.0F) {
         this.b(var1, var2, var3, var4);
      }

   }

   public void a() {
      if(this.j) {
         this.j = false;
         this.k.a((BasePacket)(new gc(2, 0, 0, 0, 0)));
         this.f = 0.0F;
         this.i = 0;
      }
   }

   public void c(int var1, int var2, int var3, int var4) {
      this.j = true;
      this.e();
      this.k.a((BasePacket)(new gc(1, var1, var2, var3, var4)));
      if(this.i > 0) {
         --this.i;
      } else {
         if(var1 == this.c && var2 == this.d && var3 == this.e) {
            int var5 = this.a.world.a(var1, var2, var3);
            if(var5 == 0) {
               return;
            }

            nq var6 = nq.m[var5];
            this.f += var6.a((eb)this.a.playerName);
            if(this.h % 4.0F == 0.0F && var6 != null) {
               this.a.A.b(var6.bq.d(), (float)var1 + 0.5F, (float)var2 + 0.5F, (float)var3 + 0.5F, (var6.bq.b() + 1.0F) / 8.0F, var6.bq.c() * 0.5F);
            }

            ++this.h;
            if(this.f >= 1.0F) {
               this.b(var1, var2, var3, var4);
               this.f = 0.0F;
               this.g = 0.0F;
               this.h = 0.0F;
               this.i = 5;
            }
         } else {
            this.f = 0.0F;
            this.g = 0.0F;
            this.h = 0.0F;
            this.c = var1;
            this.d = var2;
            this.e = var3;
         }

      }
   }

   public void a(float var1) {
      if(this.f <= 0.0F) {
         this.a.u.b = 0.0F;
         this.a.f.i = 0.0F;
      } else {
         float var2 = this.g + (this.f - this.g) * var1;
         this.a.u.b = var2;
         this.a.f.i = var2;
      }

   }

   public float b() {
      return 4.0F;
   }

   public void a(World var1) {
      super.a(var1);
   }

   public void c() {
      this.e();
      this.g = this.f;
      this.a.A.c();
   }

   private void e() {
      fp var1 = this.a.playerName.e.a();
      int var2 = 0;
      if(var1 != null) {
         var2 = var1.c;
      }

      if(var2 != this.l) {
         this.l = var2;
         this.k.a((BasePacket)(new eq(0, this.l)));
      }

   }

   public boolean a(eb var1, World var2, fp var3, int var4, int var5, int var6, int var7) {
      this.e();
      this.k.a((BasePacket)(new ed(var3 != null?var3.c:-1, var4, var5, var6, var7)));
      return super.a(var1, var2, var3, var4, var5, var6, var7);
   }

   public boolean a(eb var1, World var2, fp var3) {
      this.e();
      this.k.a((BasePacket)(new ed(var3 != null?var3.c:-1, -1, -1, -1, 255)));
      return super.a(var1, var2, var3);
   }

   public eb b(World var1) {
      return new mp(this.a, var1, this.a.i, this.k);
   }

   public void b(eb var1, Entity var2) {
      this.e();
      this.k.a((BasePacket)(new a(var1.an, var2.an, 1)));
      var1.c(var2);
   }

   public void a(eb var1, Entity var2) {
      this.e();
      this.k.a((BasePacket)(new a(var1.an, var2.an, 0)));
      var1.a_(var2);
   }
}
