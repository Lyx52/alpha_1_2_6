package mojang;

import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import mojang.entity.Entity;
import mojang.net.minecraft.client.Minecraft;
import org.lwjgl.opengl.ARBOcclusionQuery;
import org.lwjgl.opengl.GL11;

public class f implements jv {

   public List a = new ArrayList();
   private cy k;
   private fu l;
   private List m = new ArrayList();
   private bw[] n;
   private bw[] o;
   private int p;
   private int q;
   private int r;
   private int s;
   private Minecraft t;
   private bk u;
   private IntBuffer v;
   private boolean w = false;
   private int x = 0;
   private int y;
   private int z;
   private int A;
   private int B;
   private int C;
   private int D;
   private int E;
   private int F;
   private int G;
   private int H = -1;
   private int I = 2;
   private int J;
   private int K;
   private int L;
   int[] b = new int['\uc350'];
   IntBuffer c = ds.c(64);
   private int M;
   private int N;
   private int O;
   private int P;
   private int Q;
   private List R = new ArrayList();
   private mm[] S = new mm[]{new mm(), new mm(), new mm(), new mm()};
   int d = 0;
   int e = ds.a(1);
   double f = -9999.0D;
   double g = -9999.0D;
   double h = -9999.0D;
   public float i;
   int j = 0;


   public f(Minecraft var1, fu var2) {
      this.t = var1;
      this.l = var2;
      byte var3 = 64;
      this.s = ds.a(var3 * var3 * var3 * 3);
      this.w = var1.l().a();
      if(this.w) {
         this.c.clear();
         this.v = ds.c(var3 * var3 * var3);
         this.v.clear();
         this.v.position(0);
         this.v.limit(var3 * var3 * var3);
         ARBOcclusionQuery.glGenQueriesARB(this.v);
      }

      this.y = ds.a(3);
      GL11.glPushMatrix();
      GL11.glNewList(this.y, 4864);
      this.f();
      GL11.glEndList();
      GL11.glPopMatrix();
      is var4 = is.a;
      this.z = this.y + 1;
      GL11.glNewList(this.z, 4864);
      byte var6 = 64;
      int var7 = 256 / var6 + 2;
      float var5 = 16.0F;

      int var8;
      int var9;
      for(var8 = -var6 * var7; var8 <= var6 * var7; var8 += var6) {
         for(var9 = -var6 * var7; var9 <= var6 * var7; var9 += var6) {
            var4.b();
            var4.a((double)(var8 + 0), (double)var5, (double)(var9 + 0));
            var4.a((double)(var8 + var6), (double)var5, (double)(var9 + 0));
            var4.a((double)(var8 + var6), (double)var5, (double)(var9 + var6));
            var4.a((double)(var8 + 0), (double)var5, (double)(var9 + var6));
            var4.a();
         }
      }

      GL11.glEndList();
      this.A = this.y + 2;
      GL11.glNewList(this.A, 4864);
      var5 = -16.0F;
      var4.b();

      for(var8 = -var6 * var7; var8 <= var6 * var7; var8 += var6) {
         for(var9 = -var6 * var7; var9 <= var6 * var7; var9 += var6) {
            var4.a((double)(var8 + var6), (double)var5, (double)(var9 + 0));
            var4.a((double)(var8 + 0), (double)var5, (double)(var9 + 0));
            var4.a((double)(var8 + 0), (double)var5, (double)(var9 + var6));
            var4.a((double)(var8 + var6), (double)var5, (double)(var9 + var6));
         }
      }

      var4.a();
      GL11.glEndList();
   }

   private void f() {
      Random var1 = new Random(10842L);
      is var2 = is.a;
      var2.b();

      for(int var3 = 0; var3 < 1500; ++var3) {
         double var4 = (double)(var1.nextFloat() * 2.0F - 1.0F);
         double var6 = (double)(var1.nextFloat() * 2.0F - 1.0F);
         double var8 = (double)(var1.nextFloat() * 2.0F - 1.0F);
         double var10 = (double)(0.25F + var1.nextFloat() * 0.25F);
         double var12 = var4 * var4 + var6 * var6 + var8 * var8;
         if(var12 < 1.0D && var12 > 0.01D) {
            var12 = 1.0D / Math.sqrt(var12);
            var4 *= var12;
            var6 *= var12;
            var8 *= var12;
            double var14 = var4 * 100.0D;
            double var16 = var6 * 100.0D;
            double var18 = var8 * 100.0D;
            double var20 = Math.atan2(var4, var8);
            double var22 = Math.sin(var20);
            double var24 = Math.cos(var20);
            double var26 = Math.atan2(Math.sqrt(var4 * var4 + var8 * var8), var6);
            double var28 = Math.sin(var26);
            double var30 = Math.cos(var26);
            double var32 = var1.nextDouble() * 3.141592653589793D * 2.0D;
            double var34 = Math.sin(var32);
            double var36 = Math.cos(var32);

            for(int var38 = 0; var38 < 4; ++var38) {
               double var39 = 0.0D;
               double var41 = (double)((var38 & 2) - 1) * var10;
               double var43 = (double)((var38 + 1 & 2) - 1) * var10;
               double var47 = var41 * var36 - var43 * var34;
               double var49 = var43 * var36 + var41 * var34;
               double var53 = var47 * var28 + var39 * var30;
               double var55 = var39 * var28 - var47 * var30;
               double var57 = var55 * var22 - var49 * var24;
               double var61 = var49 * var22 + var55 * var24;
               var2.a(var14 + var57, var16 + var53, var18 + var61);
            }
         }
      }

      var2.a();
   }

