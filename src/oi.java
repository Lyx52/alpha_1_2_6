import java.awt.Component;
import java.nio.IntBuffer;
import org.lwjgl.LWJGLException;
import org.lwjgl.input.Cursor;
import org.lwjgl.input.Mouse;

public class oi {

   private Component c;
   private Cursor d;
   public int a;
   public int b;
   private int e = 10;


   public oi(Component var1) {
      this.c = var1;
      IntBuffer var2 = ds.c(1);
      var2.put(0);
      var2.flip();
      IntBuffer var3 = ds.c(1024);

      try {
         this.d = new Cursor(32, 32, 16, 16, 1, var3, var2);
      } catch (LWJGLException var5) {
         var5.printStackTrace();
      }

   }

   public void a() {
      Mouse.setGrabbed(true);
      this.a = 0;
      this.b = 0;
   }

   public void b() {
      Mouse.setCursorPosition(this.c.getWidth() / 2, this.c.getHeight() / 2);
      Mouse.setGrabbed(false);
   }

   public void c() {
      this.a = Mouse.getDX();
      this.b = Mouse.getDY();
   }
}
