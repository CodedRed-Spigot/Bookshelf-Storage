package me.codedred.bookshelf.Bookshelf.utils;

import org.bukkit.NamespacedKey;

import me.codedred.bookshelf.Bookshelf.Bookshelf;

public class ContainerUtil {

	public static NamespacedKey getNamedSpacedKey() {
		return new NamespacedKey(Bookshelf.getPlugin(Bookshelf.class), "bookshelf-key");
	}
}
