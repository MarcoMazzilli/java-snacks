package org.java;

import java.util.Random;

public class Snack2 {
	
	public static void main(String[] args) {
		Random rnd = new Random();
		
		String[] arrayNomi = {"Alessio","Marco","Giovanni","Michele"};
		String[] arrayCognomi = {"Binetto","Muraglia","De Ughi","Rossi"};
		
		for (int i = 0; i < arrayNomi.length; i++) {
			

			System.out.println( arrayNomi[i] + " " + arrayCognomi[rnd.nextInt(0,arrayNomi.length)] );
		}
	}
	
}
