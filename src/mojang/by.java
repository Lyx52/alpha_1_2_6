package mojang;

public class by extends dx {

   public by(int var1) {
      super(var1);
      this.aX = 16;
   }

   public fp a(fp var1, cy var2, eb var3) {
      --var1.a;
      var2.a(var3, "random.bow", 0.5F, 0.4F / (b.nextFloat() * 0.4F + 0.8F));
      if(!var2.z) {
         var2.a((lw)(new at(var2, var3)));
      }

      return var1;
   }
}