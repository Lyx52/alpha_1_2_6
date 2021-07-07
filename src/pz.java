import org.lwjgl.opengl.GL11;

public class pz extends ec {

   private float a;


   public pz(gm var1, float var2, float var3) {
      super(var1, var2 * var3);
      this.a = var3;
   }

   protected void a(ip var1, float var2) {
      GL11.glScalef(this.a, this.a, this.a);
   }
}
