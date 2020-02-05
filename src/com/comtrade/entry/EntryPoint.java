package com.comtrade.entry;

import java.util.*;

public class EntryPoint {

	public static void main(String[] args) {
	
//		List<Integer> firstList = prepareFirstList();
//		// List<Integer> secondList = prepareSecondList();
//		System.out.println(firstList);
//		emptyListV1(firstList);
//		System.out.println(firstList);
//		emptyList(firstList);
//		System.out.println(firstList);

	}

	private static void emptyListV1(List<Integer> firstList) {
		firstList = new ArrayList<>();		
	}

	private static void emptyList(List<Integer> firstList) {
		while (firstList.size() > 0) {
			firstList.remove(0);
		}
		
	}

	private static List<Integer> prepareSecondList() {
		List<Integer> secondList = new ArrayList<Integer>();
		secondList.add(4);
		secondList.add(2);
		secondList.add(3);
		return secondList;
	}

	private static List<Integer> prepareFirstList() {
		List<Integer> firstList = new ArrayList<Integer>();
		firstList.add(1);
		firstList.add(2);
		firstList.add(3);
		return firstList;
	}

}
