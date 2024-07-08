package com.example.yourmod.fabric;

import com.example.yourmod.YourMod;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.DedicatedServerModInitializer;
import net.fabricmc.api.ModInitializer;

public class YourModFabric implements ModInitializer, ClientModInitializer, DedicatedServerModInitializer {
    @Override
    public void onInitialize() {
        YourMod.init();
    }

    @Override
    public void onInitializeClient() {
        YourMod.initClient();
    }

    @Override
    public void onInitializeServer() {
        YourMod.initServer();
    }
}
