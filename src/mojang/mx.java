package mojang;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class mx extends BasePacket {

   public int a;
   public int b;
   public int c;
   public int d;
   public int e;


   public mx() {
      this.j = true;
   }

   public void a(DataInputStream var1) throws IOException {
      this.a = var1.readInt();
      this.b = var1.read();
      this.c = var1.readInt();
      this.d = var1.read();
      this.e = var1.read();
   }

   public void a(DataOutputStream var1) throws IOException {
      var1.writeInt(this.a);
      var1.write(this.b);
      var1.writeInt(this.c);
      var1.write(this.d);
      var1.write(this.e);
   }

   public void a(mo var1) {
      var1.a(this);
   }

   public int a() {
      return 11;
   }
}
