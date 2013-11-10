/**
 * 
 */
package com.sivasrinivas.tax;

import java.util.Collection;
import java.util.List;

import com.sivasrinivas.item.Item;

/**
 * @author Siva
 *
 */
public class TaxCalculatorImpl implements TaxCalculator{

	/**
	 * {@inheritDoc TaxCalculator}
	 */
	@Override
	public double getTax(Item item) {
		TaxType taxType = item.getTaxType();
		double tax = 0.0;
		if(!taxType.isExempted()){
			double itemPrice = item.getPrice()*item.getQuantity();
			int taxPerc = TaxValues.SALESTAX.getPercentage();
			tax+=(itemPrice*taxPerc)/100;
		}
		if(taxType.isImported()){
			double itemPrice = item.getPrice()*item.getQuantity();
			int taxPerc = TaxValues.DUTYTAX.getPercentage();
			tax+=(itemPrice*taxPerc)/100;
		}
		tax = MathUtil.roundoff(tax);
		tax = MathUtil.truncate(tax);
		return tax;
	}

	@Override
	public double calculateTax(List<Item> list) {
		double totalTax = 0.0;
		for(Item item : list){
			totalTax+=getTax(item);
		}
		totalTax = MathUtil.truncate(totalTax);
		return totalTax;
	}

}
