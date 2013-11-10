/**
 * 
 */
package com.sivasrinivas.tax;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Siva
 *
 */
public class TaxTypeTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test method for {@link com.sivasrinivas.tax.TaxType#TaxType()}.
	 */
	@Test
	public void testTaxType() {
		TaxType actual = new TaxType();
		actual.setExempted(true);
		Assert.assertTrue(actual.isExempted());
		Assert.assertFalse(actual.isImported());
	}
	
	/**
	 * Test method for {@link com.sivasrinivas.tax.TaxType#TaxType()}.
	 */
	@Test
	public void testTaxTypeNegative() {
		TaxType actual = new TaxType();
		Assert.assertFalse(actual.isExempted());
		Assert.assertFalse(actual.isImported());
	}

	/**
	 * Test method for {@link com.sivasrinivas.tax.TaxType#TaxType(boolean, boolean)}.
	 */
	@Test
	public void testTaxTypeBooleanBoolean() {
		TaxType actual = new TaxType(true, true);
		Assert.assertTrue(actual.isExempted());
		Assert.assertTrue(actual.isImported());
	}

}
