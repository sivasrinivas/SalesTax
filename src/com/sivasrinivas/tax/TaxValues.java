/**
 * 
 */
package com.sivasrinivas.tax;

/**
 * @author Siva
 *
 */
public enum TaxValues {
	/**
	 * Tax values for different type of taxes
	 */
	SALESTAX(10),
	DUTYTAX(5);
	
	private int percentage;
	
	TaxValues(int percentage){
		this.percentage=percentage;
	}
	/**
	 * 
	 * @return - tax percentage
	 */
	public int getPercentage(){
		return this.percentage;
	}
}
