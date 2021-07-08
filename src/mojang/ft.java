package mojang;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class ft {

   private static final int[] a = new int[65536];


   public static int a(double var0, double var2) {
      var2 *= var0;
      int var4 = (int)((1.0D - var0) * 255.0D);
      int var5 = (int)((1.0D - var2) * 255.0D);
      return a[var5 << 8 | var4];
   }

   static {
      try {
         BufferedImage var0 = ImageIO.read(ft.class.getResource("/mojang/assets/misc/foliagecolor.png"));
         var0.getRGB(0, 0, 256, 256, a, 0, 256);
      } catch (Exception var1) {
         var1.printStackTrace();
      }

   }
}
