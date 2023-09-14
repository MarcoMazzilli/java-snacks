package org.java;

import java.util.Scanner;

public class Snack7 {

	public static void main(String[] args) {
		//Input
		System.out.println("Inserisci i secondi: ");
		Scanner sc = new Scanner(System.in);
		int totSecondi = sc.nextInt();
		sc.close();
		// /Input
		
		int hh = totSecondi/3600; // 3600 rappresenta i secondi presenti in un H./ Otteniamo cosi le ore presenti in totale.
		
		int mm = (totSecondi % 3600) / 60; //Calcoliamo il resto di questa operazione per ottenere i secondi mancanti
		
		int ss = (totSecondi % 3600) % 60; //Calcolando il resto con %60 posso calcolare i secondi
		
		String fullDate = 
				String.format("%02d", hh) + ":" 
				+ String.format("%02d", mm) + ":" 
				+ String.format("%02d", ss);
		
		System.out.println("Tot. Secondi = " + totSecondi);
		System.out.println("Stringa formattata = " + fullDate);

	}
	
}
