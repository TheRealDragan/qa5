package com.comtrade.recapitulation;

import com.comtrade.domain.Human;

public class ChangeValuesExample {

	public static void main(String[] args) {
		Human firstHuman = new Human();
		Human secondHuman = new Human();
		firstHuman.setName("Adam");
		secondHuman.setName("Eve");
		firstHuman = secondHuman;
		secondHuman.setName("Caine");
		System.out.println(firstHuman.getName());
		
		int first = 1;
		int second = 2;
		first = second;
		second = 3;
		System.out.println(first);
		

	}

}
