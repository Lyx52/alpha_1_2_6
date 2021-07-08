package mojang;

final class GravelBlock extends Block {

   GravelBlock(String var1, float var2, float var3) {
      super(var1, var2, var3);
   }

   public String getStepSound() {
      return "step.gravel";
   }
}
