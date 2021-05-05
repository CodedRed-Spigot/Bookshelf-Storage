package me.codedred.bookshelf.Bookshelf.listeners.custom;

import org.bukkit.NamespacedKey;
import org.bukkit.block.TileState;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.persistence.PersistentDataContainer;

import me.codedred.bookshelf.Bookshelf.containers.InventoryDataType;
import me.codedred.bookshelf.Bookshelf.containers.ShelfInventory;
import me.codedred.bookshelf.Bookshelf.data.DataManager;
import me.codedred.bookshelf.Bookshelf.events.ShelfInteractEvent;
import me.codedred.bookshelf.Bookshelf.utils.ContainerUtil;
import me.codedred.bookshelf.Bookshelf.utils.InventoryUtil;

public class ShelfInteract implements Listener {
	
	@EventHandler
	public void onShelfInteract(ShelfInteractEvent event) {
		TileState state = (TileState) event.getClickedBlock().getState();
		PersistentDataContainer container = state.getPersistentDataContainer();		
		NamespacedKey key = ContainerUtil.getNamedSpacedKey();
		DataManager data = DataManager.getInstance();
		
		if (!container.has(key, new InventoryDataType()))
			container.set(key, new InventoryDataType(), new ShelfInventory());
		
		Inventory inv = container.get(key, new InventoryDataType()).getInventory();
		if (inv.getSize() != data.getChestSize())
			inv = InventoryUtil.changeSize(inv, data.getChestSize());

		event.getPlayer().openInventory(inv);
	}

}
