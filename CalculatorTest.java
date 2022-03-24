package junitTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;


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
	@DisplayName("testing error")
	void errorTest() {
		assertThrows(ArithmeticException.class,()->cal.div(10,0),"Exception");
	}
	
	@Nested
	@DisplayName("Nested class implemented")
	public class addTest{
	@Test
	@DisplayName("adding two Positive number")
	void assumptionTestPositiveNumber() {
		boolean assumption =true;
		assumeTrue(assumption);
		//if above assumption is true, below code will be executed
		assertEquals(30,cal.add(20,-10));
	}
	
	@Test
	@DisplayName("adding two negative number")
	void assumptionTestNegativeNumber() {
		boolean assumption =true;
		assumeTrue(assumption);
		//if above assumption is true, below code will be executed
		assertEquals(30,cal.add(20,-10));
	}	
	}
	
	@Test
	@DisplayName("To test assert all annotation")
	void testMultiply() {
		assertAll(
		()->assertEquals(4,cal.mul(2, 2)),
		()->assertEquals(0,cal.mul(2, 0)),
		()->assertEquals(-2,cal.mul(-1,2))
		);
	}
	
}
