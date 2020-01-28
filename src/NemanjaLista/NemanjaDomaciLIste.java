package NemanjaLista;

import java.util.ArrayList;
import java.util.List;

public class NemanjaDomaciLIste {
	public static void main(String[] args) {
		List<Integer> lista1 = new ArrayList<>();
		lista1.add(1);
		lista1.add(2);
		lista1.add(3);
		lista1.add(5);
		lista1.add(6);
		
		List<Integer> lista2 = new ArrayList<>();
		lista2.add(2);
		lista2.add(3);
		lista2.add(8);
		
		System.out.println("Elementi prve liste su: " + lista1);
		System.out.println("Elementi druge liste su: " + lista2);
		
		List<Integer> presek = new ArrayList<>();
		System.out.println("Zajednicki elementi su: " );
		for (int i = 0; i < lista1.size(); i++) {
			  for (int j = 0; j < lista2.size(); j++) {
		
				  if(lista1.get(i) == lista2.get(j)){
                      presek.add(i);
                      System.out.println(lista1.get(i));  
                  }
			  }	
	}
		
	

	}

}
