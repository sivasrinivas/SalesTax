/**
 * 
 */
package com.sivasrinivas.item;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.sivasrinivas.itemfact.BookItemFactory;

/**
 * @author Siva
 *
 */
public class BookItemTest {
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test method for {@link com.sivasrinivas.item.BookItem#BookItem()}.
	 */
	@Test
	public void testBookItem() {
		Item book = new BookItem();
		Assert.assertEquals("", book.getName());
		Assert.assertEquals(0.0, book.getPrice(), 0.001);
		Assert.assertEquals(0, book.getQuantity());
		Assert.assertEquals(false, book.getTaxType().isImported());
	}

	/**
	 * Test method for {@link com.sivasrinivas.item.BookItem#BookItem(java.lang.String, double, int, boolean)}.
	 */
	@Test
	public void testBookItemStringDoubleIntBoolean() {
		Item book = new BookItem("book", 12.49, 2, false);
		Assert.assertEquals("book", book.getName());
		Assert.assertEquals(12.49, book.getPrice(), 0.001);
		Assert.assertEquals(2, book.getQuantity());
		Assert.assertEquals(false, book.getTaxType().isImported());
	}

	/**
	 * Test method for {@link com.sivasrinivas.item.BookItem#getItemFactory()}.
	 */
	@Test
	public void testGetItemFactory() {
		Item expected = new BookItemFactory().createItem("book", 12.49, 1, false);
		Item actual = new BookItem().getItemFactory().createItem("book", 12.49, 1, false);
		Assert.assertEquals(expected, actual);
	}
	
	/**
	 * Test method for {@link com.sivasrinivas.item.BookItem#getItemFactory()}.
	 */
	@Test
	public void testGetItemFactoryNegative() {
		Item expected = new BookItemFactory().createItem("book", 12.49, 1, true);
		Item actual = new BookItem().getItemFactory().createItem("book", 12.49, 1, false);
		Assert.assertNotEquals(expected, actual);
	}

}
