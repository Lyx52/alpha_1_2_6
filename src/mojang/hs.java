package mojang;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class hs extends gk {

   public int a;
   public String b;
   public int c;
   public int d;
   public int e;
   public byte f;
   public byte g;
   public int h;


   public hs() {}

   public hs(eb var1) {
      this.a = var1.an;
      this.b = var1.l;
      this.c = fi.b(var1.aw * 32.0D);
      this.d = fi.b(var1.ax * 32.0D);
      this.e = fi.b(var1.ay * 32.0D);
      this.f = (byte)((int)(var1.aC * 256.0F / 360.0F));
      this.g = (byte)((int)(var1.aD * 256.0F / 360.0F));
      fp var2 = var1.e.a();
      this.h = var2 == null?0:var2.c;
   }

   public void a(DataInputStream var1) throws IOException {
      this.a = var1.readInt();
      this.b = var1.readUTF();
      this.c = var1.readInt();
      this.d = var1.readInt();
      this.e = var1.readInt();
      this.f = var1.readByte();
      this.g = var1.readByte();
      this.h = var1.readShort();
   }

   public void a(DataOutputStream var1) throws IOException {
      var1.writeInt(this.a);
      var1.writeUTF(this.b);
      var1.writeInt(this.c);
      var1.writeInt(this.d);
      var1.writeInt(this.e);
      var1.writeByte(this.f);
      var1.writeByte(this.g);
      var1.writeShort(this.h);
   }

   public void a(mo var1) {
      var1.a(this);
   }

   public int a() {
      return 28;
   }
}
