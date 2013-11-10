/**
 * 
 */
package com.sivasrinivas.shop;

import java.util.HashMap;

import com.sivasrinivas.item.BookItem;
import com.sivasrinivas.item.FoodItem;
import com.sivasrinivas.item.Item;
import com.sivasrinivas.item.MedicalItem;
import com.sivasrinivas.item.OtherItem;
import com.sivasrinivas.itemfact.ItemFactory;

/**
 * @author Siva
 *
 */
public class Inventory {

	  private HashMap<String, Item> inventory;
      
      
      /**
       * Instantiates a new store shelf with the product items.
       */
      public Inventory() {
    	  
    	  	inventory  = new HashMap<String, Item>();
			addItemToInventory("book", new BookItem());
			addItemToInventory("food", new FoodItem());
			addItemToInventory("other", new OtherItem());
			addItemToInventory("medical", new MedicalItem());
      }
      
      /**
       * Adds the product items to store shelf in their respective categories.
       *
       * @param productItem - the product item
       * @param productCategory - the product category to which a particular item belongs.
       */
      public void addItemToInventory(String itemName, Item item)
      {
              inventory.put(itemName, item);
              
      }
      
      /**
       * Searches for the item using the string name and maps it to the product category to create a new Product object.
       *
       * @param name - name of the product
       * @param price - price of product
       * @param imported - boolean value of whether imported or not
       * @param quantity - quantity of product
       * @return Product
       */
      public Item searchAndRetrieveItem(String name, double price, int quantity, boolean isImported)
      {	
    	  String key = getKeyWord(name);
    	  Item category = inventory.get(key);
    	  ItemFactory itemFactory = category.getItemFactory();
    	  Item item = itemFactory.createItem(name, price, quantity, isImported);
          return item;
      }
      
      public String getKeyWord(String name){
    	  String key = "";
    	  if(name.contains("book")){
    		  key="book";
    	  }else if(name.contains("chocolate") || name.contains("food")){
    		  key="food";
    	  }else if(name.contains("headache")|| name.contains("pills") || name.contains("medical")){
    		  key="medical";
    	  }else if(name.contains("perfume")||name.contains("music") || name.contains("CD")){
    		  key="other";
    	  }
    	  return key;
      }
      
      /**
       * gets the total number of items present in shelf.
       * 
       * @return int
       */
      public int getShelfSize()
      {
              return inventory.size();
      }

}
