package BasicProgram;

import java.util.Scanner;

public class PerfectNumber {
public static void main(String[]args) {
	int num;
	
	Scanner sc=new Scanner(System.in);         
	System.out.print("Enter the number: ");  
	num=sc.nextInt();    
	int c=perfect(num);
	if(c==num)  {   
	System.out.println(c+" is perfect number ");
	}  
	else  {
		System.out.println("Not a perfect number");   
	}
	}  
 static int perfect(int num) {
	 int count=0;
	 for(int i=1;i< num;i++)  {  
			if(num % i == 0)  
			{   
			count += i;  
			}  
		}
	return count;  
 }
}
