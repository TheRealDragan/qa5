package com.comtrade.recapitulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingExample {
	
	public static void main(String[] args) {	
		List<Integer> testList = setUpList();
		Collections.sort(testList);
		Collections.reverse(testList);
		for (Integer integer : testList) {
			System.out.println(integer);
		}
	}


private static List<Integer> setUpList() {
	List<Integer> result = new ArrayList<>();		
	result.add(2);
	result.add(2);
	result.add(10);
	result.add(30);
	result.add(15);
	result.add(22);
	result.add(23);
	result.add(15);
	result.add(15);
	result.add(25);
	result.add(30);
	result.add(15);
	return result;
}
}
