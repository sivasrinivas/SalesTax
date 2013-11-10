package com.sivasrinivas.billing;

import java.util.ArrayList;
import java.util.List;

import com.sivasrinivas.item.Item;
/**
 * Cart class to holds items that are added to billing list 
 * @author Siva
 *
 */
public class Cart {
	/** List to hold items added to cart*/
	private List<Item> itemList;
	
	/**
	 * default constructor to instantiate cart object
	 */
	public Cart(){
		itemList = new ArrayList<Item>();
	}
	
	public void addItem(Item item){
		itemList.add(item);
	}
	
	public void removeItem(Item item){
		itemList.remove(item);
	}
	/**
	 * Clear all items in the cart
	 */
	public void clearCart(){
		itemList.clear();
	}
	/**
	 * get item list in the cart
	 * @return itemList
	 */
	public List<Item> getCartItems(){
		return itemList;
	}
	/**
	 * get size of the cart
	 * @return int
	 */
	public int getCartSize(){
		return itemList.size();
	}
}
