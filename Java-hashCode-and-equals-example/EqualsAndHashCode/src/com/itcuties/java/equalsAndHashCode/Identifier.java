package com.itcuties.java.equalsAndHashCode;

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
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Identifier)) {
			return false;
		}
		Identifier id = (Identifier) obj;
		return catalogPrefix.equals(id.getCatalogPrefix()) &&
				catalogNumber == id.getCatalogNumber();
	}
	
	@Override
	public int hashCode() {
		int hashCode = 47;
		hashCode = hashCode * 17 + catalogPrefix.hashCode();
		hashCode = hashCode * 17 + catalogNumber;
		return hashCode;
	}
}
