package com.eloi.test;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Eloi the creator of the world!!!!!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
