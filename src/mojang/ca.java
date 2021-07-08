package mojang;

import mojang.world.World;

import java.util.Random;

public class ca extends nq {

   protected ca(int var1, int var2) {
      super(var1, var2, hb.n);
   }

   public co d(World var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      float var6 = 0.125F;
      if(var5 == 2) {
         this.a(0.0F, 0.0F, 1.0F - var6, 1.0F, 1.0F, 1.0F);
      }

      if(var5 == 3) {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var6);
      }

      if(var5 == 4) {
         this.a(1.0F - var6, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      }

      if(var5 == 5) {
         this.a(0.0F, 0.0F, 0.0F, var6, 1.0F, 1.0F);
      }

      return super.d(var1, var2, var3, var4);
   }

   public co f(World var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      float var6 = 0.125F;
      if(var5 == 2) {
         this.a(0.0F, 0.0F, 1.0F - var6, 1.0F, 1.0F, 1.0F);
      }

      if(var5 == 3) {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var6);
      }

      if(var5 == 4) {
         this.a(1.0F - var6, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      }

      if(var5 == 5) {
         this.a(0.0F, 0.0F, 0.0F, var6, 1.0F, 1.0F);
      }

      return super.f(var1, var2, var3, var4);
   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public int g() {
      return 8;
   }

   public boolean a(World var1, int var2, int var3, int var4) {
      return var1.g(var2 - 1, var3, var4)?true:(var1.g(var2 + 1, var3, var4)?true:(var1.g(var2, var3, var4 - 1)?true:var1.g(var2, var3, var4 + 1)));
   }

   public void d(World var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.e(var2, var3, var4);
      if((var6 == 0 || var5 == 2) && var1.g(var2, var3, var4 + 1)) {
         var6 = 2;
      }

      if((var6 == 0 || var5 == 3) && var1.g(var2, var3, var4 - 1)) {
         var6 = 3;
      }

      if((var6 == 0 || var5 == 4) && var1.g(var2 + 1, var3, var4)) {
         var6 = 4;
      }

      if((var6 == 0 || var5 == 5) && var1.g(var2 - 1, var3, var4)) {
         var6 = 5;
      }

      var1.b(var2, var3, var4, var6);
   }

   public void a(World var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.e(var2, var3, var4);
      boolean var7 = false;
      if(var6 == 2 && var1.g(var2, var3, var4 + 1)) {
         var7 = true;
      }

      if(var6 == 3 && var1.g(var2, var3, var4 - 1)) {
         var7 = true;
      }

      if(var6 == 4 && var1.g(var2 + 1, var3, var4)) {
         var7 = true;
      }

      if(var6 == 5 && var1.g(var2 - 1, var3, var4)) {
         var7 = true;
      }

      if(!var7) {
         this.b_(var1, var2, var3, var4, var6);
         var1.d(var2, var3, var4, 0);
      }

      super.a(var1, var2, var3, var4, var5);
   }

   public int a(Random var1) {
      return 1;
   }
}
