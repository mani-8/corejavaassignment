package BasicProgram;

import java.util.Scanner;

public class LastAndFirst{
	public static void main(String[]args) {
	long firstDigit,num;
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the number : ");
	num=sc.nextLong();
	sc.close();
	firstDigit=num%10;
	while(num>=10) 
		num=num/10;
	
	System.out.println("Sum of first and last digit : " + (num+firstDigit));
	}
}
