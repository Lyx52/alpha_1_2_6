package mojang;

import mojang.entity.Entity;
import mojang.net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class ku {

   private Minecraft a;
   private fp b = null;
   private float c = 0.0F;
   private float d = 0.0F;
   private bk e = new bk();


   public ku(Minecraft var1) {
      this.a = var1;
   }

   public void a(fp var1) {
      GL11.glPushMatrix();
      if(var1.c < 256 && bk.a(nq.m[var1.c].g())) {
         GL11.glBindTexture(3553, this.a.n.loadTexture("/mojang/terrain.png"));
         this.e.a(nq.m[var1.c]);
      } else {
         if(var1.c < 256) {
            GL11.glBindTexture(3553, this.a.n.loadTexture("/mojang/terrain.png"));
         } else {
            GL11.glBindTexture(3553, this.a.n.loadTexture("/mojang/assets/gui/items.png"));
         }

         is var2 = is.a;
         float var3 = ((float)(var1.b() % 16 * 16) + 0.0F) / 256.0F;
         float var4 = ((float)(var1.b() % 16 * 16) + 15.99F) / 256.0F;
         float var5 = ((float)(var1.b() / 16 * 16) + 0.0F) / 256.0F;
         float var6 = ((float)(var1.b() / 16 * 16) + 15.99F) / 256.0F;
         float var7 = 1.0F;
         float var8 = 0.0F;
         float var9 = 0.3F;
         GL11.glEnable('\u803a');
         GL11.glTranslatef(-var8, -var9, 0.0F);
         float var10 = 1.5F;
         GL11.glScalef(var10, var10, var10);
         GL11.glRotatef(50.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(335.0F, 0.0F, 0.0F, 1.0F);
         GL11.glTranslatef(-0.9375F, -0.0625F, 0.0F);
         float var11 = 0.0625F;
         var2.b();
         var2.b(0.0F, 0.0F, 1.0F);
         var2.a(0.0D, 0.0D, 0.0D, (double)var4, (double)var6);
         var2.a((double)var7, 0.0D, 0.0D, (double)var3, (double)var6);
         var2.a((double)var7, 1.0D, 0.0D, (double)var3, (double)var5);
         var2.a(0.0D, 1.0D, 0.0D, (double)var4, (double)var5);
         var2.a();
         var2.b();
         var2.b(0.0F, 0.0F, -1.0F);
         var2.a(0.0D, 1.0D, (double)(0.0F - var11), (double)var4, (double)var5);
         var2.a((double)var7, 1.0D, (double)(0.0F - var11), (double)var3, (double)var5);
         var2.a((double)var7, 0.0D, (double)(0.0F - var11), (double)var3, (double)var6);
         var2.a(0.0D, 0.0D, (double)(0.0F - var11), (double)var4, (double)var6);
         var2.a();
         var2.b();
         var2.b(-1.0F, 0.0F, 0.0F);

         int var12;
         float var13;
         float var14;
         float var15;
         for(var12 = 0; var12 < 16; ++var12) {
            var13 = (float)var12 / 16.0F;
            var14 = var4 + (var3 - var4) * var13 - 0.001953125F;
            var15 = var7 * var13;
            var2.a((double)var15, 0.0D, (double)(0.0F - var11), (double)var14, (double)var6);
            var2.a((double)var15, 0.0D, 0.0D, (double)var14, (double)var6);
            var2.a((double)var15, 1.0D, 0.0D, (double)var14, (double)var5);
            var2.a((double)var15, 1.0D, (double)(0.0F - var11), (double)var14, (double)var5);
         }

         var2.a();
         var2.b();
         var2.b(1.0F, 0.0F, 0.0F);

         for(var12 = 0; var12 < 16; ++var12) {
            var13 = (float)var12 / 16.0F;
            var14 = var4 + (var3 - var4) * var13 - 0.001953125F;
            var15 = var7 * var13 + 0.0625F;
            var2.a((double)var15, 1.0D, (double)(0.0F - var11), (double)var14, (double)var5);
            var2.a((double)var15, 1.0D, 0.0D, (double)var14, (double)var5);
            var2.a((double)var15, 0.0D, 0.0D, (double)var14, (double)var6);
            var2.a((double)var15, 0.0D, (double)(0.0F - var11), (double)var14, (double)var6);
         }

         var2.a();
         var2.b();
         var2.b(0.0F, 1.0F, 0.0F);

         for(var12 = 0; var12 < 16; ++var12) {
            var13 = (float)var12 / 16.0F;
            var14 = var6 + (var5 - var6) * var13 - 0.001953125F;
            var15 = var7 * var13 + 0.0625F;
            var2.a(0.0D, (double)var15, 0.0D, (double)var4, (double)var14);
            var2.a((double)var7, (double)var15, 0.0D, (double)var3, (double)var14);
            var2.a((double)var7, (double)var15, (double)(0.0F - var11), (double)var3, (double)var14);
            var2.a(0.0D, (double)var15, (double)(0.0F - var11), (double)var4, (double)var14);
         }

         var2.a();
         var2.b();
         var2.b(0.0F, -1.0F, 0.0F);

         for(var12 = 0; var12 < 16; ++var12) {
            var13 = (float)var12 / 16.0F;
            var14 = var6 + (var5 - var6) * var13 - 0.001953125F;
            var15 = var7 * var13;
            var2.a((double)var7, (double)var15, 0.0D, (double)var3, (double)var14);
            var2.a(0.0D, (double)var15, 0.0D, (double)var4, (double)var14);
            var2.a(0.0D, (double)var15, (double)(0.0F - var11), (double)var4, (double)var14);
            var2.a((double)var7, (double)var15, (double)(0.0F - var11), (double)var3, (double)var14);
         }

         var2.a();
         GL11.glDisable('\u803a');
      }

      GL11.glPopMatrix();
   }

   public void a(float var1) {
      float var2 = this.d + (this.c - this.d) * var1;
      bq var3 = this.a.playerName;
      GL11.glPushMatrix();
      GL11.glRotatef(var3.aF + (var3.aD - var3.aF) * var1, 1.0F, 0.0F, 0.0F);
      GL11.glRotatef(var3.aE + (var3.aC - var3.aE) * var1, 0.0F, 1.0F, 0.0F);
      l.b();
      GL11.glPopMatrix();
      float var4 = this.a.world.c(fi.b(var3.aw), fi.b(var3.ax), fi.b(var3.ay));
      GL11.glColor4f(var4, var4, var4, 1.0F);
      fp var5 = this.b;
      if(var3.n != null) {
         var5 = new fp(Item.B.aW);
      }

      float var6;
      float var7;
      float var8;
      float var9;
      if(var5 != null) {
         GL11.glPushMatrix();
         var6 = 0.8F;
         var7 = var3.d(var1);
         var8 = fi.a(var7 * 3.1415927F);
         var9 = fi.a(fi.c(var7) * 3.1415927F);
         GL11.glTranslatef(-var9 * 0.4F, fi.a(fi.c(var7) * 3.1415927F * 2.0F) * 0.2F, -var8 * 0.2F);
         GL11.glTranslatef(0.7F * var6, -0.65F * var6 - (1.0F - var2) * 0.6F, -0.9F * var6);
         GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
         GL11.glEnable('\u803a');
         var7 = var3.d(var1);
         var8 = fi.a(var7 * var7 * 3.1415927F);
         var9 = fi.a(fi.c(var7) * 3.1415927F);
         GL11.glRotatef(-var8 * 20.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(-var9 * 20.0F, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(-var9 * 80.0F, 1.0F, 0.0F, 0.0F);
         var7 = 0.4F;
         GL11.glScalef(var7, var7, var7);
         if(var5.a().b()) {
            GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
         }

         this.a(var5);
         GL11.glPopMatrix();
      } else {
         GL11.glPushMatrix();
         var6 = 0.8F;
         var7 = var3.d(var1);
         var8 = fi.a(var7 * 3.1415927F);
         var9 = fi.a(fi.c(var7) * 3.1415927F);
         GL11.glTranslatef(-var9 * 0.3F, fi.a(fi.c(var7) * 3.1415927F * 2.0F) * 0.4F, -var8 * 0.4F);
         GL11.glTranslatef(0.8F * var6, -0.75F * var6 - (1.0F - var2) * 0.6F, -0.9F * var6);
         GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
         GL11.glEnable('\u803a');
         var7 = var3.d(var1);
         var8 = fi.a(var7 * var7 * 3.1415927F);
         var9 = fi.a(fi.c(var7) * 3.1415927F);
         GL11.glRotatef(var9 * 70.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(-var8 * 20.0F, 0.0F, 0.0F, 1.0F);
         GL11.glBindTexture(3553, this.a.n.a(this.a.playerName.bl, this.a.playerName.A()));
         GL11.glTranslatef(-1.0F, 3.6F, 3.5F);
         GL11.glRotatef(120.0F, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(200.0F, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(-135.0F, 0.0F, 1.0F, 0.0F);
         GL11.glScalef(1.0F, 1.0F, 1.0F);
         GL11.glTranslatef(5.6F, 0.0F, 0.0F);
         aq var10 = mn.a.a((Entity)this.a.playerName);
         ce var11 = (ce)var10;
         var9 = 1.0F;
         GL11.glScalef(var9, var9, var9);
         var11.b();
         GL11.glPopMatrix();
      }

      GL11.glDisable('\u803a');
      l.a();
   }

   public void b(float var1) {
      GL11.glDisable(3008);
      int var2;
      if(this.a.playerName.bg > 0 || this.a.playerName.bv) {
         var2 = this.a.n.loadTexture("/mojang/terrain.png");
         GL11.glBindTexture(3553, var2);
         this.d(var1);
      }

      if(this.a.playerName.O()) {
         var2 = fi.b(this.a.playerName.aw);
         int var3 = fi.b(this.a.playerName.ax);
         int var4 = fi.b(this.a.playerName.ay);
         int var5 = this.a.n.loadTexture("/mojang/terrain.png");
         GL11.glBindTexture(3553, var5);
         int var6 = this.a.world.a(var2, var3, var4);
         if(nq.m[var6] != null) {
            this.a(var1, nq.m[var6].a(2));
         }
      }

      if(this.a.playerName.a(hb.f)) {
         var2 = this.a.n.loadTexture("/mojang/assets/misc/water.png");
         GL11.glBindTexture(3553, var2);
         this.c(var1);
      }

      GL11.glEnable(3008);
   }

   private void a(float var1, int var2) {
      is var3 = is.a;
      this.a.playerName.a(var1);
      float var4 = 0.1F;
      GL11.glColor4f(var4, var4, var4, 0.5F);
      GL11.glPushMatrix();
      float var5 = -1.0F;
      float var6 = 1.0F;
      float var7 = -1.0F;
      float var8 = 1.0F;
      float var9 = -0.5F;
      float var10 = 0.0078125F;
      float var11 = (float)(var2 % 16) / 256.0F - var10;
      float var12 = ((float)(var2 % 16) + 15.99F) / 256.0F + var10;
      float var13 = (float)(var2 / 16) / 256.0F - var10;
      float var14 = ((float)(var2 / 16) + 15.99F) / 256.0F + var10;
      var3.b();
      var3.a((double)var5, (double)var7, (double)var9, (double)var12, (double)var14);
      var3.a((double)var6, (double)var7, (double)var9, (double)var11, (double)var14);
      var3.a((double)var6, (double)var8, (double)var9, (double)var11, (double)var13);
      var3.a((double)var5, (double)var8, (double)var9, (double)var12, (double)var13);
      var3.a();
      GL11.glPopMatrix();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void c(float var1) {
      is var2 = is.a;
      float var3 = this.a.playerName.a(var1);
      GL11.glColor4f(var3, var3, var3, 0.5F);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glPushMatrix();
      float var4 = 4.0F;
      float var5 = -1.0F;
      float var6 = 1.0F;
      float var7 = -1.0F;
      float var8 = 1.0F;
      float var9 = -0.5F;
      float var10 = -this.a.playerName.aC / 64.0F;
      float var11 = this.a.playerName.aD / 64.0F;
      var2.b();
      var2.a((double)var5, (double)var7, (double)var9, (double)(var4 + var10), (double)(var4 + var11));
      var2.a((double)var6, (double)var7, (double)var9, (double)(0.0F + var10), (double)(var4 + var11));
      var2.a((double)var6, (double)var8, (double)var9, (double)(0.0F + var10), (double)(0.0F + var11));
      var2.a((double)var5, (double)var8, (double)var9, (double)(var4 + var10), (double)(0.0F + var11));
      var2.a();
      GL11.glPopMatrix();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(3042);
   }

   private void d(float var1) {
      is var2 = is.a;
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.9F);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      float var3 = 1.0F;

      for(int var4 = 0; var4 < 2; ++var4) {
         GL11.glPushMatrix();
         int var5 = nq.ar.bg + var4 * 16;
         int var6 = (var5 & 15) << 4;
         int var7 = var5 & 240;
         float var8 = (float)var6 / 256.0F;
         float var9 = ((float)var6 + 15.99F) / 256.0F;
         float var10 = (float)var7 / 256.0F;
         float var11 = ((float)var7 + 15.99F) / 256.0F;
         float var12 = (0.0F - var3) / 2.0F;
         float var13 = var12 + var3;
         float var14 = 0.0F - var3 / 2.0F;
         float var15 = var14 + var3;
         float var16 = -0.5F;
         GL11.glTranslatef((float)(-(var4 * 2 - 1)) * 0.24F, -0.3F, 0.0F);
         GL11.glRotatef((float)(var4 * 2 - 1) * 10.0F, 0.0F, 1.0F, 0.0F);
         var2.b();
         var2.a((double)var12, (double)var14, (double)var16, (double)var9, (double)var11);
         var2.a((double)var13, (double)var14, (double)var16, (double)var8, (double)var11);
         var2.a((double)var13, (double)var15, (double)var16, (double)var8, (double)var10);
         var2.a((double)var12, (double)var15, (double)var16, (double)var9, (double)var10);
         var2.a();
         GL11.glPopMatrix();
      }

      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(3042);
   }

   public void a() {
      this.d = this.c;
      bq var1 = this.a.playerName;
      fp var2 = var1.e.a();
      float var4 = 0.4F;
      float var5 = var2 == this.b?1.0F:0.0F;
      float var6 = var5 - this.c;
      if(var6 < -var4) {
         var6 = -var4;
      }

      if(var6 > var4) {
         var6 = var4;
      }

      this.c += var6;
      if(this.c < 0.1F) {
         this.b = var2;
      }

   }

   public void b() {
      this.c = 0.0F;
   }

   public void c() {
      this.c = 0.0F;
   }
}
