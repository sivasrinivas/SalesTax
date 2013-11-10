/**
 * 
 */
package com.sivasrinivas.shop;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.sivasrinivas.item.FoodItem;
import com.sivasrinivas.item.Item;
import com.sivasrinivas.item.OtherItem;

/**
 * @author Siva
 *
 */
public class InventoryTest {

	Inventory inventory;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		inventory = new Inventory();
	}

	/**
	 * Test method for {@link com.sivasrinivas.shop.Inventory#addItemToInventory(java.lang.String, com.sivasrinivas.item.Item)}.
	 */
	@Test
	public void testAddItemToInventory() {
		Item expected = new OtherItem("knife", 5.60, 1, false);
		inventory.addItemToInventory("other", expected);
		Item actual = inventory.searchAndRetrieveItem("knife", 5.60, 1, false);
		Assert.assertEquals(expected, actual);
		
	}

	/**
	 * Test method for {@link com.sivasrinivas.shop.Inventory#searchAndRetrieveItem(java.lang.String, double, int, boolean)}.
	 */
	@Test
	public void testSearchAndRetrieveItem() {
		Item actual = inventory.searchAndRetrieveItem("chocolate", 0.60, 1, true);
		Item expected = new FoodItem("chocolate", 0.60, 1, true);
		Assert.assertEquals(expected, actual);
	}

	/**
	 * Test method for {@link com.sivasrinivas.shop.Inventory#getShelfSize()}.
	 */
	@Test
	public void testGetShelfSize() {
		Assert.assertEquals(4, inventory.getShelfSize());
		
	}

}
