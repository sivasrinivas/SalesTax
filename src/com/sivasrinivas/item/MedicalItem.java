package com.sivasrinivas.item;

import com.sivasrinivas.itemfact.ItemFactory;
import com.sivasrinivas.itemfact.MedicalItemFactory;

/**
 * Medical item class for category 'Medical'
 * @author Siva
 */

public class MedicalItem extends Item{
	/**
	 * default constructor for instantiating a medical item
	 */
	public MedicalItem(){
		super();
	}
	
	/**
	 * parameterized constructor for instantiating a medical item
	 * @param name
	 * @param price
	 * @param quantity
	 * @param isImported
	 */
	public MedicalItem(String name, double price, int quantity, boolean isImported){
		super(name, price, quantity, true, isImported);
	}
	/**
	 * returns medical item factory
	 */
	@Override
	public MedicalItemFactory getItemFactory() {
		return new MedicalItemFactory();
	}
}
