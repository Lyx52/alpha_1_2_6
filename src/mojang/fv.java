package mojang;

import mojang.entity.LivingEntity;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class fv extends gk {

   public int a;
   public byte b;
   public int c;
   public int d;
   public int e;
   public byte f;
   public byte g;


   public fv() {}

   public fv(LivingEntity var1) {
      this.a = var1.an;
      this.b = (byte)fq.a(var1);
      this.c = fi.b(var1.aw * 32.0D);
      this.d = fi.b(var1.ax * 32.0D);
      this.e = fi.b(var1.ay * 32.0D);
      this.f = (byte)((int)(var1.aC * 256.0F / 360.0F));
      this.g = (byte)((int)(var1.aD * 256.0F / 360.0F));
   }

   public void a(DataInputStream var1) throws IOException {
      this.a = var1.readInt();
      this.b = var1.readByte();
      this.c = var1.readInt();
      this.d = var1.readInt();
      this.e = var1.readInt();
      this.f = var1.readByte();
      this.g = var1.readByte();
   }

   public void a(DataOutputStream var1) throws IOException {
      var1.writeInt(this.a);
      var1.writeByte(this.b);
      var1.writeInt(this.c);
      var1.writeInt(this.d);
      var1.writeInt(this.e);
      var1.writeByte(this.f);
      var1.writeByte(this.g);
   }

   public void a(mo var1) {
      var1.a(this);
   }

   public int a() {
      return 19;
   }
}
