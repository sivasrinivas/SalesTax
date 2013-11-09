/**
 * 
 */
package com.sivasrinivas.item;

import com.sivasrinivas.tax.TaxType;

/**
 * @author Siva
 *
 */
public abstract class Item {
	protected String name;
	protected double price;
	protected int quantity;
	protected TaxType taxType;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public abstract double getTax();
	
	public abstract double getTaxedPrice();
	
}
