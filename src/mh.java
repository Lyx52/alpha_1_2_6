import java.io.DataInput;
import java.io.DataOutput;

public class mh extends fd {

   public double a;


   public mh() {}

   public mh(double var1) {
      this.a = var1;
   }

   void a(DataOutput var1) {
      var1.writeDouble(this.a);
   }

   void a(DataInput var1) {
      this.a = var1.readDouble();
   }

   public byte a() {
      return (byte)6;
   }

   public String toString() {
      return "" + this.a;
   }
}