   public void a(cy var1) {
      if(this.k != null) {
         this.k.b((jv)this);
      }

      this.f = -9999.0D;
      this.g = -9999.0D;
      this.h = -9999.0D;
      mn.a.a(var1);
      this.k = var1;
      this.u = new bk(var1);
      if(var1 != null) {
         var1.a((jv)this);
         this.a();
      }

   }

   public void a() {
      nq.K.a(this.t.y.fancyGraphics);
      this.H = this.t.y.viewDistance;
      int var1;
      if(this.o != null) {
         for(var1 = 0; var1 < this.o.length; ++var1) {
            this.o[var1].c();
         }
      }

      var1 = 64 << 3 - this.H;
      if(var1 > 400) {
         var1 = 400;
      }

      this.p = var1 / 16 + 1;
      this.q = 8;
      this.r = var1 / 16 + 1;
      this.o = new bw[this.p * this.q * this.r];
      this.n = new bw[this.p * this.q * this.r];
      int var2 = 0;
      int var3 = 0;
      this.B = 0;
      this.C = 0;
      this.D = 0;
      this.E = this.p;
      this.F = this.q;
      this.G = this.r;

      int var4;
      for(var4 = 0; var4 < this.m.size(); ++var4) {
         ((bw)this.m.get(var4)).u = false;
      }

      this.m.clear();
      this.a.clear();

      for(var4 = 0; var4 < this.p; ++var4) {
         for(int var5 = 0; var5 < this.q; ++var5) {
            for(int var6 = 0; var6 < this.r; ++var6) {
               this.o[(var6 * this.q + var5) * this.p + var4] = new bw(this.k, this.a, var4 * 16, var5 * 16, var6 * 16, 16, this.s + var2);
               if(this.w) {
                  this.o[(var6 * this.q + var5) * this.p + var4].z = this.v.get(var3);
               }

               this.o[(var6 * this.q + var5) * this.p + var4].y = false;
               this.o[(var6 * this.q + var5) * this.p + var4].x = true;
               this.o[(var6 * this.q + var5) * this.p + var4].o = true;
               this.o[(var6 * this.q + var5) * this.p + var4].w = var3++;
               this.o[(var6 * this.q + var5) * this.p + var4].f();
               this.n[(var6 * this.q + var5) * this.p + var4] = this.o[(var6 * this.q + var5) * this.p + var4];
               this.m.add(this.o[(var6 * this.q + var5) * this.p + var4]);
               var2 += 3;
            }
         }
      }

      if(this.k != null) {
         bq var7 = this.t.playerName;
         this.b(fi.b(var7.aw), fi.b(var7.ax), fi.b(var7.ay));
         Arrays.sort(this.n, new fx(var7));
      }

      this.I = 2;
   }

   public void a(ao var1, qf var2, float var3) {
      if(this.I > 0) {
         --this.I;
      } else {
         gz.a.a(this.k, this.l, this.t.o, this.t.playerName, var3);
         mn.a.a(this.k, this.l, this.t.o, this.t.playerName, this.t.y, var3);
         this.J = 0;
         this.K = 0;
         this.L = 0;
         bq var4 = this.t.playerName;
         mn.b = var4.aV + (var4.aw - var4.aV) * (double)var3;
         mn.c = var4.aW + (var4.ax - var4.aW) * (double)var3;
         mn.d = var4.aX + (var4.ay - var4.aX) * (double)var3;
         gz.b = var4.aV + (var4.aw - var4.aV) * (double)var3;
         gz.c = var4.aW + (var4.ax - var4.aW) * (double)var3;
         gz.d = var4.aX + (var4.ay - var4.aX) * (double)var3;
         List var5 = this.k.k();
         this.J = var5.size();

         int var6;
         for(var6 = 0; var6 < var5.size(); ++var6) {
            Entity var7 = (Entity)var5.get(var6);
            if(var7.a(var1) && var2.a(var7.aG) && (var7 != this.t.playerName || this.t.y.y)) {
               ++this.K;
               mn.a.a(var7, var3);
            }
         }

         for(var6 = 0; var6 < this.a.size(); ++var6) {
            gz.a.a((ji)this.a.get(var6), var3);
         }

      }
   }

   public String b() {
      return "C: " + this.P + "/" + this.M + ". F: " + this.N + ", O: " + this.O + ", E: " + this.Q;
   }

   public String c() {
      return "E: " + this.K + "/" + this.J + ". B: " + this.L + ", I: " + (this.J - this.L - this.K);
   }

   private void b(int var1, int var2, int var3) {
      var1 -= 8;
      var2 -= 8;
      var3 -= 8;
      this.B = Integer.MAX_VALUE;
      this.C = Integer.MAX_VALUE;
      this.D = Integer.MAX_VALUE;
      this.E = Integer.MIN_VALUE;
      this.F = Integer.MIN_VALUE;
      this.G = Integer.MIN_VALUE;
      int var4 = this.p * 16;
      int var5 = var4 / 2;

      for(int var6 = 0; var6 < this.p; ++var6) {
         int var7 = var6 * 16;
         int var8 = var7 + var5 - var1;
         if(var8 < 0) {
            var8 -= var4 - 1;
         }

         var8 /= var4;
         var7 -= var8 * var4;
         if(var7 < this.B) {
            this.B = var7;
         }

         if(var7 > this.E) {
            this.E = var7;
         }

         for(int var9 = 0; var9 < this.r; ++var9) {
            int var10 = var9 * 16;
            int var11 = var10 + var5 - var3;
            if(var11 < 0) {
               var11 -= var4 - 1;
            }

            var11 /= var4;
            var10 -= var11 * var4;
            if(var10 < this.D) {
               this.D = var10;
            }

            if(var10 > this.G) {
               this.G = var10;
            }

            for(int var12 = 0; var12 < this.q; ++var12) {
               int var13 = var12 * 16;
               if(var13 < this.C) {
                  this.C = var13;
               }

               if(var13 > this.F) {
                  this.F = var13;
               }

               bw var14 = this.o[(var9 * this.q + var12) * this.p + var6];
               boolean var15 = var14.u;
               var14.a(var7, var13, var10);
               if(!var15 && var14.u) {
                  this.m.add(var14);
               }
            }
         }
      }

   }

