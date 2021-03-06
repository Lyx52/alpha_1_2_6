package mojang.net.minecraft.client;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;

import mojang.*;
import mojang.entity.Entity;
import mojang.gui.*;
import mojang.world.Dimension;
import mojang.world.OverworldDimension;
import mojang.world.World;
import org.lwjgl.LWJGLException;
import org.lwjgl.input.Controllers;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

public abstract class Minecraft implements Runnable {

   public iv b;
   private boolean a = false;
   public int c;
   public int d;
   private bm O;
   private kc P = new kc(20.0F);
   public World world;
   public f f;
   public bq playerName;
   public bz h;
   public ea i = null;
   public String developerURL;
   public Canvas k;
   public boolean l = true;
   public volatile boolean m = false;
   public Texture n;
   public ls o;
   public GraphicsUserInterface p = null;
   public hu q = new hu(this);
   public kb r = new kb(this);
   private ResourceDownloadThread Q;
   private int R = 0;
   private int S = 0;
   private int T;
   private int U;
   public String s = null;
   public int t = 0;
   public BaseGUI u;
   public boolean v = false;
   public dc w = new dc(0.0F);
   public nx x = null;
   public OptionsManager y;
   protected MinecraftApplet z;
   public SoundManager A = new SoundManager();
   public oi B;
   public ff C;
   public File D;
   public static long[] E = new long[512];
   public static long[] F = new long[512];
   public static int G = 0;
   private String V;
   private int W;
   private oe X = new oe();
   private ba Y = new ba();
   private static File gameDirectory = null;
   public volatile boolean H = true;
   public String I = "";
   boolean J = false;
   long K = -1L;
   public boolean L = false;
   private int aa = 0;
   public boolean M = false;
   long N = System.currentTimeMillis();
   private int ab = 0;


   public Minecraft(Component var1, Canvas var2, MinecraftApplet var3, int var4, int var5, boolean var6) {
      this.T = var4;
      this.U = var5;
      this.a = var6;
      this.z = var3;
      new TimerHackThread(this, "Timer hack thread");
      this.k = var2;
      this.c = var4;
      this.d = var5;
      this.a = var6;
   }

   public abstract void throwMinecraftException(MinecraftException exception);

   public void a(String var1, int var2) {
      this.V = var1;
      this.W = var2;
   }

