package com.sivasrinivas.item;


public class FoodItem extends Item{

	public FoodItem(){
		super();
	}
	
	public FoodItem(String name, double price, int quantity, boolean isImported) {
		super(name, price, quantity, true, isImported); 
	}

}
