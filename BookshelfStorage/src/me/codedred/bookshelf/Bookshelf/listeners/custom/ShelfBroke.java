package me.codedred.bookshelf.Bookshelf.listeners.custom;

import org.bukkit.NamespacedKey;
import org.bukkit.block.TileState;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataContainer;

import me.codedred.bookshelf.Bookshelf.containers.InventoryDataType;
import me.codedred.bookshelf.Bookshelf.events.ShelfBrokeEvent;
import me.codedred.bookshelf.Bookshelf.utils.ContainerUtil;

public class ShelfBroke implements Listener {

	@EventHandler
	public void onBreak(ShelfBrokeEvent event) {
		TileState state = (TileState) event.getClickedBlock().getState();
		PersistentDataContainer container = state.getPersistentDataContainer();		
		NamespacedKey key = ContainerUtil.getNamedSpacedKey();
		
		if (!container.has(key, new InventoryDataType()))
			return;
		
		Inventory inv = container.get(key, new InventoryDataType()).getInventory();
		if (inv.isEmpty())
			return;
		
		for (ItemStack i : inv.getContents()) 
			event.getPlayer().getWorld().dropItemNaturally(event.getClickedBlock().getLocation(), i);
	}
}
