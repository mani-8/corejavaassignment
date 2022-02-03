package BasicProgram;

import java.util.Scanner;

public class PyramidProgram {
 public static void main(String[] args) {
	 System.out.println("enter any number for pyramid design");
	 Scanner sc =new Scanner(System.in);
	 char star =sc.next().charAt(0);
	 for(int i=0;i<=5;i++) {
		 for(int j=0;j<=i;j++) {
			 System.out.print(star);
		 }
		 System.out.println();
	 }
	 
 }
}
