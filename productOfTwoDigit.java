package BasicProgram;

import java.util.Scanner;

public class productOfTwoDigit {
	public static void main(String [] args) {
int num1,num2,result;
Scanner input =new Scanner(System.in);
System.out.println("Enter the digit");
num1= input.nextInt();
num2= input.nextInt();
result= num1 * num2;
System.out.println("The product is " +result);
}
}