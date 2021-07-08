package mojang;

import mojang.entity.Entity;
import mojang.entity.item.FallingSand;
import mojang.world.World;

import java.util.Random;

public class dw extends nq {

   public static boolean a = false;


   public dw(int var1, int var2) {
      super(var1, var2, hb.m);
   }

   public void e(World var1, int var2, int var3, int var4) {
      var1.h(var2, var3, var4, this.bh);
   }

   public void a(World var1, int var2, int var3, int var4, int var5) {
      var1.h(var2, var3, var4, this.bh);
   }

   public void a(World var1, int var2, int var3, int var4, Random var5) {
      this.h(var1, var2, var3, var4);
   }

   private void h(World var1, int var2, int var3, int var4) {
      if(b_(var1, var2, var3 - 1, var4) && var3 >= 0) {
         FallingSand var8 = new FallingSand(var1, (float)var2 + 0.5F, (float)var3 + 0.5F, (float)var4 + 0.5F, this.bh);
         if(a) {
            while(!var8.aN) {
               var8.e_();
            }
         } else {
            var1.a((Entity)var8);
         }
      }

   }

   public int d() {
      return 3;
   }

   public static boolean b_(World var0, int var1, int var2, int var3) {
      int var4 = var0.a(var1, var2, var3);
      if(var4 == 0) {
         return true;
      } else if(var4 == ar.bh) {
         return true;
      } else {
         hb var5 = m[var4].bs;
         return var5 == hb.f?true:var5 == hb.g;
      }
   }

}
