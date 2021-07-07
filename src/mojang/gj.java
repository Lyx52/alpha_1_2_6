package mojang;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Frame;
import mojang.net.minecraft.client.Minecraft;
import mojang.net.minecraft.client.MinecraftApplet;

public final class gj extends Minecraft {

   // $FF: synthetic field
   final Frame a;


   public gj(Component var1, Canvas var2, MinecraftApplet var3, int var4, int var5, boolean var6, Frame var7) {
      super(var1, var2, var3, var4, var5, var6);
      this.a = var7;
   }

   public void a(hr var1) {
      this.a.removeAll();
      this.a.add(new av(var1), "Center");
      this.a.validate();
   }
}
