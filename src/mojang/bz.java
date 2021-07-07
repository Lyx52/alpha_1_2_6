package mojang;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.lwjgl.opengl.GL11;

public class bz {

   protected cy a;
   private List[] b = new List[4];
   private fu c;
   private Random d = new Random();


   public bz(cy var1, fu var2) {
      if(var1 != null) {
         this.a = var1;
      }

      this.c = var2;

      for(int var3 = 0; var3 < 4; ++var3) {
         this.b[var3] = new ArrayList();
      }

   }

   public void a(pp var1) {
      int var2 = var1.l_();
      this.b[var2].add(var1);
   }

   public void a() {
      for(int var1 = 0; var1 < 4; ++var1) {
         for(int var2 = 0; var2 < this.b[var1].size(); ++var2) {
            pp var3 = (pp)this.b[var1].get(var2);
            var3.e_();
            if(var3.aN) {
               this.b[var1].remove(var2--);
            }
         }
      }

   }

   public void a(lw var1, float var2) {
      float var3 = fi.b(var1.aC * 3.1415927F / 180.0F);
      float var4 = fi.a(var1.aC * 3.1415927F / 180.0F);
      float var5 = -var4 * fi.a(var1.aD * 3.1415927F / 180.0F);
      float var6 = var3 * fi.a(var1.aD * 3.1415927F / 180.0F);
      float var7 = fi.b(var1.aD * 3.1415927F / 180.0F);
      pp.l = var1.aV + (var1.aw - var1.aV) * (double)var2;
      pp.m = var1.aW + (var1.ax - var1.aW) * (double)var2;
      pp.n = var1.aX + (var1.ay - var1.aX) * (double)var2;

      for(int var8 = 0; var8 < 3; ++var8) {
         if(this.b[var8].size() != 0) {
            int var9 = 0;
            if(var8 == 0) {
               var9 = this.c.a("/mojang/particles.png");
            }

            if(var8 == 1) {
               var9 = this.c.a("/mojang/terrain.png");
            }

            if(var8 == 2) {
               var9 = this.c.a("/mojang/gui/items.png");
            }

            GL11.glBindTexture(3553, var9);
            is var10 = is.a;
            var10.b();

            for(int var11 = 0; var11 < this.b[var8].size(); ++var11) {
               pp var12 = (pp)this.b[var8].get(var11);
               var12.a(var10, var2, var3, var7, var4, var5, var6);
            }

            var10.a();
         }
      }

   }

   public void b(lw var1, float var2) {
      byte var3 = 3;
      if(this.b[var3].size() != 0) {
         is var4 = is.a;

         for(int var5 = 0; var5 < this.b[var3].size(); ++var5) {
            pp var6 = (pp)this.b[var3].get(var5);
            var6.a(var4, var2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
         }

      }
   }

   public void a(cy var1) {
      this.a = var1;

      for(int var2 = 0; var2 < 4; ++var2) {
         this.b[var2].clear();
      }

   }

   public void a(int var1, int var2, int var3) {
      int var4 = this.a.a(var1, var2, var3);
      if(var4 != 0) {
         nq var5 = nq.m[var4];
         byte var6 = 4;

         for(int var7 = 0; var7 < var6; ++var7) {
            for(int var8 = 0; var8 < var6; ++var8) {
               for(int var9 = 0; var9 < var6; ++var9) {
                  double var10 = (double)var1 + ((double)var7 + 0.5D) / (double)var6;
                  double var12 = (double)var2 + ((double)var8 + 0.5D) / (double)var6;
                  double var14 = (double)var3 + ((double)var9 + 0.5D) / (double)var6;
                  this.a((pp)(new ki(this.a, var10, var12, var14, var10 - (double)var1 - 0.5D, var12 - (double)var2 - 0.5D, var14 - (double)var3 - 0.5D, var5)).a(var1, var2, var3));
               }
            }
         }

      }
   }

   public void a(int var1, int var2, int var3, int var4) {
      int var5 = this.a.a(var1, var2, var3);
      if(var5 != 0) {
         nq var6 = nq.m[var5];
         float var7 = 0.1F;
         double var8 = (double)var1 + this.d.nextDouble() * (var6.bn - var6.bk - (double)(var7 * 2.0F)) + (double)var7 + var6.bk;
         double var10 = (double)var2 + this.d.nextDouble() * (var6.bo - var6.bl - (double)(var7 * 2.0F)) + (double)var7 + var6.bl;
         double var12 = (double)var3 + this.d.nextDouble() * (var6.bp - var6.bm - (double)(var7 * 2.0F)) + (double)var7 + var6.bm;
         if(var4 == 0) {
            var10 = (double)var2 + var6.bl - (double)var7;
         }

         if(var4 == 1) {
            var10 = (double)var2 + var6.bo + (double)var7;
         }

         if(var4 == 2) {
            var12 = (double)var3 + var6.bm - (double)var7;
         }

         if(var4 == 3) {
            var12 = (double)var3 + var6.bp + (double)var7;
         }

         if(var4 == 4) {
            var8 = (double)var1 + var6.bk - (double)var7;
         }

         if(var4 == 5) {
            var8 = (double)var1 + var6.bn + (double)var7;
         }

         this.a((new ki(this.a, var8, var10, var12, 0.0D, 0.0D, 0.0D, var6)).a(var1, var2, var3).b(0.2F).d(0.6F));
      }
   }

   public String b() {
      return "" + (this.b[0].size() + this.b[1].size() + this.b[2].size());
   }
}
