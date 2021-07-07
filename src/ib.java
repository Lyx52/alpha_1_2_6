import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Random;
import net.minecraft.client.Minecraft;

public class ib extends mo {

   private boolean c = false;
   private jq d;
   public String a;
   private Minecraft e;
   private hv f;
   private boolean g = false;
   Random b = new Random();


   public ib(Minecraft var1, String var2, int var3) {
      this.e = var1;
      Socket var4 = new Socket(InetAddress.getByName(var2), var3);
      this.d = new jq(var4, "Client", this);
   }

   public void a() {
      if(!this.c) {
         this.d.a();
      }
   }

   public void a(iu var1) {
      this.e.b = new pg(this.e, this);
      this.f = new hv(this, var1.d, var1.e);
      this.f.z = true;
      this.e.a((cy)this.f);
      this.e.a((bp)(new du(this)));
      this.e.g.an = var1.a;
      System.out.println("clientEntityId: " + var1.a);
   }

   public void a(id var1) {
      double var2 = (double)var1.b / 32.0D;
      double var4 = (double)var1.c / 32.0D;
      double var6 = (double)var1.d / 32.0D;
      eo var8 = new eo(this.f, var2, var4, var6, new fp(var1.h, var1.i));
      var8.az = (double)var1.e / 128.0D;
      var8.aA = (double)var1.f / 128.0D;
      var8.aB = (double)var1.g / 128.0D;
      var8.br = var1.b;
      var8.bs = var1.c;
      var8.bt = var1.d;
      this.f.a(var1.a, var8);
   }

   public void a(lz var1) {
      double var2 = (double)var1.b / 32.0D;
      double var4 = (double)var1.c / 32.0D;
      double var6 = (double)var1.d / 32.0D;
      Object var8 = null;
      if(var1.e == 10) {
         var8 = new qd(this.f, var2, var4, var6, 0);
      }

      if(var1.e == 11) {
         var8 = new qd(this.f, var2, var4, var6, 1);
      }

      if(var1.e == 12) {
         var8 = new qd(this.f, var2, var4, var6, 2);
      }

      if(var1.e == 90) {
         var8 = new hj(this.f, var2, var4, var6);
      }

      if(var1.e == 60) {
         var8 = new lv(this.f, var2, var4, var6);
      }

      if(var1.e == 61) {
         var8 = new at(this.f, var2, var4, var6);
      }

      if(var1.e == 1) {
         var8 = new dp(this.f, var2, var4, var6);
      }

      if(var1.e == 50) {
         var8 = new kr(this.f, var2, var4, var6);
      }

      if(var8 != null) {
         ((lw)var8).br = var1.b;
         ((lw)var8).bs = var1.c;
         ((lw)var8).bt = var1.d;
         ((lw)var8).aC = 0.0F;
         ((lw)var8).aD = 0.0F;
         ((lw)var8).an = var1.a;
         this.f.a(var1.a, (lw)var8);
      }

   }

   public void a(dv var1) {
      lw var2 = this.a(var1.a);
      if(var2 != null) {
         var2.a((double)var1.b / 8000.0D, (double)var1.c / 8000.0D, (double)var1.d / 8000.0D);
      }
   }

   public void a(hs var1) {
      double var2 = (double)var1.c / 32.0D;
      double var4 = (double)var1.d / 32.0D;
      double var6 = (double)var1.e / 32.0D;
      float var8 = (float)(var1.f * 360) / 256.0F;
      float var9 = (float)(var1.g * 360) / 256.0F;
      ps var10 = new ps(this.e.e, var1.b);
      var10.br = var1.c;
      var10.bs = var1.d;
      var10.bt = var1.e;
      int var11 = var1.h;
      if(var11 == 0) {
         var10.e.a[var10.e.d] = null;
      } else {
         var10.e.a[var10.e.d] = new fp(var11);
      }

      var10.b(var2, var4, var6, var8, var9);
      this.f.a(var1.a, var10);
   }

   public void a(ky var1) {
      lw var2 = this.a(var1.a);
      if(var2 != null) {
         var2.br = var1.b;
         var2.bs = var1.c;
         var2.bt = var1.d;
         double var3 = (double)var2.br / 32.0D;
         double var5 = (double)var2.bs / 32.0D + 0.015625D;
         double var7 = (double)var2.bt / 32.0D;
         float var9 = (float)(var1.e * 360) / 256.0F;
         float var10 = (float)(var1.f * 360) / 256.0F;
         var2.a(var3, var5, var7, var9, var10, 3);
      }
   }

