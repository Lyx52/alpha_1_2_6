package mojang;

import java.util.Random;

import mojang.entity.item.DroppedItem;
import mojang.entity.Entity;
import org.lwjgl.opengl.GL11;

public class af extends aq {

   private bk a = new bk();
   private Random e = new Random();


   public af() {
      this.c = 0.15F;
      this.d = 0.75F;
   }
   @Override
   public void a(Entity var0, double var2, double var4, double var6, float var8, float var9) {
      DroppedItem var1 = (DroppedItem)var0;

      this.e.setSeed(187L);
      fp var10 = var1.a;
      GL11.glPushMatrix();
      float var11 = fi.a(((float)var1.b + var9) / 10.0F + var1.d) * 0.1F + 0.1F;
      float var12 = (((float)var1.b + var9) / 20.0F + var1.d) * 57.295776F;
      byte var13 = 1;
      if(var1.a.a > 1) {
         var13 = 2;
      }

      if(var1.a.a > 5) {
         var13 = 3;
      }

      if(var1.a.a > 20) {
         var13 = 4;
      }

      GL11.glTranslatef((float)var2, (float)var4 + var11, (float)var6);
      GL11.glEnable('\u803a');
      float var16;
      float var17;
      float var18;
      if(var10.c < 256 && bk.a(nq.m[var10.c].g())) {
         GL11.glRotatef(var12, 0.0F, 1.0F, 0.0F);
         this.a("/mojang/terrain.png");
         float var27 = 0.25F;
         if(!nq.m[var10.c].b() && var10.c != nq.ak.bh) {
            var27 = 0.5F;
         }

         GL11.glScalef(var27, var27, var27);

         for(int var28 = 0; var28 < var13; ++var28) {
            GL11.glPushMatrix();
            if(var28 > 0) {
               var16 = (this.e.nextFloat() * 2.0F - 1.0F) * 0.2F / var27;
               var17 = (this.e.nextFloat() * 2.0F - 1.0F) * 0.2F / var27;
               var18 = (this.e.nextFloat() * 2.0F - 1.0F) * 0.2F / var27;
               GL11.glTranslatef(var16, var17, var18);
            }

            this.a.a(nq.m[var10.c]);
            GL11.glPopMatrix();
         }
      } else {
         GL11.glScalef(0.5F, 0.5F, 0.5F);
         int var14 = var10.b();
         if(var10.c < 256) {
            this.a("/mojang/terrain.png");
         } else {
            this.a("/mojang/assets/gui/items.png");
         }

         is var15 = is.a;
         var16 = (float)(var14 % 16 * 16 + 0) / 256.0F;
         var17 = (float)(var14 % 16 * 16 + 16) / 256.0F;
         var18 = (float)(var14 / 16 * 16 + 0) / 256.0F;
         float var19 = (float)(var14 / 16 * 16 + 16) / 256.0F;
         float var20 = 1.0F;
         float var21 = 0.5F;
         float var22 = 0.25F;

         for(int var23 = 0; var23 < var13; ++var23) {
            GL11.glPushMatrix();
            if(var23 > 0) {
               float var24 = (this.e.nextFloat() * 2.0F - 1.0F) * 0.3F;
               float var25 = (this.e.nextFloat() * 2.0F - 1.0F) * 0.3F;
               float var26 = (this.e.nextFloat() * 2.0F - 1.0F) * 0.3F;
               GL11.glTranslatef(var24, var25, var26);
            }

            GL11.glRotatef(180.0F - this.b.i, 0.0F, 1.0F, 0.0F);
            var15.b();
            var15.b(0.0F, 1.0F, 0.0F);
            var15.a((double)(0.0F - var21), (double)(0.0F - var22), 0.0D, (double)var16, (double)var19);
            var15.a((double)(var20 - var21), (double)(0.0F - var22), 0.0D, (double)var17, (double)var19);
            var15.a((double)(var20 - var21), (double)(1.0F - var22), 0.0D, (double)var17, (double)var18);
            var15.a((double)(0.0F - var21), (double)(1.0F - var22), 0.0D, (double)var16, (double)var18);
            var15.a();
            GL11.glPopMatrix();
         }
      }

      GL11.glDisable('\u803a');
      GL11.glPopMatrix();
   }

