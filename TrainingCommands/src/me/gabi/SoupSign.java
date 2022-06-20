package me.gabi;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

public class SoupSign implements Listener {
	@EventHandler
    public void signInteract(PlayerInteractEvent e) {
     Block block = e.getClickedBlock();
        if(e.getAction() == Action.RIGHT_CLICK_BLOCK) {
           if(block.getType() == Material.SIGN || block.getType() == Material.SIGN_POST || block.getType() == Material.WALL_SIGN) {
              Sign sign = (Sign) e.getClickedBlock().getState();
              if(sign.getLine(1).contains(ChatColor.translateAlternateColorCodes('&',"&8[&3Soups&8]"))) {
             	Player p = e.getPlayer();
            	Inventory soup = Bukkit.createInventory((InventoryHolder)p, 36, "Soups");
            		for (int i = 35; i >= 0; i--)
            	    soup.setItem(i, new ItemStack(Material.MUSHROOM_SOUP)); 
            	 p.openInventory(soup);                            
                 }
            }
        }
    }
}
