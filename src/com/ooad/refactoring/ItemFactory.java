package com.ooad.refactoring;

public class ItemFactory {
	
	// Factory method to create an item specified itemType
	public static Items create(String itemName, String itemType) {
		if (itemType.equals("Movie")) {
			return new Movie(itemName);
		}
		return null;
		
	}


}
