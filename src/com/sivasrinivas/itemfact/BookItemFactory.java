/**
 * 
 */
package com.sivasrinivas.itemfact;

import com.sivasrinivas.item.BookItem;
import com.sivasrinivas.item.Item;

/**
 * @author Siva
 *
 */
public class BookItemFactory extends ItemFactory{

	/**
	 * Factory method for creating book item
	 */
	@Override
	public BookItem createItem(String name, double price, int quantity,	boolean isImported) {
		return new BookItem(name, price, quantity, isImported);
	}

}
