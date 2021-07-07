package mojang.tags;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CompoundTag extends BaseTag {

   private Map hashmap = new HashMap();


   void writeTag(DataOutput output) throws IOException {
      Iterator var2 = this.hashmap.values().iterator();

      while(var2.hasNext()) {
         BaseTag tag = (BaseTag)var2.next();
         writeToOutput(tag, output);
      }

      output.writeByte(0);
   }

   void readTag(DataInput input) throws IOException {
      this.hashmap.clear();

      BaseTag tag;
      while((tag = readFromInput(input)).getTagID() != 0) {
         this.hashmap.put(tag.getTagName(), tag);
      }

   }

   public byte getTagID() {
      return (byte)10;
   }

   public void putBaseTag(String key, BaseTag tag) {
      this.hashmap.put(key, tag.createTag(key));
   }

   public void putByteTag(String key, byte value) {
      this.hashmap.put(key, (new ByteTag(value)).createTag(key));
   }

   public void putShortTag(String key, short value) {
      this.hashmap.put(key, (new ShortTag(value)).createTag(key));
   }

   public void putIntegerTag(String key, int value) {
      this.hashmap.put(key, (new IntegerTag(value)).createTag(key));
   }

   public void putLongTag(String key, long value) {
      this.hashmap.put(key, (new LongTag(value)).createTag(key));
   }

   public void putFloatTag(String key, float value) {
      this.hashmap.put(key, (new FloatTag(value)).createTag(key));
   }

   public void putDoubleTag(String key, double value) {
      this.hashmap.put(key, (new DoubleTag(value)).createTag(key));
   }

   public void putStringTag(String key, String value) {
      this.hashmap.put(key, (new StringTag(value)).createTag(key));
   }

   public void putByteArrayTag(String key, byte[] array) {
      this.hashmap.put(key, (new ByteArrayTag(array)).createTag(key));
   }

   public void putCompoundTag(String key, CompoundTag tag) {
      this.hashmap.put(key, tag.createTag(key));
   }

   public void putBooleanTag(String key, boolean value) {
      this.putByteTag(key, (byte)(value ? 1 : 0));
   }

   public boolean hasKey(String key) {
      return this.hashmap.containsKey(key);
   }

   public byte getByte(String key) {
      return !this.hashmap.containsKey(key) ? 0 : ((ByteTag)this.hashmap.get(key)).value;
   }

   public short getShort(String key) {
      return !this.hashmap.containsKey(key) ? 0 : ((ShortTag)this.hashmap.get(key)).value;
   }

   public int getInteger(String key) {
      return !this.hashmap.containsKey(key) ? 0 : ((IntegerTag)this.hashmap.get(key)).value;
   }

   public long getLong(String key) {
      return !this.hashmap.containsKey(key) ? 0L : ((LongTag)this.hashmap.get(key)).value;
   }

   public float getFloat(String key) {
      return !this.hashmap.containsKey(key) ? 0.0F : ((FloatTag)this.hashmap.get(key)).value;
   }

   public double getDouble(String key) {
      return !this.hashmap.containsKey(key) ? 0.0D : ((DoubleTag)this.hashmap.get(key)).value;
   }

   public String getString(String key) {
      return !this.hashmap.containsKey(key) ? "" : ((StringTag)this.hashmap.get(key)).value;
   }

   public byte[] getByteArray(String key) {
      return !this.hashmap.containsKey(key) ? new byte[0] : ((ByteArrayTag)this.hashmap.get(key)).array;
   }

   public CompoundTag getMapTag(String key) {
      return !this.hashmap.containsKey(key) ? new CompoundTag() : (CompoundTag)this.hashmap.get(key);
   }

   public ListTag getListTag(String key) {
      return !this.hashmap.containsKey(key) ? new ListTag() : (ListTag)this.hashmap.get(key);
   }

   public boolean getBoolean(String key) {
      return this.getByte(key) != 0;
   }

   public String toString() {
      return "" + this.hashmap.size() + " entries";
   }
}
