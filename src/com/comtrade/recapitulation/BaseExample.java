package com.comtrade.recapitulation;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BaseExample {

public static List<Integer> setUpList() {
	List<Integer> result = new ArrayList<>();	
	
	List<Integer> lookAtThis = new LinkedList<Integer>();
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
