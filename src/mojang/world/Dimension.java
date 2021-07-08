package mojang.world;

import mojang.*;

import java.io.File;
import java.io.IOException;

public class Dimension {

   public World a;
   public po b;
   public boolean c = false;
   public boolean d = false;
   public boolean e = false;
   public float[] f = new float[16];
   public int g = 0;
   private float[] h = new float[4];


   public final void a(World var1) {
      this.a = var1;
      this.a();
      this.b();
   }

   protected void b() {
      float var1 = 0.05F;

      for(int var2 = 0; var2 <= 15; ++var2) {
         float var3 = 1.0F - (float)var2 / 15.0F;
         this.f[var2] = (1.0F - var3) / (var3 * 3.0F + 1.0F) * (1.0F - var1) + var1;
      }

   }

   protected void a() {
      this.b = new po(this.a);
   }

   public bd c() {
      return new px(this.a, this.a.worldSeed);
   }

   public ai a(File var1) throws IOException {
      return new mu(var1, true);
   }

   public boolean a(int var1, int var2) {
      int var3 = this.a.a(var1, var2);
      return var3 == nq.E.bh;
   }

   public float a(long var1, float var3) {
      int var4 = (int)(var1 % 24000L);
      float var5 = ((float)var4 + var3) / 24000.0F - 0.25F;
      if(var5 < 0.0F) {
         ++var5;
      }

      if(var5 > 1.0F) {
         --var5;
      }

      float var6 = var5;
      var5 = 1.0F - (float)((Math.cos((double)var5 * 3.141592653589793D) + 1.0D) / 2.0D);
      var5 = var6 + (var5 - var6) / 3.0F;
      return var5;
   }

   public float[] b(float var1, float var2) {
      float var3 = 0.4F;
      float var4 = fi.b(var1 * 3.1415927F * 2.0F) - 0.0F;
      float var5 = -0.0F;
      if(var4 >= var5 - var3 && var4 <= var5 + var3) {
         float var6 = (var4 - var5) / var3 * 0.5F + 0.5F;
         float var7 = 1.0F - (1.0F - fi.a(var6 * 3.1415927F)) * 0.99F;
         var7 *= var7;
         this.h[0] = var6 * 0.3F + 0.7F;
         this.h[1] = var6 * var6 * 0.7F + 0.2F;
         this.h[2] = var6 * var6 * 0.0F + 0.2F;
         this.h[3] = var7;
         return this.h;
      } else {
         return null;
      }
   }

   public ao a(float var1, float var2) {
      float var3 = fi.b(var1 * 3.1415927F * 2.0F) * 2.0F + 0.5F;
      if(var3 < 0.0F) {
         var3 = 0.0F;
      }

      if(var3 > 1.0F) {
         var3 = 1.0F;
      }

      float var4 = 0.7529412F;
      float var5 = 0.84705883F;
      float var6 = 1.0F;
      var4 *= var3 * 0.94F + 0.06F;
      var5 *= var3 * 0.94F + 0.06F;
      var6 *= var3 * 0.91F + 0.09F;
      return ao.b((double)var4, (double)var5, (double)var6);
   }

   public boolean d() {
      return true;
   }

   public static Dimension a(int var0) {
      return (Dimension)(var0 == 0?new Dimension():(var0 == -1?new OverworldDimension():null));
   }
}
