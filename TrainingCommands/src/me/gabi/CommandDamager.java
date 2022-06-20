package me.gabi;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandDamager implements CommandExecutor {
  int damage;  
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    if (sender instanceof Player) {
    	final Player p = (Player)sender;
  	  	if(p.hasPermission("myplugin.damager")) {
  	  	this.damage = Integer.parseInt(args[0]);
  	  	ScheduledExecutorService executor = Executors.newScheduledThreadPool(0);
  	  	executor.scheduleWithFixedDelay(new Runnable() {
            public void run() {
              p.damage(CommandDamager.this.damage);
            }
          },  60L, 60L, TimeUnit.MILLISECONDS);
  	  	}
  	  	else
  	  		p.sendMessage("No permission!");
    } 
    return true;
  }
}
