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
		if(length==0){
			printHelp();
			return;
		}
		if(args[0].equalsIgnoreCase("console")){
			store.readOrderFromConsole();
			store.printReceipt();
		}else if(args[0].equalsIgnoreCase("file")){
			if(length>1){
				store.readOrderFromFile(args[1]);
				store.printReceipt();
			}
			else{
				System.out.println("Please enter file path in arguments.\n");
				printHelp();
			}
				
		}else
			printHelp();
	}
	
	public static void printHelp(){
		StringBuilder sb = new StringBuilder();
		sb.append("****** SalesTax Application Help ******\n\n");
		sb.append("To run application use one of the following commands:\n");
		sb.append("1. java -jar SalesTax.jar console\n");
		sb.append("2. java - jar SalesTax file <file path>\n");
		sb.append("\nItem details should be entered in following format\n");
		sb.append("Imported product: <quantity> imported <name> at <price>\n");
		sb.append("Non-imported product: <quantity> <name> at <price>\n");
		sb.append("Ex: 1 imported box of chocolates at 10.00");
		System.out.println(sb.toString());
	}

}
