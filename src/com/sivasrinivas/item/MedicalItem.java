package com.sivasrinivas.item;
/**
 * 
 * @author Siva
 */

public class MedicalItem extends Item{
	
	public MedicalItem(){
		
	}
	
	public MedicalItem(String name, double price, int quantity, boolean isImported){
		super(name, price, quantity, true, isImported);
	}
}
