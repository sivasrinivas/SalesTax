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
public class ReceiptTest {

	Biller biller;
	Item otherItem;
	Item medicalItem;
	Receipt receipt;
	
		
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		biller = new Biller();
		otherItem = new OtherItem("Bootle of perfume", 27.99, 1, true);
		medicalItem = new MedicalItem("Packet of headache pills", 9.75, 2, false);
		biller.billItem(otherItem);
		biller.billItem(medicalItem);
		receipt = biller.generateReceipt();
	}

	/**
	 * Test method for {@link com.sivasrinivas.billing.Receipt#getItemList()}.
	 */
	@Test
	public void testGetItemList() {
		List<Item> items = new ArrayList<Item>();
		items.add(otherItem);
		items.add(medicalItem);
		Assert.assertEquals(items, receipt.getItemList());
	}

	/**
	 * Test method for {@link com.sivasrinivas.billing.Receipt#getTotalAmount()}.
	 */
	@Test
	public void testGetTotalAmount() {
		assertEquals(51.69, receipt.getTotalAmount(),0.001);
	}

	/**
	 * Test method for {@link com.sivasrinivas.billing.Receipt#getTotalTax()}.
	 */
	@Test
	public void testGetTotalTax() {
		assertEquals(4.20, receipt.getTotalTax(),0.001);
	}

}
