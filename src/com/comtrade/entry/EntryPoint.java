package com.comtrade.entry;
import java.util.*;


public class EntryPoint {

	public static void main(String[] args) {
	 List<Integer> firstList = new ArrayList<Integer>();
	 firstList.add(1);
	 firstList.add(2);
	 firstList.add(3);
	 List<Integer> secondList = new ArrayList<Integer>();
	 secondList.add(4);
	 secondList.add(2);
	 secondList.add(3);
	
	for (int i = 0; i<firstList.size(); i++) {
		System.out.println(firstList.get(i));
	}
	
	for (Integer integer : firstList) {
		System.out.println(integer);
	}
	}
	

	
}
