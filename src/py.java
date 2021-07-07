import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class py extends gk {

   public int a;
   public int b;
   public int c;
   public byte[] d;
   public iq e;


   public py() {
      this.j = true;
   }

   public py(int var1, int var2, int var3, ji var4) {
      this.j = true;
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.e = new iq();
      var4.b(this.e);

      try {
         this.d = ab.a(this.e);
      } catch (IOException var6) {
         var6.printStackTrace();
      }

   }

   public void a(DataInputStream var1) {
      this.a = var1.readInt();
      this.b = var1.readShort();
      this.c = var1.readInt();
      int var2 = var1.readShort() & '\uffff';
      this.d = new byte[var2];
      var1.readFully(this.d);
      this.e = ab.a(this.d);
   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.a);
      var1.writeShort(this.b);
      var1.writeInt(this.c);
      var1.writeShort((short)this.d.length);
      var1.write(this.d);
   }

   public void a(mo var1) {
      var1.a(this);
   }

   public int a() {
      return this.d.length + 2 + 10;
   }
}
