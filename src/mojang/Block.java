package mojang;

public class Block {

   public final String name;
   public final float b;
   public final float c;


   public Block(String name, float var2, float var3) {
      this.name = name;
      this.b = var2;
      this.c = var3;
   }

   public float b() {
      return this.b;
   }

   public float c() {
      return this.c;
   }

   public String getStepSound() {
      return "step." + this.name;
   }

   public String d() {
      return "step." + this.name;
   }
}
