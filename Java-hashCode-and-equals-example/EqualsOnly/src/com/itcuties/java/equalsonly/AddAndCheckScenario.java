package com.itcuties.java.equalsonly;

/**
 * In this scenario Client A adds an Item to the Catalog. Client B tries to
 * check whether an Item for an Identifier consisting of the same prefix and
 * number is already in the Catalog.
 */
public class AddAndCheckScenario {

	public static void main(String[] args) {
		Catalog catalog = new Catalog();
		Client clientA = new Client(catalog);
		Client clientB = new Client(catalog);

		clientA.createItemAndAddToCatalog("cat-1", 0);
		boolean isPresent = clientB.checkIfAnItemForPrefixAndNumberExists(
				"cat-1", 0);

		System.out.println("Is an Item present for Client B? " + isPresent);
	}
}
