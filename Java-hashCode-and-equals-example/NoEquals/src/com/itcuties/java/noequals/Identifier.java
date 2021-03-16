package com.itcuties.java.noequals;

/**
 * First implementation of Identifier -- without hashCode() and equals().
 */
public class Identifier {

	private final String catalogPrefix;
	private final int catalogNumber;

	public Identifier(String catalogPrefix, int catalogNumber) {
		this.catalogPrefix = catalogPrefix;
		this.catalogNumber = catalogNumber;
	}

	public String getCatalogPrefix() {
		return catalogPrefix;
	}

	public long getCatalogNumber() {
		return catalogNumber;
	}
}
