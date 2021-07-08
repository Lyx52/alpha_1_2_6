package mojang;

import java.awt.image.BufferedImage;
import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.imageio.ImageIO;
import mojang.net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class od extends d {

   private ZipFile e;
   private int f = -1;
   private BufferedImage g;
   private File h;


   public od(File var1) {
      this.a = var1.getName();
      this.h = var1;
   }

   private String b(String var1) {
      if(var1 != null && var1.length() > 34) {
         var1 = var1.substring(0, 34);
      }

      return var1;
   }

   public void a(Minecraft var1) throws IOException {
      ZipFile var2 = null;
      InputStream var3 = null;

      try {
         var2 = new ZipFile(this.h);

         try {
            var3 = var2.getInputStream(var2.getEntry("mojang/pack.txt"));
            BufferedReader var4 = new BufferedReader(new InputStreamReader(var3));
            this.b = this.b(var4.readLine());
            this.c = this.b(var4.readLine());
            var4.close();
            var3.close();
         } catch (IOException var20) {
            ;
         }

         try {
            var3 = var2.getInputStream(var2.getEntry("mojang/pack.png"));
            this.g = ImageIO.read(var3);
            var3.close();
         } catch (IOException var19) {
            ;
         }

         var2.close();
      } catch (Exception var21) {
         var21.printStackTrace();
      } finally {
         try {
            var3.close();
         } catch (Exception var18) {
            ;
         }

         try {
            var2.close();
         } catch (Exception var17) {
            ;
         }

      }

   }

   public void b(Minecraft var1) {
      if(this.g != null) {
         var1.n.a(this.f);
      }

      this.b();
   }

   public void c(Minecraft var1) {
      if(this.g != null && this.f < 0) {
         this.f = var1.n.a(this.g);
      }

      if(this.g != null) {
         var1.n.b(this.f);
      } else {
         GL11.glBindTexture(3553, var1.n.loadTexture("/mojang/assets/gui/unknown_pack.png"));
      }

   }

   public void a() {
      try {
         this.e = new ZipFile(this.h);
      } catch (Exception var2) {
         ;
      }

   }

   public void b() {
      try {
         this.e.close();
      } catch (Exception var2) {
         ;
      }

      this.e = null;
   }

   public InputStream a(String var1) {
      try {
         ZipEntry var2 = this.e.getEntry(var1.substring(1));
         if(var2 != null) {
            return this.e.getInputStream(var2);
         }
      } catch (Exception var3) {
         ;
      }

      return d.class.getResourceAsStream(var1);
   }
}
