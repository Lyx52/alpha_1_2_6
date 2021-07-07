import java.io.DataInputStream;
import java.io.DataOutputStream;

public class cq extends gk {

   public int a;


   public void a(DataInputStream var1) {
      this.a = var1.readByte();
   }

   public void a(DataOutputStream var1) {
      var1.writeByte(this.a);
   }

   public void a(mo var1) {
      var1.a(this);
   }

   public int a() {
      return 1;
   }
}