   public int a(eb var1, int var2, double var3) {
      if(this.t.y.viewDistance != this.H) {
         this.a();
      }

      if(var2 == 0) {
         this.M = 0;
         this.N = 0;
         this.O = 0;
         this.P = 0;
         this.Q = 0;
      }

      double var5 = var1.aV + (var1.aw - var1.aV) * var3;
      double var7 = var1.aW + (var1.ax - var1.aW) * var3;
      double var9 = var1.aX + (var1.ay - var1.aX) * var3;
      double var11 = var1.aw - this.f;
      double var13 = var1.ax - this.g;
      double var15 = var1.ay - this.h;
      if(var11 * var11 + var13 * var13 + var15 * var15 > 16.0D) {
         this.f = var1.aw;
         this.g = var1.ax;
         this.h = var1.ay;
         this.b(fi.b(var1.aw), fi.b(var1.ax), fi.b(var1.ay));
         Arrays.sort(this.n, new fx(var1));
      }

      byte var17 = 0;
      int var33;
      if(this.w && !this.t.y.anaglyph3D && var2 == 0) {
         byte var18 = 0;
         int var19 = 16;
         this.a(var18, var19);

         for(int var20 = var18; var20 < var19; ++var20) {
            this.n[var20].x = true;
         }

         var33 = var17 + this.a(var18, var19, var2, var3);

         do {
            int var34 = var19;
            var19 *= 2;
            if(var19 > this.n.length) {
               var19 = this.n.length;
            }

            GL11.glDisable(3553);
            GL11.glDisable(2896);
            GL11.glDisable(3008);
            GL11.glDisable(2912);
            GL11.glColorMask(false, false, false, false);
            GL11.glDepthMask(false);
            this.a(var34, var19);
            GL11.glPushMatrix();
            float var35 = 0.0F;
            float var21 = 0.0F;
            float var22 = 0.0F;

            for(int var23 = var34; var23 < var19; ++var23) {
               if(this.n[var23].e()) {
                  this.n[var23].o = false;
               } else {
                  if(!this.n[var23].o) {
                     this.n[var23].x = true;
                  }

                  if(this.n[var23].o && !this.n[var23].y) {
                     float var24 = fi.c(this.n[var23].a((Entity)var1));
                     int var25 = (int)(1.0F + var24 / 128.0F);
                     if(this.x % var25 == var23 % var25) {
                        bw var26 = this.n[var23];
                        float var27 = (float)((double)var26.i - var5);
                        float var28 = (float)((double)var26.j - var7);
                        float var29 = (float)((double)var26.k - var9);
                        float var30 = var27 - var35;
                        float var31 = var28 - var21;
                        float var32 = var29 - var22;
                        if(var30 != 0.0F || var31 != 0.0F || var32 != 0.0F) {
                           GL11.glTranslatef(var30, var31, var32);
                           var35 += var30;
                           var21 += var31;
                           var22 += var32;
                        }

                        ARBOcclusionQuery.glBeginQueryARB('\u8914', this.n[var23].z);
                        this.n[var23].d();
                        ARBOcclusionQuery.glEndQueryARB('\u8914');
                        this.n[var23].y = true;
                     }
                  }
               }
            }

            GL11.glPopMatrix();
            GL11.glColorMask(true, true, true, true);
            GL11.glDepthMask(true);
            GL11.glEnable(3553);
            GL11.glEnable(3008);
            GL11.glEnable(2912);
            var33 += this.a(var34, var19, var2, var3);
         } while(var19 < this.n.length);
      } else {
         var33 = var17 + this.a(0, this.n.length, var2, var3);
      }

      return var33;
   }

   private void a(int var1, int var2) {
      for(int var3 = var1; var3 < var2; ++var3) {
         if(this.n[var3].y) {
            this.c.clear();
            ARBOcclusionQuery.glGetQueryObjectuARB(this.n[var3].z, '\u8867', this.c);
            if(this.c.get(0) != 0) {
               this.n[var3].y = false;
               this.c.clear();
               ARBOcclusionQuery.glGetQueryObjectuARB(this.n[var3].z, '\u8866', this.c);
               this.n[var3].x = this.c.get(0) != 0;
            }
         }
      }

   }

   private int a(int var1, int var2, int var3, double var4) {
      this.R.clear();
      int var6 = 0;

      for(int var7 = var1; var7 < var2; ++var7) {
         if(var3 == 0) {
            ++this.M;
            if(this.n[var7].p[var3]) {
               ++this.Q;
            } else if(!this.n[var7].o) {
               ++this.N;
            } else if(this.w && !this.n[var7].x) {
               ++this.O;
            } else {
               ++this.P;
            }
         }

         if(!this.n[var7].p[var3] && this.n[var7].o && this.n[var7].x) {
            int var8 = this.n[var7].a(var3);
            if(var8 >= 0) {
               this.R.add(this.n[var7]);
               ++var6;
            }
         }
      }

      bq var19 = this.t.playerName;
      double var20 = var19.aV + (var19.aw - var19.aV) * var4;
      double var10 = var19.aW + (var19.ax - var19.aW) * var4;
      double var12 = var19.aX + (var19.ay - var19.aX) * var4;
      int var14 = 0;

      int var15;
      for(var15 = 0; var15 < this.S.length; ++var15) {
         this.S[var15].b();
      }

      for(var15 = 0; var15 < this.R.size(); ++var15) {
         bw var16 = (bw)this.R.get(var15);
         int var17 = -1;

         for(int var18 = 0; var18 < var14; ++var18) {
            if(this.S[var18].a(var16.i, var16.j, var16.k)) {
               var17 = var18;
            }
         }

         if(var17 < 0) {
            var17 = var14++;
            this.S[var17].a(var16.i, var16.j, var16.k, var20, var10, var12);
         }

         this.S[var17].a(var16.a(var3));
      }

      this.a(var3, var4);
      return var6;
   }

