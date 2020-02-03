package com.comtrade.domain;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {

	public static void main(String[] args) {
		ArrayList<Human> sortedlist = new ArrayList<Human>();
		sortedlist.add(new Human(180, 70, "Mitar", "Miric"));
		sortedlist.add(new Human(164, 64, "Buba", "Miranovic"));
		sortedlist.add(new Human(202, 79, "Nikola", "Zigic"));

		   Collections.sort(sortedlist);

		   for(Human h: sortedlist){
				System.out.println(h);
		   }
	     }

	}
