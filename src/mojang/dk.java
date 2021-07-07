package mojang;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.lwjgl.Sys;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class dk extends bp {

   protected bp a;
   private int h = 0;
   private int i = 32;
   private int j;
   private int l;
   private int m;
   private int n;
   private int o;
   private String p;


   public dk(bp var1) {
      this.j = this.d - 55 + 4;
      this.l = 0;
      this.m = this.c;
      this.n = -2;
      this.o = -1;
      this.p = "";
      this.a = var1;
   }

   public void a() {
      this.e.add(new r(5, this.c / 2 - 154, this.d - 48, "Open texture pack folder"));
      this.e.add(new r(6, this.c / 2 + 4, this.d - 48, "Done"));
      this.b.C.a();
      this.p = (new File(this.b.D, "texturepacks")).getAbsolutePath();
      this.i = 32;
      this.j = this.d - 58 + 4;
      this.l = 0;
      this.m = this.c;
   }

   protected void a(gh var1) {
      if(var1.g) {
         if(var1.f == 5) {
            Sys.openURL("file://" + this.p);
         }

         if(var1.f == 6) {
            this.b.n.b();
            this.b.a(this.a);
         }

      }
   }

   protected void a(int var1, int var2, int var3) throws IOException {
      super.a(var1, var2, var3);
   }

   protected void b(int var1, int var2, int var3) {
      super.b(var1, var2, var3);
   }

   public void a(int var1, int var2, float var3) {
      this.i();
      if(this.o <= 0) {
         this.b.C.a();
         this.o += 20;
      }

      List var4 = this.b.C.b();
      int var5;
      if(Mouse.isButtonDown(0)) {
         if(this.n == -1) {
            if(var2 >= this.i && var2 <= this.j) {
               var5 = this.c / 2 - 110;
               int var6 = this.c / 2 + 110;
               int var7 = (var2 - this.i + this.h - 2) / 36;
               if(var1 >= var5 && var1 <= var6 && var7 >= 0 && var7 < var4.size() && this.b.C.a((d)var4.get(var7))) {
                  this.b.n.b();
               }

               this.n = var2;
            } else {
               this.n = -2;
            }
         } else if(this.n >= 0) {
            this.h -= var2 - this.n;
            this.n = var2;
         }
      } else {
         if(this.n >= 0 && this.n == var2) {
            ;
         }

         this.n = -1;
      }

      var5 = var4.size() * 36 - (this.j - this.i - 4);
      if(var5 < 0) {
         var5 /= 2;
      }

      if(this.h < 0) {
         this.h = 0;
      }

      if(this.h > var5) {
         this.h = var5;
      }

      GL11.glDisable(2896);
      GL11.glDisable(2912);
      is var16 = is.a;
      GL11.glBindTexture(3553, this.b.n.a("/mojang/gui/background.png"));
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      float var17 = 32.0F;
      var16.b();
      var16.b(2105376);
      var16.a((double)this.l, (double)this.j, 0.0D, (double)((float)this.l / var17), (double)((float)(this.j + this.h) / var17));
      var16.a((double)this.m, (double)this.j, 0.0D, (double)((float)this.m / var17), (double)((float)(this.j + this.h) / var17));
      var16.a((double)this.m, (double)this.i, 0.0D, (double)((float)this.m / var17), (double)((float)(this.i + this.h) / var17));
      var16.a((double)this.l, (double)this.i, 0.0D, (double)((float)this.l / var17), (double)((float)(this.i + this.h) / var17));
      var16.a();

      for(int var8 = 0; var8 < var4.size(); ++var8) {
         d var9 = (d)var4.get(var8);
         int var10 = this.c / 2 - 92 - 16;
         int var11 = 36 + var8 * 36 - this.h;
         byte var12 = 32;
         byte var13 = 32;
         if(var9 == this.b.C.a) {
            int var14 = this.c / 2 - 110;
            int var15 = this.c / 2 + 110;
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glDisable(3553);
            var16.b();
            var16.b(8421504);
            var16.a((double)var14, (double)(var11 + var12 + 2), 0.0D, 0.0D, 1.0D);
            var16.a((double)var15, (double)(var11 + var12 + 2), 0.0D, 1.0D, 1.0D);
            var16.a((double)var15, (double)(var11 - 2), 0.0D, 1.0D, 0.0D);
            var16.a((double)var14, (double)(var11 - 2), 0.0D, 0.0D, 0.0D);
            var16.b(0);
            var16.a((double)(var14 + 1), (double)(var11 + var12 + 1), 0.0D, 0.0D, 1.0D);
            var16.a((double)(var15 - 1), (double)(var11 + var12 + 1), 0.0D, 1.0D, 1.0D);
            var16.a((double)(var15 - 1), (double)(var11 - 1), 0.0D, 1.0D, 0.0D);
            var16.a((double)(var14 + 1), (double)(var11 - 1), 0.0D, 0.0D, 0.0D);
            var16.a();
            GL11.glEnable(3553);
         }

         var9.c(this.b);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         var16.b();
         var16.b(16777215);
         var16.a((double)var10, (double)(var11 + var12), 0.0D, 0.0D, 1.0D);
         var16.a((double)(var10 + var13), (double)(var11 + var12), 0.0D, 1.0D, 1.0D);
         var16.a((double)(var10 + var13), (double)var11, 0.0D, 1.0D, 0.0D);
         var16.a((double)var10, (double)var11, 0.0D, 0.0D, 0.0D);
         var16.a();
         this.b(this.g, var9.a, var10 + var13 + 2, var11 + 1, 16777215);
         this.b(this.g, var9.b, var10 + var13 + 2, var11 + 12, 8421504);
         this.b(this.g, var9.c, var10 + var13 + 2, var11 + 12 + 10, 8421504);
      }

      byte var18 = 4;
      this.a(0, this.i, 255, 255);
      this.a(this.j, this.d, 255, 255);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glDisable(3008);
      GL11.glShadeModel(7425);
      GL11.glDisable(3553);
      var16.b();
      var16.a(0, 0);
      var16.a((double)this.l, (double)(this.i + var18), 0.0D, 0.0D, 1.0D);
      var16.a((double)this.m, (double)(this.i + var18), 0.0D, 1.0D, 1.0D);
      var16.a(0, 255);
      var16.a((double)this.m, (double)this.i, 0.0D, 1.0D, 0.0D);
      var16.a((double)this.l, (double)this.i, 0.0D, 0.0D, 0.0D);
      var16.a();
      var16.b();
      var16.a(0, 255);
      var16.a((double)this.l, (double)this.j, 0.0D, 0.0D, 1.0D);
      var16.a((double)this.m, (double)this.j, 0.0D, 1.0D, 1.0D);
      var16.a(0, 0);
      var16.a((double)this.m, (double)(this.j - var18), 0.0D, 1.0D, 0.0D);
      var16.a((double)this.l, (double)(this.j - var18), 0.0D, 0.0D, 0.0D);
      var16.a();
      GL11.glEnable(3553);
      GL11.glShadeModel(7424);
      GL11.glEnable(3008);
      GL11.glDisable(3042);
      this.a(this.g, "Select Texture Pack", this.c / 2, 16, 16777215);
      this.a(this.g, "(Place texture pack files here)", this.c / 2 - 77, this.d - 26, 8421504);
      super.a(var1, var2, var3);
   }

   public void g() throws IOException {
      super.g();
      --this.o;
   }

   public void a(int var1, int var2, int var3, int var4) {
      is var5 = is.a;
      GL11.glBindTexture(3553, this.b.n.a("/mojang/gui/background.png"));
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      float var6 = 32.0F;
      var5.b();
      var5.a(4210752, var4);
      var5.a(0.0D, (double)var2, 0.0D, 0.0D, (double)((float)var2 / var6));
      var5.a((double)this.c, (double)var2, 0.0D, (double)((float)this.c / var6), (double)((float)var2 / var6));
      var5.a(4210752, var3);
      var5.a((double)this.c, (double)var1, 0.0D, (double)((float)this.c / var6), (double)((float)var1 / var6));
      var5.a(0.0D, (double)var1, 0.0D, 0.0D, (double)((float)var1 / var6));
      var5.a();
   }
}
