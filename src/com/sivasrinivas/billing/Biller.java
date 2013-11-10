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
 * This is Biller class, which adds items to cart or removes item from cart. And generates order receipt for the items that are there in cart
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
	/**
	 * Adds an item to billing, which in turn adds to shopping cart
	 * @param item
	 */
	public void billItem(Item item){
		cart.addItem(item);
	}
	/**
	 * Removes specified item from billing, which in turn removes from shoppint cart
	 * @param item
	 */
	public void removeItem(Item item){
		cart.removeItem(item);
	}
	/**
	 * Generates order receipt for items that are there in shopping cart, by calculating tax to each item
	 * @return
	 */
	public Receipt generateReceipt(){
		
		List<Item> items = cart.getCartItems();
		
		
		double totalTax = 0.0;
		double totalAmount = 0.0;
		for(Item item : items){
			double tax = taxCalculator.getTax(item);
			double taxedPrice = MathUtil.add(item.getPrice()*item.getQuantity(), tax);
			totalTax = MathUtil.add(totalTax, tax);
			totalAmount = MathUtil.add(totalAmount, taxedPrice);
			item.setTaxedPrice(taxedPrice);
		}
		 
		return new Receipt(items, totalTax, totalAmount);
	}
	/**
	 * Return calculated total tax for the items that are there in cart. It doesn't bill items, which means taxedPrice of item is not updated
	 * @return
	 */
	public double getTotalTax(){
		double totalTax = 0.0;
		totalTax = taxCalculator.calculateTax(cart.getCartItems());
		return totalTax;
	}
	/**
	 * Return calculated tax for specified item
	 * @param item
	 * @return
	 */
	public double getItemTax(Item item){
		double tax = 0.0;
		tax = taxCalculator.getTax(item);
		return tax;
	}
	/**
	 * Gets the receipt by generating it and prints the receipt
	 */
	public void printReceipt(){
		Receipt r = generateReceipt();
		System.out.println(r.toString());;
	}
	/**
	 * Clear all items from present order, which in turn clears shopping cart
	 */
	public void clearOrder(){
		cart.clearCart();
	}
	/**
	 * Get the item list in shopping cart
	 * @return
	 */
	public List<Item> getOrder(){
		return cart.getCartItems();
	}
}
