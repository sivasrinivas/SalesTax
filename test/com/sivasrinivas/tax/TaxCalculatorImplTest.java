/**
 * 
 */
package com.sivasrinivas.tax;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.sivasrinivas.item.FoodItem;
import com.sivasrinivas.item.Item;
import com.sivasrinivas.item.MedicalItem;
import com.sivasrinivas.item.OtherItem;

/**
 * @author Siva
 *
 */
public class TaxCalculatorImplTest {

	TaxCalculatorImpl calculator;
	Item foodItem;
	Item medicalItem;
	Item otherItem;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		calculator = new TaxCalculatorImpl();
		foodItem = new FoodItem("chocolate", 0.85, 2, false);
		medicalItem = new MedicalItem("piils", 10.85, 2, true);
		otherItem = new OtherItem("knife", 11.05, 1, true);
	}

	/**
	 * Test method for {@link com.sivasrinivas.tax.TaxCalculatorImpl#getTax(com.sivasrinivas.item.Item)}.
	 */
	@Test
	public void testGetTax() {
		Assert.assertEquals(0.0, calculator.getTax(foodItem), 0.001);
		Assert.assertEquals(1.10, calculator.getTax(medicalItem), 0.001);
		Assert.assertEquals(1.70, calculator.getTax(otherItem), 0.001);
	}

	/**
	 * Test method for {@link com.sivasrinivas.tax.TaxCalculatorImpl#calculateTax(java.util.List)}.
	 */
	@Test
	public void testCalculateTax() {
		List<Item> list = new ArrayList<Item>();
		list.add(foodItem);
		list.add(medicalItem);
		list.add(otherItem);
		Assert.assertEquals(2.80, calculator.calculateTax(list), 0.001);
	}

}
