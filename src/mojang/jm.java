package mojang;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import mojang.net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class jm extends d {

   private int e = -1;
   private BufferedImage f;


   public jm() {
      this.a = "Default";
      this.b = "The default look of Minecraft";

      try {
         this.f = ImageIO.read(jm.class.getResource("/mojang/pack.png"));
      } catch (IOException var2) {
         var2.printStackTrace();
      }

   }

   public void b(Minecraft var1) {
      if(this.f != null) {
         var1.n.a(this.e);
      }

   }

   public void c(Minecraft var1) {
      if(this.f != null && this.e < 0) {
         this.e = var1.n.a(this.f);
      }

      if(this.f != null) {
         var1.n.b(this.e);
      } else {
         GL11.glBindTexture(3553, var1.n.loadTexture("/mojang/assets/gui/unknown_pack.png"));
      }

   }
}
