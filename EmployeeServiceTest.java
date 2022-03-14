package com.testing.junitminiproject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

class EmployeeServiceTest {
EmployeeService emp;
@BeforeEach
void setUp() {
	emp=new EmployeeService();
}

@Test
@DisplayName("check test by add employee")
@Order(2)
public void checkAddTest()  {
	emp.addEmployee(101,"Mani",100000,"Chennai");
	assertEquals(1,emp.employeeLength());
	
}

@Test
@DisplayName("Throw exception")
@Order(1)
void findAccountTest() throws Exception{
	emp.addEmployee(102, "Mani", 30000, "Chennai");
	assertThrows(AccountNotFoundException.class,
			()->emp.findAccount(105));
}

@Test
@DisplayName("calculating yearly salary")
@Order(3)
void calYearlySalTest() {
	emp.addEmployee(101,"Mani",100000,"Chennai");
	assertEquals(1200000,emp.calYearlySalary(101));
}

@Test
@Disabled
@DisplayName("calculating appraisal")
@Order(4)
void calUppraisalTest() {
	emp.addEmployee(101,"Mani",100000,"Chennai");
	assertEquals(1000,emp.calUppraisalary(101));
}
}