/**
 * 
 */
package com.sivasrinivas.item;

import com.sivasrinivas.itemfact.BookItemFactory;
import com.sivasrinivas.itemfact.ItemFactory;

/**
 * @author Siva
 *
 */
public class BookItem extends Item{
	
	public BookItem(){
		super();
	}
	
	public BookItem(String name, double price, int quantity, boolean isImported){
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

	@Override
	public BookItemFactory getItemFactory() {
		// TODO Auto-generated method stub
		return new  BookItemFactory();
	}
	
	

}
