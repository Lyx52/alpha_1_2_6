package mojang;

import mojang.entity.Entity;
import mojang.entity.LivingEntity;
import mojang.tags.CompoundTag;

public class bl extends ji {

   public int a = -1;
   public String b = "Pig";
   public double c;
   public double d = 0.0D;


   public bl() {
      this.a = 20;
   }

   public boolean a() {
      return this.e.a((double)this.f + 0.5D, (double)this.g + 0.5D, (double)this.h + 0.5D, 16.0D) != null;
   }

   public void b() {
      this.d = this.c;
      if(this.a()) {
         double var1 = (double)((float)this.f + this.e.l.nextFloat());
         double var3 = (double)((float)this.g + this.e.l.nextFloat());
         double var5 = (double)((float)this.h + this.e.l.nextFloat());
         this.e.a("smoke", var1, var3, var5, 0.0D, 0.0D, 0.0D);
         this.e.a("flame", var1, var3, var5, 0.0D, 0.0D, 0.0D);

         for(this.c += (double)(1000.0F / ((float)this.a + 200.0F)); this.c > 360.0D; this.d -= 360.0D) {
            this.c -= 360.0D;
         }

         if(this.a == -1) {
            this.c();
         }

         if(this.a > 0) {
            --this.a;
         } else {
            byte var7 = 4;

            for(int var8 = 0; var8 < var7; ++var8) {
               LivingEntity var9 = (LivingEntity)((LivingEntity)fq.a(this.b, this.e));
               if(var9 == null) {
                  return;
               }

               int var10 = this.e.a(var9.getClass(), co.b((double)this.f, (double)this.g, (double)this.h, (double)(this.f + 1), (double)(this.g + 1), (double)(this.h + 1)).b(8.0D, 4.0D, 8.0D)).size();
               if(var10 >= 6) {
                  this.c();
                  return;
               }

               if(var9 != null) {
                  double var11 = (double)this.f + (this.e.l.nextDouble() - this.e.l.nextDouble()) * 4.0D;
                  double var13 = (double)(this.g + this.e.l.nextInt(3) - 1);
                  double var15 = (double)this.h + (this.e.l.nextDouble() - this.e.l.nextDouble()) * 4.0D;
                  var9.c(var11, var13, var15, this.e.l.nextFloat() * 360.0F, 0.0F);
                  if(var9.a()) {
                     this.e.a((Entity)var9);

                     for(int var17 = 0; var17 < 20; ++var17) {
                        var1 = (double)this.f + 0.5D + ((double)this.e.l.nextFloat() - 0.5D) * 2.0D;
                        var3 = (double)this.g + 0.5D + ((double)this.e.l.nextFloat() - 0.5D) * 2.0D;
                        var5 = (double)this.h + 0.5D + ((double)this.e.l.nextFloat() - 0.5D) * 2.0D;
                        this.e.a("smoke", var1, var3, var5, 0.0D, 0.0D, 0.0D);
                        this.e.a("flame", var1, var3, var5, 0.0D, 0.0D, 0.0D);
                     }

                     var9.C();
                     this.c();
                  }
               }
            }

            super.b();
         }
      }
   }

   private void c() {
      this.a = 200 + this.e.l.nextInt(600);
   }

   public void a(CompoundTag var1) {
      super.a(var1);
      this.b = var1.getString("EntityId");
      this.a = var1.getShort("Delay");
   }

   public void b(CompoundTag var1) {
      super.b(var1);
      var1.putStringTag("EntityId", this.b);
      var1.putShortTag("Delay", (short)this.a);
   }
}
