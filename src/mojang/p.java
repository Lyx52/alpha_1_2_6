package mojang;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class p extends BasePacket {

   public int a;
   public fp[] b;


   public p() {}

   public p(int var1, fp[] var2) {
      this.a = var1;
      this.b = new fp[var2.length];

      for(int var3 = 0; var3 < this.b.length; ++var3) {
         this.b[var3] = var2[var3] == null?null:var2[var3].e();
      }

   }

   public void a(DataInputStream var1) throws IOException {
      this.a = var1.readInt();
      short var2 = var1.readShort();
      this.b = new fp[var2];

      for(int var3 = 0; var3 < var2; ++var3) {
         short var4 = var1.readShort();
         if(var4 >= 0) {
            byte var5 = var1.readByte();
            short var6 = var1.readShort();
            this.b[var3] = new fp(var4, var5, var6);
         }
      }

   }

   public void a(DataOutputStream var1) throws IOException {
      var1.writeInt(this.a);
      var1.writeShort(this.b.length);

      for(int var2 = 0; var2 < this.b.length; ++var2) {
         if(this.b[var2] == null) {
            var1.writeShort(-1);
         } else {
            var1.writeShort((short)this.b[var2].c);
            var1.writeByte((byte)this.b[var2].a);
            var1.writeShort((short)this.b[var2].d);
         }
      }

   }

   public void a(mo var1) {
      var1.a(this);
   }

   public int a() {
      return 6 + this.b.length * 5;
   }
}
