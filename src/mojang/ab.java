package mojang;

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

public class ab {

   public static CompoundTag a(InputStream var0) throws IOException {
      DataInputStream var1 = new DataInputStream(new GZIPInputStream(var0));

      CompoundTag var2;
      try {
         var2 = a((DataInput)var1);
      } finally {
         var1.close();
      }

      return var2;
   }

   public static void a(CompoundTag var0, OutputStream var1) throws IOException {
      DataOutputStream var2 = new DataOutputStream(new GZIPOutputStream(var1));

      try {
         a(var0, (DataOutput)var2);
      } finally {
         var2.close();
      }

   }

   public static CompoundTag a(byte[] var0) throws IOException {
      DataInputStream var1 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(var0)));

      CompoundTag var2;
      try {
         var2 = a((DataInput)var1);
      } finally {
         var1.close();
      }

      return var2;
   }

   public static byte[] a(CompoundTag var0) throws IOException {
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();
      DataOutputStream var2 = new DataOutputStream(new GZIPOutputStream(var1));

      try {
         a(var0, (DataOutput)var2);
      } finally {
         var2.close();
      }

      return var1.toByteArray();
   }

   public static CompoundTag a(DataInput var0) throws IOException {
      BaseTag var1 = BaseTag.readFromInput(var0);
      if(var1 instanceof CompoundTag) {
         return (CompoundTag)var1;
      } else {
         throw new IOException("Root tag must be a named compound tag");
      }
   }

   public static void a(CompoundTag var0, DataOutput var1) throws IOException {
      BaseTag.writeToOutput(var0, var1);
   }
}
