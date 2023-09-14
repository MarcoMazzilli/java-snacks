package org.java;

import java.util.Scanner;

public class Snack4 {

	public static void main(String[] args) {
		
		// Input
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci una parola per verificare se è palindroma [es. anna]");
		String userInput = sc.nextLine();
		
		sc.close();
		// /Input
		
		//Data
		char[] arrayUserInput = userInput.toCharArray();
		char[] arrayReverseInput = new char [userInput.length()];
		// /Data

		//Logic
		for (int i = 0; i < arrayUserInput.length; i++) {
			arrayReverseInput[i] = arrayUserInput[arrayUserInput.length - 1 - i];
		}
		
		String reversedString = new String(arrayReverseInput);
		// /Logic
		
		//Output
		System.out.println( 
				userInput.equals(reversedString) 
				? "Palindroma"
				: "Non palindroma"
			);
		// /Output
		
	}
}
