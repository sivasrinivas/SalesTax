/**
 * 
 */
package com.sivasrinivas.billing;

import java.util.List;

import com.sivasrinivas.item.Item;
import com.sivasrinivas.tax.MathUtil;
import com.sivasrinivas.tax.TaxCalculator;
import com.sivasrinivas.tax.TaxCalculatorImpl;

/**
 * @author Siva
 *
 */
public class Biller {
	private Cart cart;
	private TaxCalculator taxCalculator;
	
	public Biller(){
		cart = new Cart();
		taxCalculator = new TaxCalculatorImpl();
	}
	
	public void billItem(Item item){
		cart.addItem(item);
	}
	
	public void removeItem(Item item){
		cart.removeItem(item);
	}
	
	public Receipt generateReceipt(){
		Receipt receipt = new Receipt();
		List<Item> items = cart.getCartItems();
		receipt.setItemList(items);
		receipt.setTotalAmount(getTotalAmount(items));
		receipt.setTotalTax(getTotalTax(items));
		return receipt;
	}
	
	private double getTotalTax(List<Item> items){
		double tax = taxCalculator.calculateTax(items);
		return tax;
	}
	
	private double getTotalAmount(List<Item> items){
		double total = 0.0;
		for(Item item : items){
			total+=MathUtil.truncate(item.getQuantity()*item.getPrice());
		}
		return total;
	}
}