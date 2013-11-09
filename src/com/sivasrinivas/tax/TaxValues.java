/**
 * 
 */
package com.sivasrinivas.tax;

/**
 * @author Siva
 *
 */
public enum TaxValues {
	SALESTAX(10),
	DUTYTAX(5);
	
	private int percentage;
	
	TaxValues(int percentage){
		this.percentage=percentage;
	}
	
	public int getPercentage(){
		return this.percentage;
	}
}
