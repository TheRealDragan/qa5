package com.comtrade.recapitulation;

import java.util.*;

public class AverageOfListExample {
	public static void main(String[] args) {	
		List<Integer> testList = setUpList();
		System.out.println(calculateAverage(testList));
	}
	
	private static List<Integer> setUpList() {
		List<Integer> result = new ArrayList<>();
		result.add(2);
		result.add(2);
		result.add(10);
		result.add(15);
		return result;
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
	
	public void logIn() {
		WebDriver driver = new Driver();
		WebElement element = driver.getElementById("login-field");
		element.fillText("petarnov");
		WebElement secondElement = driver.getElementById("password-field");
		element.fillText("petarpetar");
		WebElement button = driver.getElementById("login-button");
		button.click();
		Thread.sleep(4000);
	}
}
