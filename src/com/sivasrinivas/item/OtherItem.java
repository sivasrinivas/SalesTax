package com.sivasrinivas.item;

public class OtherItem extends Item{

	public OtherItem(){
		super();
	}
	
	public OtherItem(String name, double price, int quantity, boolean isImported){
		super(name, price, quantity, false, isImported);
	}

}
