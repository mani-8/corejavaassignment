package BasicProgram;

import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {
		
		System.out.println("Enter the row");
		 Scanner sc=new Scanner(System.in);
		 int row =sc.nextInt();	

	System.out.println("Enter the character"); 
	 char star =sc.next().charAt(0);
	 for(int i=row;i>=1;i--)
	 {
	 for(int k=i;k<row;k++) {
		System.out.print(" ");
	}
	  
	   for(int j=1;j<=(i*2)-1;j++)			
	  {
	   System.out.print(star);
	  }
	 			
	  System.out.println();
	 			
	 }
	 for(int i=1;i<=row;i++)
	 {
	 for(int k=row;k>i;k--) {
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
