package mojang;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class lq extends BasePacket {

   public int a;
   public int b;
   public boolean c;


   public void a(DataInputStream var1) throws IOException {
      this.a = var1.readInt();
      this.b = var1.readInt();
      this.c = var1.read() != 0;
   }

   public void a(DataOutputStream var1) throws IOException {
      var1.writeInt(this.a);
      var1.writeInt(this.b);
      var1.write(this.c?1:0);
   }

   public void a(mo var1) {
      var1.a(this);
   }

   public int a() {
      return 9;
   }
}
