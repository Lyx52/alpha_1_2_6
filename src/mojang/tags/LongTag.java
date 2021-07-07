package mojang.tags;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class LongTag extends BaseTag {

   public long value;


   public LongTag() {}

   public LongTag(long value) {
      this.value = value;
   }

   void writeTag(DataOutput output) throws IOException {
      output.writeLong(this.value);
   }

   void readTag(DataInput input) throws IOException {
      this.value = input.readLong();
   }

   public byte getTagID() {
      return (byte)4;
   }

   public String toString() {
      return "" + this.value;
   }
}
