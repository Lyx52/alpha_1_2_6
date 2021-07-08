package mojang;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class gc extends BasePacket {

   public int a;
   public int b;
   public int c;
   public int d;
   public int e;


   public gc() {}

   public gc(int var1, int var2, int var3, int var4, int var5) {
      this.e = var1;
      this.a = var2;
      this.b = var3;
      this.c = var4;
      this.d = var5;
   }

   public void a(DataInputStream var1) throws IOException {
      this.e = var1.read();
      this.a = var1.readInt();
      this.b = var1.read();
      this.c = var1.readInt();
      this.d = var1.read();
   }

   public void a(DataOutputStream var1) throws IOException {
      var1.write(this.e);
      var1.writeInt(this.a);
      var1.write(this.b);
      var1.writeInt(this.c);
      var1.write(this.d);
   }

   public void a(mo var1) {
      var1.a(this);
   }

   public int a() {
      return 11;
   }
}
