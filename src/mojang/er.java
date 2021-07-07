package mojang;

import org.lwjgl.opengl.GL11;

public class er extends ex {

   private hi j;
   private hi l;
   private int m = 0;


   public er(hi var1, hi var2) {
      this.j = var1;
      this.l = var2;
      this.f = false;
      short var3 = 222;
      int var4 = var3 - 108;
      this.m = var2.c() / 9;
      this.h = var4 + this.m * 18;
      int var5 = (this.m - 4) * 18;

      int var6;
      int var7;
      for(var6 = 0; var6 < this.m; ++var6) {
         for(var7 = 0; var7 < 9; ++var7) {
            this.i.add(new of(this, var2, var7 + var6 * 9, 8 + var7 * 18, 18 + var6 * 18));
         }
      }

      for(var6 = 0; var6 < 3; ++var6) {
         for(var7 = 0; var7 < 9; ++var7) {
            this.i.add(new of(this, var1, var7 + (var6 + 1) * 9, 8 + var7 * 18, 103 + var6 * 18 + var5));
         }
      }

      for(var6 = 0; var6 < 9; ++var6) {
         this.i.add(new of(this, var1, var6, 8 + var6 * 18, 161 + var5));
      }

   }

   protected void j() {
      this.g.b(this.l.d(), 8, 6, 4210752);
      this.g.b(this.j.d(), 8, this.h - 96 + 2, 4210752);
   }

   protected void a(float var1) {
      int var2 = this.b.n.a("/mojang/gui/container.png");
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.b.n.b(var2);
      int var3 = (this.c - this.a) / 2;
      int var4 = (this.d - this.h) / 2;
      this.b(var3, var4, 0, 0, this.a, this.m * 18 + 17);
      this.b(var3, var4 + this.m * 18 + 17, 0, 126, this.a, 96);
   }
}
