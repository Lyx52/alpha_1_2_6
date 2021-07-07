package mojang;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class ii extends gk {

   public int a;
   public int b;


   public ii() {}

   public ii(lw var1, int var2) {
      this.a = var1.an;
      this.b = var2;
   }

   public void a(DataInputStream var1) throws IOException {
      this.a = var1.readInt();
      this.b = var1.readByte();
   }

   public void a(DataOutputStream var1) throws IOException {
      var1.writeInt(this.a);
      var1.writeByte(this.b);
   }

   public void a(mo var1) {
      var1.a(this);
   }

   public int a() {
      return 5;
   }
}
