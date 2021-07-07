package mojang;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class t extends fa {

   public t() {
      this.h = true;
   }

   public t(double var1, double var3, double var5, double var7, boolean var9) {
      this.a = var1;
      this.b = var3;
      this.d = var5;
      this.c = var7;
      this.g = var9;
      this.h = true;
   }

   public void a(DataInputStream var1) throws IOException {
      this.a = var1.readDouble();
      this.b = var1.readDouble();
      this.d = var1.readDouble();
      this.c = var1.readDouble();
      super.a(var1);
   }

   public void a(DataOutputStream var1) throws IOException {
      var1.writeDouble(this.a);
      var1.writeDouble(this.b);
      var1.writeDouble(this.d);
      var1.writeDouble(this.c);
      super.a(var1);
   }

   public int a() {
      return 33;
   }
}
