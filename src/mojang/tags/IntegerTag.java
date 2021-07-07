package mojang.tags;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class IntegerTag extends BaseTag {

   public int value;


   public IntegerTag() {}

   public IntegerTag(int value) {
      this.value = value;
   }

   void writeTag(DataOutput output) throws IOException {
      output.writeInt(this.value);
   }

   void readTag(DataInput input) throws IOException {
      this.value = input.readInt();
   }

   public byte getTagID() {
      return (byte)3;
   }

   public String toString() {
      return "" + this.value;
   }
}
