package mojang.tags;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class FloatTag extends BaseTag {

   public float value;


   public FloatTag() {}

   public FloatTag(float value) {
      this.value = value;
   }

   void writeTag(DataOutput output) throws IOException {
      output.writeFloat(this.value);
   }

   void readTag(DataInput input) throws IOException {
      this.value = input.readFloat();
   }

   public byte getTagID() {
      return (byte)5;
   }

   public String toString() {
      return "" + this.value;
   }
}
