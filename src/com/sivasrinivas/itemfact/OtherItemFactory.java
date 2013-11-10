/**
 * 
 */
package com.sivasrinivas.itemfact;

import com.sivasrinivas.item.Item;
import com.sivasrinivas.item.OtherItem;

/**
 * @author Siva
 *
 */
public class OtherItemFactory extends ItemFactory{

	/**
	 * Factory method for creating other item
	 */
	@Override
	public OtherItem createItem(String name, double price, int quantity,	boolean isImported) {
		return new OtherItem(name, price, quantity, isImported);
	}

}
