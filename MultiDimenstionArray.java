package BasicProgram;

import java.util.Scanner;

public class MultiDimenstionArray {

	public static void main(String[] args) {
		int row,column;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the array row and column [row x column] size");
	    row = sc.nextInt();	
		column = sc.nextInt();
		int[][] arr = new int[row][column];
		System.out.println("Enter array elements :");
				for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
		        arr[i][j] = sc.nextInt();
			}
			System.out.println();
		}
				for(int i=0; i<row;i++) {
					for(int j=0;j<column;j++) {
			System.out.print((arr[i][j])+" ");	
					}
					System.out.println();
	}
	}

}
