package mojang;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ly extends fd {

   private List a = new ArrayList();
   private byte b;


   void a(DataOutput var1) throws IOException {
      if(this.a.size() > 0) {
         this.b = ((fd)this.a.get(0)).a();
      } else {
         this.b = 1;
      }

      var1.writeByte(this.b);
      var1.writeInt(this.a.size());

      for(int var2 = 0; var2 < this.a.size(); ++var2) {
         ((fd)this.a.get(var2)).a(var1);
      }

   }

   void a(DataInput var1) throws IOException {
      this.b = var1.readByte();
      int var2 = var1.readInt();
      this.a = new ArrayList();

      for(int var3 = 0; var3 < var2; ++var3) {
         fd var4 = a(this.b);
         var4.a(var1);
         this.a.add(var4);
      }

   }

   public byte a() {
      return (byte)9;
   }

   public String toString() {
      return "" + this.a.size() + " entries of type " + b(this.b);
   }

   public void a(fd var1) {
      this.b = var1.a();
      this.a.add(var1);
   }

   public fd a(int var1) {
      return (fd)this.a.get(var1);
   }

   public int c() {
      return this.a.size();
   }
}
