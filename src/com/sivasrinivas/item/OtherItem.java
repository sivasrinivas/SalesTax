package com.sivasrinivas.item;

import com.sivasrinivas.itemfact.ItemFactory;
import com.sivasrinivas.itemfact.OtherItemFactory;

/**
 * Othem item class for items that are other than Book, Fodd and Medical
 * @author Siva
 */
public class OtherItem extends Item{

	/**
	 * default constructor for instantiating a other item
	 */
	public OtherItem(){
		super();
	}
	/**
	 * parameterized constructor for instantiating a other item
	 * @param name
	 * @param price
	 * @param quantity
	 * @param isImported
	 */
	public OtherItem(String name, double price, int quantity, boolean isImported){
		super(name, price, quantity, false, isImported);
	}
	/**
	 * returns other item factory
	 */
	@Override
	public OtherItemFactory getItemFactory() {
		// TODO Auto-generated method stub
		return new OtherItemFactory();
	}

}
