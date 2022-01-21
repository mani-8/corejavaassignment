package BasicProgram;

import java.util.Scanner;

public class AddAndDivisible {
	public static void main(String[] args) {
	System.out.println("Addition of 3 numbers and divide by 3");
	Scanner sc = new Scanner(System.in);
	int n1,n2,n3,result;
	System.out.println("Enter first number :");
	n1=sc.nextInt();
	System.out.println("Enter second number :");
	n2=sc.nextInt();
	System.out.println("Enter third number :");
	n3=sc.nextInt();
	result=(n1+n2+n3)/3;
	System.out.println(result);
}
}

