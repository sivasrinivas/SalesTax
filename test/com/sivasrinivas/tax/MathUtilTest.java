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
public class MathUtilTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test method for {@link com.sivasrinivas.tax.MathUtil#roundoff(double)}.
	 */
	@Test
	public void testRoundoff() {
		Assert.assertEquals(1.25, MathUtil.roundoff(1.2345), 0.001);
	}

	/**
	 * Test method for {@link com.sivasrinivas.tax.MathUtil#truncate(double)}.
	 */
	@Test
	public void testTruncate() {
		Assert.assertEquals(1.23, MathUtil.truncate(1.2345), 0.001);
	}

	/**
	 * Test method for {@link com.sivasrinivas.tax.MathUtil#add(double, double)}.
	 */
	@Test
	public void testAdd() {
		Assert.assertEquals(3.58, MathUtil.add(1.2345, 2.3456), 0.001);
	}

	/**
	 * Test method for {@link com.sivasrinivas.tax.MathUtil#subtract(double, double)}.
	 */
	@Test
	public void testSubtract() {
		Assert.assertEquals(1.11, MathUtil.subtract(2.3456, 1.2345), 0.001);
	}

}
