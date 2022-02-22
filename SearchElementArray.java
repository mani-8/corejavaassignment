package BasicProgram;

import java.util.Scanner;

public class SearchElementArray {
 public static void main(String[] args) {
	 int arr[],count_val,search;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("how manu value you need to enter?");
	 count_val = sc.nextInt();
	 search(count_val);	 
	 }
 
 public static void search(int count) {
	 int count_val=count,arr[],pos =-1;
	 Scanner sc = new Scanner(System.in);
	 arr = new int[count_val];
     System.out.println("Enter the number value :");
	 for(int i=0;i<count_val;i++) {
		 arr[i] =  sc.nextInt();
	 }
	 
	 System.out.println("Enter the number to search the value you entered");
	 int search =sc.nextInt();
	 
	 for(int i=0;i<count_val;i++) {
	 if (arr[i] == search) {
		  pos =i;
	 }
	 }
	 if(pos != -1) {
		 System.out.println("The value is found at position "+(pos + 1));
 }else
	 System.out.println("The value is not found!");
 }
 }

