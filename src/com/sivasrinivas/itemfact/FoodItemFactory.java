/**
 * 
 */
package com.sivasrinivas.itemfact;

import com.sivasrinivas.item.FoodItem;
import com.sivasrinivas.item.Item;

/**
 * @author Siva
 *
 */
public class FoodItemFactory extends ItemFactory{

	@Override
	public FoodItem createItem(String name, double price, int quantity, boolean isImported) {
		return new FoodItem(name, price, quantity, isImported);
	}

}
