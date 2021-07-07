package mojang;

import mojang.net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class gh extends nb {

   protected int a;
   protected int b;
   public int c;
   public int d;
   public String e;
   public int f;
   public boolean g;
   public boolean h;


   public gh(int var1, int var2, int var3, String var4) {
      this(var1, var2, var3, 200, 20, var4);
   }

   protected gh(int var1, int var2, int var3, int var4, int var5, String var6) {
      this.a = 200;
      this.b = 20;
      this.g = true;
      this.h = true;
      this.f = var1;
      this.c = var2;
      this.d = var3;
      this.a = var4;
      this.b = var5;
      this.e = var6;
   }

   protected int a(boolean var1) {
      byte var2 = 1;
      if(!this.g) {
         var2 = 0;
      } else if(var1) {
         var2 = 2;
      }

      return var2;
   }

   public void a(Minecraft var1, int var2, int var3) {
      if(this.h) {
         ls var4 = var1.o;
         GL11.glBindTexture(3553, var1.n.a("/mojang/gui/gui.png"));
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         boolean var5 = var2 >= this.c && var3 >= this.d && var2 < this.c + this.a && var3 < this.d + this.b;
         int var6 = this.a(var5);
         this.b(this.c, this.d, 0, 46 + var6 * 20, this.a / 2, this.b);
         this.b(this.c + this.a / 2, this.d, 200 - this.a / 2, 46 + var6 * 20, this.a / 2, this.b);
         this.b(var1, var2, var3);
         if(!this.g) {
            this.a(var4, this.e, this.c + this.a / 2, this.d + (this.b - 8) / 2, -6250336);
         } else if(var5) {
            this.a(var4, this.e, this.c + this.a / 2, this.d + (this.b - 8) / 2, 16777120);
         } else {
            this.a(var4, this.e, this.c + this.a / 2, this.d + (this.b - 8) / 2, 14737632);
         }

      }
   }

   protected void b(Minecraft var1, int var2, int var3) {}

   public void a(int var1, int var2) {}

   public boolean c(Minecraft var1, int var2, int var3) {
      return this.g && var2 >= this.c && var3 >= this.d && var2 < this.c + this.a && var3 < this.d + this.b;
   }
}
