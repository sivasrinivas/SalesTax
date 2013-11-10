package com.sivasrinivas.billing;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.sivasrinivas.item.Item;
import com.sivasrinivas.item.MedicalItem;
import com.sivasrinivas.item.OtherItem;
/**
 * Juni test cases for Biller class - {@link com.sivasrinivas.billing.Biller}} 
 * @author Siva
 *
 */
public class BillerTest {

	Biller biller;
	Item otherItem;
	Item medicalItem;
	
	/**
	 * Tests setup
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		biller = new Biller();
		otherItem = new OtherItem("Bootle of perfume", 27.99, 1, true);
		medicalItem = new MedicalItem("Packet of headache pills", 9.75, 2, false);
	}
	/**
	 * Test method for {@link com.sivasrinivas.billing.Biller#billItem(Item)}.
	 */
	@Test
	public void testBillItem() {
		biller.billItem(medicalItem);
		List<Item> itemList = biller.getOrder();
		Assert.assertTrue(itemList.iterator().next().equals(medicalItem));
	}
	/**
	 * Test method for {@link com.sivasrinivas.billing.Biller#generateReceipt()}.
	 */
	@Test
	public void testGenerateReceipt() {
		biller.billItem(medicalItem);
		biller.billItem(otherItem);
		
		Receipt r = biller.generateReceipt();
		Assert.assertEquals(2, r.getItemList().size());
		Assert.assertEquals(51.69, r.getTotalAmount(), 0.0009);
		Assert.assertEquals(4.20, r.getTotalTax(), 0.0009);
	}
	/**
	 * Test method for {@link com.sivasrinivas.billing.Biller#getTotalTax()}.
	 */
	@Test
	public void testGetTotalTax() {
		biller.billItem(medicalItem);
		biller.billItem(otherItem);
		
		Assert.assertEquals(4.20, biller.getTotalTax(), 0.0009);
	}
	/**
	 * Test method for {@link com.sivasrinivas.billing.Biller#getItemTax(Item)}.
	 */
	@Test
	public void testGetItemTax() {
		Assert.assertEquals(0.0, biller.getItemTax(medicalItem), 0.0009);
	}
	/**
	 * Test method for {@link com.sivasrinivas.billing.Biller#clearOrder()}.
	 */
	@Test
	public void testClearOrder() {
		biller.billItem(medicalItem);
		biller.billItem(otherItem);
		biller.clearOrder();
		Assert.assertEquals(0, biller.getOrder().size());
	}
	/**
	 * Test method for {@link com.sivasrinivas.billing.Biller#getOrder()}.
	 */
	@Test
	public void testGetOrder() {
		biller.billItem(medicalItem);
		biller.billItem(otherItem);
		Assert.assertEquals(2, biller.getOrder().size());
	}

}
