package com.comtrade.recapitulation;

public class StringDemo {

	public static void main(String[] args) {
		String name = "Milan Milic";
		
		name = name.substring(0, 3);
		//vrati prva tri karaktera Stringa
		System.out.println(name);
		
		name = "Milan Milic";
		
		name = name.substring(0, name.indexOf(" "));
		System.out.println(name);
		
		name = "Milan Milic";
		
		name = name.replaceAll(" ", "");
		System.out.println(name);
	}

}
