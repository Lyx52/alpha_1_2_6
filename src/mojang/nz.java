package mojang;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class nz extends fa {

   public nz() {
      this.i = true;
   }

   public nz(float var1, float var2, boolean var3) {
      this.e = var1;
      this.f = var2;
      this.g = var3;
      this.i = true;
   }

   public void a(DataInputStream var1) throws IOException {
      this.e = var1.readFloat();
      this.f = var1.readFloat();
      super.a(var1);
   }

   public void a(DataOutputStream var1) throws IOException {
      var1.writeFloat(this.e);
      var1.writeFloat(this.f);
      super.a(var1);
   }

   public int a() {
      return 9;
   }
}
