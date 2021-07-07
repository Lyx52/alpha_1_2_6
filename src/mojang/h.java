package mojang;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class h extends fd {

   public float a;


   public h() {}

   public h(float var1) {
      this.a = var1;
   }

   void a(DataOutput var1) throws IOException {
      var1.writeFloat(this.a);
   }

   void a(DataInput var1) throws IOException {
      this.a = var1.readFloat();
   }

   public byte a() {
      return (byte)5;
   }

   public String toString() {
      return "" + this.a;
   }
}
