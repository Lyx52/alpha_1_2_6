import org.lwjgl.opengl.GL11;

public class ad {

   public byte[] a = new byte[1024];
   public int b;
   public boolean c = false;
   public int d = 0;
   public int e = 1;
   public int f = 0;


   public ad(int var1) {
      this.b = var1;
   }

   public void a() {}

   public void a(fu var1) {
      if(this.f == 0) {
         GL11.glBindTexture(3553, var1.a("/terrain.png"));
      } else if(this.f == 1) {
         GL11.glBindTexture(3553, var1.a("/gui/items.png"));
      }

   }
}
