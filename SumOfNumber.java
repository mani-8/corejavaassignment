package BasicProgram;

import java.util.Scanner;

public class SumOfNumber {
	public static void main(String[]args) {
		int num,sum;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number : ");
		num=sc.nextInt();
		sum= num*(num+1)/2;
		System.out.println("The sum of number : "+ sum);
}

	
}
