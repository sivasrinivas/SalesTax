/**
 * 
 */
package com.sivasrinivas.item;

import com.sivasrinivas.tax.MathUtil;
import com.sivasrinivas.tax.TaxType;

/**
 * @author Siva
 *
 */
public abstract class Item {
	protected String name;
	protected double price;
	protected double taxedPrice;
	protected int quantity;
	protected TaxType taxType;
	
	
	public Item(){
		this.name="";
		this.price=0.0;
		this.quantity=0;
		this.taxType=new TaxType();
	}
	
	public Item(String name, double price, int quantity, boolean isExempted, boolean isImported){
		this.name=name;
		this.price=price;
		this.quantity=quantity;
		this.taxType = new TaxType(isExempted, isImported);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice(){
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
	
	public double getTaxedPrice(){
		return taxedPrice;
	}
	
	public void setTaxedPrice(double taxedPrice){
		this.taxedPrice = taxedPrice;
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(quantity+" ");
		sb.append(name+ " : ");
		sb.append(taxedPrice);
		
		return sb.toString();
	}

	public TaxType getTaxType() {
		return taxType;
	}

	public void setTaxType(TaxType taxType) {
		this.taxType = taxType;
	}
}
