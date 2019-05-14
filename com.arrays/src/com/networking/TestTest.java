package com.networking;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.test.Calculation;
/*
 * by msfata programming help 
 * */

class TestTest {

	@Test
	void additionTest() {
		int[] a = { 1, 2, 51 };
		Calculation c = new Calculation();
		assertEquals(c.add(a), 54);
	}

	@Test
	void deductionTest() {
		int[] a = { 1, 2, 51 };
		Calculation c = new Calculation();
		assertEquals(c.deduct(a), -54);
	}

	@Test
	void divisionTest() {
		int[] a = { 1, 2, 51 };
		Calculation c = new Calculation();
		assertEquals(c.devide(2, a), 27);
	}

	@Test
	void multiplicationTest() {
		int[] a = { 1, 2, 51 };
		Calculation c = new Calculation();
		assertEquals(c.multiply(2, a), 108);
	}

	@Test
	void modulusTest() {
		int[] a = { 1, 2, 51 };
		Calculation c = new Calculation();
		assertEquals(c.modulus(2, a), 0);
	}

}
