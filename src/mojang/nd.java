package mojang;

// $FF: synthetic class
class nd {

   // $FF: synthetic field
   static final int[] a = new int[fw.values().length];


   static {
      try {
         a[fw.a.ordinal()] = 1;
      } catch (NoSuchFieldError var4) {
         ;
      }

      try {
         a[fw.b.ordinal()] = 2;
      } catch (NoSuchFieldError var3) {
         ;
      }

      try {
         a[fw.c.ordinal()] = 3;
      } catch (NoSuchFieldError var2) {
         ;
      }

      try {
         a[fw.d.ordinal()] = 4;
      } catch (NoSuchFieldError var1) {
         ;
      }

   }
}
