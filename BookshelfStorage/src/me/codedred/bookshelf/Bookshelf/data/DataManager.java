package me.codedred.bookshelf.Bookshelf.data;

import org.bukkit.configuration.file.FileConfiguration;

import me.codedred.bookshelf.Bookshelf.Bookshelf;
import me.codedred.bookshelf.Bookshelf.utils.InventoryUtil;

public class DataManager {
	
	private static DataManager instance = null;
	
	public static DataManager getInstance() {
		if (instance == null)
			instance = new DataManager();
		return instance;
	}
	
	private CustomFile config = new CustomFile(Bookshelf.getPlugin(Bookshelf.class), "config.yml");
	
	public void save() {
		config.saveConfig();
	}
	
	public void reload() {
		config.reloadConfig();
	}

	public FileConfiguration getConfig() {
		return config.getConfig();
	}
	
	public int getChestSize() {
		return InventoryUtil.clamp(getConfig().getInt("shelf-size"));
	}
	
	public String getShelfTitle() {
		return getConfig().getString("shelf-title");
	}
	
	public boolean onlyBooks() {
		return getConfig().getBoolean("books-only");
	}

}
