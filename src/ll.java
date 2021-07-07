import java.io.DataInputStream;
import java.io.DataOutputStream;

public class ll extends nh {

   public ll() {
      this.g = true;
   }

   public void a(DataInputStream var1) {
      super.a(var1);
      this.e = var1.readByte();
      this.f = var1.readByte();
   }

   public void a(DataOutputStream var1) {
      super.a(var1);
      var1.writeByte(this.e);
      var1.writeByte(this.f);
   }

   public int a() {
      return 6;
   }
}
