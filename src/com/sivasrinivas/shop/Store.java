package com.sivasrinivas.shop;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.sivasrinivas.billing.Biller;
import com.sivasrinivas.item.Item;
import com.sivasrinivas.item.ItemFactory;

public class Store {
	
	private Scanner inputScanner = null;
	private Biller biller;
	public Store(){
		biller = new Biller();
	}
	
	public void init(){
		System.out.println("****** Sales Tax Application******");
		System.out.println("How do you want to read order? \n 1. From console, enter 'C' \n 2. From input file, enter 'F'");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
			try {
					String line = br.readLine();
					if(line.equalsIgnoreCase("C")){
						System.out.println("Sample item input: ");
						System.out.println("1 imported box of chocolates at 10.00");
						inputScanner = new Scanner(System.in);
					}else if(line.equalsIgnoreCase("F")){
						System.out.println("Enter file path: ");
						line = br.readLine();
						inputScanner = new Scanner(new File(line));
						
					}else{
						System.out.println("Wrong input. Exiting!");
					}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
	}
	
	public void readOrderFromConsole(){
		System.out.println("Enter item details: ");
		inputScanner = new Scanner(System.in);
		String input;
		input = inputScanner.nextLine();
		while(input!=null){
			int quantity = Integer.parseInt(input.substring(0, input.indexOf(' ')));
			String name = input.substring(input.indexOf(' '), input.lastIndexOf("at"));
			double price = Double.parseDouble(input.substring(input.lastIndexOf(" "), input.length()));
			addItemToBilling(quantity, name, price);
			input = inputScanner.nextLine();
		}
		
	}
	
	private void addItemToBilling(int quantity, String name, double price){
		if(name.contains("chocolates")){
			boolean isImported = name.contains("imported");
			Item book = ItemFactory.creatBookItem(name, price, quantity, isImported);
			biller.billItem(book);
			System.out.println(book.toString());
		}
	}
	
	public void readOrderFromFile(){
		
	}
	
	public void printReceipt(){
		
	}
}
