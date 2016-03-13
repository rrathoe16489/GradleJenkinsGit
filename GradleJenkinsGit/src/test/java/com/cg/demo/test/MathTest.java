package com.cg.demo.test;

import org.junit.Test;
import com.cg.demo.Math;

import static org.junit.Assert.*;

public class MathTest {

	/* 1. 22 is an even number.
	 * 2. 57 is an odd number.
	 */

	@Test
	public void testWhetherNumberIsEven(){

		Math m = new Math();

		assertTrue(m.isEven(22));

	}
	@Test
	public void testWhetherNumberIsOdd(){

		Math m = new Math();

		assertFalse(m.isEven(59));

	}
	
	/* 1. Zero factorial is one.
	 * 2. One factorial is one.
	 * 3. Factorial for 5 is 120.
	 * 4. Factorial of negative numbers cannot be found.
	 * 
	 */

	@Test
	public void zeroFactorialIsOne() {
		Math m = new Math();
		assertEquals(1, m.factorial(0));
	}
	
	@Test
	public void oneFactorialIsOne(){
		Math m = new Math();
		assertEquals(1, m.factorial(1));
	}
	
	@Test
	public void fiveFactorialIsOnetwenty(){
		Math m = new Math();
		assertEquals(120, m.factorial(5));
	}
	
	@Test(expected=java.lang.RuntimeException.class)
	public void factorialOfNegativeNumbersCannotBeFound(){
		Math m = new Math();
		m.factorial(-44);
	}
	

}














