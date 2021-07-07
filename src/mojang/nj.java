package mojang;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class nj extends fd {

   public short a;


   public nj() {}

   public nj(short var1) {
      this.a = var1;
   }

   void a(DataOutput var1) throws IOException {
      var1.writeShort(this.a);
   }

   void a(DataInput var1) throws IOException {
      this.a = var1.readShort();
   }

   public byte a() {
      return (byte)2;
   }

   public String toString() {
      return "" + this.a;
   }
}
