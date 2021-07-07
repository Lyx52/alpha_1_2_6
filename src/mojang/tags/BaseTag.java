package mojang.tags;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public abstract class BaseTag {

   private String tagName = null;


   abstract void writeTag(DataOutput output) throws IOException;

   abstract void readTag(DataInput input) throws IOException;

   public abstract byte getTagID();

   public String getTagName() {
      return this.tagName == null ? "" : this.tagName;
   }

   public BaseTag createTag(String tagName) {
      this.tagName = tagName;
      return this;
   }

   public static BaseTag readFromInput(DataInput input) throws IOException {
      byte tagID = input.readByte();
      if(tagID == 0) {
         return new EndTag();
      } else {
         BaseTag tag = getTagFromID(tagID);
         tag.tagName = input.readUTF();
         tag.readTag(input);
         return tag;
      }
   }

   public static void writeToOutput(BaseTag tag, DataOutput output) throws IOException {
      // Write tag id
      output.writeByte(tag.getTagID());

      if(tag.getTagID() != 0) {
         output.writeUTF(tag.getTagName());
         tag.writeTag(output);
      }
   }

   public static BaseTag getTagFromID(byte tagID) {
      switch(tagID) {
         case 0:
            return new EndTag();
         case 1:
            return new ByteTag();
         case 2:
            return new ShortTag();
         case 3:
            return new IntegerTag();
         case 4:
            return new LongTag();
         case 5:
            return new FloatTag();
         case 6:
            return new DoubleTag();
         case 7:
            return new ByteArrayTag();
         case 8:
            return new StringTag();
         case 9:
            return new ListTag();
         case 10:
            return new CompoundTag();
         default:
            return null;
      }
   }

   public static String getStringFromID(byte tagID) {
      switch(tagID) {
         case 0:
            return "TAG_End";
         case 1:
            return "TAG_Byte";
         case 2:
            return "TAG_Short";
         case 3:
            return "TAG_Int";
         case 4:
            return "TAG_Long";
         case 5:
            return "TAG_Float";
         case 6:
            return "TAG_Double";
         case 7:
            return "TAG_Byte_Array";
         case 8:
            return "TAG_String";
         case 9:
            return "TAG_List";
         case 10:
            return "TAG_Compound";
         default:
            return "UNKNOWN";
      }
   }
}
