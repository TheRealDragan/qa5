package com.comtrade.recapitulation;

import java.util.Collections;
import java.util.List;

public class SortingExample extends BaseExample{
	
	public static void main(String[] args) {	
		List<Integer> testList = setUpList();
		Collections.sort(testList);
		Collections.reverse(testList);
		for (Integer integer : testList) {
			System.out.println(integer);
		}
	}

}
