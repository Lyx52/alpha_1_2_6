package mojang;

import mojang.tags.CompoundTag;

public class qc extends ji {

   public String[] a = new String[]{"", "", "", ""};
   public int b = -1;


   public void b(CompoundTag var1) {
      super.b(var1);
      var1.putStringTag("Text1", this.a[0]);
      var1.putStringTag("Text2", this.a[1]);
      var1.putStringTag("Text3", this.a[2]);
      var1.putStringTag("Text4", this.a[3]);
   }

   public void a(CompoundTag var1) {
      super.a(var1);

      for(int var2 = 0; var2 < 4; ++var2) {
         this.a[var2] = var1.getString("Text" + (var2 + 1));
         if(this.a[var2].length() > 15) {
            this.a[var2] = this.a[var2].substring(0, 15);
         }
      }

   }
}
