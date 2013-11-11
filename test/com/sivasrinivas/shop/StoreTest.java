/**
 * 
 */
package com.sivasrinivas.shop;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.sivasrinivas.billing.Receipt;

/**
 * @author Siva
 *
 */
public class StoreTest {
	Store store;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		store = new Store();
	}

	/**
	 * Test case for general order.
	 */
	@Test
	public void testGenearlOrder() {
		store.parseAndAddToBilling("1 imported bottle of perfume at 27.99");
		store.parseAndAddToBilling("1 bottle of perfume at 18.99");
		store.parseAndAddToBilling("1 packet of headache pills at 9.75");
		store.parseAndAddToBilling("1 imported box of chocolates at 11.25");
		Assert.assertNotEquals(0, store.getBiller().getOrder().size());
		Receipt r = store.getReceipt();
		Assert.assertEquals(4, r.getItemList().size());
		Assert.assertEquals(6.70, r.getTotalTax(), 0.001);
		Assert.assertEquals(74.68, r.getTotalAmount(), 0.001);
	}
	
	/**
	 * Test case for non taxable items order
	 */
	@Test
	public void testNonTaxableOrder() {
		store.parseAndAddToBilling("1 packet of headache pills at 9.75");
		store.parseAndAddToBilling("1 imported box of chocolates at 11.25");
		Assert.assertNotEquals(0, store.getBiller().getOrder().size());
		Receipt r = store.getReceipt();
		Assert.assertEquals(2, r.getItemList().size());
		Assert.assertEquals(0.6, r.getTotalTax(), 0.001);
		Assert.assertEquals(21.6, r.getTotalAmount(), 0.001);
	}
	
	/**
	 * Test case for taxable items order.
	 */
	@Test
	public void testTaxableOrder() {
		store.parseAndAddToBilling("1 music CD at 14.99");
		store.parseAndAddToBilling("1 imported bottle of perfume at 47.50");
		Assert.assertNotEquals(0, store.getBiller().getOrder().size());
		Receipt r = store.getReceipt();
		Assert.assertEquals(2, r.getItemList().size());
		Assert.assertEquals(8.65, r.getTotalTax(), 0.001);
		Assert.assertEquals(71.14, r.getTotalAmount(), 0.001);
	}
	
	/**
	 * Test case for non taxable imported order.
	 */
	@Test
	public void testNonTaxableImprtedOrder() {
		store.parseAndAddToBilling("1 imported packet of headache pills at 9.75");
		store.parseAndAddToBilling("1 imported book at 12.49");
		Assert.assertNotEquals(0, store.getBiller().getOrder().size());
		Receipt r = store.getReceipt();
		Assert.assertEquals(2, r.getItemList().size());
		Assert.assertEquals(1.15, r.getTotalTax(), 0.001);
		Assert.assertEquals(23.39, r.getTotalAmount(), 0.001);
	}
	
	/**
	 * Test case Taxable Imported Order
	 */
	@Test
	public void testTaxableImportedOrder() {
		store.parseAndAddToBilling("1 imported music CD at 14.99");
		store.parseAndAddToBilling("1 imported bottle of perfume at 47.50");
		Assert.assertNotEquals(0, store.getBiller().getOrder().size());
		Receipt r = store.getReceipt();
		Assert.assertEquals(2, r.getItemList().size());
		Assert.assertEquals(9.40, r.getTotalTax(), 0.001);
		Assert.assertEquals(71.89, r.getTotalAmount(), 0.001);
	}
	
	/**
	 * Test case for testing item taxed price.
	 */
	@Test
	public void testItemTaxedPrice() {
		store.parseAndAddToBilling("1 music CD at 14.99");
		store.parseAndAddToBilling("1 book at 12.49");
		store.parseAndAddToBilling("1 imported book at 12.49");
		Assert.assertNotEquals(0, store.getBiller().getOrder().size());
		Receipt r = store.getReceipt();
		Assert.assertEquals(16.49, r.getItemList().get(0).getTaxedPrice(), 0.001);
		Assert.assertEquals(12.49, r.getItemList().get(1).getTaxedPrice(), 0.001);
		Assert.assertEquals(13.14, r.getItemList().get(2).getTaxedPrice(), 0.001);
	}
	
	/**
	 * Test method for {@link com.sivasrinivas.shop.Store#clearOrder()}.
	 */
	@Test
	public void testClearOrder() {
		store.parseAndAddToBilling("1 imported bottle of perfume at 27.99");
		store.clearOrder();
		Receipt receipt = store.getReceipt();
		Assert.assertEquals(0.0, receipt.getTotalAmount(), 0.001);
	}

}
