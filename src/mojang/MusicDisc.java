package mojang;

import mojang.world.World;

public class MusicDisc extends Item {

   private String name;


   protected MusicDisc(int id, String name) {
      super(id);
      this.name = name;
      this.aX = 1;
   }

   public boolean a(fp var1, eb var2, World var3, int var4, int var5, int var6, int var7) {
      if(var3.a(var4, var5, var6) == nq.aY.bh && var3.e(var4, var5, var6) == 0) {
         var3.b(var4, var5, var6, this.aW - MUSIC_DISC_13.aW + 1);
         var3.a(this.name, var4, var5, var6);
         --var1.a;
         return true;
      } else {
         return false;
      }
   }
}
