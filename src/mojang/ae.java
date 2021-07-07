package mojang;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import mojang.net.minecraft.client.Minecraft;

public class ae extends ad {

   private Minecraft g;
   private int[] h = new int[256];
   private double i;
   private double j;


   public ae(Minecraft var1) {
      super(dx.aO.a((fp)null));
      this.g = var1;
      this.f = 1;

      try {
         BufferedImage var2 = ImageIO.read(Minecraft.class.getResource("/mojang/gui/items.png"));
         int var3 = this.b % 16 * 16;
         int var4 = this.b / 16 * 16;
         var2.getRGB(var3, var4, 16, 16, this.h, 0, 16);
      } catch (IOException var5) {
         var5.printStackTrace();
      }

   }

   public void a() {
      for(int var1 = 0; var1 < 256; ++var1) {
         int var2 = this.h[var1] >> 24 & 255;
         int var3 = this.h[var1] >> 16 & 255;
         int var4 = this.h[var1] >> 8 & 255;
         int var5 = this.h[var1] >> 0 & 255;
         if(this.c) {
            int var6 = (var3 * 30 + var4 * 59 + var5 * 11) / 100;
            int var7 = (var3 * 30 + var4 * 70) / 100;
            int var8 = (var3 * 30 + var5 * 70) / 100;
            var3 = var6;
            var4 = var7;
            var5 = var8;
         }

         this.a[var1 * 4 + 0] = (byte)var3;
         this.a[var1 * 4 + 1] = (byte)var4;
         this.a[var1 * 4 + 2] = (byte)var5;
         this.a[var1 * 4 + 3] = (byte)var2;
      }

      double var20 = 0.0D;
      double var21;
      double var22;
      if(this.g.e != null && this.g.playerName != null) {
         var21 = (double)this.g.e.m - this.g.playerName.aw;
         var22 = (double)this.g.e.o - this.g.playerName.ay;
         var20 = (double)(this.g.playerName.aC - 90.0F) * 3.141592653589793D / 180.0D - Math.atan2(var22, var21);
         if(this.g.e.q.c) {
            var20 = Math.random() * 3.1415927410125732D * 2.0D;
         }
      }

      for(var21 = var20 - this.i; var21 < -3.141592653589793D; var21 += 6.283185307179586D) {
         ;
      }

      while(var21 >= 3.141592653589793D) {
         var21 -= 6.283185307179586D;
      }

      if(var21 < -1.0D) {
         var21 = -1.0D;
      }

      if(var21 > 1.0D) {
         var21 = 1.0D;
      }

      this.j += var21 * 0.1D;
      this.j *= 0.8D;
      this.i += this.j;
      var22 = Math.sin(this.i);
      double var23 = Math.cos(this.i);

      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      int var14;
      int var15;
      short var16;
      int var17;
      int var18;
      int var19;
      for(var9 = -4; var9 <= 4; ++var9) {
         var10 = (int)(8.5D + var23 * (double)var9 * 0.3D);
         var11 = (int)(7.5D - var22 * (double)var9 * 0.3D * 0.5D);
         var12 = var11 * 16 + var10;
         var13 = 100;
         var14 = 100;
         var15 = 100;
         var16 = 255;
         if(this.c) {
            var17 = (var13 * 30 + var14 * 59 + var15 * 11) / 100;
            var18 = (var13 * 30 + var14 * 70) / 100;
            var19 = (var13 * 30 + var15 * 70) / 100;
            var13 = var17;
            var14 = var18;
            var15 = var19;
         }

         this.a[var12 * 4 + 0] = (byte)var13;
         this.a[var12 * 4 + 1] = (byte)var14;
         this.a[var12 * 4 + 2] = (byte)var15;
         this.a[var12 * 4 + 3] = (byte)var16;
      }

      for(var9 = -8; var9 <= 16; ++var9) {
         var10 = (int)(8.5D + var22 * (double)var9 * 0.3D);
         var11 = (int)(7.5D + var23 * (double)var9 * 0.3D * 0.5D);
         var12 = var11 * 16 + var10;
         var13 = var9 >= 0?255:100;
         var14 = var9 >= 0?20:100;
         var15 = var9 >= 0?20:100;
         var16 = 255;
         if(this.c) {
            var17 = (var13 * 30 + var14 * 59 + var15 * 11) / 100;
            var18 = (var13 * 30 + var14 * 70) / 100;
            var19 = (var13 * 30 + var15 * 70) / 100;
            var13 = var17;
            var14 = var18;
            var15 = var19;
         }

         this.a[var12 * 4 + 0] = (byte)var13;
         this.a[var12 * 4 + 1] = (byte)var14;
         this.a[var12 * 4 + 2] = (byte)var15;
         this.a[var12 * 4 + 3] = (byte)var16;
      }

   }
}
