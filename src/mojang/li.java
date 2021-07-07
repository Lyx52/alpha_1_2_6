package mojang;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class li extends gk {

   public int a;


   public void a(DataInputStream var1) throws IOException {
      this.a = var1.readInt();
   }

   public void a(DataOutputStream var1) throws IOException {
      var1.writeInt(this.a);
   }

   public void a(mo var1) {
      var1.a(this);
   }

   public int a() {
      return 4;
   }
}
