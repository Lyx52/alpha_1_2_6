package mojang;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Component;

import mojang.gui.ErrorPanel;
import mojang.net.minecraft.client.Minecraft;
import mojang.net.minecraft.client.MinecraftApplet;

public class i extends Minecraft {

   // $FF: synthetic field
   final MinecraftApplet a;


   public i(MinecraftApplet var1, Component var2, Canvas var3, MinecraftApplet var4, int var5, int var6, boolean var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.a = var1;
   }

   public void throwMinecraftException(MinecraftException exception) {
      this.a.removeAll();
      this.a.setLayout(new BorderLayout());
      this.a.add(new ErrorPanel(exception), "Center");
      this.a.validate();
   }
}
