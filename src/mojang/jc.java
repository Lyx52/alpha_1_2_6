package mojang;

import org.lwjgl.opengl.GL11;

public class jc extends ex {

   public fn j = new fn();


   public jc(fo var1) {
      this.i.add(new ar(this, this.j.a, this.j.b, 0, 124, 35));

      int var2;
      int var3;
      for(var2 = 0; var2 < 3; ++var2) {
         for(var3 = 0; var3 < 3; ++var3) {
            this.i.add(new of(this, this.j.a, var3 + var2 * 3, 30 + var3 * 18, 17 + var2 * 18));
         }
      }

      for(var2 = 0; var2 < 3; ++var2) {
         for(var3 = 0; var3 < 9; ++var3) {
            this.i.add(new of(this, var1, var3 + (var2 + 1) * 9, 8 + var3 * 18, 84 + var2 * 18));
         }
      }

      for(var2 = 0; var2 < 9; ++var2) {
         this.i.add(new of(this, var1, var2, 8 + var2 * 18, 142));
      }

   }

   public void h() {
      super.h();
      this.j.a((eb)this.b.playerName);
   }

   protected void j() {
      this.g.b("Crafting", 28, 6, 4210752);
      this.g.b("Inventory", 8, this.h - 96 + 2, 4210752);
   }

   protected void a(float var1) {
      int var2 = this.b.n.a("/mojang/gui/crafting.png");
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.b.n.b(var2);
      int var3 = (this.c - this.a) / 2;
      int var4 = (this.d - this.h) / 2;
      this.b(var3, var4, 0, 0, this.a, this.h);
   }
}
