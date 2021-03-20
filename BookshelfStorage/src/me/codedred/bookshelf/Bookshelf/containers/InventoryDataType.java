package me.codedred.bookshelf.Bookshelf.containers;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

import org.apache.commons.lang.SerializationUtils;
import org.bukkit.persistence.PersistentDataAdapterContext;
import org.bukkit.persistence.PersistentDataType;

public class InventoryDataType implements PersistentDataType<byte[], ShelfInventory> {

	@Override
	public Class<ShelfInventory> getComplexType() {
		return ShelfInventory.class;
	}

	@Override
	public Class<byte[]> getPrimitiveType() {
		return byte[].class;
	}

	@Override
	public byte[] toPrimitive(ShelfInventory complex, PersistentDataAdapterContext arg1) {
		return SerializationUtils.serialize(complex);
	}
	
	@Override
	public ShelfInventory fromPrimitive(byte[] primitive, PersistentDataAdapterContext arg1) {
		try {
			InputStream is = new ByteArrayInputStream(primitive);
			ObjectInputStream o = new ObjectInputStream(is);
			return (ShelfInventory) o.readObject();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

}
