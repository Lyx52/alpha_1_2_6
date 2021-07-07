package mojang;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class jy extends fd {

   public int a;


   public jy() {}

   public jy(int var1) {
      this.a = var1;
   }

   void a(DataOutput var1) throws IOException {
      var1.writeInt(this.a);
   }

   void a(DataInput var1) throws IOException {
      this.a = var1.readInt();
   }

   public byte a() {
      return (byte)3;
   }

   public String toString() {
      return "" + this.a;
   }
}
