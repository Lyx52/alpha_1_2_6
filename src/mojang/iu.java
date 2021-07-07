package mojang;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class iu extends gk {

   public int a;
   public String b;
   public String c;
   public long d;
   public byte e;


   public iu() {}

   public iu(String var1, String var2, int var3) {
      this.b = var1;
      this.c = var2;
      this.a = var3;
   }

   public void a(DataInputStream var1) throws IOException {
      this.a = var1.readInt();
      this.b = var1.readUTF();
      this.c = var1.readUTF();
      this.d = var1.readLong();
      this.e = var1.readByte();
   }

   public void a(DataOutputStream var1) throws IOException {
      var1.writeInt(this.a);
      var1.writeUTF(this.b);
      var1.writeUTF(this.c);
      var1.writeLong(this.d);
      var1.writeByte(this.e);
   }

   public void a(mo var1) throws IOException {
      var1.a(this);
   }

   public int a() {
      return 4 + this.b.length() + this.c.length() + 4 + 5;
   }
}
