package me.codedred.bookshelf.Bookshelf.containers;

import java.io.Serializable;

import org.bukkit.inventory.Inventory;

public class ShelfInventory implements Serializable {

	private static final long serialVersionUID = 1L;

	private Inventory inventory;

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
}
