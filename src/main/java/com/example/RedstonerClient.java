package com.example; // CHANGE THIS to the package shown in your project

import net.fabricmc.api.ClientModInitializer;

public class RedstonerClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        System.out.println("================================");
        System.out.println("      REDSTONER CLIENT");
        System.out.println("      Minecraft 26.2");
        System.out.println("================================");

        // Client systems will be initialized here.
    }
}
