package com.comtrade.domain;

public class JUnit {
	
	public int addNumbers(int firstNumber, int secondNumber, int thirdNumber) {
		return (firstNumber + secondNumber + thirdNumber);
	}

	public int areaOfSquare(int sideLenght) {
		return (sideLenght * sideLenght);
	}

	public double areaOfRightTriangle(int a, int b) {
		return (a*b/2);
	}

	public String concatenate(String one, String two, String three, String four, String five) {
		return (one + two + three + four + five);
	}

	public boolean isNumberDivisibleBy3(int number) {
		boolean result = false;
		if (number % 3 == 0) {
			result = true;
		}
		return result;
	}
}
