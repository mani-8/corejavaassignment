package BasicProgram;

import java.util.Scanner;

class human{
	float height;
	float weight;


public void setHeightAndWeight(float h, float w) {
	height=h;
	weight=w;
}
}
public class ClassDemo {

public static void main(String [] args) {
	float height,weight;
	human manikandan = new human();
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter your height");
	height=sc.nextFloat();
//	System.out.println("Enter your Weight");
	weight=sc.nextFloat();
	
	manikandan.setHeightAndWeight(height,weight);
	System.out.println("Your height is: "+manikandan.height +" Your weight is: "+manikandan.weight);
}

}
