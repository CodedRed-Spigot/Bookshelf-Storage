package me.codedred.bookshelf.Bookshelf.events;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.event.block.BlockBreakEvent;

public class ShelfBrokeEvent extends Event implements Cancellable {
	
    private boolean isCancelled;
    private final BlockBreakEvent event;
	
	public ShelfBrokeEvent(BlockBreakEvent event) {
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
    	return event.getPlayer();
    }
    
    public Block getClickedBlock() {
    	return event.getBlock();
    }

}