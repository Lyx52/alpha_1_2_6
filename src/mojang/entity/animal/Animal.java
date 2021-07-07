package mojang.entity.animal;

import mojang.cy;
import mojang.entity.monster.Mob;
import mojang.fi;
import mojang.nq;
import mojang.tags.CompoundTag;

public abstract class Animal extends Mob {

   public Animal(cy var1) {
      super(var1);
   }

   protected float a(int var1, int var2, int var3) {
      return this.as.a(var1, var2 - 1, var3) == nq.u.bh?10.0F:this.as.c(var1, var2, var3) - 0.5F;
   }

   public void a(CompoundTag var1) {
      super.a(var1);
   }

   public void b(CompoundTag var1) {
      super.b(var1);
   }

   public boolean a() {
      int var1 = fi.b(this.aw);
      int var2 = fi.b(this.aG.b);
      int var3 = fi.b(this.ay);
      return this.as.a(var1, var2 - 1, var3) == nq.u.bh && this.as.j(var1, var2, var3) > 8 && super.a();
   }

   public int b() {
      return 120;
   }
}
