package BasicProgram;
class EmployeeProg{
	long employeeId,employeePhone;
	String employeeName;
	String employeeAddress;
	double basicSalary;
	double specialAllowance= 250.80;
	double hra =1000.50;
	public EmployeeProg(long employeeId, String employeeName, String employeeAddress, long employeePhone, double basicSalary) {
		super();
		this.employeeId = employeeId;
		this.employeePhone = employeePhone;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.basicSalary = basicSalary;
			
	}
	
	public void calculateSalary() {
		double salary;
		salary = basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary * hra/100);
		System.out.println("Id: "+employeeId+"\nName: "+employeeName+"\nAddress: "+employeeAddress+"\nPhone: "+employeePhone+"\nSalary: "+salary);
	}
	
	
	public void calculateTransportAllowance() {
		double transportAllowance;
		transportAllowance = (10*basicSalary)/100;
		 System.out.println("The calculation for the transport Allowance for trainee : "+transportAllowance);
	}
}

class Manager extends EmployeeProg{

	public Manager(long employeeId, String employeeName, String employeeAddress, long employeePhone,
			double basicSalary) {
		super(employeeId, employeeName, employeeAddress, employeePhone, basicSalary);
		double transportAllowance = 15*basicSalary /100;
		System.out.println("The calculation for the transport Allowance for manger : "+transportAllowance);
	}
	
}

class Trainee extends EmployeeProg{

	public Trainee(long employeeId, String employeeName, String employeeAddress, long employeePhone,
			double basicSalary) {
		super(employeeId, employeeName, employeeAddress, employeePhone, basicSalary);
		
		
	}
	
}
public class InheritanceActivity {
	public static void main(String[]args) {
Manager mang = new Manager(126534, "peter", "Chennai India", 237844, 65000);
mang.calculateSalary();
mang.calculateTransportAllowance();
 
Trainee tra = new Trainee(254668, "jack", "mumbai India", 442086, 4500570);
tra.calculateSalary();

 
}
}
