package mojang.tags;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class ByteArrayTag extends BaseTag {

   public byte[] array;


   public ByteArrayTag() {}

   public ByteArrayTag(byte[] array) {
      this.array = array;
   }

   void writeTag(DataOutput output) throws IOException {
      output.writeInt(this.array.length);
      output.write(this.array);
   }

   void readTag(DataInput input) throws IOException {
      int index = input.readInt();
      this.array = new byte[index];
      input.readFully(this.array);
   }

   public byte getTagID() {
      return (byte)7;
   }

   public String toString() {
      return "[" + this.array.length + " bytes]";
   }
}
