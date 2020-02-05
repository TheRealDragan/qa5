package com.comtrade.recapitulation;

import java.util.*;

public class AverageOfListExample extends BaseExample{
	public static void main(String[] args) {	
		List<Integer> testList = setUpList();
		System.out.println(calculateAverage(testList));
	}

	private static double calculateAverage(List<Integer> intList) {
		if (intList == null) {
			return 0;
		}
	    double sum = 0;
	    for (int i=0; i<intList.size(); i++) {
	   // 	System.out.println("Ovo je i"+i);
	    	sum+=intList.get(i);
	  //  	System.out.println("Ovo je trenutna suma"+sum);
	    }
	    return sum / intList.size();	    
	}

}
