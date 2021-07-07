package mojang;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class mt extends gk {

   public int a;
   public int b;
   public int c;


   public void a(DataInputStream var1) throws IOException {
      this.a = var1.readShort();
      this.b = var1.readByte();
      this.c = var1.readShort();
   }

   public void a(DataOutputStream var1) throws IOException {
      var1.writeShort(this.a);
      var1.writeByte(this.b);
      var1.writeShort(this.c);
   }

   public void a(mo var1) {
      var1.a(this);
   }

   public int a() {
      return 5;
   }
}
