/**
 * 
 */

import com.sivasrinivas.shop.Store;

/**
 * @author Siva
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Store store = new Store();
		store.readOrderFromConsole();
		store.printReceipt();
	}

}
