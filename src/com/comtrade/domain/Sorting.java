package com.comtrade.domain;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {


public static void main(String[] args) {
	ArrayList<Human> sortingList = new ArrayList<Human>();
	sortingList.add(new Human(164, "Srecko", "Sredic"));
	sortingList.add(new Human(158, "Marko", "Palcic"));
	sortingList.add(new Human(202, "Milorad", "Veliki"));

	   Collections.sort(sortingList);

	   for(Human h: sortingList){
			System.out.println(h);
	   }
}
}