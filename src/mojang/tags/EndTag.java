package mojang.tags;

import java.io.DataInput;
import java.io.DataOutput;

public class EndTag extends BaseTag {

   void readTag(DataInput input) {}

   void writeTag(DataOutput output) {}

   public byte getTagID() {
      return (byte)0;
   }

   public String toString() {
      return "END";
   }
}
