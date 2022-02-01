package BasicProgram;

import java.util.Scanner;

public class Perfectnumber {
public static void main(String[]args) {
	long num;
	long count=0;
	Scanner sc=new Scanner(System.in);         
	System.out.print("Enter the number: ");  
	num=sc.nextLong();    
	for(int i=1;i< num;i++)  {  
	if(num % i == 0)  
	{   
	count += i;  
	}  
}  
	if(count==num)  {   
	System.out.println(count+" is perfect number ");
	}  
	else  {
		System.out.println("Not a perfect number");   
	}
	}  
}
