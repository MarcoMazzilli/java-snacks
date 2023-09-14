package org.java;

import java.util.Scanner;

public class Snack9 {
	public static void main(String[] args) {
		
		//DATA
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		//DATA
		
		//LOGIC
		do {
			
			System.out.println("Inserisci un numero");
			System.out.println("Somma :" + sum);
			sum += sc.nextInt();
			
		}while(sum < 1000);
		//LOGIC
		
		//OUTPUT
		System.out.println("Somma Finale :" + sum);
		sc.close();
		//OUTPUT
	}
}