   public void a(ls var1, Texture var2, fp var3, int var4, int var5) {
      if(var3 != null) {
         if(var3.c < 256 && bk.a(nq.m[var3.c].g())) {
            int var6 = var3.c;
            var2.b(var2.loadTexture("/mojang/terrain.png"));
            nq var7 = nq.m[var6];
            GL11.glPushMatrix();
            GL11.glTranslatef((float)(var4 - 2), (float)(var5 + 3), 0.0F);
            GL11.glScalef(10.0F, 10.0F, 10.0F);
            GL11.glTranslatef(1.0F, 0.5F, 8.0F);
            GL11.glRotatef(210.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glScalef(1.0F, 1.0F, 1.0F);
            this.a.a(var7);
            GL11.glPopMatrix();
         } else if(var3.b() >= 0) {
            GL11.glDisable(2896);
            if(var3.c < 256) {
               var2.b(var2.loadTexture("/mojang/terrain.png"));
            } else {
               var2.b(var2.loadTexture("/mojang/assets/gui/items.png"));
            }

            this.a(var4, var5, var3.b() % 16 * 16, var3.b() / 16 * 16, 16, 16);
            GL11.glEnable(2896);
         }

         GL11.glEnable(2884);
      }
   }

   public void b(ls var1, Texture var2, fp var3, int var4, int var5) {
      if(var3 != null) {
         if(var3.a > 1) {
            String var6 = "" + var3.a;
            GL11.glDisable(2896);
            GL11.glDisable(2929);
            var1.a(var6, var4 + 19 - 2 - var1.a(var6), var5 + 6 + 3, 16777215);
            GL11.glEnable(2896);
            GL11.glEnable(2929);
         }

         if(var3.d > 0) {
            int var11 = 13 - var3.d * 13 / var3.d();
            int var7 = 255 - var3.d * 255 / var3.d();
            GL11.glDisable(2896);
            GL11.glDisable(2929);
            GL11.glDisable(3553);
            is var8 = is.a;
            int var9 = 255 - var7 << 16 | var7 << 8;
            int var10 = (255 - var7) / 4 << 16 | 16128;
            this.a(var8, var4 + 2, var5 + 13, 13, 2, 0);
            this.a(var8, var4 + 2, var5 + 13, 12, 1, var10);
            this.a(var8, var4 + 2, var5 + 13, var11, 1, var9);
            GL11.glEnable(3553);
            GL11.glEnable(2896);
            GL11.glEnable(2929);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         }

      }
   }

   private void a(is var1, int var2, int var3, int var4, int var5, int var6) {
      var1.b();
      var1.b(var6);
      var1.a((double)(var2 + 0), (double)(var3 + 0), 0.0D);
      var1.a((double)(var2 + 0), (double)(var3 + var5), 0.0D);
      var1.a((double)(var2 + var4), (double)(var3 + var5), 0.0D);
      var1.a((double)(var2 + var4), (double)(var3 + 0), 0.0D);
      var1.a();
   }

   public void a(int var1, int var2, int var3, int var4, int var5, int var6) {
      float var7 = 0.0F;
      float var8 = 0.00390625F;
      float var9 = 0.00390625F;
      is var10 = is.a;
      var10.b();
      var10.a((double)(var1 + 0), (double)(var2 + var6), (double)var7, (double)((float)(var3 + 0) * var8), (double)((float)(var4 + var6) * var9));
      var10.a((double)(var1 + var5), (double)(var2 + var6), (double)var7, (double)((float)(var3 + var5) * var8), (double)((float)(var4 + var6) * var9));
      var10.a((double)(var1 + var5), (double)(var2 + 0), (double)var7, (double)((float)(var3 + var5) * var8), (double)((float)(var4 + 0) * var9));
      var10.a((double)(var1 + 0), (double)(var2 + 0), (double)var7, (double)((float)(var3 + 0) * var8), (double)((float)(var4 + 0) * var9));
      var10.a();
   }
}
