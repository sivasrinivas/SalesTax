/**
 * 
 */
package com.sivasrinivas.billing;

import java.util.ArrayList;
import java.util.List;

import com.sivasrinivas.item.Item;

/**
 * @author Siva
 *
 */
public class Receipt {
	private List<Item> itemList;
	private double totalAmount;
	private double totalTax;
	
	public Receipt(){
		itemList = new ArrayList<Item>();
		totalAmount=0.0;
		totalTax=0.0;
	}
	
	public List<Item> getItemList(){
		return itemList;
	}
	
	public double getTotalAmount(){
		return totalAmount;
	}
	
	public double getTotalTax(){
		return totalTax;
	}
	
	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public void setTotalTax(double totalTax) {
		this.totalTax = totalTax;
	}
	
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
