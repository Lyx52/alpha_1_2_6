package mojang;

import mojang.tags.BaseTag;
import mojang.tags.CompoundTag;
import mojang.tags.ListTag;

public class ga extends ji implements hi {

   private fp[] a = new fp[36];


   public int c() {
      return 27;
   }

   public fp c(int var1) {
      return this.a[var1];
   }

   public fp a(int var1, int var2) {
      if(this.a[var1] != null) {
         fp var3;
         if(this.a[var1].a <= var2) {
            var3 = this.a[var1];
            this.a[var1] = null;
            this.h();
            return var3;
         } else {
            var3 = this.a[var1].a(var2);
            if(this.a[var1].a == 0) {
               this.a[var1] = null;
            }

            this.h();
            return var3;
         }
      } else {
         return null;
      }
   }

   public void a(int var1, fp var2) {
      this.a[var1] = var2;
      if(var2 != null && var2.a > this.o_()) {
         var2.a = this.o_();
      }

      this.h();
   }

   public String d() {
      return "Chest";
   }

   public void a(CompoundTag var1) {
      super.a(var1);
      ListTag var2 = var1.getListTag("Items");
      this.a = new fp[this.c()];

      for(int var3 = 0; var3 < var2.c(); ++var3) {
         CompoundTag var4 = (CompoundTag)var2.a(var3);
         int var5 = var4.getByte("Slot") & 255;
         if(var5 >= 0 && var5 < this.a.length) {
            this.a[var5] = new fp(var4);
         }
      }

   }

   public void b(CompoundTag var1) {
      super.b(var1);
      ListTag var2 = new ListTag();

      for(int var3 = 0; var3 < this.a.length; ++var3) {
         if(this.a[var3] != null) {
            CompoundTag var4 = new CompoundTag();
            var4.putByteTag("Slot", (byte)var3);
            this.a[var3].a(var4);
            var2.a((BaseTag)var4);
         }
      }

      var1.putBaseTag("Items", (BaseTag)var2);
   }

   public int o_() {
      return 64;
   }
}
