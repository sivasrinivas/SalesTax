/**
 * 
 */
package com.sivasrinivas.tax;

/**
 * @author Siva
 *
 */
public class TaxType {
	
	private boolean isExempted;
	private boolean isImported;
	
	public TaxType(){
		this.isExempted=false;
		this.isImported=false;
	}
	
	public TaxType(boolean isExempted, boolean isImported){
		this.isExempted=isExempted;
		this.isImported=isImported;
	}
	
	public boolean isExempted() {
		return isExempted;
	}
	public void setExempted(boolean isExempted) {
		this.isExempted = isExempted;
	}
	public boolean isImported() {
		return isImported;
	}
	public void setImported(boolean isImported) {
		this.isImported = isImported;
	}
	
	

}
