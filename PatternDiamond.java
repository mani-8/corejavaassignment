package BasicProgram;

import java.util.Scanner;

public class PatternDiamond {	
	public static void main(String[] args) {
		 System.out.println("Enter the character");
		 Scanner sc=new Scanner(System.in);
		 char star =sc.next().charAt(0);
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
			   System.out.print(star);
			}
			System.out.println();
		}
		for(int i=1;i<=4;i++) {
			for(int j=4;j>=i;j--) {
			   System.out.print(star);
			}
			System.out.println();
		} 			                             
		 }
	 }
	