package mojang.gui;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.IOException;
import javax.imageio.ImageIO;

class MinecraftLogo extends Canvas {

   private BufferedImage logo;


   public MinecraftLogo() {
      try {
         this.logo = ImageIO.read(ErrorPanel.class.getResource("/gui/logo.png"));
      } catch (IOException e) {
         System.out.println("Cannot load logo! /gui/logo.png");
         e.printStackTrace();
      }

      this.setPreferredSize(new Dimension(100, 100));
      this.setMinimumSize(new Dimension(100, 100));
   }

   public void paint(Graphics gfx) {
      super.paint(gfx);
      gfx.drawImage(this.logo, this.getWidth() / 2 - this.logo.getWidth() / 2, 32, (ImageObserver)null);
   }
}
