package com.example.yourmod;

import com.example.yourmod.config.MidnightConfigExample;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

public class YourMod {
    public static final String MOD_ID = "yourmod";

    public static void init() {
        MidnightConfigExample.init(MOD_ID, MidnightConfigExample.class);
    }
    @Environment(EnvType.CLIENT)
    public static void initClient() {
        System.out.println("Initializing client");
    }
    @Environment(EnvType.SERVER)
    public static void initServer() {
        System.out.println("Initializing dedicated server");
    }
}
