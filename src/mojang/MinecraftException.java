package mojang;

public class MinecraftException {

   public final String message;
   public final Throwable exception;


   public MinecraftException(String message, Throwable exception) {
      this.message = message;
      this.exception = exception;
   }
}
