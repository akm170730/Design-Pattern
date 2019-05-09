package com.ooad.refactoring;

public class Items implements Rentable, Sellable {
	private String itemName;
	protected String itemType;


    public Items(String itemName) {
        this.itemName = itemName;
    }
	
    public String getItemType() {
    	return this.itemType;
    }
    
	public String getItemName() {
		return this.itemName;
	}

}
