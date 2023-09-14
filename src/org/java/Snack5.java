package org.java;

import java.util.Scanner;

public class Snack5 {
	
	public static void main(String[] args) {
		
		String userInput = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci una stringa : ");
		
		do {
			
			//Input
			
			
			userInput = sc.nextLine();
			System.out.println("userInput: " + userInput);
			
			// /Input
			
			// Data
			char[] arrayInput = userInput.toCharArray();
			int numbers = 0;
			int letters = 0;
			int specialChar = 0;
			// /Data
			
			//Logic
				
				for (int i = 0; i < userInput.length(); i++) {
					
					if(Character.isDigit(arrayInput[i])){
						
						numbers++;
						
					}else if(Character.isAlphabetic(arrayInput[i])){
						
						letters++;
						
					}else {
						specialChar++;
					}
				}
					
			// /Logic
			
			//Output
			System.out.println("Numeri : " + numbers);
			System.out.println("Lettrere : " + letters);
			System.out.println("Caratteri speciali : " + specialChar);
			// /Output
			
			
		} while (!userInput.equals("0"));
		
		System.out.println("Ho finito : " + userInput.equals("0"));
		sc.close();
	 }
	}
