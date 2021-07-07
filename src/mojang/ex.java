package mojang;

import java.util.ArrayList;
import java.util.List;
import org.lwjgl.opengl.GL11;

public abstract class ex extends GraphicsUserInterface {

   private static af j = new af();
   protected int a = 176;
   protected int h = 166;
   protected List i = new ArrayList();


   public void a(int var1, int var2, float var3) {
      this.i();
      int var4 = (this.c - this.a) / 2;
      int var5 = (this.d - this.h) / 2;
      this.a(var3);
      GL11.glPushMatrix();
      GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
      l.b();
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var4, (float)var5, 0.0F);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glEnable('\u803a');

      for(int var6 = 0; var6 < this.i.size(); ++var6) {
         of var7 = (of)this.i.get(var6);
         this.a(var7);
         if(var7.a(var1, var2)) {
            GL11.glDisable(2896);
            GL11.glDisable(2929);
            int var8 = var7.e;
            int var9 = var7.f;
            this.a(var8, var9, var8 + 16, var9 + 16, -2130706433, -2130706433);
            GL11.glEnable(2896);
            GL11.glEnable(2929);
         }
      }

      fo var10 = this.b.playerName.e;
      if(var10.e != null) {
         GL11.glTranslatef(0.0F, 0.0F, 32.0F);
         j.a(this.g, this.b.n, var10.e, var1 - var4 - 8, var2 - var5 - 8);
         j.b(this.g, this.b.n, var10.e, var1 - var4 - 8, var2 - var5 - 8);
      }

      GL11.glDisable('\u803a');
      l.a();
      GL11.glDisable(2896);
      GL11.glDisable(2929);
      this.j();
      GL11.glEnable(2896);
      GL11.glEnable(2929);
      GL11.glPopMatrix();
   }

   protected void j() {}

   protected abstract void a(float var1);

   private void a(of var1) {
      hi var2 = var1.b;
      int var3 = var1.a;
      int var4 = var1.e;
      int var5 = var1.f;
      fp var6 = var2.c(var3);
      if(var6 == null) {
         int var7 = var1.c();
         if(var7 >= 0) {
            GL11.glDisable(2896);
            this.b.n.b(this.b.n.a("/mojang/gui/items.png"));
            this.b(var4, var5, var7 % 16 * 16, var7 / 16 * 16, 16, 16);
            GL11.glEnable(2896);
            return;
         }
      }

      j.a(this.g, this.b.n, var6, var4, var5);
      j.b(this.g, this.b.n, var6, var4, var5);
   }

   private dz a(int var1, int var2) {
      for(int var3 = 0; var3 < this.i.size(); ++var3) {
         of var4 = (of)this.i.get(var3);
         if(var4.a(var1, var2)) {
            return var4;
         }
      }

      return null;
   }

   protected void a(int var1, int var2, int var3) {
      if(var3 == 0 || var3 == 1) {
         dz var4 = this.a(var1, var2);
         fo var5 = this.b.playerName.e;
         int var7;
         if(var4 != null) {
            fp var6 = var4.b();
            if(var6 != null || var5.e != null) {
               if(var6 != null && var5.e == null) {
                  var7 = var3 == 0?var6.a:(var6.a + 1) / 2;
                  var5.e = var4.b.a(var4.a, var7);
                  if(var6.a == 0) {
                     var4.b((fp)null);
                  }

                  var4.a();
               } else if(var6 == null && var5.e != null && var4.a(var5.e)) {
                  var7 = var3 == 0?var5.e.a:1;
                  if(var7 > var4.e()) {
                     var7 = var4.e();
                  }

                  var4.b(var5.e.a(var7));
                  if(var5.e.a == 0) {
                     var5.e = null;
                  }
               } else if(var6 != null && var5.e != null) {
                  if(var4.a(var5.e)) {
                     if(var6.c != var5.e.c) {
                        if(var5.e.a <= var4.e()) {
                           var4.b(var5.e);
                           var5.e = var6;
                        }
                     } else if(var6.c == var5.e.c) {
                        if(var3 == 0) {
                           var7 = var5.e.a;
                           if(var7 > var4.e() - var6.a) {
                              var7 = var4.e() - var6.a;
                           }

                           if(var7 > var5.e.c() - var6.a) {
                              var7 = var5.e.c() - var6.a;
                           }

                           var5.e.a(var7);
                           if(var5.e.a == 0) {
                              var5.e = null;
                           }

                           var6.a += var7;
                        } else if(var3 == 1) {
                           var7 = 1;
                           if(var7 > var4.e() - var6.a) {
                              var7 = var4.e() - var6.a;
                           }

                           if(var7 > var5.e.c() - var6.a) {
                              var7 = var5.e.c() - var6.a;
                           }

                           var5.e.a(var7);
                           if(var5.e.a == 0) {
                              var5.e = null;
                           }

                           var6.a += var7;
                        }
                     }
                  } else if(var6.c == var5.e.c && var5.e.c() > 1) {
                     var7 = var6.a;
                     if(var7 > 0 && var7 + var5.e.a <= var5.e.c()) {
                        var5.e.a += var7;
                        var6.a(var7);
                        if(var6.a == 0) {
                           var4.b((fp)null);
                        }

                        var4.a();
                     }
                  }
               }
            }

            var4.d();
         } else if(var5.e != null) {
            int var9 = (this.c - this.a) / 2;
            var7 = (this.d - this.h) / 2;
            if(var1 < var9 || var2 < var7 || var1 >= var9 + this.a || var2 >= var7 + this.a) {
               bq var8 = this.b.playerName;
               if(var3 == 0) {
                  var8.a(var5.e);
                  var5.e = null;
               }

               if(var3 == 1) {
                  var8.a(var5.e.a(1));
                  if(var5.e.a == 0) {
                     var5.e = null;
                  }
               }
            }
         }
      }

   }

   protected void b(int var1, int var2, int var3) {
      if(var3 == 0) {
         ;
      }

   }

   protected void a(char var1, int var2) {
      if(var2 == 1 || var2 == this.b.y.p.b) {
         this.b.a((GraphicsUserInterface)null);
      }

   }

   public void h() {
      if(this.b.playerName != null) {
         fo var1 = this.b.playerName.e;
         if(var1.e != null) {
            this.b.playerName.a(var1.e);
            var1.e = null;
         }

      }
   }

   public boolean b() {
      return false;
   }

}
