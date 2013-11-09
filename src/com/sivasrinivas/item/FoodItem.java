package com.sivasrinivas.item;

import com.sivasrinivas.itemfact.ItemFactory;

public class FoodItem extends Item{

	public FoodItem(){
		super();
	}
	
	public FoodItem(String name, double price, int quantity, boolean isImported) {
		super(name, price, quantity, true, isImported); 
	}

	@Override
	public double getTax() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getTaxedPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

}
