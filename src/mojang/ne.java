package mojang;

import org.lwjgl.opengl.GL11;

public class ne extends ex {

   private q j;
   private float l;
   private float m;


   public ne(hi var1, fp[] var2) {
      this.f = true;
      this.j = new q(var2);
      this.i.add(new ar(this, this.j.a, this.j.b, 0, 144, 36));

      int var3;
      int var4;
      for(var3 = 0; var3 < 2; ++var3) {
         for(var4 = 0; var4 < 2; ++var4) {
            this.i.add(new of(this, this.j.a, var4 + var3 * 2, 88 + var4 * 18, 26 + var3 * 18));
         }
      }

      for(var3 = 0; var3 < 4; ++var3) {
         this.i.add(new na(this, this, var1, var1.c() - 1 - var3, 8, 8 + var3 * 18, var3));
      }

      for(var3 = 0; var3 < 3; ++var3) {
         for(var4 = 0; var4 < 9; ++var4) {
            this.i.add(new of(this, var1, var4 + (var3 + 1) * 9, 8 + var4 * 18, 84 + var3 * 18));
         }
      }

      for(var3 = 0; var3 < 9; ++var3) {
         this.i.add(new of(this, var1, var3, 8 + var3 * 18, 142));
      }

   }

   protected void j() {
      this.g.b("Crafting", 86, 16, 4210752);
   }

   public void a(int var1, int var2, float var3) {
      super.a(var1, var2, var3);
      this.l = (float)var1;
      this.m = (float)var2;
   }

   protected void a(float var1) {
      int var2 = this.b.n.a("/mojang/gui/inventory.png");
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.b.n.b(var2);
      int var3 = (this.c - this.a) / 2;
      int var4 = (this.d - this.h) / 2;
      this.b(var3, var4, 0, 0, this.a, this.h);
      GL11.glEnable('\u803a');
      GL11.glEnable(2903);
      GL11.glPushMatrix();
      GL11.glTranslatef((float)(var3 + 51), (float)(var4 + 75), 50.0F);
      float var5 = 30.0F;
      GL11.glScalef(-var5, var5, var5);
      GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
      float var6 = this.b.playerName.s;
      float var7 = this.b.playerName.aC;
      float var8 = this.b.playerName.aD;
      float var9 = (float)(var3 + 51) - this.l;
      float var10 = (float)(var4 + 75 - 50) - this.m;
      GL11.glRotatef(135.0F, 0.0F, 1.0F, 0.0F);
      mojang.l.b();
      GL11.glRotatef(-135.0F, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(-((float)Math.atan((double)(var10 / 40.0F))) * 20.0F, 1.0F, 0.0F, 0.0F);
      this.b.playerName.s = (float)Math.atan((double)(var9 / 40.0F)) * 20.0F;
      this.b.playerName.aC = (float)Math.atan((double)(var9 / 40.0F)) * 40.0F;
      this.b.playerName.aD = -((float)Math.atan((double)(var10 / 40.0F))) * 20.0F;
      GL11.glTranslatef(0.0F, this.b.playerName.aO, 0.0F);
      mn.a.a(this.b.playerName, 0.0D, 0.0D, 0.0D, 0.0F, 1.0F);
      this.b.playerName.s = var6;
      this.b.playerName.aC = var7;
      this.b.playerName.aD = var8;
      GL11.glPopMatrix();
      mojang.l.a();
      GL11.glDisable('\u803a');
   }
}
