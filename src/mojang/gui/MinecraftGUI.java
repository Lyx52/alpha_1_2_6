package mojang.gui;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import mojang.*;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

public class MinecraftGUI extends GraphicsUserInterface {

   private static final Random h = new Random();
   String[] a = new String[]{" *   * * *   * *** *** *** *** *** ***", " ** ** * **  * *   *   * * * * *    * ", " * * * * * * * **  *   **  *** **   * ", " *   * * *  ** *   *   * * * * *    * ", " *   * * *   * *** *** * * * * *    * "};
   private lr[][] i;
   private float j = 0.0F;
   private String title = "missingno";


   public MinecraftGUI() {
      try {
         ArrayList var1 = new ArrayList();
         BufferedReader var2 = new BufferedReader(new InputStreamReader(MinecraftGUI.class.getResourceAsStream("/mojang/assets/title/splashes.txt")));
         String var3 = "";

         while((var3 = var2.readLine()) != null) {
            var3 = var3.trim();
            if(var3.length() > 0) {
               var1.add(var3);
            }
         }

         this.title = (String)var1.get(h.nextInt(var1.size()));
      } catch (Exception var4) {
         ;
      }

   }

   public void g() {
      ++this.j;
      if(this.i != null) {
         for(int var1 = 0; var1 < this.i.length; ++var1) {
            for(int var2 = 0; var2 < this.i[var1].length; ++var2) {
               this.i[var1][var2].a();
            }
         }
      }

   }

   protected void a(char var1, int var2) {}

   public void initButtons() {
      Calendar var1 = Calendar.getInstance();
      var1.setTime(new Date());
      if(var1.get(2) + 1 == 11 && var1.get(5) == 9) {
         this.title = "Happy birthday, ez!";
      } else if(var1.get(2) + 1 == 6 && var1.get(5) == 1) {
         this.title = "Happy birthday, Notch!";
      } else if(var1.get(2) + 1 == 12 && var1.get(5) == 24) {
         this.title = "Merry X-mas!";
      } else if(var1.get(2) + 1 == 1 && var1.get(5) == 1) {
         this.title = "Happy new year!";
      }

      this.buttons.add(new Button(1, this.c / 2 - 100, this.d / 4 + 48, "Singleplayer"));
      this.buttons.add(new Button(2, this.c / 2 - 100, this.d / 4 + 72, "Multiplayer"));
      this.buttons.add(new Button(3, this.c / 2 - 100, this.d / 4 + 96, "Mods and Texture Packs"));
      this.buttons.add(new Button(0, this.c / 2 - 100, this.d / 4 + 120 + 12, "Options..."));
      if(this.minecraft.i == null) {
         ((Button)this.buttons.get(1)).visible = false;
      }

   }

   protected void buttonClicked(Button button) {
      if(button.value == 0) {
         this.minecraft.changeGUI((GraphicsUserInterface)(new OptionsGUI(this, this.minecraft.y)));
      }

      if(button.value == 1) {
         this.minecraft.changeGUI((GraphicsUserInterface)(new WorldSelectionGUI(this)));
      }

      if(button.value == 2) {
         this.minecraft.changeGUI((GraphicsUserInterface)(new MultiplayerGUI(this)));
      }

      if(button.value == 3) {
         this.minecraft.changeGUI((GraphicsUserInterface)(new TexturepackGUI(this)));
      }

   }

   public void a(int var1, int var2, float var3) {
      this.i();
      is var4 = is.a;
      this.initButtons(var3);
      GL11.glBindTexture(3553, this.minecraft.n.loadTexture("/mojang/assets/gui/logo.png"));
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      var4.b(16777215);
      GL11.glPushMatrix();
      GL11.glTranslatef((float)(this.c / 2 + 90), 70.0F, 0.0F);
      GL11.glRotatef(-20.0F, 0.0F, 0.0F, 1.0F);
      float var5 = 1.8F - fi.e(fi.a((float)(System.currentTimeMillis() % 1000L) / 1000.0F * 3.1415927F * 2.0F) * 0.1F);
      var5 = var5 * 100.0F / (float)(this.g.a(this.title) + 32);
      GL11.glScalef(var5, var5, var5);
      this.displayButton(this.g, this.title, 0, -8, 16776960);
      GL11.glPopMatrix();
      this.b(this.g, "Minecraft Alpha v1.2.6", 2, 2, 5263440);
      String var6 = "Copyright Mojang Specifications. Do not distribute.";
      this.b(this.g, var6, this.c - this.g.a(var6) - 2, this.d - 10, 16777215);
      super.a(var1, var2, var3);
   }

