package mojang;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class ek extends BasePacket {

   public long a;


   public void a(DataInputStream var1) throws IOException {
      this.a = var1.readLong();
   }

   public void a(DataOutputStream var1) throws IOException {
      var1.writeLong(this.a);
   }

   public void a(mo var1) {
      var1.a(this);
   }

   public int a() {
      return 8;
   }
}
