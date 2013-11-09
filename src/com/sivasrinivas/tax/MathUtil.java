/**
 * 
 */
package com.sivasrinivas.tax;

import java.text.DecimalFormat;

/**
 * @author Siva
 *
 */
public class MathUtil {
	
	public static double roundoff(double value){
		value = Math.ceil(value*20)/20;
		return value;
	}
	
	public static double truncate(double value){
		String strValue = new DecimalFormat("0.00").format(value);
		return Double.parseDouble(strValue);
	}
}
