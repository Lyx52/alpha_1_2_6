package mojang;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class ep extends fd {

   public byte[] a;


   public ep() {}

   public ep(byte[] var1) {
      this.a = var1;
   }

   void a(DataOutput var1) throws IOException {
      var1.writeInt(this.a.length);
      var1.write(this.a);
   }

   void a(DataInput var1) throws IOException {
      int var2 = var1.readInt();
      this.a = new byte[var2];
      var1.readFully(this.a);
   }

   public byte a() {
      return (byte)7;
   }

   public String toString() {
      return "[" + this.a.length + " bytes]";
   }
}
