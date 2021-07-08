package mojang;

final class GlassBlock extends Block {

   GlassBlock(String var1, float var2, float var3) {
      super(var1, var2, var3);
   }

   public String getStepSound() {
      return "random.glass";
   }
}
