package me.codedred.bookshelf.Bookshelf.containers;

import java.io.Serializable;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

import me.codedred.bookshelf.Bookshelf.data.DataManager;
import me.codedred.bookshelf.Bookshelf.utils.InventoryUtil;

public class ShelfInventory implements Serializable {

	private static final long serialVersionUID = 1L;

	private Inventory inventory;
	
	public ShelfInventory() {
		DataManager data = DataManager.getInstance();
		setInventory(Bukkit.createInventory(null, data.getChestSize(), InventoryUtil.format(data.getShelfTitle())));
	}
	
	public ShelfInventory(Inventory inv) {
		setInventory(inv);
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		inventory.getLocation().setPitch(777f);
		this.inventory = inventory;
	}
}
