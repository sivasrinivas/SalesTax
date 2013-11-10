/**
 * 
 */
package com.sivasrinivas.tax;

import java.util.LinkedList;
import java.util.List;

import com.sivasrinivas.item.Item;

/**
 * Interface for TaxCalcualtor 
 * @author Siva
 *
 */
public interface TaxCalculator {
	/**
	 * calculates tax for the specified item
	 * @param item
	 * @return
	 */
	double getTax(Item item);
	/**
	 * calculates total tax for the specified item list
	 * @param list
	 * @return
	 */
	double calculateTax(List<Item> list);
	
}
