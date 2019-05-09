package com.ooad.refactoring;

import java.util.HashMap;

public class Store {
	
	private static Store obj;
	private final Integer rentableCode = 1;
	private final Integer purchasableCode = 2;
	private final Integer rentableAndPurchasableCode = 3;
	
	public synchronized static Store getInstance() {
		if (obj == null) {
			obj = new Store();
		}
		return obj;
	}
	
	// Catalog keeps items that exists in the store.
	// Each item is mapped to a code that indicates for what 
	// type (i.e., rent/purchase) it's available
	private HashMap<String, Integer> catalog;
	
	private Store() {
		this.catalog = new HashMap<String, Integer>();
		
	}
	
	// When a customer wants to add some item to his cart from the store, he
	// he calls this method.
	public Items handleAddToCardRequest(String itemName, String itemType, String requestType) {
		if (!this.doesContainItemForRequest(itemName, requestType)) {
			return null;
		}
		// call factory method for item
		return null;
		
		
	}
	public boolean doesContainItemForRequest(String itemName, String requestType) {
		if (this.catalog.containsKey(itemName)) {
			Integer itemCode = catalog.get(itemName);
			if (requestType.equals("rent") && (itemCode == this.rentableCode || itemCode == this.rentableAndPurchasableCode)){
				return true;
			}
			else if (requestType.equals("purchase") && (itemCode == this.purchasableCode) || itemCode == this.rentableAndPurchasableCode) {
				return true;
			}
			
		}
		return false;
		
	}
	
	

}
