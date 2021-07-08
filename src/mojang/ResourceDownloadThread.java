package mojang;

import java.io.*;
import java.net.URL;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import mojang.net.minecraft.client.Minecraft;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ResourceDownloadThread extends Thread {

   public File resources;
   private Minecraft minecraft;
   private boolean c = false;


   public ResourceDownloadThread(File gameDirectory, Minecraft minecraft) {
      this.minecraft = minecraft;
      this.setName("Resource download thread");
      this.setDaemon(true);
      this.resources = new File(gameDirectory, "resources/");
      if(!this.resources.exists() && !this.resources.mkdirs()) {
         throw new RuntimeException("The working directory could not be created: " + this.resources);
      }
   }

   public void run() {
      try {
         URL downloadURL = new URL("https://s3.amazonaws.com/MinecraftResources/");

         DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
         DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
         Document document = documentBuilder.parse(downloadURL.openStream());
         NodeList contents = document.getElementsByTagName("Contents");

         for(int i = 0; i < 2; ++i) {
            for(int content_index = 0; content_index < contents.getLength(); ++content_index) {

               Node node = contents.item(content_index);
               if(node.getNodeType() == 1) {
                  Element element = (Element)node;
                  String fileName = ((Element)element.getElementsByTagName("Key").item(0)).getChildNodes().item(0).getNodeValue();
                  long size = Long.parseLong(((Element)element.getElementsByTagName("Size").item(0)).getChildNodes().item(0).getNodeValue());
                  if(size > 0L) {
                     this.a(downloadURL, fileName, size, i);
                     if(this.c) {
                        return;
                     }
                  }
               }
            }
         }
      } catch (Exception var13) {
         this.a(this.resources, "");
         var13.printStackTrace();
      }

   }

   public void a() {
      this.a(this.resources, "");
   }

   private void a(File var1, String var2) {
      File[] var3 = var1.listFiles();

      for(int var4 = 0; var4 < var3.length; ++var4) {
         if(var3[var4].isDirectory()) {
            this.a(var3[var4], var2 + var3[var4].getName() + "/");
         } else {
            try {
               this.minecraft.a(var2 + var3[var4].getName(), var3[var4]);
            } catch (Exception var6) {
               System.out.println("Failed to add " + var2 + var3[var4].getName());
            }
         }
      }

   }

   private void a(URL downloadURL, String fileName, long var3, int var5) {
      try {
         int subKey = fileName.indexOf("/");
         String keyName = fileName.substring(0, subKey);
         if(!keyName.equals("sound") && !keyName.equals("newsound")) {
            if(var5 != 1) {
               return;
            }
         } else if(var5 != 0) {
            return;
         }

         File var8 = new File(this.resources, fileName);
         if(!var8.exists() || var8.length() != var3) {
            var8.getParentFile().mkdirs();
            String var9 = fileName.replaceAll(" ", "%20");
            this.a(new URL(downloadURL, var9), var8, var3);
            if(this.c) {
               return;
            }
         }

         this.minecraft.a(fileName, var8);
      } catch (Exception var10) {
         var10.printStackTrace();
      }

   }

   private void a(URL var1, File var2, long var3) throws IOException {
      byte[] var5 = new byte[4096];
      DataInputStream var6 = new DataInputStream(var1.openStream());
      DataOutputStream var7 = new DataOutputStream(new FileOutputStream(var2));
      boolean var8 = false;

      do {
         int var9;
         if((var9 = var6.read(var5)) < 0) {
            var6.close();
            var7.close();
            return;
         }

         var7.write(var5, 0, var9);
      } while(!this.c);

   }

   public void b() {
      this.c = true;
   }
}
