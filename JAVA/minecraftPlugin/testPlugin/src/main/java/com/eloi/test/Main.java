package com.eloi.test;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin implements Listner{

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
