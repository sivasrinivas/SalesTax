package com.sivasrinivas.item;

public class OtherItem extends Item{

	public OtherItem(){
		super();
	}
	
	public OtherItem(String name, double price, int quantity, boolean isImported){
		super(name, price, quantity, false, isImported);
	}
	
	@Override
	public double getTax() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getTaxedPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

}
