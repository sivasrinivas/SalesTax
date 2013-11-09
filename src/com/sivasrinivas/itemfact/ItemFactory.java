package com.sivasrinivas.itemfact;

import com.sivasrinivas.item.BookItem;
import com.sivasrinivas.item.Item;

public class ItemFactory {
	public static BookItem creatBookItem(String name, double price, int quantity, boolean isImported){
		return new BookItem(name, price, quantity, isImported);
	}
}
