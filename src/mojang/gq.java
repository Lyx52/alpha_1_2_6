package mojang;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import mojang.net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;

public class gq {

   private static final String[] A = new String[]{"FAR", "NORMAL", "SHORT", "TINY"};
   private static final String[] B = new String[]{"Peaceful", "Easy", "Normal", "Hard"};
   public float musicVolume = 1.0F;
   public float soundVolume = 1.0F;
   public float mouseSensitivity = 0.5F;
   public boolean invertYMouse = false;
   public int viewDistance = 0;
   public boolean bobView = true;
   public boolean anaglyph3D = false;
   public boolean vsync = false;
   public boolean fancyGraphics = true;
   public String skinURL = "Default";
   public ke k = new ke("Forward", 17);
   public ke l = new ke("Left", 30);
   public ke m = new ke("Back", 31);
   public ke n = new ke("Right", 32);
   public ke o = new ke("Jump", 57);
   public ke p = new ke("Inventory", 23);
   public ke q = new ke("Drop", 16);
   public ke r = new ke("Chat", 20);
   public ke s = new ke("Toggle fog", 33);
   public ke t = new ke("Sneak", 42);
   public ke[] u;
   protected Minecraft v;
   private File configFile;
   public int w;
   public int gameDifficulty;
   public boolean y;
   public String lastServer;


   public gq(Minecraft var1, File var2) {
      this.u = new ke[]{this.k, this.l, this.m, this.n, this.o, this.t, this.q, this.p, this.r, this.s};
      this.w = 10;
      this.gameDifficulty = 2;
      this.y = false;
      this.lastServer = "";
      this.v = var1;
      this.configFile = new File(var2, "options.txt");
      this.a();
   }

   public gq() {
      this.u = new ke[]{this.k, this.l, this.m, this.n, this.o, this.t, this.q, this.p, this.r, this.s};
      this.w = 10;
      this.gameDifficulty = 2;
      this.y = false;
      this.lastServer = "";
   }

   public String a(int var1) {
      return this.u[var1].a + ": " + Keyboard.getKeyName(this.u[var1].b);
   }

   public void a(int var1, int var2) {
      this.u[var1].b = var2;
      this.b();
   }

   public void a(int var1, float var2) {
      if(var1 == 0) {
         this.musicVolume = var2;
         this.v.A.a();
      }

      if(var1 == 1) {
         this.soundVolume = var2;
         this.v.A.a();
      }

      if(var1 == 3) {
         this.mouseSensitivity = var2;
      }

   }

   public void b(int var1, int var2) {
      if(var1 == 2) {
         this.invertYMouse = !this.invertYMouse;
      }

      if(var1 == 4) {
         this.viewDistance = this.viewDistance + var2 & 3;
      }

      if(var1 == 5) {
         this.bobView = !this.bobView;
      }

      if(var1 == 6) {
         this.anaglyph3D = !this.anaglyph3D;
         this.v.n.b();
      }

      if(var1 == 7) {
         this.vsync = !this.vsync;
      }

      if(var1 == 8) {
         this.gameDifficulty = this.gameDifficulty + var2 & 3;
      }

      if(var1 == 9) {
         this.fancyGraphics = !this.fancyGraphics;
         this.v.f.a();
      }

      this.b();
   }

   public int b(int var1) {
      return var1 == 0?1:(var1 == 1?1:(var1 == 3?1:0));
   }

   public float c(int var1) {
      return var1 == 0?this.musicVolume :(var1 == 1?this.soundVolume :(var1 == 3?this.mouseSensitivity :0.0F));
   }

