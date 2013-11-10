/**
 * 
 */
package com.sivasrinivas.billing;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.sivasrinivas.item.Item;
import com.sivasrinivas.item.MedicalItem;
import com.sivasrinivas.item.OtherItem;

/**
 * @author Siva
 *
 */
public class CartTest {

	Cart cart;
	Item foodItem;
	Item medicalItem; 
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		cart = new Cart();
		foodItem = new OtherItem("chocolate bar", 0.85, 1, true);
		medicalItem = new MedicalItem("Packet of headache pills", 9.75, 2, false);
	}

	/**
	 * Test method for {@link com.sivasrinivas.billing.Cart#addItem(com.sivasrinivas.item.Item)}.
	 */
	@Test
	public void testAddItem() {
		cart.addItem(foodItem);
		Assert.assertEquals(foodItem, cart.getCartItems().iterator().next());
	}

	/**
	 * Test method for {@link com.sivasrinivas.billing.Cart#removeItem(com.sivasrinivas.item.Item)}.
	 */
	@Test
	public void testRemoveItem() {
		cart.addItem(foodItem);
		cart.removeItem(foodItem);
		Assert.assertEquals(0, cart.getCartItems().size());
	}
	
	/**
	 * Test method for {@link com.sivasrinivas.billing.Cart#removeItem(com.sivasrinivas.item.Item)}.
	 */
	@Test
	public void testRemoveItemNegative() {
		cart.addItem(foodItem);
		cart.removeItem(medicalItem);
		Assert.assertEquals(1, cart.getCartItems().size());
	}

	/**
	 * Test method for {@link com.sivasrinivas.billing.Cart#clearCart()}.
	 */
	@Test
	public void testClearCart() {
		cart.addItem(foodItem);
		cart.removeItem(medicalItem);
		cart.clearCart();
		Assert.assertEquals(0, cart.getCartItems().size());
	}

	/**
	 * Test method for {@link com.sivasrinivas.billing.Cart#getCartItems()}.
	 */
	@Test
	public void testGetCartItems() {
		cart.addItem(foodItem);
		List<Item> items = new ArrayList<Item>();
		items.add(foodItem);
		Assert.assertEquals(items, cart.getCartItems());
	}

	/**
	 * Test method for {@link com.sivasrinivas.billing.Cart#getCartSize()}.
	 */
	@Test
	public void testGetCartSize() {
		cart.addItem(foodItem);
		cart.addItem(medicalItem);
		Assert.assertEquals(2, cart.getCartItems().size());
	}

}
