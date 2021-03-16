package com.itcuties.java.equalsonly;

import java.util.HashMap;

/**
 * Catalog class: storing a collection of Items and providing an interface for
 * adding, removing, obtaining and checking an Item's presence.
 */
public class Catalog {

	// Items are stored in a hashed collection.
	private HashMap<Identifier, Item> items = new HashMap<Identifier, Item>();

	public boolean isPresent(Identifier id) {
		return items.containsKey(id);
	}

	public void addItem(Item item) {
		this.items.put(item.getId(), item);
	}

	public Item getItem(Identifier id) {
		return items.get(id);
	}

	public void remove(Identifier id) {
		items.remove(id);
	}
}
