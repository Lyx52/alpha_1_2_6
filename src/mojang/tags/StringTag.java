package mojang.tags;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class StringTag extends BaseTag {

   public String value;


   public StringTag() {}

   public StringTag(String value) {
      this.value = value;
      if(value == null) {
         throw new IllegalArgumentException("Empty string not allowed");
      }
   }

   void writeTag(DataOutput output) throws IOException {
      output.writeUTF(this.value);
   }

   void readTag(DataInput input) throws IOException {
      this.value = input.readUTF();
   }

   public byte getTagID() {
      return (byte)8;
   }

   public String toString() {
      return "" + this.value;
   }
}
