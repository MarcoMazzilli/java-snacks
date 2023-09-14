package org.java;

public class Snack3 {
	
	public static void main(String[] args) {
		
		int[] arrayNumbers = {0,1,0,1,0,1,0,1,0};
		int sum = 0;
		
		for (int i = 0; i < arrayNumbers.length; i++) {
			
			if(i % 2 == 1) {
				sum += arrayNumbers[i];
			}
			
		}
		
		System.out.println("Somma dei numeri ad indice dispari -> " + sum);
		
	}
	
}
