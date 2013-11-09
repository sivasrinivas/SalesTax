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
		
		double totalTax = 0.0;
		double totalAmount = 0.0;
		for(Item item : items){
			double tax = taxCalculator.getTax(item);
			double taxedPrice = item.getPrice()+tax;
			totalTax+=tax;
			totalAmount+=taxedPrice;
			item.setTaxedPrice(tax);
		}
		
		receipt.setTotalAmount(totalAmount);
		receipt.setTotalTax(totalTax);
		return receipt;
	}
	
}
