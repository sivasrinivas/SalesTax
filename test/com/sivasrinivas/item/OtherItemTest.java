/**
 * 
 */
package com.sivasrinivas.item;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.sivasrinivas.itemfact.MedicalItemFactory;
import com.sivasrinivas.itemfact.OtherItemFactory;

/**
 * @author Siva
 *
 */
public class OtherItemTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test method for {@link com.sivasrinivas.item.OtherItem#OtherItem()}.
	 */
	@Test
	public void testOtherItem() {
		Item other = new OtherItem();
		Assert.assertEquals("", other.getName());
		Assert.assertEquals(0.0, other.getPrice(), 0.001);
		Assert.assertEquals(0, other.getQuantity());
	}

	/**
	 * Test method for {@link com.sivasrinivas.item.OtherItem#OtherItem(java.lang.String, double, int, boolean)}.
	 */
	@Test
	public void testOtherItemStringDoubleIntBoolean() {
		Item other = new OtherItem("music cd", 9.75, 1, false);
		Assert.assertEquals("music cd", other.getName());
		Assert.assertEquals(9.75, other.getPrice(), 0.001);
		Assert.assertEquals(1, other.getQuantity());
		Assert.assertEquals(false, other.getTaxType().isImported());
	}

	/**
	 * Test method for {@link com.sivasrinivas.item.OtherItem#getItemFactory()}.
	 */
	@Test
	public void testGetItemFactory() {
		Item expected = new OtherItemFactory().createItem("perfume", 19.75, 1, true);
		Item actual = new OtherItem().getItemFactory().createItem("perfume", 19.75, 1, true);
		Assert.assertEquals(expected, actual);
	}

	/**
	 * Test method for {@link com.sivasrinivas.item.OtherItem#getItemFactory()}.
	 */
	@Test
	public void testGetItemFactoryNegative() {
		Item expected = new OtherItemFactory().createItem("perfume", 19.75, 1, false);
		Item actual = new OtherItem().getItemFactory().createItem("shirt", 39.75, 2, false);
		Assert.assertNotEquals(expected, actual);
	}
}
