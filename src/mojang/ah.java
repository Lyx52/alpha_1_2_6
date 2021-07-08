package mojang;

import mojang.world.World;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferStrategy;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ah extends Canvas implements KeyListener, MouseListener, MouseMotionListener, Runnable {

   private int a = 0;
   private int b = 2;
   private boolean c = true;
   private World d;
   private File e = this.a();
   private boolean f = true;
   private List g = Collections.synchronizedList(new LinkedList());
   private kw[][] h = new kw[64][64];
   private int i;
   private int j;
   private int k;
   private int l;


   public File a() {
      if(this.e == null) {
         this.e = this.a("mojang");
      }

      return this.e;
   }

   public File a(String var1) {
      String var2 = System.getProperty("user.home", ".");
      File var3;
      switch(nd.a[e().ordinal()]) {
      case 1:
      case 2:
         var3 = new File(var2, '.' + var1 + '/');
         break;
      case 3:
         String var4 = System.getenv("APPDATA");
         if(var4 != null) {
            var3 = new File(var4, "." + var1 + '/');
         } else {
            var3 = new File(var2, '.' + var1 + '/');
         }
         break;
      case 4:
         var3 = new File(var2, "Library/Application Support/" + var1);
         break;
      default:
         var3 = new File(var2, var1 + '/');
      }

      if(!var3.exists() && !var3.mkdirs()) {
         throw new RuntimeException("The working directory could not be created: " + var3);
      } else {
         return var3;
      }
   }

   private static fw e() {
      String var0 = System.getProperty("os.name").toLowerCase();
      return var0.contains("win")?fw.c:(var0.contains("mac")?fw.d:(var0.contains("solaris")?fw.b:(var0.contains("sunos")?fw.b:(var0.contains("linux")?fw.a:(var0.contains("unix")?fw.a:fw.e)))));
   }

   public ah() {
      for(int var1 = 0; var1 < 64; ++var1) {
         for(int var2 = 0; var2 < 64; ++var2) {
            this.h[var1][var2] = new kw((World)null, var1, var2);
         }
      }

      this.addMouseListener(this);
      this.addMouseMotionListener(this);
      this.addKeyListener(this);
      this.setFocusable(true);
      this.requestFocus();
      this.setBackground(Color.red);
   }

   public void b(String var1) throws IOException {
      this.i = this.j = 0;
      this.d = new mz(this, new File(this.e, "saves"), var1);
      this.d.f = 0;
      List var2 = this.g;
      synchronized(this.g) {
         this.g.clear();

         for(int var3 = 0; var3 < 64; ++var3) {
            for(int var4 = 0; var4 < 64; ++var4) {
               this.h[var3][var4].a(this.d, var3, var4);
            }
         }

      }
   }

   private void a(int var1) {
      List var2 = this.g;
      synchronized(this.g) {
         this.d.f = var1;
         this.g.clear();

         for(int var3 = 0; var3 < 64; ++var3) {
            for(int var4 = 0; var4 < 64; ++var4) {
               this.h[var3][var4].a(this.d, var3, var4);
            }
         }

      }
   }

   public void b() {
      (new my(this)).start();

      for(int var1 = 0; var1 < 8; ++var1) {
         (new Thread(this)).start();
      }

   }

   public void c() {
      this.f = false;
   }

   private kw a(int var1, int var2) {
      int var3 = var1 & 63;
      int var4 = var2 & 63;
      kw var5 = this.h[var3][var4];
      if(var5.c == var1 && var5.d == var2) {
         return var5;
      } else {
         List var6 = this.g;
         synchronized(this.g) {
            this.g.remove(var5);
         }

         var5.a(var1, var2);
         return var5;
      }
   }

   public void run() {
      nk var1 = new nk();

      while(this.f) {
         kw var2 = null;
         List var3 = this.g;
         synchronized(this.g) {
            if(this.g.size() > 0) {
               var2 = (kw)this.g.remove(0);
            }
         }

         if(var2 != null) {
            if(this.a - var2.g < 2) {
               var1.a(var2);
               this.repaint();
            } else {
               var2.h = false;
            }
         }

         try {
            Thread.sleep(2L);
         } catch (InterruptedException var5) {
            var5.printStackTrace();
         }
      }

   }

   public void update(Graphics var1) {}

   public void paint(Graphics var1) {}

   public void d() {
      BufferStrategy var1 = this.getBufferStrategy();
      if(var1 == null) {
         this.createBufferStrategy(2);
      } else {
         this.a((Graphics2D)var1.getDrawGraphics());
         var1.show();
      }
   }

   public void a(Graphics2D var1) {
      ++this.a;
      AffineTransform var2 = var1.getTransform();
      var1.setClip(0, 0, this.getWidth(), this.getHeight());
      var1.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR);
      var1.translate(this.getWidth() / 2, this.getHeight() / 2);
      var1.scale((double)this.b, (double)this.b);
      var1.translate(this.i, this.j);
      if(this.d != null) {
         var1.translate(-(this.d.spawnX + this.d.spawnZ), -(-this.d.spawnX + this.d.spawnZ) + 64);
      }

      Rectangle var3 = var1.getClipBounds();
      var1.setColor(new Color(-15724512));
      var1.fillRect(var3.x, var3.y, var3.width, var3.height);
      byte var4 = 16;
      byte var5 = 3;
      int var6 = var3.x / var4 / 2 - 2 - var5;
      int var7 = (var3.x + var3.width) / var4 / 2 + 1 + var5;
      int var8 = var3.y / var4 - 1 - var5 * 2;
      int var9 = (var3.y + var3.height + 16 + 128) / var4 + 1 + var5 * 2;

      int var10;
      for(var10 = var8; var10 <= var9; ++var10) {
         for(int var11 = var6; var11 <= var7; ++var11) {
            int var12 = var11 - (var10 >> 1);
            int var13 = var11 + (var10 + 1 >> 1);
            kw var14 = this.a(var12, var13);
            var14.g = this.a;
            if(!var14.e) {
               if(!var14.h) {
                  var14.h = true;
                  this.g.add(var14);
               }
            } else {
               var14.h = false;
               if(!var14.f) {
                  int var15 = var11 * var4 * 2 + (var10 & 1) * var4;
                  int var16 = var10 * var4 - 128 - 16;
                  var1.drawImage(var14.a, var15, var16, (ImageObserver)null);
               }
            }
         }
      }

      if(this.c) {
         var1.setTransform(var2);
         var10 = this.getHeight() - 32 - 4;
         var1.setColor(new Color(Integer.MIN_VALUE, true));
         var1.fillRect(4, this.getHeight() - 32 - 4, this.getWidth() - 8, 32);
         var1.setColor(Color.WHITE);
         String var17 = "F1 - F5: load levels   |   0-9: Set time of day   |   Space: return to spawn   |   Double click: zoom   |   Escape: hide this text";
         var1.drawString(var17, this.getWidth() / 2 - var1.getFontMetrics().stringWidth(var17) / 2, var10 + 20);
      }

      var1.dispose();
   }

   public void mouseDragged(MouseEvent var1) {
      int var2 = var1.getX() / this.b;
      int var3 = var1.getY() / this.b;
      this.i += var2 - this.k;
      this.j += var3 - this.l;
      this.k = var2;
      this.l = var3;
      this.repaint();
   }

   public void mouseMoved(MouseEvent var1) {}

   public void mouseClicked(MouseEvent var1) {
      if(var1.getClickCount() == 2) {
         this.b = 3 - this.b;
         this.repaint();
      }

   }

   public void mouseEntered(MouseEvent var1) {}

   public void mouseExited(MouseEvent var1) {}

   public void mousePressed(MouseEvent var1) {
      int var2 = var1.getX() / this.b;
      int var3 = var1.getY() / this.b;
      this.k = var2;
      this.l = var3;
   }

   public void mouseReleased(MouseEvent var1) {}

   public void keyPressed(KeyEvent var1) {
      if(var1.getKeyCode() == 48) {
         this.a(11);
      }

      if(var1.getKeyCode() == 49) {
         this.a(10);
      }

      if(var1.getKeyCode() == 50) {
         this.a(9);
      }

      if(var1.getKeyCode() == 51) {
         this.a(7);
      }

      if(var1.getKeyCode() == 52) {
         this.a(6);
      }

      if(var1.getKeyCode() == 53) {
         this.a(5);
      }

      if(var1.getKeyCode() == 54) {
         this.a(3);
      }

      if(var1.getKeyCode() == 55) {
         this.a(2);
      }

      if(var1.getKeyCode() == 56) {
         this.a(1);
      }

      if(var1.getKeyCode() == 57) {
         this.a(0);
      }

      if(var1.getKeyCode() == 112) {
         try {
            this.b("World1");
         } catch (IOException ioException) {
            ioException.printStackTrace();
         }
      }

      if(var1.getKeyCode() == 113) {
         try {
            this.b("World2");
         } catch (IOException ioException) {
            ioException.printStackTrace();
         }
      }

      if(var1.getKeyCode() == 114) {
         try {
            this.b("World3");
         } catch (IOException ioException) {
            ioException.printStackTrace();
         }
      }

      if(var1.getKeyCode() == 115) {
         try {
            this.b("World4");
         } catch (IOException ioException) {
            ioException.printStackTrace();
         }
      }

      if(var1.getKeyCode() == 116) {
         try {
            this.b("World5");
         } catch (IOException ioException) {
            ioException.printStackTrace();
         }
      }

      if(var1.getKeyCode() == 32) {
         this.i = this.j = 0;
      }

      if(var1.getKeyCode() == 27) {
         this.c = !this.c;
      }

      this.repaint();
   }

   public void keyReleased(KeyEvent var1) {}

   public void keyTyped(KeyEvent var1) {}

   // $FF: synthetic method
   static boolean a(ah var0) {
      return var0.f;
   }
}