   public String d(int var1) {
      return var1 == 0 ? "Music: " + (this.musicVolume > 0.0F?(int)(this.musicVolume * 100.0F) + "%":"OFF") : (var1 == 1 ? "Sound: " + (this.soundVolume > 0.0F ? (int)(this.soundVolume * 100.0F) + "%":"OFF"):(var1 == 2?"Invert mouse: " + (this.invertYMouse ?"ON":"OFF"):(var1 == 3?(this.mouseSensitivity == 0.0F?"Sensitivity: *yawn*":(this.mouseSensitivity == 1.0F?"Sensitivity: HYPERSPEED!!!":"Sensitivity: " + (int)(this.mouseSensitivity * 200.0F) + "%")):(var1 == 4?"Render distance: " + A[this.viewDistance]:(var1 == 5?"View bobbing: " + (this.bobView ?"ON":"OFF"):(var1 == 6?"3d anaglyph: " + (this.anaglyph3D ?"ON":"OFF"):(var1 == 7?"Limit framerate: " + (this.vsync ?"ON":"OFF"):(var1 == 8?"Difficulty: " + B[this.gameDifficulty]:(var1 == 9?"Graphics: " + (this.fancyGraphics ?"FANCY":"FAST"):"")))))))));
   }

   public void a() {
      try {
         if(!this.configFile.exists()) {
            return;
         }

         BufferedReader configReader = new BufferedReader(new FileReader(this.configFile));
         String readLine = "";

         while((readLine = configReader.readLine()) != null) {
            String[] var3 = readLine.split(":");
            if(var3[0].equals("music")) {
               this.musicVolume = this.a(var3[1]);
            }

            if(var3[0].equals("sound")) {
               this.soundVolume = this.a(var3[1]);
            }

            if(var3[0].equals("mouseSensitivity")) {
               this.mouseSensitivity = this.a(var3[1]);
            }

            if(var3[0].equals("invertYMouse")) {
               this.invertYMouse = var3[1].equals("true");
            }

            if(var3[0].equals("viewDistance")) {
               this.viewDistance = Integer.parseInt(var3[1]);
            }

            if(var3[0].equals("bobView")) {
               this.bobView = var3[1].equals("true");
            }

            if(var3[0].equals("anaglyph3d")) {
               this.anaglyph3D = var3[1].equals("true");
            }

            if(var3[0].equals("limitFramerate")) {
               this.vsync = var3[1].equals("true");
            }

            if(var3[0].equals("difficulty")) {
               this.gameDifficulty = Integer.parseInt(var3[1]);
            }

            if(var3[0].equals("fancyGraphics")) {
               this.fancyGraphics = var3[1].equals("true");
            }

            if(var3[0].equals("skin")) {
               this.skinURL = var3[1];
            }

            if(var3[0].equals("lastServer")) {
               this.lastServer = var3.length > 2 ? var3[1] : "";
            }

            for(int var4 = 0; var4 < this.u.length; ++var4) {
               if(var3[0].equals("key_" + this.u[var4].a)) {
                  this.u[var4].b = Integer.parseInt(var3[1]);
               }
            }
         }

         configReader.close();
      } catch (Exception configException) {
         System.out.println("Failed to load options");
         configException.printStackTrace();
      }

   }

   private float a(String var1) {
      return var1.equals("true")?1.0F:(var1.equals("false")?0.0F:Float.parseFloat(var1));
   }

   public void b() {
      try {
         PrintWriter configWriter = new PrintWriter(new FileWriter(this.configFile));
         configWriter.println("music:" + this.musicVolume);
         configWriter.println("sound:" + this.soundVolume);
         configWriter.println("invertYMouse:" + this.invertYMouse);
         configWriter.println("mouseSensitivity:" + this.mouseSensitivity);
         configWriter.println("viewDistance:" + this.viewDistance);
         configWriter.println("bobView:" + this.bobView);
         configWriter.println("anaglyph3d:" + this.anaglyph3D);
         configWriter.println("limitFramerate:" + this.vsync);
         configWriter.println("difficulty:" + this.gameDifficulty);
         configWriter.println("fancyGraphics:" + this.fancyGraphics);
         configWriter.println("skin:" + this.skinURL);
         configWriter.println("lastServer:" + this.lastServer);

         for(int var2 = 0; var2 < this.u.length; ++var2) {
            configWriter.println("key_" + this.u[var2].a + ":" + this.u[var2].b);
         }

         configWriter.close();
      } catch (Exception var3) {
         System.out.println("Failed to save options");
         var3.printStackTrace();
      }

   }

}
