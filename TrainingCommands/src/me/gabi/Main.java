package me.gabi;

import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {    	
    	getCommand("damager").setExecutor(new CommandDamager());
    	getServer().getPluginManager().registerEvents(new SoupSign(), (Plugin)this);
    	getServer().getPluginManager().registerEvents(new RecraftSign(), (Plugin)this);
    }
}