package com.comtrade.recapitulation;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
	public static void main(String[] args) {
		
		List<Integer> fibonacci = generateFibonacci(0);
		
		for (Integer integer : fibonacci) {
			System.out.println(integer);
		}
		
	//	printUntil(5);

	}
	
//	public static void printUntil (int boundary) {
//		System.out.println(boundary);
//		if (boundary < 1) {
//			return;
//		}
//		printUntil(boundary-1);
//	}
	
	/**
	 * Za prosledjeni broj vraca Fibonacijev niz
	 * do tog mesta. Primer Fibonacijevog niza : 1 1 2 3 5 8 13 21 34
	 * @param boundary Pozitivan broj manji ili jednak 20
	 * @return Generisan Fibonacijev niz do prosledjenog mesta
	 */
	private static List<Integer> generateFibonacci(int boundary) {
		if (boundary<=0) {
			throw new IllegalArgumentException("Prosledjeni broj mora biti pozitivan");
		}
		if (boundary>20) {
			throw new IllegalArgumentException("Prosledjeni broj mora biti manji ili jednak 1000");
		}
		List<Integer> result = new ArrayList<Integer>();
		result.add(1);
		
		if (boundary == 1) {
			return result;
		}
				
		result.add(1);
		
		int i = 0;
		while (i < boundary - 2) {
			result.add(result.get(i)+result.get(i+1));
			i++;
		}
		return result;
	}

}
