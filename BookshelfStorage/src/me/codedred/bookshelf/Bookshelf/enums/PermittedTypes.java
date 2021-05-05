package me.codedred.bookshelf.Bookshelf.enums;

public enum PermittedTypes {

	ENCHANTED_BOOK,
	BOOK,
	KNOWLEDGE_BOOK,
	WRITABLE_BOOK,
	WRITTEN_BOOK
	;
	
	public static boolean contains(String s) {
		if (PermittedTypes.valueOf(s) == null)
			return false;
		return true;
	}
}
