package me.codedred.bookshelf.Bookshelf.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class ShelfClickEvent extends Event implements Cancellable {
	
    private boolean isCancelled;
    private final InventoryClickEvent event;
	
	public ShelfClickEvent(InventoryClickEvent event) {
		this.event = event;
	}

    public boolean isCancelled() {
        return this.isCancelled;
    }

    public void setCancelled(boolean isCancelled) {
        this.isCancelled = isCancelled;
        event.setCancelled(true);
    }

    private static final HandlerList HANDLERS = new HandlerList();

    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }
    
    public Player getPlayer() {
    	return (Player) event.getWhoClicked();
    }
    
    public ItemStack getClickedItem() {
    	return event.getCurrentItem();
    }
    
    public ItemStack getCursorItem() {
    	return event.getCursor();
    }

    

}