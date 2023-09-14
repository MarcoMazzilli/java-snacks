package org.java;

import java.util.Random;

public class Snack8 {

	public static void main(String[] args) {
		
		//DATA
		Random rand = new Random();
		
		int minimo = 0;
		int massimo = 0;
		int somma = 0;
		
		int[] arrayNumber = new int[10];
		//DATA
		
		//LOGIC
		for (int i = 0; i < arrayNumber.length; i++) {
			arrayNumber[i] = rand.nextInt(100,151);
			}
		
		minimo = arrayNumber[0];
		
		for (int i = 0; i < arrayNumber.length; i++) {
			
			System.out.println(arrayNumber[i]);
			
			if (arrayNumber[i] < minimo ) {
				minimo = arrayNumber[i];
			}
			
			if (arrayNumber[i] > massimo ) {
				massimo = arrayNumber[i];
			}
			
			somma += arrayNumber[i] ;
		}
		//LOGIC
		
		//OUTPUT
		System.out.println("min: "+minimo);
		System.out.println("max: "+massimo);
		System.out.println("somma: "+somma);
		//OUTPUT

	}
	
}
