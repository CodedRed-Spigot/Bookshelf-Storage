package me.codedred.bookshelf.Bookshelf;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import me.codedred.bookshelf.Bookshelf.listeners.BlockBreak;
import me.codedred.bookshelf.Bookshelf.listeners.InventoryClick;
import me.codedred.bookshelf.Bookshelf.listeners.PlayerInteract;
import me.codedred.bookshelf.Bookshelf.listeners.custom.ShelfBroke;
import me.codedred.bookshelf.Bookshelf.listeners.custom.ShelfClick;
import me.codedred.bookshelf.Bookshelf.listeners.custom.ShelfInteract;

public class Bookshelf extends JavaPlugin {
	
	/***
	 * This doesnt work, since bookshelfs are not TileStates... so I need to change the way the info is saved.
	 * 
	 */
	
	@Override
	public void onEnable() {
	
		registerEvents();
	}
	
	@Override
	public void onDisable() {
		
	}
	
	
	private void registerEvents() {
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(new BlockBreak(), this);
		pm.registerEvents(new PlayerInteract(), this);
		pm.registerEvents(new ShelfInteract(), this);
		pm.registerEvents(new ShelfBroke(), this);
		pm.registerEvents(new InventoryClick(), this);
		pm.registerEvents(new ShelfClick(), this);
	}
	

}
