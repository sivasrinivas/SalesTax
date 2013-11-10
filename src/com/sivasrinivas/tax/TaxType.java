/**
 * 
 */
package com.sivasrinivas.tax;

/**
 * This is Tax Type class, which is contained by each item object. 
 * @author Siva
 *
 */
public class TaxType {
	/**
	 * check whether tax exemption is applicable for the item
	 */
	private boolean isExempted;
	/**
	 * check whether imported tax applicable for the item
	 */
	private boolean isImported;
	/**
	 * default constructor for instantiating tax type object, which set isExempted, isImported to false
	 */
	public TaxType(){
		this.isExempted=false;
		this.isImported=false;
	}
	/**
	 * Parameterized constructor for instantiating tax type object
	 * @param isExempted
	 * @param isImported
	 */
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

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (isExempted ? 1231 : 1237);
		result = prime * result + (isImported ? 1231 : 1237);
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		TaxType other = (TaxType) obj;
		if (isExempted != other.isExempted) {
			return false;
		}
		if (isImported != other.isImported) {
			return false;
		}
		return true;
	}
	
	

}
