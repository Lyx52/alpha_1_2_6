package mojang;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class iq extends fd {

   private Map a = new HashMap();


   void a(DataOutput var1) throws IOException {
      Iterator var2 = this.a.values().iterator();

      while(var2.hasNext()) {
         fd var3 = (fd)var2.next();
         a(var3, var1);
      }

      var1.writeByte(0);
   }

   void a(DataInput var1) throws IOException {
      this.a.clear();

      fd var2;
      while((var2 = b(var1)).a() != 0) {
         this.a.put(var2.b(), var2);
      }

   }

   public byte a() {
      return (byte)10;
   }

   public void a(String var1, fd var2) {
      this.a.put(var1, var2.a(var1));
   }

   public void a(String var1, byte var2) {
      this.a.put(var1, (new kk(var2)).a(var1));
   }

   public void a(String var1, short var2) {
      this.a.put(var1, (new nj(var2)).a(var1));
   }

   public void a(String var1, int var2) {
      this.a.put(var1, (new jy(var2)).a(var1));
   }

   public void a(String var1, long var2) {
      this.a.put(var1, (new hq(var2)).a(var1));
   }

   public void a(String var1, float var2) {
      this.a.put(var1, (new h(var2)).a(var1));
   }

   public void a(String var1, double var2) {
      this.a.put(var1, (new mh(var2)).a(var1));
   }

   public void a(String var1, String var2) {
      this.a.put(var1, (new pb(var2)).a(var1));
   }

   public void a(String var1, byte[] var2) {
      this.a.put(var1, (new ep(var2)).a(var1));
   }

   public void a(String var1, iq var2) {
      this.a.put(var1, var2.a(var1));
   }

   public void a(String var1, boolean var2) {
      this.a(var1, (byte)(var2?1:0));
   }

   public boolean b(String var1) {
      return this.a.containsKey(var1);
   }

   public byte c(String var1) {
      return !this.a.containsKey(var1)?0:((kk)this.a.get(var1)).a;
   }

   public short d(String var1) {
      return !this.a.containsKey(var1)?0:((nj)this.a.get(var1)).a;
   }

   public int e(String var1) {
      return !this.a.containsKey(var1)?0:((jy)this.a.get(var1)).a;
   }

   public long f(String var1) {
      return !this.a.containsKey(var1)?0L:((hq)this.a.get(var1)).a;
   }

   public float g(String var1) {
      return !this.a.containsKey(var1)?0.0F:((h)this.a.get(var1)).a;
   }

   public double h(String var1) {
      return !this.a.containsKey(var1)?0.0D:((mh)this.a.get(var1)).a;
   }

   public String i(String var1) {
      return !this.a.containsKey(var1)?"":((pb)this.a.get(var1)).a;
   }

   public byte[] j(String var1) {
      return !this.a.containsKey(var1)?new byte[0]:((ep)this.a.get(var1)).a;
   }

   public iq k(String var1) {
      return !this.a.containsKey(var1)?new iq():(iq)this.a.get(var1);
   }

   public ly l(String var1) {
      return !this.a.containsKey(var1)?new ly():(ly)this.a.get(var1);
   }

   public boolean m(String var1) {
      return this.c(var1) != 0;
   }

   public String toString() {
      return "" + this.a.size() + " entries";
   }
}
