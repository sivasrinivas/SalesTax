/**
 * 
 */
package com.sivasrinivas.tax;

import java.util.Collection;
import java.util.LinkedList;

import com.sivasrinivas.item.Item;

/**
 * @author Siva
 *
 */
public interface TaxCalculator {
	double getTax(Item item);
	double calculateTax(Collection<Item> list);
	
}
