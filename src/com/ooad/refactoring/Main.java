package com.ooad.refactoring;

public class Main {

	public static void main(String[] args) {
		//1. Initialize our store. It's singleton so that it can do bookkeeping for
		//customers in a consistment manner (e.g., cross txs) 
		Store store = Store.getInstance();
		
		//2. Create a customer to make rentals/purchases from the store
		Customer cust = new Customer("Homer", 12);
		
		//3. Customer makes a certain request (rent or purchase) for an item identified by its name
		// assumption: in our store, each item can be uniquely identified by 
		// its name so we can deduce an item's type (i.e., movie, musicCD etc) given its name
		String requestType = "rent";
		String itemName = "SupaKid";
		cust.addToCartRequest(store, itemName, requestType);
		
		
		

	}

}
