package mojang.tags;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class ShortTag extends BaseTag {

   public short value;


   public ShortTag() {}

   public ShortTag(short value) {
      this.value = value;
   }

   void writeTag(DataOutput output) throws IOException {
      output.writeShort(this.value);
   }

   void readTag(DataInput input) throws IOException {
      this.value = input.readShort();
   }

   public byte getTagID() {
      return (byte)2;
   }

   public String toString() {
      return "" + this.value;
   }
}
