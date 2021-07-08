package mojang;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class ed extends BasePacket {

   public int a;
   public int b;
   public int c;
   public int d;
   public int e;


   public ed() {}

   public ed(int var1, int var2, int var3, int var4, int var5) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
   }

   public void a(DataInputStream var1) throws IOException {
      this.a = var1.readShort();
      this.b = var1.readInt();
      this.c = var1.read();
      this.d = var1.readInt();
      this.e = var1.read();
   }

   public void a(DataOutputStream var1) throws IOException {
      var1.writeShort(this.a);
      var1.writeInt(this.b);
      var1.write(this.c);
      var1.writeInt(this.d);
      var1.write(this.e);
   }

   public void a(mo var1) {
      var1.a(this);
   }

   public int a() {
      return 12;
   }
}
