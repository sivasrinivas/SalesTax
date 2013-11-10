/**
 * 
 */
package com.sivasrinivas.tax;

import java.text.DecimalFormat;

/**
 * Utility functions for doing calculations with double values
 * @author Siva
 *
 */
public class MathUtil {
	/**
	 * Roundoff the given value to nearest 0.05
	 * @param value
	 * @return
	 */
	public static double roundoff(double value){
		value = Math.ceil(value*20)/20;
		return value;
	}
	/**
	 * Truncates the given value to two decimal places 
	 * @param value
	 * @return
	 */
	public static double truncate(double value){
		String strValue = new DecimalFormat("0.00").format(value);
		return Double.parseDouble(strValue);
	}
	/**
	 * adds value1 and value2 and them truncate result to two decimal places
	 * @param value1
	 * @param value2
	 * @return
	 */
	public static double add(double value1, double value2){
		double value = value1+value2;
		value = truncate(value);
		return value;
	}
	/**
	 * subtracts value1 and value2 and them truncate result to two decimal places
	 * @param value1
	 * @param value2
	 * @return
	 */
	public static double subtract(double value1, double value2){
		double value = value1 - value2;
		value = truncate(value);
		return value;
	}
}
