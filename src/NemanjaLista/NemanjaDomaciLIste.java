package NemanjaLista;

import java.util.ArrayList;
import java.util.List;

public class NemanjaDomaciLIste {
	public static void main(String[] args) {
		List<Integer> firstList = createFirstList();		
		List<Integer> secondList = createSecondList();		
		List<Integer> intersection = findIntersection(firstList, secondList);
		printList(intersection);
	}
	
	private static void printList(List<Integer> intersection) {
		for (Integer integer : intersection) {
			System.out.println(integer);
		};
	}

	private static List<Integer> findIntersection(List<Integer> firstList,
			List<Integer> secondList) {
		List<Integer> intersection = new ArrayList<>();
		for (int i = 0; i < firstList.size(); i++) {
			for (int j = 0; j < secondList.size(); j++) {
				if (firstList.get(i).equals(secondList.get(j))) {
					intersection.add(firstList.get(i));
				}
			}
		}
		return intersection;
	}

	private static List<Integer> createSecondList() {
		List<Integer> lista2 = new ArrayList<>();
		lista2.add(22222);
		lista2.add(333);
		lista2.add(8);
		return lista2;
	}

	private static List<Integer> createFirstList() {
		List<Integer> lista1 = new ArrayList<>();
		lista1.add(1);
		lista1.add(22222);
		lista1.add(333);
		lista1.add(5);
		lista1.add(6);
		return lista1;
	}

}
