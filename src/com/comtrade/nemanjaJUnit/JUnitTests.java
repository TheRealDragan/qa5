package com.comtrade.nemanjaJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitTests {

	public static final double PI = 3.14;

	@Test
	void testAverage() {
		NemanjaJUnit nju = new NemanjaJUnit();
		int result = nju.average(5, 6, 7);
		assertEquals(6, result);
	}

	@Test
	void testCubeVolume() {
		NemanjaJUnit nju = new NemanjaJUnit();
		int result = nju.cubeVolume(4);
		assertEquals(64, result);
	}

	@Test
	void testCircumference() {
		NemanjaJUnit nju = new NemanjaJUnit();
		double result = nju.circumference(7, PI);
		assertEquals(43.96, result);
	}

	@Test
	void testConcatenate() {
		NemanjaJUnit nju = new NemanjaJUnit();
		String sentence = nju.concatenate("Devojke ", "u ", "letnjim ", "haljinama ", "volim!");
		assertEquals("Devojke u letnjim haljinama volim!", sentence);
	}

	@Test
	void testIsNumberEven() {
		NemanjaJUnit nju = new NemanjaJUnit();
		assertTrue(nju.isNumberEven(8));
	}

}
