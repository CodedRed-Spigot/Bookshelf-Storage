package me.codedred.bookshelf.Bookshelf.listeners.custom;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import me.codedred.bookshelf.Bookshelf.data.DataManager;
import me.codedred.bookshelf.Bookshelf.enums.PermittedTypes;
import me.codedred.bookshelf.Bookshelf.events.ShelfClickEvent;

public class ShelfClick implements Listener {
	
	@EventHandler
	public void onClick(ShelfClickEvent event) {
		if (DataManager.getInstance().onlyBooks()) {
			if (event.getCursorItem() == null)
				return;
			if (PermittedTypes.contains(event.getCursorItem().getType().name()))
				return;
			
			event.setCancelled(true);
		}
	}

}
