/**
 * 
 */
package com.sivasrinivas.item;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.sivasrinivas.itemfact.BookItemFactory;
import com.sivasrinivas.itemfact.FoodItemFactory;

/**
 * @author Siva
 *
 */
public class FoodItemTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test method for {@link com.sivasrinivas.item.FoodItem#FoodItem()}.
	 */
	@Test
	public void testFoodItem() {
		Item food = new FoodItem();
		Assert.assertEquals("", food.getName());
		Assert.assertEquals(0.0, food.getPrice(), 0.001);
		Assert.assertEquals(0, food.getQuantity());
		Assert.assertEquals(false, food.getTaxType().isImported());
	}

	/**
	 * Test method for {@link com.sivasrinivas.item.FoodItem#FoodItem(java.lang.String, double, int, boolean)}.
	 */
	@Test
	public void testFoodItemStringDoubleIntBoolean() {
		Item food = new FoodItem("chocolate", 0.85, 2, false);
		Assert.assertEquals("chocolate", food.getName());
		Assert.assertEquals(0.85, food.getPrice(), 0.001);
		Assert.assertEquals(2, food.getQuantity());
		Assert.assertEquals(false, food.getTaxType().isImported());
	}

	/**
	 * Test method for {@link com.sivasrinivas.item.FoodItem#getItemFactory()}.
	 */
	@Test
	public void testGetItemFactory() {
		Item expected = new FoodItemFactory().createItem("cake", 12.49, 1, false);
		Item actual = new FoodItem().getItemFactory().createItem("cake", 12.49, 1, false);
		Assert.assertEquals(expected, actual);
	}
	
	/**
	 * Test method for {@link com.sivasrinivas.item.FoodItem#getItemFactory()}.
	 */
	@Test
	public void testGetItemFactoryNegative() {
		Item expected = new FoodItemFactory().createItem("cake", 12.49, 1, false);
		Item actual = new FoodItem().getItemFactory().createItem("pasta", 2.49, 1, false);
		Assert.assertNotEquals(expected, actual);
	}

}
