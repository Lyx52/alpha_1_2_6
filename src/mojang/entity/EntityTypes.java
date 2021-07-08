package mojang.entity;

public enum EntityTypes {

   EVERYTHING("everything", 0),
   MOBS("mobs", 1),
   PLAYERS("players", 2);
   private static final EntityTypes[] entities = new EntityTypes[]{EVERYTHING, MOBS, PLAYERS};

   private EntityTypes(String name, int id) {}

}
