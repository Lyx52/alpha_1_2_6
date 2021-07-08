package mojang.gui;

import java.awt.Canvas;
import java.awt.Dimension;

class Border extends Canvas {

   public Border(int size) {
      this.setPreferredSize(new Dimension(size, size));
      this.setMinimumSize(new Dimension(size, size));
   }
}
