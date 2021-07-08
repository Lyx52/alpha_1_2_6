package mojang;

import org.lwjgl.opengl.GL11;

public class ad {

   public byte[] a = new byte[1024];
   public int b;
   public boolean c = false;
   public int d = 0;
   public int e = 1;
   public int textureID = 0;


   public ad(int var1) {
      this.b = var1;
   }

   public void a() {}

   public void setTexture(Texture texture) {
      if(this.textureID == 0) {
         GL11.glBindTexture(3553, texture.loadTexture("/mojang/terrain.png"));
      } else if(this.textureID == 1) {
         GL11.glBindTexture(3553, texture.loadTexture("/mojang/assets/gui/items.png"));
      }

   }
}
