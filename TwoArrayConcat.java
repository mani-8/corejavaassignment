package BasicProgram;

import java.util.Arrays;
import java.util.Scanner;

public class TwoArrayConcat {
public static void main(String [] args) {
	
	int result[],a[],b[];
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the size of an 1st array");
	int size_1= sc.nextInt();
	
	System.out.println("Enter the size of an 2nd array");
	int size_2= sc.nextInt();
	
	a = new int[size_1];
	b = new int[size_2];

	System.out.println("Enter the "+size_1+" element in 1st array :");
	for(int i=0;i<size_1;i++) {
       a[i] = sc.nextInt();
	}
    
	System.out.println("Enter the "+size_2+" element in 2nd array :");
	for(int i=0;i<size_2;i++) {
       b[i] = sc.nextInt();
	}
    sc.close();
	
    int length = a.length + b.length;
    result = new int[length];
    
    int pos = 0;

    for (int array1: a) {
      result[pos] = array1;
      pos++;
    }

    for (int array2: b) {
      result[pos] = array2;
      pos++;
    }
    System.out.println("The resulting array after merging two arrays is: ");
    System.out.println(Arrays.toString(result));

}
}
