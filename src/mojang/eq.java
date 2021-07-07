package mojang;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class eq extends gk {

   public int a;
   public int b;


   public eq() {}

   public eq(int var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   public void a(DataInputStream var1) throws IOException {
      this.a = var1.readInt();
      this.b = var1.readShort();
   }

   public void a(DataOutputStream var1) throws IOException {
      var1.writeInt(this.a);
      var1.writeShort(this.b);
   }

   public void a(mo var1) {
      var1.a(this);
   }

   public int a() {
      return 6;
   }
}
