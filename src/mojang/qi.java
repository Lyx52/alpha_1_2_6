package mojang;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class qi extends BasePacket {

   public String a;


   public qi() {}

   public qi(String message) {
      this.a = message;
   }

   public void a(DataInputStream var1) throws IOException {
      this.a = var1.readUTF();
   }

   public void a(DataOutputStream var1) throws IOException {
      var1.writeUTF(this.a);
   }

   public void a(mo var1) {
      var1.a(this);
   }

   public int a() {
      return this.a.length();
   }
}