   public void a() throws LWJGLException {
      if(this.k != null) {
         Graphics var1 = this.k.getGraphics();
         if(var1 != null) {
            var1.setColor(Color.BLACK);
            var1.fillRect(0, 0, this.c, this.d);
            var1.dispose();
         }

         Display.setParent(this.k);
      } else if(this.a) {
         Display.setFullscreen(true);
         this.c = Display.getDisplayMode().getWidth();
         this.d = Display.getDisplayMode().getHeight();
         if(this.c <= 0) {
            this.c = 1;
         }

         if(this.d <= 0) {
            this.d = 1;
         }
      } else {
         Display.setDisplayMode(new DisplayMode(this.c, this.d));
      }

      Display.setTitle("Minecraft Minecraft Alpha v1.2.6");

      try {
         Display.create();
      } catch (LWJGLException var6) {
         var6.printStackTrace();

         try {
            Thread.sleep(1000L);
         } catch (InterruptedException var5) {
            ;
         }

         Display.create();
      }

      mn.a.f = new ku(this);
      this.D = getGameDirectory();
      this.y = new OptionsManager(this, this.D);
      this.C = new ff(this, this.D);
      this.n = new Texture(this.C, this.y);
      this.o = new ls(this.y, "/mojang/assets/font/default.png", this.n);
      this.q();
      Keyboard.create();
      Mouse.create();
      this.B = new oi(this.k);

      try {
         Controllers.create();
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      this.checkGLError("Pre startup");
      GL11.glEnable(3553);
      GL11.glShadeModel(7425);
      GL11.glClearDepth(1.0D);
      GL11.glEnable(2929);
      GL11.glDepthFunc(515);
      GL11.glEnable(3008);
      GL11.glAlphaFunc(516, 0.1F);
      GL11.glCullFace(1029);
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      GL11.glMatrixMode(5888);
      this.checkGLError("Startup");
      this.O = new bm();
      this.A.a(this.y);
      this.n.a((ad)this.Y);
      this.n.a((ad)this.X);
      this.n.a((ad)(new et()));
      this.n.a((ad)(new ae(this)));
      this.n.a((ad)(new gp(this)));
      this.n.a((ad)(new iz()));
      this.n.a((ad)(new ez()));
      this.n.a((ad)(new ln(0)));
      this.n.a((ad)(new ln(1)));
      this.f = new f(this, this.n);
      GL11.glViewport(0, 0, this.c, this.d);
      this.h = new bz(this.world, this.n);

      try {
         this.Q = new ResourceDownloadThread(this.D, this);
         this.Q.start();
      } catch (Exception var3) {
         ;
      }

      this.checkGLError("Post startup");
      this.u = new BaseGUI(this);
      if(this.V != null) {
         this.changeGUI((GraphicsUserInterface)(new ServerConnectionGUI(this, this.V, this.W)));
      } else {
         this.changeGUI((GraphicsUserInterface)(new MinecraftGUI()));
      }

   }

   private void q() throws LWJGLException {
      kl var1 = new kl(this.c, this.d);
      int var2 = var1.a();
      int var3 = var1.b();
      GL11.glClear(16640);
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      GL11.glOrtho(0.0D, (double)var2, (double)var3, 0.0D, 1000.0D, 3000.0D);
      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      GL11.glTranslatef(0.0F, 0.0F, -2000.0F);
      GL11.glViewport(0, 0, this.c, this.d);
      GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
      is var4 = is.a;
      GL11.glDisable(2896);
      GL11.glEnable(3553);
      GL11.glDisable(2912);
      GL11.glBindTexture(3553, this.n.loadTexture("/mojang/assets/title/mojang.png"));
      var4.b();
      var4.b(16777215);
      var4.a(0.0D, (double)this.d, 0.0D, 0.0D, 0.0D);
      var4.a((double)this.c, (double)this.d, 0.0D, 0.0D, 0.0D);
      var4.a((double)this.c, 0.0D, 0.0D, 0.0D, 0.0D);
      var4.a(0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
      var4.a();
      short var5 = 256;
      short var6 = 256;
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      var4.b(16777215);
      this.a((this.c / 2 - var5) / 2, (this.d / 2 - var6) / 2, 0, 0, var5, var6);
      GL11.glDisable(2896);
      GL11.glDisable(2912);
      GL11.glEnable(3008);
      GL11.glAlphaFunc(516, 0.1F);
      Display.swapBuffers();
   }

   public void a(int var1, int var2, int var3, int var4, int var5, int var6) {
      float var7 = 0.00390625F;
      float var8 = 0.00390625F;
      is var9 = is.a;
      var9.b();
      var9.a((double)(var1 + 0), (double)(var2 + var6), 0.0D, (double)((float)(var3 + 0) * var7), (double)((float)(var4 + var6) * var8));
      var9.a((double)(var1 + var5), (double)(var2 + var6), 0.0D, (double)((float)(var3 + var5) * var7), (double)((float)(var4 + var6) * var8));
      var9.a((double)(var1 + var5), (double)(var2 + 0), 0.0D, (double)((float)(var3 + var5) * var7), (double)((float)(var4 + 0) * var8));
      var9.a((double)(var1 + 0), (double)(var2 + 0), 0.0D, (double)((float)(var3 + 0) * var7), (double)((float)(var4 + 0) * var8));
      var9.a();
   }

   public static File getGameDirectory() {
      if(gameDirectory == null) {
         gameDirectory = createGameDirectory("mojang");
      }

      return gameDirectory;
   }

   public static File createGameDirectory(String applicationName) {
      String userHomeDirectory = System.getProperty("user.home", ".");
      File gameDirectory;
      switch(OS_IDS.type_ids[getOSType().ordinal()]) {
      case 1:
      case 2:
         gameDirectory = new File(userHomeDirectory, '.' + applicationName + '/');
         break;
      case 3:
         String appdata = System.getenv("APPDATA");
         if(appdata != null) {
            gameDirectory = new File(appdata, "." + applicationName + '/');
         } else {
            gameDirectory = new File(userHomeDirectory, '.' + applicationName + '/');
         }
         break;
      case 4:
         gameDirectory = new File(userHomeDirectory, "Library/Application Support/" + applicationName);
         break;
      default:
         gameDirectory = new File(userHomeDirectory, applicationName + '/');
      }

      if(!gameDirectory.exists() && !gameDirectory.mkdirs()) {
         throw new RuntimeException("The working directory could not be created: " + gameDirectory);
      } else {
         return gameDirectory;
      }
   }

   private static OS_TYPES getOSType() {
      String osName = System.getProperty("os.name").toLowerCase();
      return osName.contains("win")? OS_TYPES.WINDOWS :(osName.contains("mac")? OS_TYPES.MACOS :(osName.contains("solaris")? OS_TYPES.SOLARIS :(osName.contains("sunos")? OS_TYPES.SOLARIS :(osName.contains("linux")? OS_TYPES.LINUX :(osName.contains("unix")? OS_TYPES.LINUX : OS_TYPES.UNKOWN)))));
   }

   public void changeGUI(GraphicsUserInterface var1) {
      if(!(this.p instanceof ay)) {
         if(this.p != null) {
            this.p.h();
         }

         if(var1 == null && this.world == null) {
            var1 = new MinecraftGUI();
         } else if(var1 == null && this.playerName.J <= 0) {
            var1 = new bb();
         }

         this.p = (GraphicsUserInterface)var1;
         if(var1 != null) {
            this.f();
            kl var2 = new kl(this.c, this.d);
            int var3 = var2.a();
            int var4 = var2.b();
            ((GraphicsUserInterface)var1).initInterface(this, var3, var4);
            this.v = false;
         } else {
            this.e();
         }

      }
   }

   private void checkGLError(String var1) {
      int var2 = GL11.glGetError();
      if(var2 != 0) {
         String var3 = GLU.gluErrorString(var2);
         System.out.println("########## GL ERROR ##########");
         System.out.println("@ " + var1);
         System.out.println(var2 + ": " + var3);
         System.exit(0);
      }

   }

   public void c() {
      if(this.z != null) {
         this.z.c();
      }

      try {
         if(this.Q != null) {
            this.Q.b();
         }
      } catch (Exception var8) {
         ;
      }

      try {
         System.out.println("Stopping!");
         this.setWorld((World)null);

         try {
            ds.a();
         } catch (Exception var6) {
            ;
         }

         this.A.b();
         Mouse.destroy();
         Keyboard.destroy();
      } finally {
         Display.destroy();
      }

      System.gc();
   }

   public void run() {
      this.H = true;

      try {
         this.a();
      } catch (Exception var15) {
         var15.printStackTrace();
         this.throwMinecraftException(new MinecraftException("Failed to start game", var15));
         return;
      }

      try {
         try {
            long var1 = System.currentTimeMillis();
            int var3 = 0;

            while(this.H && (this.z == null || this.z.isActive())) {
               co.a();
               ao.a();
               if(this.k == null && Display.isCloseRequested()) {
                  this.d();
               }

               if(this.m && this.world != null) {
                  float var4 = this.P.c;
                  this.P.a();
                  this.P.c = var4;
               } else {
                  this.P.a();
               }

               long var19 = System.nanoTime();

               for(int var6 = 0; var6 < this.P.b; ++var6) {
                  ++this.R;

                  try {
                     this.i();
                  } catch (MinecraftRuntimeException var14) {
                     this.world = null;
                     this.setWorld((World)null);
                     this.changeGUI((GraphicsUserInterface)(new kh()));
                  }
               }

               long var20 = System.nanoTime() - var19;
               this.checkGLError("Pre render");
               this.A.a(this.playerName, this.P.c);
               GL11.glEnable(3553);
               if(this.world != null && !this.world.z) {
                  while(true) {
                     if(this.world.g()) {
                        continue;
                     }
                  }
               }

               if(this.world != null && this.world.z) {
                  this.world.g();
               }

               if(this.y.vsync) {
                  Thread.sleep(5L);
               }

               if(!Keyboard.isKeyDown(65)) {
                  Display.update();
               }

               if(!this.v) {
                  if(this.b != null) {
                     this.b.a(this.P.c);
                  }

                  this.r.b(this.P.c);
               }

               if(!Display.isActive()) {
                  if(this.a) {
                     this.h();
                  }

                  Thread.sleep(10L);
               }

               if(Keyboard.isKeyDown(61)) {
                  this.a(var20);
               } else {
                  this.K = System.nanoTime();
               }

               Thread.yield();
               if(Keyboard.isKeyDown(65)) {
                  Display.update();
               }

               this.s();
               if(this.k != null && !this.a && (this.k.getWidth() != this.c || this.k.getHeight() != this.d)) {
                  this.c = this.k.getWidth();
                  this.d = this.k.getHeight();
                  if(this.c <= 0) {
                     this.c = 1;
                  }

                  if(this.d <= 0) {
                     this.d = 1;
                  }

                  this.a(this.c, this.d);
               }

               this.checkGLError("Post render");
               ++var3;

               for(this.m = !this.j() && this.p != null && this.p.b(); System.currentTimeMillis() >= var1 + 1000L; var3 = 0) {
                  this.I = var3 + " fps, " + bw.b + " chunk updates";
                  bw.b = 0;
                  var1 += 1000L;
               }
            }
         } catch (pq var16) {
            ;
         } catch (Throwable exception) {
            this.world = null;
            exception.printStackTrace();
            this.throwMinecraftException(new MinecraftException("Unexpected error", exception));
         }

      } finally {
         ;
      }
   }

   private void s() {
      if(Keyboard.isKeyDown(60)) {
         if(!this.J) {
            if(Keyboard.isKeyDown(59)) {
               this.u.a(em.a(gameDirectory, this.c, this.d));
            }

            this.J = true;
         }
      } else {
         this.J = false;
      }

   }

   private void a(long var1) {
      long var3 = 16666666L;
      if(this.K == -1L) {
         this.K = System.nanoTime();
      }

      long var5 = System.nanoTime();
      F[G & E.length - 1] = var1;
      E[G++ & E.length - 1] = var5 - this.K;
      this.K = var5;
      GL11.glClear(256);
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      GL11.glOrtho(0.0D, (double)this.c, (double)this.d, 0.0D, 1000.0D, 3000.0D);
      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      GL11.glTranslatef(0.0F, 0.0F, -2000.0F);
      GL11.glLineWidth(1.0F);
      GL11.glDisable(3553);
      is var7 = is.a;
      var7.a(7);
      int var8 = (int)(var3 / 200000L);
      var7.b(536870912);
      var7.a(0.0D, (double)(this.d - var8), 0.0D);
      var7.a(0.0D, (double)this.d, 0.0D);
      var7.a((double)E.length, (double)this.d, 0.0D);
      var7.a((double)E.length, (double)(this.d - var8), 0.0D);
      var7.b(538968064);
      var7.a(0.0D, (double)(this.d - var8 * 2), 0.0D);
      var7.a(0.0D, (double)(this.d - var8), 0.0D);
      var7.a((double)E.length, (double)(this.d - var8), 0.0D);
      var7.a((double)E.length, (double)(this.d - var8 * 2), 0.0D);
      var7.a();
      long var9 = 0L;

      int var11;
      for(var11 = 0; var11 < E.length; ++var11) {
         var9 += E[var11];
      }

      var11 = (int)(var9 / 200000L / (long)E.length);
      var7.a(7);
      var7.b(541065216);
      var7.a(0.0D, (double)(this.d - var11), 0.0D);
      var7.a(0.0D, (double)this.d, 0.0D);
      var7.a((double)E.length, (double)this.d, 0.0D);
      var7.a((double)E.length, (double)(this.d - var11), 0.0D);
      var7.a();
      var7.a(1);

      for(int var12 = 0; var12 < E.length; ++var12) {
         int var13 = (var12 - G & E.length - 1) * 255 / E.length;
         int var14 = var13 * var13 / 255;
         var14 = var14 * var14 / 255;
         int var15 = var14 * var14 / 255;
         var15 = var15 * var15 / 255;
         if(E[var12] > var3) {
            var7.b(-16777216 + var14 * 65536);
         } else {
            var7.b(-16777216 + var14 * 256);
         }

         long var16 = E[var12] / 200000L;
         long var18 = F[var12] / 200000L;
         var7.a((double)((float)var12 + 0.5F), (double)((float)((long)this.d - var16) + 0.5F), 0.0D);
         var7.a((double)((float)var12 + 0.5F), (double)((float)this.d + 0.5F), 0.0D);
         var7.b(-16777216 + var14 * 65536 + var14 * 256 + var14 * 1);
         var7.a((double)((float)var12 + 0.5F), (double)((float)((long)this.d - var16) + 0.5F), 0.0D);
         var7.a((double)((float)var12 + 0.5F), (double)((float)((long)this.d - (var16 - var18)) + 0.5F), 0.0D);
      }

      var7.a();
      GL11.glEnable(3553);
   }

   public void d() {
      this.H = false;
   }

   public void e() {
      if(Display.isActive()) {
         if(!this.L) {
            this.L = true;
            this.B.a();
            this.changeGUI((GraphicsUserInterface)null);
            this.aa = this.R + 10000;
         }
      }
   }

   public void f() {
      if(this.L) {
         if(this.playerName != null) {
            this.playerName.m_();
         }

         this.L = false;
         this.B.b();
      }
   }

   public void g() {
      if(this.p == null) {
         this.changeGUI((GraphicsUserInterface)(new jl()));
      }
   }

   private void a(int var1, boolean var2) {
      if(!this.b.b) {
         if(var1 != 0 || this.S <= 0) {
            if(var2 && this.x != null && this.x.a == 0 && var1 == 0) {
               int var3 = this.x.b;
               int var4 = this.x.c;
               int var5 = this.x.d;
               this.b.c(var3, var4, var5, this.x.e);
               this.h.a(var3, var4, var5, this.x.e);
            } else {
               this.b.a();
            }

         }
      }
   }

   private void a(int var1) {
      if(var1 != 0 || this.S <= 0) {
         if(var1 == 0) {
            this.playerName.z();
         }

         boolean var2 = true;
         if(this.x == null) {
            if(var1 == 0 && !(this.b instanceof jt)) {
               this.S = 10;
            }
         } else if(this.x.a == 1) {
            if(var1 == 0) {
               this.b.b(this.playerName, this.x.g);
            }

            if(var1 == 1) {
               this.b.a(this.playerName, this.x.g);
            }
         } else if(this.x.a == 0) {
            int var3 = this.x.b;
            int var4 = this.x.c;
            int var5 = this.x.d;
            int var6 = this.x.e;
            nq var7 = nq.m[this.world.a(var3, var4, var5)];
            if(var1 == 0) {
               this.world.i(var3, var4, var5, this.x.e);
               if(var7 != nq.z || this.playerName.f >= 100) {
                  this.b.a(var3, var4, var5, this.x.e);
               }
            } else {
               fp var8 = this.playerName.e.a();
               int var9 = var8 != null?var8.a:0;
               if(this.b.a(this.playerName, this.world, var8, var3, var4, var5, var6)) {
                  var2 = false;
                  this.playerName.z();
               }

               if(var8 == null) {
                  return;
               }

               if(var8.a == 0) {
                  this.playerName.e.a[this.playerName.e.d] = null;
               } else if(var8.a != var9) {
                  this.r.a.b();
               }
            }
         }

         if(var2 && var1 == 1) {
            fp var10 = this.playerName.e.a();
            if(var10 != null && this.b.a(this.playerName, this.world, var10)) {
               this.r.a.c();
            }
         }

      }
   }

   public void h() {
      try {
         this.a = !this.a;
         System.out.println("Toggle fullscreen!");
         if(this.a) {
            Display.setDisplayMode(Display.getDesktopDisplayMode());
            this.c = Display.getDisplayMode().getWidth();
            this.d = Display.getDisplayMode().getHeight();
            if(this.c <= 0) {
               this.c = 1;
            }

            if(this.d <= 0) {
               this.d = 1;
            }
         } else {
            if(this.k != null) {
               this.c = this.k.getWidth();
               this.d = this.k.getHeight();
            } else {
               this.c = this.T;
               this.d = this.U;
            }

            if(this.c <= 0) {
               this.c = 1;
            }

            if(this.d <= 0) {
               this.d = 1;
            }

            Display.setDisplayMode(new DisplayMode(this.T, this.U));
         }

         this.f();
         Display.setFullscreen(this.a);
         Display.update();
         Thread.sleep(1000L);
         if(this.a) {
            this.e();
         }

         if(this.p != null) {
            this.f();
            this.a(this.c, this.d);
         }

         System.out.println("Size: " + this.c + ", " + this.d);
      } catch (Exception var2) {
         var2.printStackTrace();
      }

   }

   private void a(int var1, int var2) {
      if(var1 <= 0) {
         var1 = 1;
      }

      if(var2 <= 0) {
         var2 = 1;
      }

      this.c = var1;
      this.d = var2;
      if(this.p != null) {
         kl var3 = new kl(var1, var2);
         int var4 = var3.a();
         int var5 = var3.b();
         this.p.initInterface(this, var4, var5);
      }

   }

   private void t() {
      if(this.x != null) {
         int var1 = this.world.a(this.x.b, this.x.c, this.x.d);
         if(var1 == nq.u.bh) {
            var1 = nq.v.bh;
         }

         if(var1 == nq.aj.bh) {
            var1 = nq.ak.bh;
         }

         if(var1 == nq.z.bh) {
            var1 = nq.t.bh;
         }

         this.playerName.e.a(var1, this.b instanceof jt);
      }

   }

   public void i() throws IOException {
      this.u.a();
      this.r.a(1.0F);
      if(this.playerName != null) {
         this.playerName.o();
      }

      if(!this.m && this.world != null) {
         this.b.c();
      }

      GL11.glBindTexture(3553, this.n.loadTexture("/mojang/terrain.png"));
      if(!this.m) {
         this.n.a();
      }

      if(this.p == null && this.playerName != null && this.playerName.J <= 0) {
         this.changeGUI((GraphicsUserInterface)null);
      }

      if(this.p != null) {
         this.aa = this.R + 10000;
      }

      if(this.p != null) {
         this.p.updateInput();
         if(this.p != null) {
            this.p.g();
         }
      }

      if(this.p == null || this.p.f) {
         while(Mouse.next()) {
            long var1 = System.currentTimeMillis() - this.N;
            if(var1 <= 200L) {
               int var3 = Mouse.getEventDWheel();
               if(var3 != 0) {
                  this.playerName.e.a(var3);
               }

               if(this.p == null) {
                  if(!this.L && Mouse.getEventButtonState()) {
                     this.e();
                  } else {
                     if(Mouse.getEventButton() == 0 && Mouse.getEventButtonState()) {
                        this.a(0);
                        this.aa = this.R;
                     }

                     if(Mouse.getEventButton() == 1 && Mouse.getEventButtonState()) {
                        this.a(1);
                        this.aa = this.R;
                     }

                     if(Mouse.getEventButton() == 2 && Mouse.getEventButtonState()) {
                        this.t();
                     }
                  }
               } else if(this.p != null) {
                  this.p.updateMouse();
               }
            }
         }

         if(this.S > 0) {
            --this.S;
         }

         while(Keyboard.next()) {
            this.playerName.a(Keyboard.getEventKey(), Keyboard.getEventKeyState());
            if(Keyboard.getEventKeyState()) {
               if(Keyboard.getEventKey() == 87) {
                  this.h();
               } else {
                  if(this.p != null) {
                     this.p.updateKeyboard();
                  } else {
                     if(Keyboard.getEventKey() == 1) {
                        this.g();
                     }

                     if(Keyboard.getEventKey() == 31 && Keyboard.isKeyDown(61)) {
                        this.u();
                     }

                     if(Keyboard.getEventKey() == 63) {
                        this.y.y = !this.y.y;
                     }

                     if(Keyboard.getEventKey() == this.y.ACTION_INVENTORY.keyCode) {
                        this.changeGUI((GraphicsUserInterface)(new ne(this.playerName.e, this.playerName.e.c)));
                     }

                     if(Keyboard.getEventKey() == this.y.ACTION_DROP.keyCode) {
                        this.playerName.a(this.playerName.e.a(this.playerName.e.d, 1), false);
                     }

                     if(this.j() && Keyboard.getEventKey() == this.y.ACTION_CHAT.keyCode) {
                        this.changeGUI((GraphicsUserInterface)(new ChooseInputGUI()));
                     }
                  }

                  for(int var4 = 0; var4 < 9; ++var4) {
                     if(Keyboard.getEventKey() == 2 + var4) {
                        this.playerName.e.d = var4;
                     }
                  }

                  if(Keyboard.getEventKey() == this.y.ACTION_TOGGLE_FOG.keyCode) {
                     this.y.b(4, !Keyboard.isKeyDown(42) && !Keyboard.isKeyDown(54)?1:-1);
                  }
               }
            }
         }

         if(this.p == null) {
            if(Mouse.isButtonDown(0) && (float)(this.R - this.aa) >= this.P.a / 4.0F && this.L) {
               this.a(0);
               this.aa = this.R;
            }

            if(Mouse.isButtonDown(1) && (float)(this.R - this.aa) >= this.P.a / 4.0F && this.L) {
               this.a(1);
               this.aa = this.R;
            }
         }

         this.a(0, this.p == null && Mouse.isButtonDown(0) && this.L);
      }

      if(this.world != null) {
         if(this.playerName != null) {
            ++this.ab;
            if(this.ab == 30) {
               this.ab = 0;
               this.world.f(this.playerName);
            }
         }

         this.world.k = this.y.gameDifficulty;
         if(this.world.z) {
            this.world.k = 3;
         }

         if(!this.m) {
            this.r.a();
         }

         if(!this.m) {
            this.f.d();
         }

         if(!this.m) {
            this.world.e();
         }

         if(!this.m || this.j()) {
            this.world.i();
         }

         if(!this.m && this.world != null) {
            this.world.m(fi.b(this.playerName.aw), fi.b(this.playerName.ax), fi.b(this.playerName.ay));
         }

         if(!this.m) {
            this.h.a();
         }
      }

      this.N = System.currentTimeMillis();
   }

   private void u() {
      System.out.println("FORCING RELOAD!");
      this.A = new SoundManager();
      this.A.a(this.y);
      this.Q.a();
   }

   public boolean j() {
      return this.world != null && this.world.z;
   }

   public void changeWorld(String worldName) throws IOException {
      this.setWorld((World)null);
      System.gc();
      World world = new World(new File(getGameDirectory(), "saves"), worldName);
      if(world.needsGeneration) {
         this.a(world, "Generating level");
      } else {
         this.a(world, "Loading level");
      }

   }

   public void k() throws IOException {
      if(this.playerName.m == -1) {
         this.playerName.m = 0;
      } else {
         this.playerName.m = -1;
      }

      this.world.d(this.playerName);
      this.playerName.aN = false;
      double var1 = this.playerName.aw;
      double var3 = this.playerName.ay;
      double var5 = 8.0D;
      World var7;
      if(this.playerName.m == -1) {
         var1 /= var5;
         var3 /= var5;
         this.playerName.c(var1, this.playerName.ax, var3, this.playerName.aC, this.playerName.aD);
         this.world.a(this.playerName, false);
         var7 = new World(this.world, new OverworldDimension());
         this.a(var7, "Entering the Nether", (eb)this.playerName);
      } else {
         var1 *= var5;
         var3 *= var5;
         this.playerName.c(var1, this.playerName.ax, var3, this.playerName.aC, this.playerName.aD);
         this.world.a(this.playerName, false);
         var7 = new World(this.world, new Dimension());
         this.a(var7, "Leaving the Nether", (eb)this.playerName);
      }

      this.playerName.as = this.world;
      this.playerName.c(var1, this.playerName.ax, var3, this.playerName.aC, this.playerName.aD);
      this.world.a(this.playerName, false);
      (new no()).a(this.world, this.playerName);
   }

   public void setWorld(World var1) {
      this.a(var1, "");
   }

   public void a(World var1, String var2) {
      this.a(var1, var2, (eb)null);
   }

   public void a(World world, String title, eb var3) {
      this.q.primaryText(title);
      this.q.secondaryText("");
      this.A.a((String)null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      if(this.world != null) {
         this.world.a((pu)this.q);
      }

      this.world = world;
      System.out.println("Player is " + this.playerName);
      if(world != null) {
         this.b.a(world);
         if(!this.j()) {
            if(var3 == null) {
               this.playerName = (bq)world.a(bq.class);
            }
         } else if(this.playerName != null) {
            this.playerName.t();
            if(world != null) {
               world.a((Entity)this.playerName);
            }
         }

         if(!world.z) {
            this.BuildAndGenerateTerrain(title);
         }

         System.out.println("Player is now " + this.playerName);
         if(this.playerName == null) {
            this.playerName = (bq)this.b.b(world);
            this.playerName.t();
            this.b.a((eb)this.playerName);
         }

         this.playerName.a = new he(this.y);
         if(this.f != null) {
            this.f.a(world);
         }

         if(this.h != null) {
            this.h.a(world);
         }

         this.b.b((eb)this.playerName);
         if(var3 != null) {
            world.c();
         }

         world.a((eb)this.playerName);
         if(world.needsGeneration) {
            world.a((pu)this.q);
         }
      } else {
         this.playerName = null;
      }

      System.gc();
      this.N = 0L;
   }

   private void BuildAndGenerateTerrain(String text) {
      this.q.primaryText(text);
      this.q.secondaryText("Building terrain");
      short var2 = 128;
      int var3 = 0;
      int var4 = var2 * 2 / 16 + 1;
      var4 *= var4;

      for(int var5 = -var2; var5 <= var2; var5 += 16) {
         int var6 = this.world.spawnX;
         int var7 = this.world.spawnZ;
         if(this.playerName != null) {
            var6 = (int)this.playerName.aw;
            var7 = (int)this.playerName.ay;
         }

         for(int var8 = -var2; var8 <= var2; var8 += 16) {
            this.q.a(var3++ * 100 / var4);
            this.world.a(var6 + var5, 64, var7 + var8);

            while(this.world.g()) {
               ;
            }
         }
      }

      this.q.secondaryText("Simulating world for a bit");
      boolean var9 = true;
      this.world.l();
   }

   public void a(String var1, File var2) {
      int indexOfSlash = var1.indexOf("/");
      String directoryName = var1.substring(0, indexOfSlash);
      var1 = var1.substring(indexOfSlash + 1);
      if(directoryName.equalsIgnoreCase("sound")) {
         this.A.a(var1, var2);
      } else if(directoryName.equalsIgnoreCase("newsound")) {
         this.A.a(var1, var2);
      } else if(directoryName.equalsIgnoreCase("streaming")) {
         this.A.b(var1, var2);
      } else if(directoryName.equalsIgnoreCase("music")) {
         this.A.c(var1, var2);
      } else if(directoryName.equalsIgnoreCase("newmusic")) {
         this.A.c(var1, var2);
      }

   }

   public bm l() {
      return this.O;
   }

   public String m() {
      return this.f.b();
   }

   public String n() {
      return this.f.c();
   }

   public String o() {
      return "P: " + this.h.b() + ". T: " + this.world.f();
   }

   public void p() throws IOException {
      if(!this.world.currentDimension.d()) {
         this.k();
      }

      this.world.b();
      this.world.o();
      int var1 = 0;
      if(this.playerName != null) {
         var1 = this.playerName.an;
         this.world.d(this.playerName);
      }

      this.playerName = (bq)this.b.b(this.world);
      this.playerName.t();
      this.b.a((eb)this.playerName);
      this.world.a((eb)this.playerName);
      this.playerName.a = new he(this.y);
      this.playerName.an = var1;
      this.b.b((eb)this.playerName);
      this.BuildAndGenerateTerrain("Respawning");
      if(this.p instanceof bb) {
         this.changeGUI((GraphicsUserInterface)null);
      }

   }

   public static void a(String var0, String var1) {
      a(var0, var1, (String)null);
   }

   public static void a(String var0, String var1, String var2) {
      boolean var3 = false;
      Frame var5 = new Frame("Minecraft");
      Canvas var6 = new Canvas();
      var5.setLayout(new BorderLayout());
      var5.add(var6, "Center");
      var6.setPreferredSize(new java.awt.Dimension(854, 480));
      var5.pack();
      var5.setLocationRelativeTo((Component)null);
      gj var7 = new gj(var5, var6, (MinecraftApplet)null, 854, 480, var3, var5);
      Thread var8 = new Thread(var7, "Minecraft main thread");
      var8.setPriority(10);
      var7.l = false;
      var7.developerURL = "www.minecraft.net";
      if(var0 != null && var1 != null) {
         var7.i = new ea(var0, var1);
      } else {
         var7.i = new ea("Player" + System.currentTimeMillis() % 1000L, "");
      }

      if(var2 != null) {
         String[] var9 = var2.split(":");
         var7.a(var9[0], Integer.parseInt(var9[1]));
      }

      var5.setVisible(true);
      var5.addWindowListener(new gn(var7, var8));
      var8.start();
   }

   public static void main(String[] var0) {
      String var1 = "Player" + System.currentTimeMillis() % 1000L;
      if(var0.length > 0) {
         var1 = var0[0];
      }

      String var2 = "-";
      if(var0.length > 1) {
         var2 = var0[1];
      }

      var1 = "Player" + System.currentTimeMillis() % 1000L;
      var1 = "Player524";
      a(var1, var2);
   }

}
