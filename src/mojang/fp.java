package mojang;

import mojang.entity.Entity;
import mojang.entity.LivingEntity;
import mojang.tags.CompoundTag;
import mojang.world.World;

public final class fp {

   public int a;
   public int b;
   public int c;
   public int d;


   public fp(nq var1) {
      this(var1, 1);
   }

   public fp(nq var1, int var2) {
      this(var1.bh, var2);
   }

   public fp(Item var1) {
      this(var1, 1);
   }

   public fp(Item var1, int var2) {
      this(var1.aW, var2);
   }

   public fp(int var1) {
      this(var1, 1);
   }

   public fp(int var1, int var2) {
      this.a = 0;
      this.c = var1;
      this.a = var2;
   }

   public fp(int var1, int var2, int var3) {
      this.a = 0;
      this.c = var1;
      this.a = var2;
      this.d = var3;
   }

   public fp(CompoundTag var1) {
      this.a = 0;
      this.b(var1);
   }

   public fp a(int var1) {
      this.a -= var1;
      return new fp(this.c, var1, this.d);
   }

   public Item a() {
      return Item.itemIds[this.c];
   }

   public int b() {
      return this.a().a(this);
   }

   public boolean a(eb var1, World var2, int var3, int var4, int var5, int var6) {
      return this.a().a(this, var1, var2, var3, var4, var5, var6);
   }

   public float a(nq var1) {
      return this.a().a(this, var1);
   }

   public fp a(World var1, eb var2) {
      return this.a().a(this, var1, var2);
   }

   public CompoundTag a(CompoundTag var1) {
      var1.putShortTag("id", (short)this.c);
      var1.putByteTag("Count", (byte)this.a);
      var1.putShortTag("Damage", (short)this.d);
      return var1;
   }

   public void b(CompoundTag var1) {
      this.c = var1.getShort("id");
      this.a = var1.getByte("Count");
      this.d = var1.getShort("Damage");
   }

   public int c() {
      return this.a().c();
   }

   public int d() {
      return Item.itemIds[this.c].d();
   }

   public void b(int var1) {
      this.d += var1;
      if(this.d > this.d()) {
         --this.a;
         if(this.a < 0) {
            this.a = 0;
         }

         this.d = 0;
      }

   }

   public void a(LivingEntity var1) {
      Item.itemIds[this.c].a(this, var1);
   }

   public void a(int var1, int var2, int var3, int var4) {
      Item.itemIds[this.c].a(this, var1, var2, var3, var4);
   }

   public int a(Entity var1) {
      return Item.itemIds[this.c].a(var1);
   }

   public boolean b(nq var1) {
      return Item.itemIds[this.c].a(var1);
   }

   public void a(eb var1) {}

   public void b(LivingEntity var1) {
      Item.itemIds[this.c].b(this, var1);
   }

   public fp e() {
      return new fp(this.c, this.a, this.d);
   }
}
