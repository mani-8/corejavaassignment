package BasicProgram;

import java.util.Scanner;

public class StrongNumber {
	
	public static void main(String[] args) {
		int value =0,rem,fact,temp;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		temp=num;
		while(num != 0){
		    
		     rem = num % 10;
		     fact=factorialValue(rem);
		    value += fact;
		    num /= 10;
		}
		if(temp == value) {
		System.out.println(temp + " is a strong number");
		}
	}
	static int factorialValue(int rem) {
		 int i = 1; int n=rem;
	    int fact = 1;
		while(i <= n){
		     fact *= i;
		     i++;
      }return fact;
		
	}
}