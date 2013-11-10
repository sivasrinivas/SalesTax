/**
 * 
 */
package com.sivasrinivas.item;

import com.sivasrinivas.itemfact.BookItemFactory;
import com.sivasrinivas.itemfact.ItemFactory;

/**
 * Book item class for category 'Book'
 * @author Siva
 *
 */
public class BookItem extends Item{
	/**
	 * default constructor for instantiating a book item
	 */
	public BookItem(){
		super();
	}
	/**
	 * parameterized constructor for instantiating a book item
	 * @param name
	 * @param price
	 * @param quantity
	 * @param isImported
	 */
	public BookItem(String name, double price, int quantity, boolean isImported){
		super(name, price, quantity, true, isImported);
	}
	/**
	 * returns book item factory
	 */
	@Override
	public BookItemFactory getItemFactory() {
		return new BookItemFactory();
	}

	
}
