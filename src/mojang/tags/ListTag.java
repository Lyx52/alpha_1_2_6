package mojang.tags;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListTag extends BaseTag {

   private List list = new ArrayList();
   private byte b;


   void writeTag(DataOutput output) throws IOException {
      if(this.list.size() > 0) {
         this.b = ((BaseTag)this.list.get(0)).getTagID();
      } else {
         this.b = 1;
      }

      output.writeByte(this.b);
      output.writeInt(this.list.size());

      for(int var2 = 0; var2 < this.list.size(); ++var2) {
         ((BaseTag)this.list.get(var2)).writeTag(output);
      }

   }

   void readTag(DataInput input) throws IOException {
      this.b = input.readByte();
      int var2 = input.readInt();
      this.list = new ArrayList();

      for(int var3 = 0; var3 < var2; ++var3) {
         BaseTag var4 = getTagFromID(this.b);
         var4.readTag(input);
         this.list.add(var4);
      }

   }

   public byte getTagID() {
      return (byte)9;
   }

   public String toString() {
      return "" + this.list.size() + " entries of type " + getStringFromID(this.b);
   }

   public void a(BaseTag var1) {
      this.b = var1.getTagID();
      this.list.add(var1);
   }

   public BaseTag a(int var1) {
      return (BaseTag)this.list.get(var1);
   }

   public int c() {
      return this.list.size();
   }
}
