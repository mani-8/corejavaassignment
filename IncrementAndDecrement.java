package BasicProgram;

public class IncrementAndDecrement {
public static void main(String[] args) {
	int x= 10;
	int y= ++x; 
	System.out.println("value of x is : "+x);
	System.out.println("value of y is : "+y);
	
	int a= 10;
	int b= --x; 
	System.out.println("value of a is : "+a);
	System.out.println("value of b is : "+b);
    System.out.println(++a);
    System.out.println(a++);
}
}