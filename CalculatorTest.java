package junitTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assumptions;

class CalculatorTest {
	Calculator cal;
	@BeforeAll
	static void beforeAll() {
		System.out.println("Before all");
	}
	@AfterAll
	static void afterAll() {
		System.out.println("After all");
	}
	@BeforeEach
	void init() {
		cal=new Calculator();
		System.out.println("Before each test cases");
	}
	@AfterEach
	void cleanUp(){
		System.out.println("After each test cases");
	}
	
	@Test
	void addTest() {
		assertEquals(20,cal.add(15,5));
	}
	@Test
	void mulTest() {
		assertEquals(10,cal.mul(5,2));
	}
	@Test
	void maxTest() {
		assertEquals(9,cal.max(new int[]{1,2,6,7,8,9}));
	}
	@Test
	void errorTest() {
		assertThrows(ArithmeticException.class,()->cal.div(10,0),"Exception");
	}
	@Test
	@DisplayName(Value="adding two number")
	void assumptionTest() {
		boolean assumption =true;
		assumeTrue(assumption);
		assertEquals(30,cal.add(20,-10));
		
		
	}
}
