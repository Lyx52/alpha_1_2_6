package mojang;

import mojang.net.minecraft.client.Minecraft;

public class jt extends iv {

   public jt(Minecraft var1) {
      super(var1);
      this.b = true;
   }

   public void b(eb var1) {
      for(int var2 = 0; var2 < 9; ++var2) {
         if(var1.e.a[var2] == null) {
            this.a.playerName.e.a[var2] = new fp(((nq)ea.a.get(var2)).bh);
         } else {
            this.a.playerName.e.a[var2].a = 1;
         }
      }

   }

   public boolean d() {
      return false;
   }

   public void a(cy var1) {
      super.a(var1);
   }

   public void c() {}
}
