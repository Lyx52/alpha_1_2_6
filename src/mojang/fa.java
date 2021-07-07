package mojang;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class fa extends gk {

   public double a;
   public double b;
   public double c;
   public double d;
   public float e;
   public float f;
   public boolean g;
   public boolean h;
   public boolean i;


   public fa() {}

   public fa(boolean var1) {
      this.g = var1;
   }

   public void a(mo var1) {
      var1.a(this);
   }

   public void a(DataInputStream var1) throws IOException {
      this.g = var1.read() != 0;
   }

   public void a(DataOutputStream var1) throws IOException {
      var1.write(this.g?1:0);
   }

   public int a() {
      return 1;
   }
}
