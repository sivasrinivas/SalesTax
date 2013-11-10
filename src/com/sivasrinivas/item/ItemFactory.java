package com.sivasrinivas.item;

import com.sivasrinivas.item.BookItem;
import com.sivasrinivas.item.FoodItem;
import com.sivasrinivas.item.Item;
import com.sivasrinivas.item.MedicalItem;
import com.sivasrinivas.item.OtherItem;

public class ItemFactory {
	public static BookItem createBookItem(String name, double price, int quantity, boolean isImported){
		return new BookItem(name, price, quantity, isImported);
	}
	
	public static FoodItem createFoodItem(String name, double price, int quantity, boolean isImported){
		return new FoodItem(name, price, quantity, isImported);
	}
	
	public static MedicalItem createMedicalItem(String name, double price, int quantity, boolean isImported){
		return new MedicalItem(name, price, quantity, isImported);
	}
	
	public static OtherItem createOtherItem(String name, double price, int quantity, boolean isImported){
		return new OtherItem(name, price, quantity, isImported);
	}
}
