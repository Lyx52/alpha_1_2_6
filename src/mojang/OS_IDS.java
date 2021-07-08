package mojang;

// $FF: synthetic class
public class OS_IDS {

   public static final int[] type_ids = new int[OS_TYPES.values().length];


   static {
      try {
         type_ids[OS_TYPES.LINUX.ordinal()] = 1;
      } catch (NoSuchFieldError var4) {
         ;
      }

      try {
         type_ids[OS_TYPES.SOLARIS.ordinal()] = 2;
      } catch (NoSuchFieldError var3) {
         ;
      }

      try {
         type_ids[OS_TYPES.WINDOWS.ordinal()] = 3;
      } catch (NoSuchFieldError var2) {
         ;
      }

      try {
         type_ids[OS_TYPES.MACOS.ordinal()] = 4;
      } catch (NoSuchFieldError var1) {
         ;
      }

   }
}
