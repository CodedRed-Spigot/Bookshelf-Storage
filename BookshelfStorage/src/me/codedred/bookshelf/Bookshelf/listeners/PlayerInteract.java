package me.codedred.bookshelf.Bookshelf.listeners;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import me.codedred.bookshelf.Bookshelf.events.ShelfInteractEvent;

public class PlayerInteract implements Listener {
	
	@EventHandler
	public void onInteract(PlayerInteractEvent event) {
		if (!event.hasBlock())
			return;
		if (event.getClickedBlock().getType() != Material.BOOKSHELF)
			return;
		if (event.getAction() != Action.RIGHT_CLICK_BLOCK)
			return;
		Bukkit.getPluginManager().callEvent(new ShelfInteractEvent(event));
	}

}
