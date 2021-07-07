import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class nr implements bd {

   private ha a;
   private Map b = new HashMap();
   private List c = new ArrayList();
   private cy d;


   public nr(cy var1) {
      this.a = new ha(var1, new byte['\u8000'], 0, 0);
      this.a.q = true;
      this.a.p = true;
      this.d = var1;
   }

   public boolean a(int var1, int var2) {
      if var3 = new if(var1, var2);
      return this.b.containsKey(var3);
   }

   public void c(int var1, int var2) {
      ha var3 = this.b(var1, var2);
      if(!var3.q) {
         var3.f();
      }

      this.b.remove(new if(var1, var2));
      this.c.remove(var3);
   }

   public ha d(int var1, int var2) {
      if var3 = new if(var1, var2);
      byte[] var4 = new byte['\u8000'];
      ha var5 = new ha(this.d, var4, var1, var2);
      Arrays.fill(var5.f.a, (byte)-1);
      this.b.put(var3, var5);
      var5.c = true;
      return var5;
   }

   public ha b(int var1, int var2) {
      if var3 = new if(var1, var2);
      ha var4 = (ha)this.b.get(var3);
      return var4 == null?this.a:var4;
   }

   public boolean a(boolean var1, pu var2) {
      return true;
   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public void a(bd var1, int var2, int var3) {}
}
