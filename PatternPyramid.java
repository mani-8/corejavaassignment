package BasicProgram;

import java.util.Scanner;

public class PatternPyramid {
 public static void main(String[] args) {
	 System.out.println("Enter the number");
	 Scanner sc=new Scanner(System.in);
	 char star =sc.next().charAt(0);
	 for(int i=1;i<=6;i++)
	 {
	  space(i);
	  
	   for(int j=1;j<=i;j++)			
	  {
	   System.out.print(star);
	  }
	 			
	  System.out.println();
	 			
	 }
 }
 static void space(int i) {
	 while(i<=10) {
			System.out.print(" ");
			i++;//10 spaces
			}
   }
}
