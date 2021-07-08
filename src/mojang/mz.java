package mojang;

import mojang.world.World;

import java.io.File;
import java.io.IOException;

class mz extends World {

   // $FF: synthetic field
   final ah A;


   mz(ah var1, File var2, String var3) throws IOException {
      super(var2, var3);
      this.A = var1;
   }

   protected bd a(File var1) {
      return new cu(this, new mu(var1, false));
   }
}
