package com.itcuties.java.equalsonly;

public class Client {

	private final Catalog catalog;

	public Client(Catalog catalog) {
		this.catalog = catalog;
	}

	public void createItemAndAddToCatalog(String catalogPrefix,
			int catalogNumber) {
		Identifier id = new Identifier(catalogPrefix, catalogNumber);
		Item item = new Item(id, "item created by A");
		catalog.addItem(item);
	}

	public boolean checkIfAnItemForPrefixAndNumberExists(String catalogPrefix,
			int catalogNumber) {
		Identifier id = new Identifier(catalogPrefix, catalogNumber);
		return catalog.isPresent(id);
	}
	
	public void removeItemFromTheCatalogForPrefixAndNumber(String catalogPrefix,
			int catalogNumber) {
		Identifier id = new Identifier(catalogPrefix, catalogNumber);
		catalog.remove(id);
	}
	
	public Item obtainItemFromTheCatalog(String catalogPrefix,
			int catalogNumber) {
		Identifier id = new Identifier(catalogPrefix, catalogNumber);
		return catalog.getItem(id);
	}
}
