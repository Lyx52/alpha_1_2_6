package mojang;

import mojang.entity.animal.Animal;
import mojang.entity.NullInterface;

public enum gy {

   a("monster", 0, NullInterface.class, 100),
   b("creature", 1, Animal.class, 20);
   public final Class c;
   public final int d;
   // $FF: synthetic field
   private static final gy[] e = new gy[]{a, b};


   private gy(String var1, int var2, Class var3, int var4) {
      this.c = var3;
      this.d = var4;
   }

}
