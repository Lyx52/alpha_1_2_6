package mojang;

import java.io.IOException;
import java.io.InputStream;
import mojang.net.minecraft.client.Minecraft;

public abstract class d {

   public String a;
   public String b;
   public String c;
   public String d;


   public void a() {}

   public void b() {}

   public void a(Minecraft var1) throws IOException {}

   public void b(Minecraft var1) {}

   public void c(Minecraft var1) {}

   public InputStream a(String var1) {
      return d.class.getResourceAsStream(var1);
   }
}
