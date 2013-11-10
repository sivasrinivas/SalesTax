/**
 * 
 */
package com.sivasrinivas.item;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.sivasrinivas.itemfact.FoodItemFactory;
import com.sivasrinivas.itemfact.MedicalItemFactory;

/**
 * @author Siva
 *
 */
public class MedicalItemTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test method for {@link com.sivasrinivas.item.MedicalItem#MedicalItem()}.
	 */
	@Test
	public void testMedicalItem() {
		Item medicine = new MedicalItem();
		Assert.assertEquals("", medicine.getName());
		Assert.assertEquals(0.0, medicine.getPrice(), 0.001);
		Assert.assertEquals(0, medicine.getQuantity());
		Assert.assertEquals(false, medicine.getTaxType().isImported());
	}

	/**
	 * Test method for {@link com.sivasrinivas.item.MedicalItem#MedicalItem(java.lang.String, double, int, boolean)}.
	 */
	@Test
	public void testMedicalItemStringDoubleIntBoolean() {
		Item medicine = new MedicalItem("pills", 9.75, 1, false);
		Assert.assertEquals("pills", medicine.getName());
		Assert.assertEquals(9.75, medicine.getPrice(), 0.001);
		Assert.assertEquals(1, medicine.getQuantity());
		Assert.assertEquals(false, medicine.getTaxType().isImported());
	}

	/**
	 * Test method for {@link com.sivasrinivas.item.MedicalItem#getItemFactory()}.
	 */
	@Test
	public void testGetItemFactory() {
		Item expected = new MedicalItemFactory().createItem("pills", 9.75, 1, false);
		Item actual = new MedicalItem().getItemFactory().createItem("pills", 9.75, 1, false);
		Assert.assertEquals(expected, actual);
	}
	
	/**
	 * Test method for {@link com.sivasrinivas.item.MedicalItem#getItemFactory()}.
	 */
	@Test
	public void testGetItemFactoryNegative() {
		Item expected = new FoodItemFactory().createItem("piils", 10.00, 1, false);
		Item actual = new FoodItem().getItemFactory().createItem("pills", 11.00, 1, false);
		Assert.assertNotEquals(expected, actual);
	}

}