   public void a(nh var1) {
      lw var2 = this.a(var1.a);
      if(var2 != null) {
         var2.br += var1.b;
         var2.bs += var1.c;
         var2.bt += var1.d;
         double var3 = (double)var2.br / 32.0D;
         double var5 = (double)var2.bs / 32.0D + 0.015625D;
         double var7 = (double)var2.bt / 32.0D;
         float var9 = var1.g?(float)(var1.e * 360) / 256.0F:var2.aC;
         float var10 = var1.g?(float)(var1.f * 360) / 256.0F:var2.aD;
         var2.a(var3, var5, var7, var9, var10, 3);
      }
   }

   public void a(li var1) {
      this.f.c(var1.a);
   }

   public void a(fa var1) {
      bq var2 = this.e.g;
      double var3 = var2.aw;
      double var5 = var2.ax;
      double var7 = var2.ay;
      float var9 = var2.aC;
      float var10 = var2.aD;
      if(var1.h) {
         var3 = var1.a;
         var5 = var1.b;
         var7 = var1.c;
      }

      if(var1.i) {
         var9 = var1.e;
         var10 = var1.f;
      }

      var2.aY = 0.0F;
      var2.az = var2.aA = var2.aB = 0.0D;
      var2.b(var3, var5, var7, var9, var10);
      var1.a = var2.aw;
      var1.b = var2.aG.b;
      var1.c = var2.ay;
      var1.d = var2.ax;
      this.d.a((gk)var1);
      if(!this.g) {
         this.e.g.at = this.e.g.aw;
         this.e.g.au = this.e.g.ax;
         this.e.g.av = this.e.g.ay;
         this.g = true;
         this.e.a((bp)null);
      }

   }

   public void a(lq var1) {
      this.f.a(var1.a, var1.b, var1.c);
   }

   public void a(ov var1) {
      ha var2 = this.f.c(var1.a, var1.b);
      int var3 = var1.a * 16;
      int var4 = var1.b * 16;

      for(int var5 = 0; var5 < var1.f; ++var5) {
         short var6 = var1.c[var5];
         int var7 = var1.d[var5] & 255;
         byte var8 = var1.e[var5];
         int var9 = var6 >> 12 & 15;
         int var10 = var6 >> 8 & 15;
         int var11 = var6 & 255;
         var2.a(var9, var11, var10, var7, var8);
         this.f.c(var9 + var3, var11, var10 + var4, var9 + var3, var11, var10 + var4);
         this.f.b(var9 + var3, var11, var10 + var4, var9 + var3, var11, var10 + var4);
      }

   }

   public void a(ci var1) {
      this.f.c(var1.a, var1.b, var1.c, var1.a + var1.d - 1, var1.b + var1.e - 1, var1.c + var1.f - 1);
      this.f.a(var1.a, var1.b, var1.c, var1.d, var1.e, var1.f, var1.g);
   }

   public void a(mx var1) {
      this.f.c(var1.a, var1.b, var1.c, var1.d, var1.e);
   }

   public void a(qi var1) {
      this.d.a("Got kicked");
      this.c = true;
      this.e.a((cy)null);
      this.e.a((bp)(new ct("Disconnected by server", var1.a)));
   }

   public void a(String var1) {
      if(!this.c) {
         this.c = true;
         this.e.a((cy)null);
         this.e.a((bp)(new ct("Connection lost", var1)));
      }
   }

   public void a(gk var1) {
      if(!this.c) {
         this.d.a(var1);
      }
   }

   public void a(bu var1) {
      lw var2 = this.a(var1.a);
      Object var3 = (hf)this.a(var1.b);
      if(var3 == null) {
         var3 = this.e.g;
      }

      if(var2 != null) {
         this.f.a(var2, "random.pop", 0.2F, ((this.b.nextFloat() - this.b.nextFloat()) * 0.7F + 1.0F) * 2.0F);
         this.e.h.a((pp)(new cm(this.e.e, var2, (lw)var3, -0.5F)));
         this.f.c(var1.a);
      }

   }

   public void a(eq var1) {
      lw var2 = this.a(var1.a);
      if(var2 != null) {
         eb var3 = (eb)var2;
         int var4 = var1.b;
         if(var4 == 0) {
            var3.e.a[var3.e.d] = null;
         } else {
            var3.e.a[var3.e.d] = new fp(var4);
         }

      }
   }

