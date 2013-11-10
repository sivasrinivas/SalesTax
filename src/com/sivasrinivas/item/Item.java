/**
 * 
 */
package com.sivasrinivas.item;

import com.sivasrinivas.itemfact.ItemFactory;
import com.sivasrinivas.tax.MathUtil;
import com.sivasrinivas.tax.TaxType;

/**
 * An abstract class for item category. 
 * @author Siva
 */
public abstract class Item {
	/** name - name of the item	 */
	protected String name;
	/** price - unit price of the item */
	protected double price;
	/** quantity - quantity of the item added to billing*/
	protected int quantity;
	/** taxType - type of taxes applicable to this item*/
	protected TaxType taxType;
	/** taxedPrice - net price of the item for total quantity including tax*/
	protected double taxedPrice;
	
	/**
	 * default constructor to instantiate item with default values 
	 */
	public Item(){
		this.name="";
		this.price=0.0;
		this.quantity=0;
		this.taxType=new TaxType();
	}
	/**
	 * parameterized constructor to instantiate item
	 * @param name
	 * @param price
	 * @param quantity
	 * @param isExempted
	 * @param isImported
	 */
	public Item(String name, double price, int quantity, boolean isExempted, boolean isImported){
		this.name=name;
		this.price=price;
		this.quantity=quantity;
		this.taxType = new TaxType(isExempted, isImported);
	}
	/**
	 * get the name of the item 
	 * @return
	 */
	public String getName() {
		return name;
	}
	/**
	 * set the name of the item
	 * @param name
	 */
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
	/**
	 * get net price of the item for total quantity including tax
	 * @return
	 */
	public double getTaxedPrice(){
		return taxedPrice;
	}
	/**
	 * set net price of the item for total quantity including tax
	 * @param taxedPrice
	 */
	public void setTaxedPrice(double taxedPrice){
		this.taxedPrice = taxedPrice;
	}
	
	public TaxType getTaxType() {
		return taxType;
	}

	public void setTaxType(TaxType taxType) {
		this.taxType = taxType;
	}
	
	public abstract ItemFactory getItemFactory();
	
	/**
	 * get String representation of the item
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(quantity);
		sb.append(name+ ": ");
		sb.append(taxedPrice);
		
		return sb.toString();
	}

	/**
	 * default implementation of hasCode method, in case item is used in data structures that uses hash 
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + quantity;
		result = prime * result + ((taxType == null) ? 0 : taxType.hashCode());
		return result;
	}

	/**
	 * default implementation of equals method, in case item is used in data structures that uses hash 
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Item other = (Item) obj;
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (Double.doubleToLongBits(price) != Double
				.doubleToLongBits(other.price)) {
			return false;
		}
		if (quantity != other.quantity) {
			return false;
		}
		if (taxType == null) {
			if (other.taxType != null) {
				return false;
			}
		} else if (!taxType.equals(other.taxType)) {
			return false;
		}
		return true;
	}
	
}
