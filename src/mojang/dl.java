package mojang;

import mojang.world.World;

import java.util.Random;

public class dl {

   protected int a = 8;
   protected Random b = new Random();


   public void a(bd var1, World var2, int var3, int var4, byte[] var5) {
      int var6 = this.a;
      this.b.setSeed(var2.worldSeed);
      long var7 = this.b.nextLong() / 2L * 2L + 1L;
      long var9 = this.b.nextLong() / 2L * 2L + 1L;

      for(int var11 = var3 - var6; var11 <= var3 + var6; ++var11) {
         for(int var12 = var4 - var6; var12 <= var4 + var6; ++var12) {
            this.b.setSeed((long)var11 * var7 + (long)var12 * var9 ^ var2.worldSeed);
            this.a(var2, var11, var12, var3, var4, var5);
         }
      }

   }

   protected void a(World var1, int var2, int var3, int var4, int var5, byte[] var6) {}
}
