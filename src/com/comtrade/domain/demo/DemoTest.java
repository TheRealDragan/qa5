package com.comtrade.domain.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DemoTest {

	@Test
	void testAddition() {
	   Calculator calculator = new Calculator();
	   int result = calculator.add(3, 5);
	   assertEquals(8, result);
	}
	
	@Test
	void testSubtraction() {
		Calculator calculator = new Calculator();
		int result = calculator.subtract(5, 3);
		assertEquals(result, 2);
	}

}
