package org.generation.italy.array;

public class CibiPreferiti {
	public static void main(String[] args) {
		
		String[] cibiPreferiti = {"Patate", "Tiramisù", "Pizza", "Sushi", "Ramen", "Cotoletta"};
		System.out.println("Numero di elementi della classifica: " + cibiPreferiti.length);
		int lunghezzaArray = cibiPreferiti.length;
		
		System.out.println("Il mio cibo preferito in assoluto: " + cibiPreferiti[0]);
		System.out.println("il mio cibo preferito ma non troppo: " + cibiPreferiti[lunghezzaArray-1]);
		System.out.println("il mio cibo preferito nè in assoluto nè che disdegno: " + cibiPreferiti[lunghezzaArray/2]);
			
	}
	

}
