package com.comtrade.entry;
import java.util.*;


public class EntryPoint {

	public static void main(String[] args) {
	 List<Integer> list = new ArrayList<Integer>();
	 list.add(199);
	 list.add(211);
	 list.add(202);
	 list.add(456);
	 list.add(7777);
	 list.add(2224);
	 list.add(4444);
	 list.add(2311);
	 list.add(3288);
	 list.add(9088);
	 list.add(4426);
	 list.add(6482);
	 list.add(5317);
	 list.add(5555);
	 list.add(3333);
	 list.add(9999);
	 list.add(2532);
	 list.add(6635);
	 
	 int currentMin = list.get(0);
	 for (int i =0; i<list.size(); i++) {
		if (list.get(i) < currentMin) {
			currentMin = list.get(i);
		}
	 }
	 
	 System.out.println(currentMin);
	}
	
}
