package me.codedred.bookshelf.Bookshelf.listeners;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import me.codedred.bookshelf.Bookshelf.events.ShelfBrokeEvent;

public class BlockBreak implements Listener {
	
	@EventHandler
	public void onBlockBreak(BlockBreakEvent event) {
		if (event.getBlock().getType() != Material.BOOKSHELF)
			return;
		Bukkit.getPluginManager().callEvent(new ShelfBrokeEvent(event));
	}

}
