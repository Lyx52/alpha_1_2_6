package mojang.entity.monster;

import mojang.cy;
import mojang.dx;
import mojang.eb;
import mojang.entity.Entity;
import mojang.fp;
import mojang.tags.CompoundTag;

import java.io.IOException;
import java.util.List;

public class PigZombie extends Zombie {

   private int a = 0;
   private int b = 0;
   private static final fp c = new fp(dx.E, 1);


   public PigZombie(cy var1) {
      super(var1);
      this.image = "/mojang/mob/pigzombie.png";
      this.am = 0.5F;
      this.f = 5;
      this.bm = true;
   }

   public void e_() throws IOException {
      this.am = this.g != null?0.95F:0.5F;
      if(this.b > 0 && --this.b == 0) {
         this.as.a(this, "mob.zombiepig.zpigangry", this.h() * 2.0F, ((this.bd.nextFloat() - this.bd.nextFloat()) * 0.2F + 1.0F) * 1.8F);
      }

      super.e_();
   }

   public boolean a() {
      return this.as.k > 0 && this.as.a(this.aG) && this.as.a((Entity)this, this.aG).size() == 0 && !this.as.b(this.aG);
   }

   public void a(CompoundTag var1) {
      super.a(var1);
      var1.putShortTag("Anger", (short)this.a);
   }

   public void b(CompoundTag var1) {
      super.b(var1);
      this.a = var1.getShort("Anger");
   }

   protected Entity c_() {
      return this.a == 0?null:super.c_();
   }

   public void k() throws IOException {
      super.k();
   }

   public boolean a(Entity var1, int var2) {
      if(var1 instanceof eb) {
         List var3 = this.as.b((Entity)this, this.aG.b(32.0D, 32.0D, 32.0D));

         for(int var4 = 0; var4 < var3.size(); ++var4) {
            Entity var5 = (Entity)var3.get(var4);
            if(var5 instanceof PigZombie) {
               PigZombie var6 = (PigZombie)var5;
               var6.c(var1);
            }
         }

         this.c(var1);
      }

      return super.a(var1, var2);
   }

   private void c(Entity var1) {
      this.g = var1;
      this.a = 400 + this.bd.nextInt(400);
      this.b = this.bd.nextInt(40);
   }

   protected String d() {
      return "mob.zombiepig.zpig";
   }

   protected String f_() {
      return "mob.zombiepig.zpighurt";
   }

   protected String f() {
      return "mob.zombiepig.zpigdeath";
   }

   protected int g_() {
      return dx.ap.aW;
   }

   public fp l() {
      return c;
   }

}
