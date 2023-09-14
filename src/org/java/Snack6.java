package org.java;

import java.util.Scanner;

public class Snack6 {

	public static void main(String[] args) {
		
		//Input
		System.out.println("Inserisci un numero");							
		
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		sc.close();
		// /Input
		
		
		System.out.println("Numero inserito : " + inputString);
		
//		---------------
		
		int inputInt = Integer.valueOf(inputString) ;
		
		System.out.println("TypeOff del numero convertito : " + ((Object)inputInt).getClass().getSimpleName());
	}
	
}
