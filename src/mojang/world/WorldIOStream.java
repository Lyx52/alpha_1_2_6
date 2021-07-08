package mojang.world;

import mojang.tags.BaseTag;
import mojang.tags.CompoundTag;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class WorldIOStream {

   public static CompoundTag readLevelData(InputStream levelData) throws IOException {
      DataInputStream inputStream = new DataInputStream(new GZIPInputStream(levelData));

      CompoundTag rootTag;
      try {
         rootTag = getRootTag((DataInput)inputStream);
      } finally {
         inputStream.close();
      }

      return rootTag;
   }

   public static void a(CompoundTag data, OutputStream stream) throws IOException {
      DataOutputStream outputStream = new DataOutputStream(new GZIPOutputStream(stream));

      try {
         writeTag(data, (DataOutput)outputStream);
      } finally {
         outputStream.close();
      }

   }

   public static CompoundTag a(byte[] var0) throws IOException {
      DataInputStream var1 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(var0)));

      CompoundTag var2;
      try {
         var2 = getRootTag((DataInput)var1);
      } finally {
         var1.close();
      }

      return var2;
   }

   public static byte[] writeByteArray(CompoundTag var0) throws IOException {
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();
      DataOutputStream var2 = new DataOutputStream(new GZIPOutputStream(var1));

      try {
         writeTag(var0, (DataOutput)var2);
      } finally {
         var2.close();
      }

      return var1.toByteArray();
   }

   public static CompoundTag getRootTag(DataInput input) throws IOException {
      BaseTag root = BaseTag.readFromInput(input);
      if(root instanceof CompoundTag) {
         return (CompoundTag)root;
      } else {
         throw new IOException("Root tag must be a named compound tag");
      }
   }

   public static void writeTag(CompoundTag data, DataOutput output) throws IOException {
      BaseTag.writeToOutput(data, output);
   }
}
