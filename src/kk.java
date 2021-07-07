import java.io.DataInput;
import java.io.DataOutput;

public class kk extends fd {

   public byte a;


   public kk() {}

   public kk(byte var1) {
      this.a = var1;
   }

   void a(DataOutput var1) {
      var1.writeByte(this.a);
   }

   void a(DataInput var1) {
      this.a = var1.readByte();
   }

   public byte a() {
      return (byte)1;
   }

   public String toString() {
      return "" + this.a;
   }
}
