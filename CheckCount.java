package BasicProgram;

import java.util.Scanner;

public class CheckCount {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
	    int number = sc.nextInt();
	    sc.close();
	    int count=0;
			whilw(number!=0) {
			    number/=10;
			    count+=1;
			}	
			System.out.println("The count of number is : "+count);
	}
}
