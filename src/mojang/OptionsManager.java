package mojang;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import mojang.net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;

public class OptionsManager {

   private static final String[] VIEW_DISTANCE_CONTANTS = new String[]{"FAR", "NORMAL", "SHORT", "TINY"};
   private static final String[] DIFFICULTY_CONSTANTS = new String[]{"Peaceful", "Easy", "Normal", "Hard"};
   public float musicVolume = 1.0F;
   public float soundVolume = 1.0F;
   public float mouseSensitivity = 0.5F;
   public boolean invertYMouse = false;
   public int viewDistance = 0;
   public boolean bobView = true;
   public boolean anaglyph3D = false;
   public boolean vsync = false;
   public boolean fancyGraphics = true;
   public String playerSkin = "Default";
   public KeyboardInput ACTION_FORWARD = new KeyboardInput("Forward", 17);
   public KeyboardInput ACTION_LEFT = new KeyboardInput("Left", 30);
   public KeyboardInput ACTION_BACK = new KeyboardInput("Back", 31);
   public KeyboardInput ACTION_RIGHT = new KeyboardInput("Right", 32);
   public KeyboardInput ACTION_JUMP = new KeyboardInput("Jump", 57);
   public KeyboardInput ACTION_INVENTORY = new KeyboardInput("Inventory", 23);
   public KeyboardInput ACTION_DROP = new KeyboardInput("Drop", 16);
   public KeyboardInput ACTION_CHAT = new KeyboardInput("Chat", 20);
   public KeyboardInput ACTION_TOGGLE_FOG = new KeyboardInput("Toggle fog", 33);
   public KeyboardInput ACTION_SNEAK = new KeyboardInput("Sneak", 42);
   public KeyboardInput[] actions;
   protected Minecraft minecraft;
   private File configFile;
   public int buttonCount;
   public int gameDifficulty;
   public boolean y;
   public String lastServer;


   public OptionsManager(Minecraft minecraft, File gameDirectory) {
      this.actions = new KeyboardInput[]{this.ACTION_FORWARD, this.ACTION_LEFT, this.ACTION_BACK, this.ACTION_RIGHT, this.ACTION_JUMP, this.ACTION_SNEAK, this.ACTION_DROP, this.ACTION_INVENTORY, this.ACTION_CHAT, this.ACTION_TOGGLE_FOG};
      this.buttonCount = 10;
      this.gameDifficulty = 2;
      this.y = false;
      this.lastServer = "";
      this.minecraft = minecraft;
      this.configFile = new File(gameDirectory, "options.txt");
      this.init();
   }

   public OptionsManager() {
      this.actions = new KeyboardInput[]{this.ACTION_FORWARD, this.ACTION_LEFT, this.ACTION_BACK, this.ACTION_RIGHT, this.ACTION_JUMP, this.ACTION_SNEAK, this.ACTION_DROP, this.ACTION_INVENTORY, this.ACTION_CHAT, this.ACTION_TOGGLE_FOG};
      this.buttonCount = 10;
      this.gameDifficulty = 2;
      this.y = false;
      this.lastServer = "";
   }

   public String a(int var1) {
      return this.actions[var1].keyName + ": " + Keyboard.getKeyName(this.actions[var1].keyCode);
   }

   public void a(int var1, int var2) {
      this.actions[var1].keyCode = var2;
      this.b();
   }

   public void a(int var1, float var2) {
      if(var1 == 0) {
         this.musicVolume = var2;
         this.minecraft.A.a();
      }

      if(var1 == 1) {
         this.soundVolume = var2;
         this.minecraft.A.a();
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
         this.minecraft.n.b();
      }

      if(var1 == 7) {
         this.vsync = !this.vsync;
      }

      if(var1 == 8) {
         this.gameDifficulty = this.gameDifficulty + var2 & 3;
      }

      if(var1 == 9) {
         this.fancyGraphics = !this.fancyGraphics;
         this.minecraft.f.a();
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
      return var1 == 0 ? "Music: " + (this.musicVolume > 0.0F?(int)(this.musicVolume * 100.0F) + "%":"OFF") : (var1 == 1 ? "Sound: " + (this.soundVolume > 0.0F ? (int)(this.soundVolume * 100.0F) + "%":"OFF"):(var1 == 2?"Invert mouse: " + (this.invertYMouse ?"ON":"OFF"):(var1 == 3?(this.mouseSensitivity == 0.0F?"Sensitivity: *yawn*":(this.mouseSensitivity == 1.0F?"Sensitivity: HYPERSPEED!!!":"Sensitivity: " + (int)(this.mouseSensitivity * 200.0F) + "%")):(var1 == 4?"Render distance: " + VIEW_DISTANCE_CONTANTS[this.viewDistance]:(var1 == 5?"View bobbing: " + (this.bobView ?"ON":"OFF"):(var1 == 6?"3d anaglyph: " + (this.anaglyph3D ?"ON":"OFF"):(var1 == 7?"Limit framerate: " + (this.vsync ?"ON":"OFF"):(var1 == 8?"Difficulty: " + DIFFICULTY_CONSTANTS[this.gameDifficulty]:(var1 == 9?"Graphics: " + (this.fancyGraphics ?"FANCY":"FAST"):"")))))))));
   }

   public void init() {
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
               this.playerSkin = var3[1];
            }

            if(var3[0].equals("lastServer")) {
               this.lastServer = var3.length > 2 ? var3[1] : "";
            }

            for(int var4 = 0; var4 < this.actions.length; ++var4) {
               if(var3[0].equals("key_" + this.actions[var4].keyName)) {
                  this.actions[var4].keyCode = Integer.parseInt(var3[1]);
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
         configWriter.println("skin:" + this.playerSkin);
         configWriter.println("lastServer:" + this.lastServer);

         for(int var2 = 0; var2 < this.actions.length; ++var2) {
            configWriter.println("key_" + this.actions[var2].keyName + ":" + this.actions[var2].keyCode);
         }

         configWriter.close();
      } catch (Exception var3) {
         System.out.println("Failed to save options");
         var3.printStackTrace();
      }

   }

}
