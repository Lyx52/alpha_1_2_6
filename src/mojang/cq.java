package mojang;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class cq extends BasePacket {

   public int a;


   public void a(DataInputStream var1) throws IOException {
      this.a = var1.readByte();
   }

   public void a(DataOutputStream var1) throws IOException {
      var1.writeByte(this.a);
   }

   public void a(mo var1) {
      var1.a(this);
   }

   public int a() {
      return 1;
   }
}
