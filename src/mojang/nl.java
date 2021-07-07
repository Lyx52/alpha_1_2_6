package mojang;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import mojang.net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class nl extends GUIComponent {

   private static af d = new af();
   private List e = new ArrayList();
   private Random f = new Random();
   private Minecraft g;
   public String a = null;
   private int h = 0;
   private String i = "";
   private int j = 0;
   public float b;
   float c = 1.0F;


   public nl(Minecraft var1) {
      this.g = var1;
   }

   public void a(float var1, boolean var2, int var3, int var4) {
      kl var5 = new kl(this.g.c, this.g.d);
      int var6 = var5.a();
      int var7 = var5.b();
      ls var8 = this.g.o;
      this.g.r.b();
      GL11.glEnable(3042);
      if(this.g.y.fancyGraphics) {
         this.a(this.g.playerName.a(var1), var6, var7);
      }

      fp var9 = this.g.playerName.e.d(3);
      if(!this.g.y.y && var9 != null && var9.c == nq.ba.bh) {
         this.a(var6, var7);
      }

      float var10 = this.g.playerName.d + (this.g.playerName.c - this.g.playerName.d) * var1;
      if(var10 > 0.0F) {
         this.b(var10, var6, var7);
      }

      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glBindTexture(3553, this.g.n.a("/mojang/gui/gui.png"));
      fo var11 = this.g.playerName.e;
      this.k = -90.0F;
      this.b(var6 / 2 - 91, var7 - 22, 0, 0, 182, 22);
      this.b(var6 / 2 - 91 - 1 + var11.d * 20, var7 - 22 - 1, 0, 22, 24, 22);
      GL11.glBindTexture(3553, this.g.n.a("/mojang/gui/icons.png"));
      GL11.glEnable(3042);
      GL11.glBlendFunc(775, 769);
      this.b(var6 / 2 - 7, var7 / 2 - 7, 0, 0, 16, 16);
      GL11.glDisable(3042);
      boolean var12 = this.g.playerName.bj / 3 % 2 == 1;
      if(this.g.playerName.bj < 10) {
         var12 = false;
      }

      int var13 = this.g.playerName.J;
      int var14 = this.g.playerName.K;
      this.f.setSeed((long)(this.h * 312871));
      int var15;
      int var16;
      int var17;
      if(this.g.b.d()) {
         var15 = this.g.playerName.n();

         int var18;
         for(var16 = 0; var16 < 10; ++var16) {
            var17 = var7 - 32;
            if(var15 > 0) {
               var18 = var6 / 2 + 91 - var16 * 8 - 9;
               if(var16 * 2 + 1 < var15) {
                  this.b(var18, var17, 34, 9, 9, 9);
               }

               if(var16 * 2 + 1 == var15) {
                  this.b(var18, var17, 25, 9, 9, 9);
               }

               if(var16 * 2 + 1 > var15) {
                  this.b(var18, var17, 16, 9, 9, 9);
               }
            }

            byte var27 = 0;
            if(var12) {
               var27 = 1;
            }

            int var19 = var6 / 2 - 91 + var16 * 8;
            if(var13 <= 4) {
               var17 += this.f.nextInt(2);
            }

            this.b(var19, var17, 16 + var27 * 9, 0, 9, 9);
            if(var12) {
               if(var16 * 2 + 1 < var14) {
                  this.b(var19, var17, 70, 0, 9, 9);
               }

               if(var16 * 2 + 1 == var14) {
                  this.b(var19, var17, 79, 0, 9, 9);
               }
            }

            if(var16 * 2 + 1 < var13) {
               this.b(var19, var17, 52, 0, 9, 9);
            }

            if(var16 * 2 + 1 == var13) {
               this.b(var19, var17, 61, 0, 9, 9);
            }
         }

         if(this.g.playerName.a(hb.f)) {
            var16 = (int)Math.ceil((double)(this.g.playerName.bk - 2) * 10.0D / 300.0D);
            var17 = (int)Math.ceil((double)this.g.playerName.bk * 10.0D / 300.0D) - var16;

            for(var18 = 0; var18 < var16 + var17; ++var18) {
               if(var18 < var16) {
                  this.b(var6 / 2 - 91 + var18 * 8, var7 - 32 - 9, 16, 18, 9, 9);
               } else {
                  this.b(var6 / 2 - 91 + var18 * 8, var7 - 32 - 9, 25, 18, 9, 9);
               }
            }
         }
      }

      GL11.glDisable(3042);
      GL11.glEnable('\u803a');
      GL11.glPushMatrix();
      GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
      l.b();
      GL11.glPopMatrix();

      for(var15 = 0; var15 < 9; ++var15) {
         var16 = var6 / 2 - 90 + var15 * 20 + 2;
         var17 = var7 - 16 - 3;
         this.a(var15, var16, var17, var1);
      }

      l.a();
      GL11.glDisable('\u803a');
      String var23;
      if(Keyboard.isKeyDown(61)) {
         var8.a("Minecraft Alpha v1.2.6 (" + this.g.I + ")", 2, 2, 16777215);
         var8.a(this.g.m(), 2, 12, 16777215);
         var8.a(this.g.n(), 2, 22, 16777215);
         var8.a(this.g.o(), 2, 32, 16777215);
         long var24 = Runtime.getRuntime().maxMemory();
         long var29 = Runtime.getRuntime().totalMemory();
         long var30 = Runtime.getRuntime().freeMemory();
         long var21 = var29 - var30;
         var23 = "Used memory: " + var21 * 100L / var24 + "% (" + var21 / 1024L / 1024L + "MB) of " + var24 / 1024L / 1024L + "MB";
         this.b(var8, var23, var6 - var8.a(var23) - 2, 2, 14737632);
         var23 = "Allocated memory: " + var29 * 100L / var24 + "% (" + var29 / 1024L / 1024L + "MB)";
         this.b(var8, var23, var6 - var8.a(var23) - 2, 12, 14737632);
         this.b(var8, "x: " + this.g.playerName.aw, 2, 64, 14737632);
         this.b(var8, "y: " + this.g.playerName.ax, 2, 72, 14737632);
         this.b(var8, "z: " + this.g.playerName.ay, 2, 80, 14737632);
      } else {
         var8.a("Minecraft Alpha v1.2.6", 2, 2, 16777215);
      }

      if(this.j > 0) {
         float var25 = (float)this.j - var1;
         var16 = (int)(var25 * 256.0F / 20.0F);
         if(var16 > 255) {
            var16 = 255;
         }

         if(var16 > 0) {
            GL11.glPushMatrix();
            GL11.glTranslatef((float)(var6 / 2), (float)(var7 - 48), 0.0F);
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 771);
            var17 = Color.HSBtoRGB(var25 / 50.0F, 0.7F, 0.6F) & 16777215;
            var8.b(this.i, -var8.a(this.i) / 2, -4, var17 + (var16 << 24));
            GL11.glDisable(3042);
            GL11.glPopMatrix();
         }
      }

      byte var26 = 10;
      boolean var28 = false;
      if(this.g.p instanceof dr) {
         var26 = 20;
         var28 = true;
      }

      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glDisable(3008);
      GL11.glPushMatrix();
      GL11.glTranslatef(0.0F, (float)(var7 - 48), 0.0F);

      for(var17 = 0; var17 < this.e.size() && var17 < var26; ++var17) {
         if(((me)this.e.get(var17)).b < 200 || var28) {
            double var31 = (double)((me)this.e.get(var17)).b / 200.0D;
            var31 = 1.0D - var31;
            var31 *= 10.0D;
            if(var31 < 0.0D) {
               var31 = 0.0D;
            }

            if(var31 > 1.0D) {
               var31 = 1.0D;
            }

            var31 *= var31;
            int var20 = (int)(255.0D * var31);
            if(var28) {
               var20 = 255;
            }

            if(var20 > 0) {
               byte var32 = 2;
               int var22 = -var17 * 9;
               var23 = ((me)this.e.get(var17)).a;
               this.a(var32, var22 - 1, var32 + 320, var22 + 8, var20 / 2 << 24);
               GL11.glEnable(3042);
               var8.a(var23, var32, var22, 16777215 + (var20 << 24));
            }
         }
      }

      GL11.glPopMatrix();
      GL11.glEnable(3008);
      GL11.glDisable(3042);
   }

   private void a(int var1, int var2) {
      GL11.glDisable(2929);
      GL11.glDepthMask(false);
      GL11.glBlendFunc(770, 771);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(3008);
      GL11.glBindTexture(3553, this.g.n.a("%blur%/misc/pumpkinblur.png"));
      is var3 = is.a;
      var3.b();
      var3.a(0.0D, (double)var2, -90.0D, 0.0D, 1.0D);
      var3.a((double)var1, (double)var2, -90.0D, 1.0D, 1.0D);
      var3.a((double)var1, 0.0D, -90.0D, 1.0D, 0.0D);
      var3.a(0.0D, 0.0D, -90.0D, 0.0D, 0.0D);
      var3.a();
      GL11.glDepthMask(true);
      GL11.glEnable(2929);
      GL11.glEnable(3008);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void a(float var1, int var2, int var3) {
      var1 = 1.0F - var1;
      if(var1 < 0.0F) {
         var1 = 0.0F;
      }

      if(var1 > 1.0F) {
         var1 = 1.0F;
      }

      this.c = (float)((double)this.c + (double)(var1 - this.c) * 0.01D);
      GL11.glDisable(2929);
      GL11.glDepthMask(false);
      GL11.glBlendFunc(0, 769);
      GL11.glColor4f(this.c, this.c, this.c, 1.0F);
      GL11.glBindTexture(3553, this.g.n.a("%blur%/misc/vignette.png"));
      is var4 = is.a;
      var4.b();
      var4.a(0.0D, (double)var3, -90.0D, 0.0D, 1.0D);
      var4.a((double)var2, (double)var3, -90.0D, 1.0D, 1.0D);
      var4.a((double)var2, 0.0D, -90.0D, 1.0D, 0.0D);
      var4.a(0.0D, 0.0D, -90.0D, 0.0D, 0.0D);
      var4.a();
      GL11.glDepthMask(true);
      GL11.glEnable(2929);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glBlendFunc(770, 771);
   }

   private void b(float var1, int var2, int var3) {
      var1 *= var1;
      var1 *= var1;
      var1 = var1 * 0.8F + 0.2F;
      GL11.glDisable(3008);
      GL11.glDisable(2929);
      GL11.glDepthMask(false);
      GL11.glBlendFunc(770, 771);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, var1);
      GL11.glBindTexture(3553, this.g.n.a("/mojang/terrain.png"));
      float var4 = (float)(nq.be.bg % 16) / 16.0F;
      float var5 = (float)(nq.be.bg / 16) / 16.0F;
      float var6 = (float)(nq.be.bg % 16 + 1) / 16.0F;
      float var7 = (float)(nq.be.bg / 16 + 1) / 16.0F;
      is var8 = is.a;
      var8.b();
      var8.a(0.0D, (double)var3, -90.0D, (double)var4, (double)var7);
      var8.a((double)var2, (double)var3, -90.0D, (double)var6, (double)var7);
      var8.a((double)var2, 0.0D, -90.0D, (double)var6, (double)var5);
      var8.a(0.0D, 0.0D, -90.0D, (double)var4, (double)var5);
      var8.a();
      GL11.glDepthMask(true);
      GL11.glEnable(2929);
      GL11.glEnable(3008);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void a(int var1, int var2, int var3, float var4) {
      fp var5 = this.g.playerName.e.a[var1];
      if(var5 != null) {
         float var6 = (float)var5.b - var4;
         if(var6 > 0.0F) {
            GL11.glPushMatrix();
            float var7 = 1.0F + var6 / 5.0F;
            GL11.glTranslatef((float)(var2 + 8), (float)(var3 + 12), 0.0F);
            GL11.glScalef(1.0F / var7, (var7 + 1.0F) / 2.0F, 1.0F);
            GL11.glTranslatef((float)(-(var2 + 8)), (float)(-(var3 + 12)), 0.0F);
         }

         d.a(this.g.o, this.g.n, var5, var2, var3);
         if(var6 > 0.0F) {
            GL11.glPopMatrix();
         }

         d.b(this.g.o, this.g.n, var5, var2, var3);
      }
   }

   public void a() {
      if(this.j > 0) {
         --this.j;
      }

      ++this.h;

      for(int var1 = 0; var1 < this.e.size(); ++var1) {
         ++((me)this.e.get(var1)).b;
      }

   }

   public void a(String var1) {
      while(this.g.o.a(var1) > 320) {
         int var2;
         for(var2 = 1; var2 < var1.length() && this.g.o.a(var1.substring(0, var2 + 1)) <= 320; ++var2) {
            ;
         }

         this.a(var1.substring(0, var2));
         var1 = var1.substring(var2);
      }

      this.e.add(0, new me(var1));

      while(this.e.size() > 50) {
         this.e.remove(this.e.size() - 1);
      }

   }

   public void b(String var1) {
      this.i = "Now playing: " + var1;
      this.j = 60;
   }

}
