package mojang;

public enum OS_TYPES {

   LINUX("linux", 0),
   SOLARIS("solaris", 1),
   WINDOWS("windows", 2),
   MACOS("macos", 3),
   UNKOWN("unknown", 4);
   private static final OS_TYPES[] types = new OS_TYPES[]{LINUX, SOLARIS, WINDOWS, MACOS, UNKOWN};

   private OS_TYPES(String name, int id) {}

}
