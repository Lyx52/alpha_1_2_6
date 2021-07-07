package mojang;

import mojang.entity.item.DroppedItem;
import mojang.entity.Entity;

public class dg extends nq {

   protected dg(int var1, int var2) {
      super(var1, var2, hb.c);
   }

   public int a(int var1) {
      return this.bg + (var1 == 1?1:0);
   }

   public boolean a(cy var1, int var2, int var3, int var4, eb var5) {
      int var6 = var1.e(var2, var3, var4);
      if(var6 > 0) {
         this.e(var1, var2, var3, var4, var6);
         return true;
      } else {
         return false;
      }
   }

   public void e(cy var1, int var2, int var3, int var4, int var5) {
      var1.a((String)null, var2, var3, var4);
      var1.b(var2, var3, var4, 0);
      int var6 = dx.aU.aW + var5 - 1;
      float var7 = 0.7F;
      double var8 = (double)(var1.l.nextFloat() * var7) + (double)(1.0F - var7) * 0.5D;
      double var10 = (double)(var1.l.nextFloat() * var7) + (double)(1.0F - var7) * 0.2D + 0.6D;
      double var12 = (double)(var1.l.nextFloat() * var7) + (double)(1.0F - var7) * 0.5D;
      DroppedItem var14 = new DroppedItem(var1, (double)var2 + var8, (double)var3 + var10, (double)var4 + var12, new fp(var6));
      var14.c = 10;
      var1.a((Entity)var14);
   }

   public void a(cy var1, int var2, int var3, int var4, int var5, float var6) {
      if(!var1.z) {
         if(var5 > 0) {
            this.e(var1, var2, var3, var4, var5);
         }

         super.a(var1, var2, var3, var4, var5, var6);
      }
   }
}
