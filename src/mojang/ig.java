package mojang;

import mojang.entity.item.DroppedItem;
import mojang.entity.Entity;
import mojang.world.World;

import java.util.Random;

public class ig extends ok {

   protected ig(int var1, int var2) {
      super(var1, var2);
      this.bg = var2;
      this.b(true);
      float var3 = 0.5F;
      this.a(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, 0.25F, 0.5F + var3);
   }

   protected boolean b(int var1) {
      return var1 == aA.bh;
   }

   public void a(World var1, int var2, int var3, int var4, Random var5) {
      super.a(var1, var2, var3, var4, var5);
      if(var1.j(var2, var3 + 1, var4) >= 9) {
         int var6 = var1.e(var2, var3, var4);
         if(var6 < 7) {
            float var7 = this.i(var1, var2, var3, var4);
            if(var5.nextInt((int)(100.0F / var7)) == 0) {
               ++var6;
               var1.b(var2, var3, var4, var6);
            }
         }
      }

   }

   private float i(World var1, int var2, int var3, int var4) {
      float var5 = 1.0F;
      int var6 = var1.a(var2, var3, var4 - 1);
      int var7 = var1.a(var2, var3, var4 + 1);
      int var8 = var1.a(var2 - 1, var3, var4);
      int var9 = var1.a(var2 + 1, var3, var4);
      int var10 = var1.a(var2 - 1, var3, var4 - 1);
      int var11 = var1.a(var2 + 1, var3, var4 - 1);
      int var12 = var1.a(var2 + 1, var3, var4 + 1);
      int var13 = var1.a(var2 - 1, var3, var4 + 1);
      boolean var14 = var8 == this.bh || var9 == this.bh;
      boolean var15 = var6 == this.bh || var7 == this.bh;
      boolean var16 = var10 == this.bh || var11 == this.bh || var12 == this.bh || var13 == this.bh;

      for(int var17 = var2 - 1; var17 <= var2 + 1; ++var17) {
         for(int var18 = var4 - 1; var18 <= var4 + 1; ++var18) {
            int var19 = var1.a(var17, var3 - 1, var18);
            float var20 = 0.0F;
            if(var19 == aA.bh) {
               var20 = 1.0F;
               if(var1.e(var17, var3 - 1, var18) > 0) {
                  var20 = 3.0F;
               }
            }

            if(var17 != var2 || var18 != var4) {
               var20 /= 4.0F;
            }

            var5 += var20;
         }
      }

      if(var16 || var14 && var15) {
         var5 /= 2.0F;
      }

      return var5;
   }

   public int a(int var1, int var2) {
      if(var2 < 0) {
         var2 = 7;
      }

      return this.bg + var2;
   }

   public int g() {
      return 6;
   }

   public void b(World var1, int var2, int var3, int var4, int var5) {
      super.b(var1, var2, var3, var4, var5);
      if(!var1.z) {
         for(int var6 = 0; var6 < 3; ++var6) {
            if(var1.l.nextInt(15) <= var5) {
               float var7 = 0.7F;
               float var8 = var1.l.nextFloat() * var7 + (1.0F - var7) * 0.5F;
               float var9 = var1.l.nextFloat() * var7 + (1.0F - var7) * 0.5F;
               float var10 = var1.l.nextFloat() * var7 + (1.0F - var7) * 0.5F;
               DroppedItem var11 = new DroppedItem(var1, (double)((float)var2 + var8), (double)((float)var3 + var9), (double)((float)var4 + var10), new fp(Item.Q));
               var11.c = 10;
               var1.a((Entity)var11);
            }
         }
      }

   }

   public int a(int var1, Random var2) {
      return var1 == 7? Item.R.aW:-1;
   }

   public int a(Random var1) {
      return 1;
   }
}