   private void initButtons(float var1) {
      int var3;
      if(this.i == null) {
         this.i = new lr[this.a[0].length()][this.a.length];

         for(int var2 = 0; var2 < this.i.length; ++var2) {
            for(var3 = 0; var3 < this.i[var2].length; ++var3) {
               this.i[var2][var3] = new lr(this, var2, var3);
            }
         }
      }

      GL11.glMatrixMode(5889);
      GL11.glPushMatrix();
      GL11.glLoadIdentity();
      kl var14 = new kl(this.minecraft.c, this.minecraft.d);
      var3 = 120 * var14.a;
      GLU.gluPerspective(70.0F, (float)this.minecraft.c / (float)var3, 0.05F, 100.0F);
      GL11.glViewport(0, this.minecraft.d - var3, this.minecraft.c, var3);
      GL11.glMatrixMode(5888);
      GL11.glPushMatrix();
      GL11.glLoadIdentity();
      GL11.glDisable(2884);
      GL11.glCullFace(1029);
      GL11.glDepthMask(true);
      bk var4 = new bk();

      for(int var5 = 0; var5 < 3; ++var5) {
         GL11.glPushMatrix();
         GL11.glTranslatef(0.4F, 0.6F, -13.0F);
         if(var5 == 0) {
            GL11.glClear(256);
            GL11.glTranslatef(0.0F, -0.4F, 0.0F);
            GL11.glScalef(0.98F, 1.0F, 1.0F);
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 771);
         }

         if(var5 == 1) {
            GL11.glDisable(3042);
            GL11.glClear(256);
         }

         if(var5 == 2) {
            GL11.glEnable(3042);
            GL11.glBlendFunc(768, 1);
         }

         GL11.glScalef(1.0F, -1.0F, 1.0F);
         GL11.glRotatef(15.0F, 1.0F, 0.0F, 0.0F);
         GL11.glScalef(0.89F, 1.0F, 0.4F);
         GL11.glTranslatef((float)(-this.a[0].length()) * 0.5F, (float)(-this.a.length) * 0.5F, 0.0F);
         GL11.glBindTexture(3553, this.minecraft.n.loadTexture("/mojang/terrain.png"));
         if(var5 == 0) {
            GL11.glBindTexture(3553, this.minecraft.n.loadTexture("/mojang/assets/title/black.png"));
         }

         for(int var6 = 0; var6 < this.a.length; ++var6) {
            for(int var7 = 0; var7 < this.a[var6].length(); ++var7) {
               char var8 = this.a[var6].charAt(var7);
               if(var8 != 32) {
                  GL11.glPushMatrix();
                  lr var9 = this.i[var7][var6];
                  float var10 = (float)(var9.b + (var9.a - var9.b) * (double)var1);
                  float var11 = 1.0F;
                  float var12 = 1.0F;
                  float var13 = 0.0F;
                  if(var5 == 0) {
                     var11 = var10 * 0.04F + 1.0F;
                     var12 = 1.0F / var11;
                     var10 = 0.0F;
                  }

                  GL11.glTranslatef((float)var7, (float)var6, var10);
                  GL11.glScalef(var11, var11, var11);
                  GL11.glRotatef(var13, 0.0F, 1.0F, 0.0F);
                  var4.a(nq.t, var12);
                  GL11.glPopMatrix();
               }
            }
         }

         GL11.glPopMatrix();
      }

      GL11.glDisable(3042);
      GL11.glMatrixMode(5889);
      GL11.glPopMatrix();
      GL11.glMatrixMode(5888);
      GL11.glPopMatrix();
      GL11.glViewport(0, 0, this.minecraft.c, this.minecraft.d);
      GL11.glEnable(2884);
   }

   // $FF: synthetic method
   public static Random j() {
      return h;
   }

}
