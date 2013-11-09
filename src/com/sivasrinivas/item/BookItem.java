/**
 * 
 */
package com.sivasrinivas.item;

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

}