   public void a(int var1, double var2) {
      for(int var4 = 0; var4 < this.S.length; ++var4) {
         this.S[var4].a();
      }

   }

   public void d() {
      ++this.x;
   }

   public void a(float var1) {
      if(!this.t.e.q.c) {
         GL11.glDisable(3553);
         ao var2 = this.k.a(this.t.playerName, var1);
         float var3 = (float)var2.a;
         float var4 = (float)var2.b;
         float var5 = (float)var2.c;
         float var7;
         float var8;
         if(this.t.y.anaglyph3D) {
            float var6 = (var3 * 30.0F + var4 * 59.0F + var5 * 11.0F) / 100.0F;
            var7 = (var3 * 30.0F + var4 * 70.0F) / 100.0F;
            var8 = (var3 * 30.0F + var5 * 70.0F) / 100.0F;
            var3 = var6;
            var4 = var7;
            var5 = var8;
         }

         GL11.glColor3f(var3, var4, var5);
         is var14 = is.a;
         GL11.glDepthMask(false);
         GL11.glEnable(2912);
         GL11.glColor3f(var3, var4, var5);
         GL11.glCallList(this.z);
         GL11.glDisable(2912);
         GL11.glDisable(3008);
         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 771);
         float[] var15 = this.k.q.b(this.k.b(var1), var1);
         float var11;
         if(var15 != null) {
            GL11.glDisable(3553);
            GL11.glShadeModel(7425);
            GL11.glPushMatrix();
            GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
            var8 = this.k.b(var1);
            GL11.glRotatef(var8 > 0.5F?180.0F:0.0F, 0.0F, 0.0F, 1.0F);
            var14.a(6);
            var14.a(var15[0], var15[1], var15[2], var15[3]);
            var14.a(0.0D, 100.0D, 0.0D);
            byte var9 = 16;
            var14.a(var15[0], var15[1], var15[2], 0.0F);

            for(int var10 = 0; var10 <= var9; ++var10) {
               var11 = (float)var10 * 3.1415927F * 2.0F / (float)var9;
               float var12 = fi.a(var11);
               float var13 = fi.b(var11);
               var14.a((double)(var12 * 120.0F), (double)(var13 * 120.0F), (double)(-var13 * 40.0F * var15[3]));
            }

            var14.a();
            GL11.glPopMatrix();
            GL11.glShadeModel(7424);
         }

         GL11.glEnable(3553);
         GL11.glBlendFunc(1, 1);
         GL11.glPushMatrix();
         var7 = 0.0F;
         var8 = 0.0F;
         float var16 = 0.0F;
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glTranslatef(var7, var8, var16);
         GL11.glRotatef(0.0F, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(this.k.b(var1) * 360.0F, 1.0F, 0.0F, 0.0F);
         float var17 = 30.0F;
         GL11.glBindTexture(3553, this.l.a("/mojang/terrain/sun.png"));
         var14.b();
         var14.a((double)(-var17), 100.0D, (double)(-var17), 0.0D, 0.0D);
         var14.a((double)var17, 100.0D, (double)(-var17), 1.0D, 0.0D);
         var14.a((double)var17, 100.0D, (double)var17, 1.0D, 1.0D);
         var14.a((double)(-var17), 100.0D, (double)var17, 0.0D, 1.0D);
         var14.a();
         var17 = 20.0F;
         GL11.glBindTexture(3553, this.l.a("/mojang/terrain/moon.png"));
         var14.b();
         var14.a((double)(-var17), -100.0D, (double)var17, 1.0D, 1.0D);
         var14.a((double)var17, -100.0D, (double)var17, 0.0D, 1.0D);
         var14.a((double)var17, -100.0D, (double)(-var17), 0.0D, 0.0D);
         var14.a((double)(-var17), -100.0D, (double)(-var17), 1.0D, 0.0D);
         var14.a();
         GL11.glDisable(3553);
         var11 = this.k.e(var1);
         if(var11 > 0.0F) {
            GL11.glColor4f(var11, var11, var11, var11);
            GL11.glCallList(this.y);
         }

         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glDisable(3042);
         GL11.glEnable(3008);
         GL11.glEnable(2912);
         GL11.glPopMatrix();
         GL11.glColor3f(var3 * 0.2F + 0.04F, var4 * 0.2F + 0.04F, var5 * 0.6F + 0.1F);
         GL11.glDisable(3553);
         GL11.glCallList(this.A);
         GL11.glEnable(3553);
         GL11.glDepthMask(true);
      }
   }