   public void a(jr var1) {
      this.e.u.a(var1.a);
   }

   public void a(ii var1) {
      lw var2 = this.a(var1.a);
      if(var2 != null) {
         if(var1.b == 1) {
            eb var3 = (eb)var2;
            var3.z();
         } else if(var1.b == 100) {
            var2.bu = true;
         } else if(var1.b == 101) {
            var2.bu = false;
         } else if(var1.b == 102) {
            var2.bv = true;
         } else if(var1.b == 103) {
            var2.bv = false;
         } else if(var1.b == 104) {
            var2.bw = true;
         } else if(var1.b == 105) {
            var2.bw = false;
         } else if(var1.b == 2) {
            var2.g();
         }

      }
   }

   public void a(mt var1) {
      this.e.g.e.a(new fp(var1.a, var1.b, var1.c));
   }

   public void a(hw var1) {
      if(var1.a.equals("-")) {
         this.a((gk)(new iu(this.e.i.b, "Password", 6)));
      } else {
         try {
            URL var2 = new URL("http://www.minecraft.net/game/joinserver.jsp?user=" + this.e.i.b + "&sessionId=" + this.e.i.c + "&serverId=" + var1.a);
            BufferedReader var3 = new BufferedReader(new InputStreamReader(var2.openStream()));
            String var4 = var3.readLine();
            var3.close();
            if(var4.equalsIgnoreCase("ok")) {
               this.a((gk)(new iu(this.e.i.b, "Password", 6)));
            } else {
               this.d.a("Failed to login: " + var4);
            }
         } catch (Exception var5) {
            var5.printStackTrace();
            this.d.a("Internal client error: " + var5.toString());
         }
      }

   }

   public void b() {
      this.c = true;
      this.d.a("Closed");
   }

   public void a(fv var1) {
      double var2 = (double)var1.c / 32.0D;
      double var4 = (double)var1.d / 32.0D;
      double var6 = (double)var1.e / 32.0D;
      float var8 = (float)(var1.f * 360) / 256.0F;
      float var9 = (float)(var1.g * 360) / 256.0F;
      hf var10 = (hf)fq.a(var1.b, this.e.e);
      var10.br = var1.c;
      var10.bs = var1.d;
      var10.bt = var1.e;
      var10.an = var1.a;
      var10.b(var2, var4, var6, var8, var9);
      var10.G = true;
      this.f.a(var1.a, var10);
   }

   public void a(ek var1) {
      this.e.e.a(var1.a);
   }

   public void a(p var1) {
      bq var2 = this.e.g;
      if(var1.a == -1) {
         var2.e.a = var1.b;
      }

      if(var1.a == -2) {
         var2.e.c = var1.b;
      }

      if(var1.a == -3) {
         var2.e.b = var1.b;
      }

   }

   public void a(py var1) {
      if(var1.e.e("x") == var1.a) {
         if(var1.e.e("y") == var1.b) {
            if(var1.e.e("z") == var1.c) {
               ji var2 = this.f.b(var1.a, var1.b, var1.c);
               if(var2 != null) {
                  try {
                     var2.a(var1.e);
                  } catch (Exception var4) {
                     ;
                  }

                  this.f.b(var1.a, var1.b, var1.c, var1.a, var1.b, var1.c);
               }

            }
         }
      }
   }

   public void a(kv var1) {
      this.f.m = var1.a;
      this.f.n = var1.b;
      this.f.o = var1.c;
   }

   public void a(io var1) {
      Object var2 = this.a(var1.a);
      lw var3 = this.a(var1.b);
      if(var1.a == this.e.g.an) {
         var2 = this.e.g;
      }

      if(var2 != null) {
         ((lw)var2).h(var3);
      }
   }

   public void a(fs var1) {
      lw var2 = this.a(var1.a);
      if(var2 != null) {
         var2.a(var1.b);
      }

   }

   private lw a(int var1) {
      return (lw)(var1 == this.e.g.an?this.e.g:this.f.b(var1));
   }

   public void a(cq var1) {
      this.e.g.a_(var1.a);
   }

   public void a(jk var1) {
      this.e.p();
   }

   public void a(lc var1) {
      ks var2 = new ks(this.e.e, (lw)null, var1.a, var1.b, var1.c, var1.d);
      var2.g = var1.e;
      var2.b();
   }
}
