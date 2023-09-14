package org.java;

import java.util.Scanner;

public class Snack1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci un numero :");
		int number = sc.nextInt();
		
		System.out.println(number % 2 == 0 
				? "Il numero inserito è pari -> " + number 
				: "Il numero inserito è dispari " + (number + 1));
		
		sc.close();
	}
	
}
