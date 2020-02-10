package com.comtrade.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class JUnitTests {
	
	@Test
	public void testAddNumbers() {
		JUnit unit = new JUnit();
		int result = unit.addNumbers(13, 26, 49);
		assertEquals(88, result);
	}

	@Test
	public void testAreaOfSquare() {
		JUnit unit = new JUnit();
		int result = unit.areaOfSquare(25);
		assertEquals(625, result);
	}

	@Test
	public void testAreaOfRightTriangle() {
		JUnit unit = new JUnit();
		double result = unit.areaOfRightTriangle(7, 9);
		assertEquals(31,5, result);
	}

	@Test
	public void testConcatenate() {
		JUnit unit = new JUnit();
		String sentence = unit.concatenate("Sve ", "bi ", "seke ", "ljubile ", "mornare");
		assertEquals("Sve bi seke ljubile mornare", sentence);
	}

	@Test
	public void testIsNumberDivisibleBy3() {
		JUnit unit = new JUnit();
		assertTrue(unit.isNumberDivisibleBy3(27));
	}

}
