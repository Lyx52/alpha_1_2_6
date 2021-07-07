package mojang;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class mh extends fd {

   public double a;


   public mh() {}

   public mh(double var1) {
      this.a = var1;
   }

   void a(DataOutput var1) throws IOException {
      var1.writeDouble(this.a);
   }

   void a(DataInput var1) throws IOException {
      this.a = var1.readDouble();
   }

   public byte a() {
      return (byte)6;
   }

   public String toString() {
      return "" + this.a;
   }
}
