
// $FF: synthetic class
public class go {

   // $FF: synthetic field
   public static final int[] a = new int[jp.values().length];


   static {
      try {
         a[jp.a.ordinal()] = 1;
      } catch (NoSuchFieldError var4) {
         ;
      }

      try {
         a[jp.b.ordinal()] = 2;
      } catch (NoSuchFieldError var3) {
         ;
      }

      try {
         a[jp.c.ordinal()] = 3;
      } catch (NoSuchFieldError var2) {
         ;
      }

      try {
         a[jp.d.ordinal()] = 4;
      } catch (NoSuchFieldError var1) {
         ;
      }

   }
}
