/**
 * 
 */

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

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
		int length = args.length;
		if(args[0].equalsIgnoreCase("console")){
			store.readOrderFromConsole();
			store.printReceipt();
		}else if(args[0].equalsIgnoreCase("file")){
			if(length>1){
				store.readOrderFromFile(args[1]);
				store.printReceipt();
			}
			else{
				System.err.println("Invalid arguments.\n");
				printHelp();
			}
				
		}else
			printHelp();
	}
	
	public static void printHelp(){
		StringBuilder sb = new StringBuilder();
		sb.append("****** SalesTax Application Help ******\n\n");
		sb.append("To run application use one of the following commands:\n");
		sb.append("1. SalesTax console\n");
		sb.append("2. SalesTax file <file path>\n");
		sb.append("\nItem details should be entered in following format\n");
		sb.append("Quantity Item Name at Price \n");
		sb.append("Ex: 1 imported box of chocolates at 10.00");
		System.out.println(sb.toString());
	}

}
