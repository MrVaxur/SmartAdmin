package com.gmail.kukubaczek.SmartAdmin;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class PlayerMenuCreator {
	
  @SuppressWarnings("deprecation")
  public static void reloadInv(Player admin, String player) {
		 Inventory menu = Bukkit.createInventory(null, 54, "§aS§fmart§bAdmin: §e" + player);
		 
		 Player gracz = Bukkit.getPlayerExact(player);
		 
		 //kick
		 ItemStack stack = new ItemStack (Material.TRIPWIRE_HOOK, 1);
		 ItemMeta meta = stack.getItemMeta();
		 meta.setDisplayName("§cWyrzuć z serwera");
		 stack.setItemMeta(meta);
		 menu.setItem(16, stack);
		 
		 stack = new ItemStack (Material.FEATHER, 1);
		 if(gracz.getAllowFlight() == true){
			 meta.setDisplayName("§aFly");
			 meta.addEnchant(Enchantment.WATER_WORKER, 1, true);
		 }else{
			 meta.setDisplayName("§cFly");
		 }
		 stack.setItemMeta(meta);
		 menu.setItem(19, stack);
		 
		 //heal
		 stack = new ItemStack (Material.APPLE, 1);
		 meta = stack.getItemMeta();
		 meta.setDisplayName("§aUlecz");
		 stack.setItemMeta(meta);
		 menu.setItem(10, stack);
		 
		 admin.openInventory(menu);
	 }
}
