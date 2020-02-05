package com.comtrade.recapitulation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountOccurrences extends BaseExample{

	public static void main(String[] args) {
		List<Integer> testList = setUpList();
		printCountedOccurrences(testList);
	}
	
	private static void printCountedOccurrences(List<Integer> testList) {
		Map<Integer, Integer> occurenceMap = new HashMap<Integer, Integer>();
		for (int i=0; i<testList.size();i++) {
			occurenceMap.put(testList.get(i), 0);
		}
		for (int i=0; i<testList.size();i++) {
			occurenceMap.put(testList.get(i),
					occurenceMap.get(testList.get(i))+1);
		}
		for (Integer integer : occurenceMap.keySet()) {
			System.out.println("Za element "+integer
					+" broj ponavljanja je: "+
					occurenceMap.get(integer));
		}
	}


}
