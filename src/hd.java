
public class hd extends bp {

   private bp a;
   private int h = 0;
   private String i = "";


   public hd(bp var1) {
      this.a = var1;
   }

   public void g() {
      ++this.h;
   }

   public void a() {
      this.e.clear();
      this.e.add(new gh(0, this.c / 2 - 100, this.d / 4 + 96 + 12, "Connect"));
      this.e.add(new gh(1, this.c / 2 - 100, this.d / 4 + 120 + 12, "Cancel"));
      this.i = this.b.y.z.replaceAll("_", ":");
      ((gh)this.e.get(0)).g = this.i.length() > 0;
   }

   protected void a(gh var1) {
      if(var1.g) {
         if(var1.f == 1) {
            this.b.a(this.a);
         } else if(var1.f == 0) {
            this.b.y.z = this.i.replaceAll(":", "_");
            this.b.y.b();
            String[] var2 = this.i.split(":");
            this.b.a((bp)(new og(this.b, var2[0], var2.length > 1?this.a(var2[1], 25565):25565)));
         }

      }
   }

   private int a(String var1, int var2) {
      try {
         return Integer.parseInt(var1.trim());
      } catch (Exception var4) {
         return var2;
      }
   }

   protected void a(char var1, int var2) {
      if(var1 == 22) {
         String var3 = bp.c();
         if(var3 == null) {
            var3 = "";
         }

         int var4 = 32 - this.i.length();
         if(var4 > var3.length()) {
            var4 = var3.length();
         }

         if(var4 > 0) {
            this.i = this.i + var3.substring(0, var4);
         }
      }

      if(var1 == 13) {
         this.a((gh)this.e.get(0));
      }

      if(var2 == 14 && this.i.length() > 0) {
         this.i = this.i.substring(0, this.i.length() - 1);
      }

      if(" !\"#$%&\'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_\'abcdefghijklmnopqrstuvwxyz{|}~⌂ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»".indexOf(var1) >= 0 && this.i.length() < 32) {
         this.i = this.i + var1;
      }

      ((gh)this.e.get(0)).g = this.i.length() > 0;
   }

   public void a(int var1, int var2, float var3) {
      this.i();
      this.a(this.g, "Play Multiplayer", this.c / 2, this.d / 4 - 60 + 20, 16777215);
      this.b(this.g, "Minecraft Multiplayer is currently not finished, but there", this.c / 2 - 140, this.d / 4 - 60 + 60 + 0, 10526880);
      this.b(this.g, "is some buggy early testing going on.", this.c / 2 - 140, this.d / 4 - 60 + 60 + 9, 10526880);
      this.b(this.g, "Enter the IP of a server to connect to it:", this.c / 2 - 140, this.d / 4 - 60 + 60 + 36, 10526880);
      int var4 = this.c / 2 - 100;
      int var5 = this.d / 4 - 10 + 50 + 18;
      short var6 = 200;
      byte var7 = 20;
      this.a(var4 - 1, var5 - 1, var4 + var6 + 1, var5 + var7 + 1, -6250336);
      this.a(var4, var5, var4 + var6, var5 + var7, -16777216);
      this.b(this.g, this.i + (this.h / 6 % 2 == 0?"_":""), var4 + 4, var5 + (var7 - 8) / 2, 14737632);
      super.a(var1, var2, var3);
   }
}
