package BasicProgram;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
  public static void main(String[]args) {
	    int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the list: ");
		n=sc.nextInt();
		ArrayList<String> list=new ArrayList<String>();
		System.out.println("Enter the Values: ");
		
		for(int i=0;i<n+1;i++) {
			System.out.println(""+list.add(sc.nextLine())); 
		}
		for(String s:list) {
			System.out.print(s);
		}
  }
}