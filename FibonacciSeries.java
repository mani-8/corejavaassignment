package BasicProgram;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number : ");
		int a=sc.nextInt();
		int num1=-1,num2=1;
		for(int i=0;i<a;i++){
			int number=num1+num2;
			System.out.print(" "+number);
			num1=num2;
			num2=number;
		}
	}
}
