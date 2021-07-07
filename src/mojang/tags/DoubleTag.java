package mojang.tags;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class DoubleTag extends BaseTag {

   public double value;


   public DoubleTag() {}

   public DoubleTag(double value) {
      this.value = value;
   }

   void writeTag(DataOutput output) throws IOException {
      output.writeDouble(this.value);
   }

   void readTag(DataInput input) throws IOException {
      this.value = input.readDouble();
   }

   public byte getTagID() {
      return (byte)6;
   }

   public String toString() {
      return "" + this.value;
   }
}
