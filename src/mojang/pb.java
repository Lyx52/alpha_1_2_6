package mojang;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class pb extends fd {

   public String a;


   public pb() {}

   public pb(String var1) {
      this.a = var1;
      if(var1 == null) {
         throw new IllegalArgumentException("Empty string not allowed");
      }
   }

   void a(DataOutput var1) throws IOException {
      var1.writeUTF(this.a);
   }

   void a(DataInput var1) throws IOException {
      this.a = var1.readUTF();
   }

   public byte a() {
      return (byte)8;
   }

   public String toString() {
      return "" + this.a;
   }
}
