package BasicProgram;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		String name,country;
		double salary,taxAmount,tax;
		
		Scanner sc =new Scanner(System.in);
		
		TaxCalculator tax_cal =new TaxCalculator();
		
        System.out.println("Enter your name :");
         name =sc.nextLine();
         
        System.out.println("Enter your country :");
         country = sc.nextLine().toLowerCase().trim();
         
        System.out.println("Enter the salary amount :");
         salary = sc.nextLong();
         
         sc.close();
         
         if(country.equals("india")) {
        	tax_cal.setIndian(true); 
         }else {
        	tax_cal.setIndian(false);
         }
         
         tax_cal.setEmpName(name);
         tax_cal.setEmpSalary(salary);
         tax_cal.exception_handle();
         taxAmount=tax_cal.calculateTax();
         tax = Math.round(taxAmount);
         
         if(tax_cal.isIndian() && !(tax_cal.getEmpName().isBlank())) {
        	 System.out.println("Your Tax Amount is : "+tax);
         }
}
}