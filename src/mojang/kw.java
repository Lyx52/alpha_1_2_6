package mojang;

import mojang.world.World;

import java.awt.image.BufferedImage;

public class kw {

   public BufferedImage a;
   public World b;
   public int c;
   public int d;
   public boolean e = false;
   public boolean f = false;
   public int g = 0;
   public boolean h = false;


   public kw(World var1, int var2, int var3) {
      this.b = var1;
      this.a(var2, var3);
   }

   public void a(int var1, int var2) {
      this.e = false;
      this.c = var1;
      this.d = var2;
      this.g = 0;
      this.h = false;
   }

   public void a(World var1, int var2, int var3) {
      this.b = var1;
      this.a(var2, var3);
   }
}
