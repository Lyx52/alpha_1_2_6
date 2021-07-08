package mojang.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;
import java.awt.TextArea;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import mojang.MinecraftException;
import org.lwjgl.Sys;
import org.lwjgl.opengl.GL11;

public class ErrorPanel extends Panel {

   public ErrorPanel(MinecraftException exception) {
      this.setBackground(new Color(3028036));
      this.setLayout(new BorderLayout());
      StringWriter errorLogWriter = new StringWriter();
      exception.exception.printStackTrace(new PrintWriter(errorLogWriter));
      String writerData = errorLogWriter.toString();
      String gl_vendor = "";
      String basicInfo = "";

      try {
         basicInfo = basicInfo + "Generated " + (new SimpleDateFormat()).format(new Date()) + "\n";
         basicInfo = basicInfo + "\n";
         basicInfo = basicInfo + "Minecraft: Minecraft Alpha v1.2.6\n";
         basicInfo = basicInfo + "OS: " + System.getProperty("os.name") + " (" + System.getProperty("os.arch") + ") version " + System.getProperty("os.version") + "\n";
         basicInfo = basicInfo + "Java: " + System.getProperty("java.version") + ", " + System.getProperty("java.vendor") + "\n";
         basicInfo = basicInfo + "VM: " + System.getProperty("java.vm.name") + " (" + System.getProperty("java.vm.info") + "), " + System.getProperty("java.vm.vendor") + "\n";
         basicInfo = basicInfo + "LWJGL: " + Sys.getVersion() + "\n";
         gl_vendor = GL11.glGetString(GL11.GL_VENDOR);
         basicInfo = basicInfo + "OpenGL: " + GL11.glGetString(GL11.GL_RENDERER) + " version " + GL11.glGetString(GL11.GL_VERSION) + ", " + GL11.glGetString(GL11.GL_VENDOR) + "\n";
      } catch (Throwable var8) {
         basicInfo = basicInfo + "[failed to get system properties (" + var8 + ")]\n";
      }

      basicInfo = basicInfo + "\n";
      basicInfo = basicInfo + writerData;

      String errorLog = "";
      errorLog = errorLog + "\n";
      errorLog = errorLog + "\n";
      if(writerData.contains("Pixel format not accelerated")) {
         errorLog = errorLog + "      Bad video card drivers!      \n";
         errorLog = errorLog + "      -----------------------      \n";
         errorLog = errorLog + "\n";
         errorLog = errorLog + "Minecraft was unable to start because it failed to find an accelerated OpenGL mode.\n";
         errorLog = errorLog + "This can usually be fixed by updating the video card drivers.\n";
         if(gl_vendor.toLowerCase().contains("nvidia")) {
            errorLog = errorLog + "\n";
            errorLog = errorLog + "You might be able to find drivers for your video card here:\n";
            errorLog = errorLog + "  http://www.nvidia.com/\n";
         } else if(gl_vendor.toLowerCase().contains("ati")) {
            errorLog = errorLog + "\n";
            errorLog = errorLog + "You might be able to find drivers for your video card here:\n";
            errorLog = errorLog + "  http://www.amd.com/\n";
         }
      } else {
         errorLog = errorLog + "      Minecraft has crashed!      \n";
         errorLog = errorLog + "      ----------------------      \n";
         errorLog = errorLog + "\n";
         errorLog = errorLog + "Minecraft has stopped running because it encountered a problem.\n";
         errorLog = errorLog + "\n";
         errorLog = errorLog + "If you wish to report this, please copy this entire text and email it to support@mojang.com.\n";
         errorLog = errorLog + "Please include a description of what you did when the error occured.\n";
      }

      errorLog = errorLog + "\n";
      errorLog = errorLog + "\n";
      errorLog = errorLog + "\n";
      errorLog = errorLog + "--- BEGIN ERROR REPORT " + Integer.toHexString(errorLog.hashCode()) + " --------\n";
      errorLog = errorLog + basicInfo;
      errorLog = errorLog + "--- END ERROR REPORT " + Integer.toHexString(errorLog.hashCode()) + " ----------\n";
      errorLog = errorLog + "\n";
      errorLog = errorLog + "\n";

      TextArea errorText = new TextArea(errorLog, 0, 0, 1);
      errorText.setFont(new Font("Monospaced", 0, 12));

      this.add(new MinecraftLogo(), "North");
      this.add(new Border(80), "East");
      this.add(new Border(80), "West");
      this.add(new Border(100), "South");
      this.add(errorText, "Center");
   }
}
