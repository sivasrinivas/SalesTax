package com.sivasrinivas.shop;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.sivasrinivas.billing.Biller;
import com.sivasrinivas.billing.Receipt;
import com.sivasrinivas.item.Item;
import com.sivasrinivas.item.ItemFactory;

public class Store {
	
	private Scanner inputScanner = null;
	private Biller biller;
	public Store(){
		biller = new Biller();
	}
	
	
	public void readOrderFromConsole(){
		inputScanner = new Scanner(System.in);
		
		System.out.println("Enter item details: ");
		String input;
		
		input = inputScanner.nextLine();
		do{
			int quantity = Integer.parseInt(input.substring(0, input.indexOf(' ')));
			String name = input.substring(input.indexOf(' '), input.lastIndexOf("at"));
			double price = Double.parseDouble(input.substring(input.lastIndexOf(" "), input.length()));
			addItemToBilling(quantity, name, price);
			System.out.println("Do you want to add one more item : (Y/N)");
			input = inputScanner.nextLine();
		}while(input.equalsIgnoreCase("y"));
	}
	
	private void addItemToBilling(int quantity, String name, double price){
		if(name.contains("chocolates")){
			boolean isImported = name.contains("imported");
			Item food = ItemFactory.createFoodItem(name, price, quantity, isImported);
			biller.billItem(food);
		}else if(name.contains("book")){
			boolean isImported = name.contains("imported");
			Item book = ItemFactory.createBookItem(name, price, quantity, isImported);
			biller.billItem(book);
		}else if(name.contains("medical")||name.contains("pills")||name.contains("headache")){
			boolean isImported = name.contains("imported");
			Item medic = ItemFactory.createMedicalItem(name, price, quantity, isImported);
			biller.billItem(medic);
		}else{
			boolean isImported = name.contains("imported");
			Item other = ItemFactory.createOtherItem(name, price, quantity, isImported);
			biller.billItem(other);
		}
	}
	
	public void printReceipt(){
		Receipt receipt = biller.generateReceipt();
		receipt.printReceipt();
	}
	
	
	public void readOrderFromFile(){
		
	}

}
