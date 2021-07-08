package mojang;

import java.io.File;
import java.util.Random;

import mojang.entity.LivingEntity;
import mojang.paulscode.sound.SoundSystem;
import mojang.paulscode.sound.SoundSystemConfig;
import mojang.paulscode.sound.codecs.CodecJOrbis;
import mojang.paulscode.sound.codecs.CodecMus;
import mojang.paulscode.sound.codecs.CodecWav;
import mojang.paulscode.sound.libraries.LibraryLWJGLOpenAL;

public class SoundManager {

   private static SoundSystem soundSystem;
   private es b = new es();
   private es c = new es();
   private es d = new es();
   private int e = 0;
   private OptionsManager optionsManager;
   private static boolean g = false;
   private Random h = new Random();
   private int i;


   public SoundManager() {
      this.i = this.h.nextInt(12000);
   }

   public void a(OptionsManager var1) {
      this.c.b = false;
      this.optionsManager = var1;
      if(!g && (var1 == null || var1.soundVolume != 0.0F || var1.musicVolume != 0.0F)) {
         this.d();
      }

   }

   private void d() {
      try {
         float var1 = this.optionsManager.soundVolume;
         float var2 = this.optionsManager.musicVolume;
         this.optionsManager.soundVolume = 0.0F;
         this.optionsManager.musicVolume = 0.0F;
         this.optionsManager.b();
         SoundSystemConfig.addLibrary(LibraryLWJGLOpenAL.class);
         SoundSystemConfig.setCodec("ogg", CodecJOrbis.class);
         SoundSystemConfig.setCodec("mus", CodecMus.class);
         SoundSystemConfig.setCodec("wav", CodecWav.class);
         soundSystem = new SoundSystem();
         this.optionsManager.soundVolume = var1;
         this.optionsManager.musicVolume = var2;
         this.optionsManager.b();
      } catch (Throwable var3) {
         var3.printStackTrace();
         System.err.println("error linking with the LibraryJavaSound plug-in");
      }

      g = true;
   }

   public void a() {
      if(!g && (this.optionsManager.soundVolume != 0.0F || this.optionsManager.musicVolume != 0.0F)) {
         this.d();
      }

      if(this.optionsManager.musicVolume == 0.0F) {
         soundSystem.stop("BgMusic");
      } else {
         soundSystem.setVolume("BgMusic", this.optionsManager.musicVolume);
      }

   }

   public void b() {
      if(g) {
         soundSystem.cleanup();
      }

   }

   public void a(String var1, File var2) {
      this.b.a(var1, var2);
   }

   public void b(String var1, File var2) {
      this.c.a(var1, var2);
   }

   public void c(String var1, File var2) {
      this.d.a(var1, var2);
   }

   public void c() {
      if(g && this.optionsManager.musicVolume != 0.0F) {
         if(!soundSystem.playing("BgMusic") && !soundSystem.playing("streaming")) {
            if(this.i > 0) {
               --this.i;
               return;
            }

            al var1 = this.d.a();
            if(var1 != null) {
               this.i = this.h.nextInt(12000) + 12000;
               soundSystem.backgroundMusic("BgMusic", var1.b, var1.a, false);
               soundSystem.setVolume("BgMusic", this.optionsManager.musicVolume);
               soundSystem.play("BgMusic");
            }
         }

      }
   }

   public void a(LivingEntity var1, float var2) {
      if(g && this.optionsManager.soundVolume != 0.0F) {
         if(var1 != null) {
            float var3 = var1.aE + (var1.aC - var1.aE) * var2;
            double var4 = var1.at + (var1.aw - var1.at) * (double)var2;
            double var6 = var1.au + (var1.ax - var1.au) * (double)var2;
            double var8 = var1.av + (var1.ay - var1.av) * (double)var2;
            float var10 = fi.b(-var3 * 0.017453292F - 3.1415927F);
            float var11 = fi.a(-var3 * 0.017453292F - 3.1415927F);
            float var12 = -var11;
            float var13 = 0.0F;
            float var14 = -var10;
            float var15 = 0.0F;
            float var16 = 1.0F;
            float var17 = 0.0F;
            soundSystem.setListenerPosition((float)var4, (float)var6, (float)var8);
            soundSystem.setListenerOrientation(var12, var13, var14, var15, var16, var17);
         }
      }
   }

   public void a(String var1, float var2, float var3, float var4, float var5, float var6) {
      if(g && this.optionsManager.soundVolume != 0.0F) {
         String var7 = "streaming";
         if(soundSystem.playing("streaming")) {
            soundSystem.stop("streaming");
         }

         if(var1 != null) {
            al var8 = this.c.a(var1);
            if(var8 != null && var5 > 0.0F) {
               if(soundSystem.playing("BgMusic")) {
                  soundSystem.stop("BgMusic");
               }

               float var9 = 16.0F;
               soundSystem.newStreamingSource(true, var7, var8.b, var8.a, false, var2, var3, var4, 2, var9 * 4.0F);
               soundSystem.setVolume(var7, 0.5F * this.optionsManager.soundVolume);
               soundSystem.play(var7);
            }

         }
      }
   }

   public void b(String var1, float var2, float var3, float var4, float var5, float var6) {
      if(g && this.optionsManager.soundVolume != 0.0F) {
         al var7 = this.b.a(var1);
         if(var7 != null && var5 > 0.0F) {
            this.e = (this.e + 1) % 256;
            String var8 = "sound_" + this.e;
            float var9 = 16.0F;
            if(var5 > 1.0F) {
               var9 *= var5;
            }

            soundSystem.newSource(var5 > 1.0F, var8, var7.b, var7.a, false, var2, var3, var4, 2, var9);
            soundSystem.setPitch(var8, var6);
            if(var5 > 1.0F) {
               var5 = 1.0F;
            }

            soundSystem.setVolume(var8, var5 * this.optionsManager.soundVolume);
            soundSystem.play(var8);
         }

      }
   }

   public void a(String var1, float var2, float var3) {
      if(g && this.optionsManager.soundVolume != 0.0F) {
         al var4 = this.b.a(var1);
         if(var4 != null) {
            this.e = (this.e + 1) % 256;
            String var5 = "sound_" + this.e;
            soundSystem.newSource(false, var5, var4.b, var4.a, false, 0.0F, 0.0F, 0.0F, 0, 0.0F);
            if(var2 > 1.0F) {
               var2 = 1.0F;
            }

            var2 *= 0.25F;
            soundSystem.setPitch(var5, var3);
            soundSystem.setVolume(var5, var2 * this.optionsManager.soundVolume);
            soundSystem.play(var5);
         }

      }
   }

}
