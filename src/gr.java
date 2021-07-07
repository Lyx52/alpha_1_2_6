import java.util.Comparator;

class gr implements Comparator {

   // $FF: synthetic field
   final en a;


   gr(en var1) {
      this.a = var1;
   }

   public int a(cd var1, cd var2) {
      return var2.a() < var1.a()?-1:(var2.a() > var1.a()?1:0);
   }
}
