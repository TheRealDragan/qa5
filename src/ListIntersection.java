import java.util.ArrayList;
import java.util.List;

public class ListIntersection {


	public static void main(String[] args) {
		List<Integer> firstList = createFirstList();		
		List<Integer> secondList = createSecondList();		
		List<Integer> intersection = findIntersection(firstList, secondList);
		printList(intersection);
	}

	private static List<Integer> createSecondList() {
		List<Integer> secondList = new ArrayList<>();
		secondList.add(2);
		secondList.add(3);
		secondList.add(8);
		return secondList;
	}
	private static List<Integer> createFirstList() {
		List<Integer> firstList = new ArrayList<>();
		firstList.add(1);
		firstList.add(2);
		firstList.add(3);
		firstList.add(5);
		firstList.add(6);
		return firstList;
		
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

		private static void printList(List<Integer> intersection) {
			for (Integer integer : intersection) {
				System.out.println(integer);
		
			}
		}

}
	
  

  