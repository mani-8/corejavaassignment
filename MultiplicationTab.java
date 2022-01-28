package BasicProgram;

import java.util.Scanner;

public class MultiplicationTab {
public static void main(String[]args) {
	System.out.println("Enter the number");
	Scanner sc=new Scanner(System.in);
	int number=sc.nextInt();
	for(int i=1;i<=10;i++) {
		int num=i*number;
		System.out.println( number+" x "+i+" = "+num);
		
	}
}
}
