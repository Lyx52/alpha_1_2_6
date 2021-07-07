import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.minecraft.client.Minecraft;

public class ff {

   private List b = new ArrayList();
   private d c = new jm();
   public d a;
   private Map d = new HashMap();
   private Minecraft e;
   private File f;
   private String g;


   public ff(Minecraft var1, File var2) {
      this.e = var1;
      this.f = new File(var2, "texturepacks");
      if(!this.f.exists()) {
         this.f.mkdirs();
      }

      this.g = var1.y.j;
      this.a();
      this.a.a();
   }

   public boolean a(d var1) {
      if(var1 == this.a) {
         return false;
      } else {
         this.a.b();
         this.g = var1.a;
         this.a = var1;
         this.e.y.j = this.g;
         this.e.y.b();
         this.a.a();
         return true;
      }
   }

   public void a() {
      ArrayList var1 = new ArrayList();
      this.a = null;
      var1.add(this.c);
      if(this.f.exists() && this.f.isDirectory()) {
         File[] var2 = this.f.listFiles();
         File[] var3 = var2;
         int var4 = var2.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            File var6 = var3[var5];
            if(var6.isFile() && var6.getName().toLowerCase().endsWith(".zip")) {
               String var7 = var6.getName() + ":" + var6.length() + ":" + var6.lastModified();

               try {
                  if(!this.d.containsKey(var7)) {
                     od var8 = new od(var6);
                     var8.d = var7;
                     this.d.put(var7, var8);
                     var8.a(this.e);
                  }

                  d var12 = (d)this.d.get(var7);
                  if(var12.a.equals(this.g)) {
                     this.a = var12;
                  }

                  var1.add(var12);
               } catch (IOException var9) {
                  var9.printStackTrace();
               }
            }
         }
      }

      if(this.a == null) {
         this.a = this.c;
      }

      this.b.removeAll(var1);
      Iterator var10 = this.b.iterator();

      while(var10.hasNext()) {
         d var11 = (d)var10.next();
         var11.b(this.e);
         this.d.remove(var11.d);
      }

      this.b = var1;
   }

   public List b() {
      return new ArrayList(this.b);
   }
}
