/**
 * 
 */
package com.sivasrinivas.itemfact;

import com.sivasrinivas.item.Item;

/**
 * @author Siva
 *
 */
public abstract class ItemFactory {

	public abstract Item createItem(String name, double price, int quantity, boolean isImported);

}
