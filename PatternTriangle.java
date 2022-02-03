package BasicProgram;

import java.util.Scanner;

public class PatternTriangle {
	 public static void main(String[] args) {
		 System.out.println("Enter the character");
		 Scanner sc=new Scanner(System.in);
		 char star =sc.next().charAt(0);
		 for(int i=1;i<=6;i++)
		 {
		for(int k=6;k>i;k--) {
			System.out.print(" ");
		}
		  
		   for(int j=1;j<=(i*2)-1;j++)			
		  {
		   System.out.print(star);
		  }
		 			
		  System.out.println();
		 			
		 }
	 }
}
