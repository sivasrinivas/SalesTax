package com.sivasrinivas.shop;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.sivasrinivas.billing.Biller;
import com.sivasrinivas.billing.Receipt;
import com.sivasrinivas.item.Item;
/**
 * Store class for dealing with shopping store. Store class reads input order, bills it and generates receipt for the order. 
 * @author Siva
 *
 */
public class Store {
	/** reader - reader reads items from console or a file */
	private BufferedReader reader = null;
	/** biller - biller to adds items to cart, bill the items and generate receipt */
	private Biller biller;
	
	private Inventory invetory;
	
	public Store(){
		biller = new Biller();
		invetory = new Inventory();
	}
	
	/**
	 * Reads order from console line by line and parse each line to fetch quantity, name and unit price of the item
	 */
	public void readOrderFromConsole(){
		System.out.println("Item details should be entered in following format");
		System.out.println("Imported product: <quantity> imported <name> at <price>");
		System.out.println("Non-imported product: <quantity> <name> at <price>");
		System.out.println("Ex: 1 imported box of chocolates at 10.00 \n");
		
		reader = new BufferedReader(new InputStreamReader(System.in));
		String input;
		
		try {
			
			do{
				System.out.println("Enter item details: ");
				input = reader.readLine();
				parseAndAddToBilling(input);
				System.out.println("Do you want to add one more item : (Y/N)");
				input = reader.readLine();
			}while(input!=null && !input.equalsIgnoreCase("n"));
			
			reader.close();
			
		} catch (IOException e) {
			System.out.println("An error occured. Unable to read input from console.");
				try {
					if(reader!=null)
					reader.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			e.printStackTrace();
		}
		
	}
	
	/**
	 * Reads order from specified file path line by line and parse each line to fetch quantity, name and unit price of the item
	 * @param filePath
	 */
	public void readOrderFromFile(String filePath){

			try {
				reader = new BufferedReader(new FileReader(new File(filePath)));
				String input;
				
				input = reader.readLine();
				while(input!=null){
					parseAndAddToBilling(input);
					input = reader.readLine();
				}
				reader.close();
			}catch(FileNotFoundException fne){
				System.out.println("Specified file path not found.");
			}
			catch (IOException e) {
				System.out.println("An error occured. Unable to read input from input file.");
				try {
					if(reader!=null)
					reader.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				e.printStackTrace();
			}
			
	}
	
	private void parseAndAddToBilling(String input){
		try{
			int quantity = Integer.parseInt(input.substring(0, input.indexOf(' ')));
			String name = input.substring(input.indexOf(' '), input.lastIndexOf("at"));
			double price = Double.parseDouble(input.substring(input.lastIndexOf(" "), input.length()));
			boolean isImported = name.contains("imported");
			addItemToBilling(quantity, name, price, isImported);
		}catch(NumberFormatException nfe){
			System.out.println("Wrong input formt : "+input);
			System.out.println("Quanity should be an integer and Price should be double.");
		}catch(Exception e){
			System.out.println("Wrong input formt : "+input);
			System.out.println("Item details should be entered in following format");
			System.out.println("Imported product: <quantity> imported <name> at <price>");
			System.out.println("Non-imported product: <quantity> <name> at <price>");
			System.out.println("Ex: 1 imported box of chocolates at 10.00 \n");
		}
		
	}
	
	/**
	 * adds each item to biller, which in turn adds to shopping cart
	 * @param quantity
	 * @param name
	 * @param price
	 */
	private void addItemToBilling(int quantity, String name, double price, boolean isImported){
		Item item = invetory.searchAndRetrieveItem(name, price, quantity, isImported);
		biller.billItem(item);
		
	}
	/**
	 * generates receipt for the items in the cart and returns it
	 * @return receipt
	 */
	public Receipt getReceipt(){
		if(biller.getOrder().size()==0){
			System.out.println("No items in shopping cart.");
		}
		Receipt receipt = biller.generateReceipt();
		return receipt;
	}
	/**
	 * Prints order receipts
	 */
	public void printReceipt(){
		if(biller.getOrder().size()==0){
			System.out.println("No items in shopping cart.");
			return;
		}
		Receipt receipt = biller.generateReceipt();
		receipt.printReceipt();
	}
	/**
	 * Clears items in biller, which in turn clears shopping cart
	 */
	public void clearOrder(){
		biller.clearOrder();
	}
	/**
	 * @return the biller
	 */
	public Biller getBiller() {
		return biller;
	}
	
}
