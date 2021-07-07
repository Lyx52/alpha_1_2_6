package mojang.net.minecraft.launcher;

import mojang.net.minecraft.client.MinecraftApplet;

import java.applet.Applet;

@SuppressWarnings("deprecation")
public class Launch {
    private static String auth_name = "Lyx52";
    private static String auth_session = "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MzIyYTBiMWJjNDM0YmEzMDRhNzEwMDhiZDk2YmVhOSIsInlnZ3QiOiI4YzQzNmMyZGJlNDU0OGMwOGQ1Y2Q0ZWZlZTNkNjRkYiIsInNwciI6IjdkOTFkZjYyNzdiZDQyNDc5ZDI4ZDZhYTRlOGMwNDE4IiwiaXNzIjoiWWdnZHJhc2lsLUF1dGgiLCJleHAiOjE2MTcxOTEwNjYsImlhdCI6MTYxNzAxODI2Nn0.chTc95skh46xIolCeVhU9e88aPeYZnGpykzb5PyNV3Q";
    public static void main (String[] args) {
        Applet minecraftApplet = new MinecraftApplet();
        MinecraftFrame mcWindow = new MinecraftFrame("Minecraft");
        mcWindow.start(minecraftApplet, auth_name, auth_session);
    }
}
