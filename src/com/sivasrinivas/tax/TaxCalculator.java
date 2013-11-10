/**
 * 
 */
package com.sivasrinivas.tax;

import java.util.LinkedList;
import java.util.List;

import com.sivasrinivas.item.Item;

/**
 * This is TaxCalcualtor interface 
 * @author Siva
 *
 */
public interface TaxCalculator {
	double getTax(Item item);
	double calculateTax(List<Item> list);
	
}
