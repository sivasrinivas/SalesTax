/**
 * 
 */
package com.sivasrinivas.billing;

import java.util.ArrayList;
import java.util.List;

import com.sivasrinivas.item.Item;

/**
 * This is receipt class and it is read only. 
 * Once biller generates receipt for items in cart, he can not modify generated receipt except generating another receipt.
 * @author Siva
 *
 */
public class Receipt {
	private List<Item> itemList;
	private double totalAmount;
	private double totalTax;
	/**
	 * Default constructor to instantiate receipt class
	 */
	public Receipt(){
		itemList = new ArrayList<Item>();
		totalAmount=0.0;
		totalTax=0.0;
	}
	/**
	 * A parameterized constructor to instantiate receipt class
	 * @param items
	 * @param totalTax
	 * @param totalAmount
	 */
	public Receipt(List<Item> items, double totalTax, double totalAmount) {
		itemList = items;
		this.totalTax = totalTax;
		this.totalAmount = totalAmount;
	}
	/**
	 * returns item list in the order receipt
	 * @return
	 */
	public List<Item> getItemList(){
		return itemList;
	}
	/**
	 * returns total amount of the order receipt
	 * @return
	 */
	public double getTotalAmount(){
		return totalAmount;
	}
	/**
	 * returns total tax amount of the order receipt
	 * @return
	 */
	public double getTotalTax(){
		return totalTax;
	}
	
	/**
	 * Prints receipt to console
	 */
	public void printReceipt(){
		System.out.println("****** Order Receipt ******");
		
		for(Item item : itemList){
			System.out.println(item.toString());
		}
		System.out.println("Total Sales Tax : "+totalTax);
		System.out.println("Total Amount : "+totalAmount);
		System.out.println("****** End of Receipt ******");
	}


}
