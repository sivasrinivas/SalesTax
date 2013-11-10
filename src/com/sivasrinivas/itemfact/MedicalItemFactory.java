/**
 * 
 */
package com.sivasrinivas.itemfact;

import com.sivasrinivas.item.Item;
import com.sivasrinivas.item.MedicalItem;

/**
 * @author Siva
 *
 */
public class MedicalItemFactory extends ItemFactory{

	@Override
	public MedicalItem createItem(String name, double price, int quantity,	boolean isImported) {
		return new MedicalItem(name, price, quantity, isImported);
	}
	
}
