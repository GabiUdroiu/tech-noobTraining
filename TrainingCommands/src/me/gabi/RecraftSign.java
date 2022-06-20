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

public class RecraftSign implements Listener {
	@EventHandler
    public void signInteract(PlayerInteractEvent e) {
     Block block = e.getClickedBlock();
        if(e.getAction() == Action.RIGHT_CLICK_BLOCK) {
           if(block.getType() == Material.SIGN || block.getType() == Material.SIGN_POST || block.getType() == Material.WALL_SIGN) {
              Sign sign = (Sign) e.getClickedBlock().getState();
              if(sign.getLine(1).contains(ChatColor.translateAlternateColorCodes('&',"&8[&3Recraft&8]"))) {
            	  Player p = e.getPlayer();
            	  Inventory recraft = Bukkit.createInventory((InventoryHolder)p, 27, "Recraft");
            	   for(int i=0;i<2;i++) {
            	       for (int j = 64; j > 0; j--) {
            	           recraft.addItem(new ItemStack[] { new ItemStack(Material.BOWL) });
            	        } 
            	       for (int j = 64; j > 0; j--) {
            	         recraft.addItem(new ItemStack[] { new ItemStack(Material.RED_MUSHROOM) });
            	       } 
            	       for (int j = 64; j > 0; j--) {
            	         recraft.addItem(new ItemStack[] { new ItemStack(Material.BROWN_MUSHROOM) });
            	       } 
            	       for (int j = 64; j > 0; j--) {
            	           recraft.addItem(new ItemStack[] { new ItemStack(Material.BOWL) });
            	        } 
            	       for (int j = 64; j > 0; j--) {
            	         recraft.addItem(new ItemStack[] { new ItemStack(Material.BOWL) });
            	       } 
            	       for (int j = 64; j > 0; j--) {
            	           recraft.addItem(new ItemStack[] { new ItemStack(Material.INK_SACK,1, (short)3) });
            	       }
            	       for (int j = 64; j > 0; j--) {
            	           recraft.addItem(new ItemStack[] { new ItemStack(Material.BOWL) });
            	       } 
            	       for (int j = 64; j > 0; j--) {
            	           recraft.addItem(new ItemStack[] { new ItemStack(Material.BOWL) });
            	       } 
            	       for (int j = 64; j > 0; j--) {
            	           recraft.addItem(new ItemStack[] { new ItemStack(Material.CACTUS) });
            	       }
            	   }
            	   for (int i = 0; i < 9; i++)
            	   	recraft.setItem(i, null);	            
            	   	recraft.setItem(12, null);
            	   	recraft.setItem(15, null);
            	  p.openInventory(recraft);                           
                 }
            }
        }
    }
}