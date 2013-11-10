package com.sivasrinivas.item;

import com.sivasrinivas.item.BookItem;
import com.sivasrinivas.item.FoodItem;
import com.sivasrinivas.item.Item;
import com.sivasrinivas.item.MedicalItem;
import com.sivasrinivas.item.OtherItem;

/**
 * ItemFactory is static item factory class to create different items with  the specified values
 * It can be extended to create different items of the same category with different default values 
 * @author Siva
 *
 */
public class ItemFactory {
	/**
	 * BookItem factory method for creating book items
	 * @param name
	 * @param price
	 * @param quantity
	 * @param isImported
	 * @return
	 */
	public static BookItem createBookItem(String name, double price, int quantity, boolean isImported){
		return new BookItem(name, price, quantity, isImported);
	}
	/**
	 * FoodItem factory method for creating food items
	 * @param name
	 * @param price
	 * @param quantity
	 * @param isImported
	 * @return
	 */
	public static FoodItem createFoodItem(String name, double price, int quantity, boolean isImported){
		return new FoodItem(name, price, quantity, isImported);
	}
	/**
	 * MedicalItem factory method for creating medical items
	 * @param name
	 * @param price
	 * @param quantity
	 * @param isImported
	 * @return
	 */
	public static MedicalItem createMedicalItem(String name, double price, int quantity, boolean isImported){
		return new MedicalItem(name, price, quantity, isImported);
	}
	/**
	 * OtherItem factory method for creating other category items
	 * @param name
	 * @param price
	 * @param quantity
	 * @param isImported
	 * @return
	 */
	public static OtherItem createOtherItem(String name, double price, int quantity, boolean isImported){
		return new OtherItem(name, price, quantity, isImported);
	}
}
