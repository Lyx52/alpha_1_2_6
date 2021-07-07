package mojang;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class hq extends fd {

   public long a;


   public hq() {}

   public hq(long var1) {
      this.a = var1;
   }

   void a(DataOutput var1) throws IOException {
      var1.writeLong(this.a);
   }

   void a(DataInput var1) throws IOException {
      this.a = var1.readLong();
   }

   public byte a() {
      return (byte)4;
   }

   public String toString() {
      return "" + this.a;
   }
}
