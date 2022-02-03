package BasicProgram;

import java.util.Scanner;

public class PatternNumber {
	public static void main(String[] args) {
		 System.out.println("Enter the row");
		 Scanner sc=new Scanner(System.in);
		 char star =sc.next().charAt(0);
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
			   System.out.print(j);
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=1;i<=5;i++) {
			for(int j=5;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k);
			}
			System.out.println();
		}
		
	
}
}
