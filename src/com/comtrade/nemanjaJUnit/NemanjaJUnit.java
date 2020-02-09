package com.comtrade.nemanjaJUnit;

public class NemanjaJUnit {

	public int average(int firstNumber, int secondNumber, int thirdNumber) {
		return ((firstNumber + secondNumber + thirdNumber) / 3);
	}

	public int cubeVolume(int sideLenght) {
		return (sideLenght * sideLenght * sideLenght);
	}

	public double circumference(int r, double PI) {
		return (2 * r * PI);
	}

	public String concatenate(String one, String two, String three, String four, String five) {
		return (one + two + three + four + five);
	}

	public boolean isNumberEven(int number) {
		boolean result = false;
		if (number % 2 == 0) {
			result = true;
		}
		return result;
	}

}