package BasicProgram;
	
	class Employee extends Object{
		int age;
		int salary;
		String name;
	public Employee(int age,int salary,String name) {
		this.age =age;
		this.salary = salary;
		this.name = name;
	}
	
	

	@Override
	public boolean equals(Object obj) {
		//checking the both object reference value to return true
		if(this == obj){
			return true;
		}
		//checking the both class value are not equal to return false
		if(this==null || this.getClass()!=obj.getClass()){
			return false;	
		}
		//checking the object value of age, salary, name to return
		Employee emp = (Employee)obj;
		return this.age == emp.age &&
				this.salary == emp.salary &&
				this.name == emp.name;
		
	}
	public  int hashCode() {
		return this.name.length()%10;
	}
	}


	public class EqualsMethodAndHashCodeMethod {
	public static void main(String[] args) {
		
		Employee e1 = new Employee(40,50000,"Dhoni");
		Employee e2 = new Employee(28,35000,"Sherayas Iyer");

		if(e1.hashCode() == e2.hashCode()) {
	    System.out.println(e1.equals(e2));
		}else {
			System.out.println("not equal!");
		}
	}
}

