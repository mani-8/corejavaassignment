package BasicProgram;

import java.util.Scanner;

public class Rangeperfectnum {
public static void main(String[]args) {
	long num;
	Scanner sc=new Scanner(System.in);         
	System.out.print("Enter the number range from 1 to : ");  
	num=sc.nextLong();    
	for(int i=1;i<=num;i++) {
		long count=0;
	for(int j=1;j< i;j++)  {  
	if(i % j == 0)  
	{   
	count += j;  
	}  
}
	if(count==i)  {   
		System.out.println(count+" is perfect number ");
		}  
	}
	
	}  
}
