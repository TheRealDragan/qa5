package com.comtrade.recapitulation;

import java.util.ArrayList;
import java.util.List;

public class PrintMiddleListElement {
	
	public static void main(String[] args) {	
		List<Integer> testList = setUpList();
		System.out.println(returnMiddleElement(testList));
	}
	
	private static Integer returnMiddleElement(List<Integer> inputList) {
// Primer rada kada ne zelimo da prihvatimo 
// listu parne duzine kao input:
//		if (inputList.size() % 2 == 0) {
//			throw new RuntimeException("Nije podrzan rad sa "
//					+ "listama parne duzine");
//		}
		if (inputList == null || inputList.size() == 0) {
			throw new RuntimeException("Prosledjena lista je prazna");
		}
		if (inputList.size() % 2 == 0) {
			return inputList.get(inputList.size() / 2 - 1);
		} else {
			return inputList.get(inputList.size() / 2);
		}		
	
	}

	private static List<Integer> setUpList() {
		List<Integer> result = new ArrayList<>();
		result.add(2);
		result.add(2);
		result.add(10);
		result.add(15);
		result.add(22);
		result.add(23);
		result.add(25);
		result.add(30);
		return result;
	}
}
