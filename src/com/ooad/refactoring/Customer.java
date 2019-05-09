package com.ooad.refactoring;

import java.util.ArrayList;

public class Customer {

	private String name;
	private Integer age;

	public Customer(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	
	/**
	 * Customer makes a request to store for adding the item specified by itemName to his cart.
	 * Type can be either "rent" or "purchase"
	 * 
	 * 
	 * @param store
	 * @param itemName
	 * @param type
	 */
	public void addToCartRequest(Store store, String itemName, String requestType) {
		//2. if it's available, we add the item to the customers cart
		
	}

}
