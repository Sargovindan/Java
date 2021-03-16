package com.itcuties.java.equalsonly;

/**
 * Items stored in the Catalog. Each instance is bind with a unique identifier.
 */
public class Item {

	private final Identifier id;
	private final String name;

	public Item(Identifier id, String name) {
		this.id = id;
		this.name = name;
	}

	public Identifier getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
