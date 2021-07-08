package mojang;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class a extends BasePacket {

   public int a;
   public int b;
   public int c;


   public a() {}

   public a(int var1, int var2, int var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public void a(DataInputStream var1) throws IOException {
      this.a = var1.readInt();
      this.b = var1.readInt();
      this.c = var1.readByte();
   }

   public void a(DataOutputStream var1) throws IOException {
      var1.writeInt(this.a);
      var1.writeInt(this.b);
      var1.writeByte(this.c);
   }

   public void a(mo var1) {
      var1.a(this);
   }

   public int a() {
      return 9;
   }
}
