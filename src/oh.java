import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class oh extends gh {

   public float i = 1.0F;
   public boolean j = false;
   private int l = 0;


   public oh(int var1, int var2, int var3, int var4, String var5, float var6) {
      super(var1, var2, var3, 150, 20, var5);
      this.l = var4;
      this.i = var6;
   }

   protected int a(boolean var1) {
      return 0;
   }

   protected void b(Minecraft var1, int var2, int var3) {
      if(this.h) {
         if(this.j) {
            this.i = (float)(var2 - (this.c + 4)) / (float)(this.a - 8);
            if(this.i < 0.0F) {
               this.i = 0.0F;
            }

            if(this.i > 1.0F) {
               this.i = 1.0F;
            }

            var1.y.a(this.l, this.i);
            this.e = var1.y.d(this.l);
         }

         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         this.b(this.c + (int)(this.i * (float)(this.a - 8)), this.d, 0, 66, 4, 20);
         this.b(this.c + (int)(this.i * (float)(this.a - 8)) + 4, this.d, 196, 66, 4, 20);
      }
   }

   public boolean c(Minecraft var1, int var2, int var3) {
      if(super.c(var1, var2, var3)) {
         this.i = (float)(var2 - (this.c + 4)) / (float)(this.a - 8);
         if(this.i < 0.0F) {
            this.i = 0.0F;
         }

         if(this.i > 1.0F) {
            this.i = 1.0F;
         }

         var1.y.a(this.l, this.i);
         this.e = var1.y.d(this.l);
         this.j = true;
         return true;
      } else {
         return false;
      }
   }

   public void a(int var1, int var2) {
      this.j = false;
   }
}
