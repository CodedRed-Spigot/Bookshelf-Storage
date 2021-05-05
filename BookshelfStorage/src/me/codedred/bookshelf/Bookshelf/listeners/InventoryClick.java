package me.codedred.bookshelf.Bookshelf.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;

public class InventoryClick implements Listener {
	
	@EventHandler
	public void onClick(InventoryClickEvent event) {
		if (event.getClickedInventory().getType() != InventoryType.CHEST)
			return;
		if (event.getInventory().getLocation().getPitch() != 777f)
			return;
		
	}

}
