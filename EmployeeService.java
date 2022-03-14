package com.testing.junitminiproject;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
private List<Employee> employee = new ArrayList<Employee>();

//Adding employee details
public void addEmployee(int empid,String name, double sal, String city) {
	Address address1 =new Address(city);
	employee.add(new Employee(empid,name,sal,address1));
}
public void displayAccount() {
	System.out.println("                 *****All Customer Data*****");
	for(Employee emp: employee) {
			System.out.println("employee id : " +emp.getEmpid());
			  System.out.println("Employee name : " +emp.getEmpname());
			  System.out.println("Employee salary : " +emp.getEmpsal());
			  System.out.println("Employee city : " +emp.address1);
	}
	}
public void findAccount(long id) throws AccountNotFoundException{
	for( int i=0; i<employee.size(); i++) {
		if(employee.get(i).getEmpid()==id) {
			System.out.println("Account found successfully!");
		}else {
			throw new AccountNotFoundException("Account number not found!");
		}
	}
}
public int employeeLength() {
	int i;
	i=employee.size();
	return i;
}

public double calYearlySalary(long id) {
	double yearlySalary = 0;
	for(int i=0;i<employee.size();i++) {
		if(employee.get(i).getEmpid()==id){
			yearlySalary=employee.get(i).getEmpsal() *12;
		}
	}
	return yearlySalary;
}

public double calUppraisalary(long id) {
	double appraisalary = 0;
	for(int i=0;i<employee.size();i++) {
		if(employee.get(i).getEmpid()==id){
			if(employee.get(i).getEmpsal() < 10000) {
				appraisalary = 500;
			}else {
				appraisalary = 1000;
			}
		}
	}
	return appraisalary;
}
}


