package com.sivasrinivas.item;

import com.sivasrinivas.itemfact.FoodItemFactory;
import com.sivasrinivas.itemfact.ItemFactory;

/**
 * Food item class for category 'Food'
 * 
 * @author Siva
 */
public class FoodItem extends Item{

	/**
	 * default constructor for instantiating a food item
	 */
	public FoodItem(){
		super();
	}
	/**
	 * parameterized constructor for instantiating a food item
	 * @param name
	 * @param price
	 * @param quantity
	 * @param isImported
	 */
	public FoodItem(String name, double price, int quantity, boolean isImported) {
		super(name, price, quantity, true, isImported); 
	}
	
	@Override
	public FoodItemFactory getItemFactory() {
		// TODO Auto-generated method stub
		return new FoodItemFactory();
	}

}
