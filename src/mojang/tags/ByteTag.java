package mojang.tags;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class ByteTag extends BaseTag {

   public byte value;


   public ByteTag() {}

   public ByteTag(byte value) {
      this.value = value;
   }

   void writeTag(DataOutput output) throws IOException {
      output.writeByte(this.value);
   }

   void readTag(DataInput input) throws IOException {
      this.value = input.readByte();
   }

   public byte getTagID() {
      return (byte)1;
   }

   public String toString() {
      return "" + this.value;
   }
}
