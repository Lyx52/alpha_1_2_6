package mojang;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class hw extends gk {

   public String a;


   public hw() {}

   public hw(String var1) {
      this.a = var1;
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
      return 4 + this.a.length() + 4;
   }
}
