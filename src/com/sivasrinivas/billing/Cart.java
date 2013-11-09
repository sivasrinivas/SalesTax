package com.sivasrinivas.shop;

import java.util.ArrayList;
import java.util.List;

import com.sivasrinivas.item.Item;

public class Cart {
	private List<Item> itemList;
	
	public Cart(){
		itemList = new ArrayList<Item>();
	}
	
	public void addItem(Item item){
		itemList.add(item);
	}
	
	public void removeItem(Item item){
		itemList.remove(item);
	}
	
	public void clearCart(){
		itemList.clear();
	}
	
	public List<Item> getCartItems(){
		return itemList;
	}
	
	public int getCartSize(){
		return itemList.size();
	}
}
