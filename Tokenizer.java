package BasicProgram;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Tokenizer {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the string : ");
	String st = sc.nextLine();
	StringTokenizer str= new StringTokenizer(st,",");
	while(str.hasMoreElements()) {
	System.out.println(str.nextElement());
	}
}
}
