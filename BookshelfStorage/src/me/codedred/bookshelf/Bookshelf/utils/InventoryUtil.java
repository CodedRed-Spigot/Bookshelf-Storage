package me.codedred.bookshelf.Bookshelf.utils;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import me.codedred.bookshelf.Bookshelf.data.DataManager;
import net.md_5.bungee.api.ChatColor;

public class InventoryUtil {

	public static int clamp(int num) {
		if (num <= 9 ) num = 9; else if (num > 9 && num <= 18) num = 18; else if (num > 18 && num <= 27) num = 27;
		else if (num > 27 && num <= 36) num = 36; else if (num > 36 && num <= 45) num = 45; else num = 54;
		return num;
	}
	
	public static ItemStack[] getFirst(Inventory inv, int length) {
		ItemStack[] list = new ItemStack[length];
		for (int i = 0 ; i < length ; i++)
			list[i] = inv.getContents()[i];
		return list;
	}
	
	public static Inventory changeSize(Inventory inv, int size) {
		size = clamp(size);
		Inventory newInventory = Bukkit.createInventory(null, size, getTitle());
		newInventory.setContents(getFirst(inv, size));
		return newInventory;
	}
	
	public static String getTitle() {
		DataManager data = DataManager.getInstance();
		return ChatColor.translateAlternateColorCodes('&', data.getConfig().getString("shelf-title"));
	}
}