   public void b(float var1) {
      if(!this.t.e.q.c) {
         if(this.t.y.fancyGraphics) {
            this.c(var1);
         } else {
            GL11.glDisable(2884);
            float var2 = (float)(this.t.playerName.aW + (this.t.playerName.ax - this.t.playerName.aW) * (double)var1);
            byte var3 = 32;
            int var4 = 256 / var3;
            is var5 = is.a;
            GL11.glBindTexture(3553, this.l.a("/mojang/environment/clouds.png"));
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 771);
            ao var6 = this.k.c(var1);
            float var7 = (float)var6.a;
            float var8 = (float)var6.b;
            float var9 = (float)var6.c;
            float var10;
            if(this.t.y.anaglyph3D) {
               var10 = (var7 * 30.0F + var8 * 59.0F + var9 * 11.0F) / 100.0F;
               float var11 = (var7 * 30.0F + var8 * 70.0F) / 100.0F;
               float var12 = (var7 * 30.0F + var9 * 70.0F) / 100.0F;
               var7 = var10;
               var8 = var11;
               var9 = var12;
            }

            var10 = 4.8828125E-4F;
            double var22 = this.t.playerName.at + (this.t.playerName.aw - this.t.playerName.at) * (double)var1 + (double)(((float)this.x + var1) * 0.03F);
            double var13 = this.t.playerName.av + (this.t.playerName.ay - this.t.playerName.av) * (double)var1;
            int var15 = fi.b(var22 / 2048.0D);
            int var16 = fi.b(var13 / 2048.0D);
            var22 -= (double)(var15 * 2048);
            var13 -= (double)(var16 * 2048);
            float var17 = 120.0F - var2 + 0.33F;
            float var18 = (float)(var22 * (double)var10);
            float var19 = (float)(var13 * (double)var10);
            var5.b();
            var5.a(var7, var8, var9, 0.8F);

            for(int var20 = -var3 * var4; var20 < var3 * var4; var20 += var3) {
               for(int var21 = -var3 * var4; var21 < var3 * var4; var21 += var3) {
                  var5.a((double)(var20 + 0), (double)var17, (double)(var21 + var3), (double)((float)(var20 + 0) * var10 + var18), (double)((float)(var21 + var3) * var10 + var19));
                  var5.a((double)(var20 + var3), (double)var17, (double)(var21 + var3), (double)((float)(var20 + var3) * var10 + var18), (double)((float)(var21 + var3) * var10 + var19));
                  var5.a((double)(var20 + var3), (double)var17, (double)(var21 + 0), (double)((float)(var20 + var3) * var10 + var18), (double)((float)(var21 + 0) * var10 + var19));
                  var5.a((double)(var20 + 0), (double)var17, (double)(var21 + 0), (double)((float)(var20 + 0) * var10 + var18), (double)((float)(var21 + 0) * var10 + var19));
               }
            }

            var5.a();
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glDisable(3042);
            GL11.glEnable(2884);
         }
      }
   }

   public void c(float var1) {
      GL11.glDisable(2884);
      float var2 = (float)(this.t.playerName.aW + (this.t.playerName.ax - this.t.playerName.aW) * (double)var1);
      is var3 = is.a;
      float var4 = 12.0F;
      float var5 = 4.0F;
      double var6 = (this.t.playerName.at + (this.t.playerName.aw - this.t.playerName.at) * (double)var1 + (double)(((float)this.x + var1) * 0.03F)) / (double)var4;
      double var8 = (this.t.playerName.av + (this.t.playerName.ay - this.t.playerName.av) * (double)var1) / (double)var4 + 0.33000001311302185D;
      float var10 = 108.0F - var2 + 0.33F;
      int var11 = fi.b(var6 / 2048.0D);
      int var12 = fi.b(var8 / 2048.0D);
      var6 -= (double)(var11 * 2048);
      var8 -= (double)(var12 * 2048);
      GL11.glBindTexture(3553, this.l.a("/mojang/environment/clouds.png"));
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      ao var13 = this.k.c(var1);
      float var14 = (float)var13.a;
      float var15 = (float)var13.b;
      float var16 = (float)var13.c;
      float var17;
      float var18;
      float var19;
      if(this.t.y.anaglyph3D) {
         var17 = (var14 * 30.0F + var15 * 59.0F + var16 * 11.0F) / 100.0F;
         var18 = (var14 * 30.0F + var15 * 70.0F) / 100.0F;
         var19 = (var14 * 30.0F + var16 * 70.0F) / 100.0F;
         var14 = var17;
         var15 = var18;
         var16 = var19;
      }

      var17 = (float)(var6 * 0.0D);
      var18 = (float)(var8 * 0.0D);
      var19 = 0.00390625F;
      var17 = (float)fi.b(var6) * var19;
      var18 = (float)fi.b(var8) * var19;
      float var20 = (float)(var6 - (double)fi.b(var6));
      float var21 = (float)(var8 - (double)fi.b(var8));
      byte var22 = 8;
      byte var23 = 3;
      float var24 = 9.765625E-4F;
      GL11.glScalef(var4, 1.0F, var4);

      for(int var25 = 0; var25 < 2; ++var25) {
         if(var25 == 0) {
            GL11.glColorMask(false, false, false, false);
         } else {
            GL11.glColorMask(true, true, true, true);
         }

         for(int var26 = -var23 + 1; var26 <= var23; ++var26) {
            for(int var27 = -var23 + 1; var27 <= var23; ++var27) {
               var3.b();
               float var28 = (float)(var26 * var22);
               float var29 = (float)(var27 * var22);
               float var30 = var28 - var20;
               float var31 = var29 - var21;
               if(var10 > -var5 - 1.0F) {
                  var3.a(var14 * 0.7F, var15 * 0.7F, var16 * 0.7F, 0.8F);
                  var3.b(0.0F, -1.0F, 0.0F);
                  var3.a((double)(var30 + 0.0F), (double)(var10 + 0.0F), (double)(var31 + (float)var22), (double)((var28 + 0.0F) * var19 + var17), (double)((var29 + (float)var22) * var19 + var18));
                  var3.a((double)(var30 + (float)var22), (double)(var10 + 0.0F), (double)(var31 + (float)var22), (double)((var28 + (float)var22) * var19 + var17), (double)((var29 + (float)var22) * var19 + var18));
                  var3.a((double)(var30 + (float)var22), (double)(var10 + 0.0F), (double)(var31 + 0.0F), (double)((var28 + (float)var22) * var19 + var17), (double)((var29 + 0.0F) * var19 + var18));
                  var3.a((double)(var30 + 0.0F), (double)(var10 + 0.0F), (double)(var31 + 0.0F), (double)((var28 + 0.0F) * var19 + var17), (double)((var29 + 0.0F) * var19 + var18));
               }

               if(var10 <= var5 + 1.0F) {
                  var3.a(var14, var15, var16, 0.8F);
                  var3.b(0.0F, 1.0F, 0.0F);
                  var3.a((double)(var30 + 0.0F), (double)(var10 + var5 - var24), (double)(var31 + (float)var22), (double)((var28 + 0.0F) * var19 + var17), (double)((var29 + (float)var22) * var19 + var18));
                  var3.a((double)(var30 + (float)var22), (double)(var10 + var5 - var24), (double)(var31 + (float)var22), (double)((var28 + (float)var22) * var19 + var17), (double)((var29 + (float)var22) * var19 + var18));
                  var3.a((double)(var30 + (float)var22), (double)(var10 + var5 - var24), (double)(var31 + 0.0F), (double)((var28 + (float)var22) * var19 + var17), (double)((var29 + 0.0F) * var19 + var18));
                  var3.a((double)(var30 + 0.0F), (double)(var10 + var5 - var24), (double)(var31 + 0.0F), (double)((var28 + 0.0F) * var19 + var17), (double)((var29 + 0.0F) * var19 + var18));
               }

               var3.a(var14 * 0.9F, var15 * 0.9F, var16 * 0.9F, 0.8F);
               int var32;
               if(var26 > -1) {
                  var3.b(-1.0F, 0.0F, 0.0F);

                  for(var32 = 0; var32 < var22; ++var32) {
                     var3.a((double)(var30 + (float)var32 + 0.0F), (double)(var10 + 0.0F), (double)(var31 + (float)var22), (double)((var28 + (float)var32 + 0.5F) * var19 + var17), (double)((var29 + (float)var22) * var19 + var18));
                     var3.a((double)(var30 + (float)var32 + 0.0F), (double)(var10 + var5), (double)(var31 + (float)var22), (double)((var28 + (float)var32 + 0.5F) * var19 + var17), (double)((var29 + (float)var22) * var19 + var18));
                     var3.a((double)(var30 + (float)var32 + 0.0F), (double)(var10 + var5), (double)(var31 + 0.0F), (double)((var28 + (float)var32 + 0.5F) * var19 + var17), (double)((var29 + 0.0F) * var19 + var18));
                     var3.a((double)(var30 + (float)var32 + 0.0F), (double)(var10 + 0.0F), (double)(var31 + 0.0F), (double)((var28 + (float)var32 + 0.5F) * var19 + var17), (double)((var29 + 0.0F) * var19 + var18));
                  }
               }

               if(var26 <= 1) {
                  var3.b(1.0F, 0.0F, 0.0F);

                  for(var32 = 0; var32 < var22; ++var32) {
                     var3.a((double)(var30 + (float)var32 + 1.0F - var24), (double)(var10 + 0.0F), (double)(var31 + (float)var22), (double)((var28 + (float)var32 + 0.5F) * var19 + var17), (double)((var29 + (float)var22) * var19 + var18));
                     var3.a((double)(var30 + (float)var32 + 1.0F - var24), (double)(var10 + var5), (double)(var31 + (float)var22), (double)((var28 + (float)var32 + 0.5F) * var19 + var17), (double)((var29 + (float)var22) * var19 + var18));
                     var3.a((double)(var30 + (float)var32 + 1.0F - var24), (double)(var10 + var5), (double)(var31 + 0.0F), (double)((var28 + (float)var32 + 0.5F) * var19 + var17), (double)((var29 + 0.0F) * var19 + var18));
                     var3.a((double)(var30 + (float)var32 + 1.0F - var24), (double)(var10 + 0.0F), (double)(var31 + 0.0F), (double)((var28 + (float)var32 + 0.5F) * var19 + var17), (double)((var29 + 0.0F) * var19 + var18));
                  }
               }

               var3.a(var14 * 0.8F, var15 * 0.8F, var16 * 0.8F, 0.8F);
               if(var27 > -1) {
                  var3.b(0.0F, 0.0F, -1.0F);

                  for(var32 = 0; var32 < var22; ++var32) {
                     var3.a((double)(var30 + 0.0F), (double)(var10 + var5), (double)(var31 + (float)var32 + 0.0F), (double)((var28 + 0.0F) * var19 + var17), (double)((var29 + (float)var32 + 0.5F) * var19 + var18));
                     var3.a((double)(var30 + (float)var22), (double)(var10 + var5), (double)(var31 + (float)var32 + 0.0F), (double)((var28 + (float)var22) * var19 + var17), (double)((var29 + (float)var32 + 0.5F) * var19 + var18));
                     var3.a((double)(var30 + (float)var22), (double)(var10 + 0.0F), (double)(var31 + (float)var32 + 0.0F), (double)((var28 + (float)var22) * var19 + var17), (double)((var29 + (float)var32 + 0.5F) * var19 + var18));
                     var3.a((double)(var30 + 0.0F), (double)(var10 + 0.0F), (double)(var31 + (float)var32 + 0.0F), (double)((var28 + 0.0F) * var19 + var17), (double)((var29 + (float)var32 + 0.5F) * var19 + var18));
                  }
               }

               if(var27 <= 1) {
                  var3.b(0.0F, 0.0F, 1.0F);

                  for(var32 = 0; var32 < var22; ++var32) {
                     var3.a((double)(var30 + 0.0F), (double)(var10 + var5), (double)(var31 + (float)var32 + 1.0F - var24), (double)((var28 + 0.0F) * var19 + var17), (double)((var29 + (float)var32 + 0.5F) * var19 + var18));
                     var3.a((double)(var30 + (float)var22), (double)(var10 + var5), (double)(var31 + (float)var32 + 1.0F - var24), (double)((var28 + (float)var22) * var19 + var17), (double)((var29 + (float)var32 + 0.5F) * var19 + var18));
                     var3.a((double)(var30 + (float)var22), (double)(var10 + 0.0F), (double)(var31 + (float)var32 + 1.0F - var24), (double)((var28 + (float)var22) * var19 + var17), (double)((var29 + (float)var32 + 0.5F) * var19 + var18));
                     var3.a((double)(var30 + 0.0F), (double)(var10 + 0.0F), (double)(var31 + (float)var32 + 1.0F - var24), (double)((var28 + 0.0F) * var19 + var17), (double)((var29 + (float)var32 + 0.5F) * var19 + var18));
                  }
               }

               var3.a();
            }
         }
      }

      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(3042);
      GL11.glEnable(2884);
   }

   public boolean a(eb var1, boolean var2) {
      Collections.sort(this.m, new ho(var1));
      int var3 = this.m.size() - 1;
      int var4 = this.m.size();

      for(int var5 = 0; var5 < var4; ++var5) {
         bw var6 = (bw)this.m.get(var3 - var5);
         if(!var2) {
            if(var6.a((Entity)var1) > 1024.0F) {
               if(var6.o) {
                  if(var5 >= 3) {
                     return false;
                  }
               } else if(var5 >= 1) {
                  return false;
               }
            }
         } else if(!var6.o) {
            continue;
         }

         var6.a();
         this.m.remove(var6);
         var6.u = false;
      }

      return this.m.size() == 0;
   }

   public void a(eb var1, nx var2, int var3, fp var4, float var5) {
      is var6 = is.a;
      GL11.glEnable(3042);
      GL11.glEnable(3008);
      GL11.glBlendFunc(770, 1);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, (fi.a((float)System.currentTimeMillis() / 100.0F) * 0.2F + 0.4F) * 0.5F);
      int var8;
      if(var3 == 0) {
         if(this.i > 0.0F) {
            GL11.glBlendFunc(774, 768);
            int var7 = this.l.a("/mojang/terrain.png");
            GL11.glBindTexture(3553, var7);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.5F);
            GL11.glPushMatrix();
            var8 = this.k.a(var2.b, var2.c, var2.d);
            nq var9 = var8 > 0?nq.m[var8]:null;
            GL11.glDisable(3008);
            GL11.glPolygonOffset(-3.0F, -3.0F);
            GL11.glEnable('\u8037');
            var6.b();
            double var10 = var1.aV + (var1.aw - var1.aV) * (double)var5;
            double var12 = var1.aW + (var1.ax - var1.aW) * (double)var5;
            double var14 = var1.aX + (var1.ay - var1.aX) * (double)var5;
            var6.b(-var10, -var12, -var14);
            var6.c();
            if(var9 == null) {
               var9 = nq.t;
            }

            this.u.a(var9, var2.b, var2.c, var2.d, 240 + (int)(this.i * 10.0F));
            var6.a();
            var6.b(0.0D, 0.0D, 0.0D);
            GL11.glPolygonOffset(0.0F, 0.0F);
            GL11.glDisable('\u8037');
            GL11.glEnable(3008);
            GL11.glDepthMask(true);
            GL11.glPopMatrix();
         }
      } else if(var4 != null) {
         GL11.glBlendFunc(770, 771);
         float var16 = fi.a((float)System.currentTimeMillis() / 100.0F) * 0.2F + 0.8F;
         GL11.glColor4f(var16, var16, var16, fi.a((float)System.currentTimeMillis() / 200.0F) * 0.2F + 0.5F);
         var8 = this.l.a("/mojang/terrain.png");
         GL11.glBindTexture(3553, var8);
         int var17 = var2.b;
         int var18 = var2.c;
         int var11 = var2.d;
         if(var2.e == 0) {
            --var18;
         }

         if(var2.e == 1) {
            ++var18;
         }

         if(var2.e == 2) {
            --var11;
         }

         if(var2.e == 3) {
            ++var11;
         }

         if(var2.e == 4) {
            --var17;
         }

         if(var2.e == 5) {
            ++var17;
         }
      }

      GL11.glDisable(3042);
      GL11.glDisable(3008);
   }

   public void b(eb var1, nx var2, int var3, fp var4, float var5) {
      if(var3 == 0 && var2.a == 0) {
         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 771);
         GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.4F);
         GL11.glLineWidth(2.0F);
         GL11.glDisable(3553);
         GL11.glDepthMask(false);
         float var6 = 0.002F;
         int var7 = this.k.a(var2.b, var2.c, var2.d);
         if(var7 > 0) {
            nq.m[var7].a((pk)this.k, var2.b, var2.c, var2.d);
            double var8 = var1.aV + (var1.aw - var1.aV) * (double)var5;
            double var10 = var1.aW + (var1.ax - var1.aW) * (double)var5;
            double var12 = var1.aX + (var1.ay - var1.aX) * (double)var5;
            this.a(nq.m[var7].f(this.k, var2.b, var2.c, var2.d).b((double)var6, (double)var6, (double)var6).c(-var8, -var10, -var12));
         }

         GL11.glDepthMask(true);
         GL11.glEnable(3553);
         GL11.glDisable(3042);
      }

   }

   private void a(co var1) {
      is var2 = is.a;
      var2.a(3);
      var2.a(var1.a, var1.b, var1.c);
      var2.a(var1.d, var1.b, var1.c);
      var2.a(var1.d, var1.b, var1.f);
      var2.a(var1.a, var1.b, var1.f);
      var2.a(var1.a, var1.b, var1.c);
      var2.a();
      var2.a(3);
      var2.a(var1.a, var1.e, var1.c);
      var2.a(var1.d, var1.e, var1.c);
      var2.a(var1.d, var1.e, var1.f);
      var2.a(var1.a, var1.e, var1.f);
      var2.a(var1.a, var1.e, var1.c);
      var2.a();
      var2.a(1);
      var2.a(var1.a, var1.b, var1.c);
      var2.a(var1.a, var1.e, var1.c);
      var2.a(var1.d, var1.b, var1.c);
      var2.a(var1.d, var1.e, var1.c);
      var2.a(var1.d, var1.b, var1.f);
      var2.a(var1.d, var1.e, var1.f);
      var2.a(var1.a, var1.b, var1.f);
      var2.a(var1.a, var1.e, var1.f);
      var2.a();
   }

   public void a(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = fi.a(var1, 16);
      int var8 = fi.a(var2, 16);
      int var9 = fi.a(var3, 16);
      int var10 = fi.a(var4, 16);
      int var11 = fi.a(var5, 16);
      int var12 = fi.a(var6, 16);

      for(int var13 = var7; var13 <= var10; ++var13) {
         int var14 = var13 % this.p;
         if(var14 < 0) {
            var14 += this.p;
         }

         for(int var15 = var8; var15 <= var11; ++var15) {
            int var16 = var15 % this.q;
            if(var16 < 0) {
               var16 += this.q;
            }

            for(int var17 = var9; var17 <= var12; ++var17) {
               int var18 = var17 % this.r;
               if(var18 < 0) {
                  var18 += this.r;
               }

               int var19 = (var18 * this.q + var16) * this.p + var14;
               bw var20 = this.o[var19];
               if(!var20.u) {
                  this.m.add(var20);
               }

               var20.f();
            }
         }
      }

   }

   public void a(int var1, int var2, int var3) {
      this.a(var1 - 1, var2 - 1, var3 - 1, var1 + 1, var2 + 1, var3 + 1);
   }

   public void b(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.a(var1 - 1, var2 - 1, var3 - 1, var4 + 1, var5 + 1, var6 + 1);
   }

   public void a(qf var1, float var2) {
      for(int var3 = 0; var3 < this.o.length; ++var3) {
         if(!this.o[var3].e() && (!this.o[var3].o || (var3 + this.j & 15) == 0)) {
            this.o[var3].a(var1);
         }
      }

      ++this.j;
   }

   public void a(String var1, int var2, int var3, int var4) {
      if(var1 != null) {
         this.t.u.b("C418 - " + var1);
      }

      this.t.A.a(var1, (float)var2, (float)var3, (float)var4, 1.0F, 1.0F);
   }

   public void a(String var1, double var2, double var4, double var6, float var8, float var9) {
      float var10 = 16.0F;
      if(var8 > 1.0F) {
         var10 *= var8;
      }

      if(this.t.playerName.e(var2, var4, var6) < (double)(var10 * var10)) {
         this.t.A.b(var1, (float)var2, (float)var4, (float)var6, var8, var9);
      }

   }

   public void a(String var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      double var14 = this.t.playerName.aw - var2;
      double var16 = this.t.playerName.ax - var4;
      double var18 = this.t.playerName.ay - var6;
      if(var14 * var14 + var16 * var16 + var18 * var18 <= 256.0D) {
         if(var1 == "bubble") {
            this.t.h.a((pp)(new bh(this.k, var2, var4, var6, var8, var10, var12)));
         } else if(var1 == "smoke") {
            this.t.h.a((pp)(new pi(this.k, var2, var4, var6)));
         } else if(var1 == "portal") {
            this.t.h.a((pp)(new jd(this.k, var2, var4, var6, var8, var10, var12)));
         } else if(var1 == "explode") {
            this.t.h.a((pp)(new ee(this.k, var2, var4, var6, var8, var10, var12)));
         } else if(var1 == "flame") {
            this.t.h.a((pp)(new ko(this.k, var2, var4, var6, var8, var10, var12)));
         } else if(var1 == "lava") {
            this.t.h.a((pp)(new db(this.k, var2, var4, var6)));
         } else if(var1 == "splash") {
            this.t.h.a((pp)(new mf(this.k, var2, var4, var6, var8, var10, var12)));
         } else if(var1 == "largesmoke") {
            this.t.h.a((pp)(new pi(this.k, var2, var4, var6, 2.5F)));
         } else if(var1 == "reddust") {
            this.t.h.a((pp)(new fh(this.k, var2, var4, var6)));
         } else if(var1 == "snowballpoof") {
            this.t.h.a((pp)(new jo(this.k, var2, var4, var6, dx.aB)));
         } else if(var1 == "slime") {
            this.t.h.a((pp)(new jo(this.k, var2, var4, var6, dx.aK)));
         }

      }
   }

   public void a(Entity var1) {
      if(var1.bl != null) {
         this.l.a(var1.bl, (ie)(new lf()));
      }

   }

   public void b(Entity var1) {
      if(var1.bl != null) {
         this.l.b(var1.bl);
      }

   }

   public void e() {
      for(int var1 = 0; var1 < this.o.length; ++var1) {
         if(this.o[var1].A) {
            if(!this.o[var1].u) {
               this.m.add(this.o[var1]);
            }

            this.o[var1].f();
         }
      }

   }

   public void a(int var1, int var2, int var3, ji var4) {}
}
