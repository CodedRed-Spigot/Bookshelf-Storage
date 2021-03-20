package me.codedred.bookshelf.Bookshelf.data;

import org.bukkit.configuration.file.FileConfiguration;

import me.codedred.bookshelf.Bookshelf.Bookshelf;

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

}
