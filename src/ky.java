import java.io.DataInputStream;
import java.io.DataOutputStream;

public class ky extends gk {

   public int a;
   public int b;
   public int c;
   public int d;
   public byte e;
   public byte f;


   public ky() {}

   public ky(lw var1) {
      this.a = var1.an;
      this.b = fi.b(var1.aw * 32.0D);
      this.c = fi.b(var1.ax * 32.0D);
      this.d = fi.b(var1.ay * 32.0D);
      this.e = (byte)((int)(var1.aC * 256.0F / 360.0F));
      this.f = (byte)((int)(var1.aD * 256.0F / 360.0F));
   }

   public void a(DataInputStream var1) {
      this.a = var1.readInt();
      this.b = var1.readInt();
      this.c = var1.readInt();
      this.d = var1.readInt();
      this.e = (byte)var1.read();
      this.f = (byte)var1.read();
   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.a);
      var1.writeInt(this.b);
      var1.writeInt(this.c);
      var1.writeInt(this.d);
      var1.write(this.e);
      var1.write(this.f);
   }

   public void a(mo var1) {
      var1.a(this);
   }

   public int a() {
      return 34;
   }
}
