package BasicProgram;

public class ConditionalStatement {
public static void main(String [] args) {
	/* Equal to */
	int a=10,b=30;
	if(a==b) { //10!=30, so Both are unequal
		System.out.println("Both are equal");
	}else {
		System.out.println("Both are unequal");
	}
	
	/* Not equal to */
	int X=30,Y=30;
	if(X!=Y) { //30==30, so condition is false
		System.out.println("Conditional ture");
	}else {
		System.out.println("Conditional false");
	}

	/* less than */
	int m=10,n=30;
	if(m<n) { //10<30 , so condition is true
		System.out.println("Conditional ture");
	}else {
		System.out.println("Conditional false");
	}
	
	/* less than equal to */
	int p=40,q=30;
	if(p<=q) { //40<=30 , so condition is false
		System.out.println("Conditional ture");
	}else {
		System.out.println("Conditional false");
	}
	
	/* grater than */
	int r=40,s=30;
	if(r>s) { //40>30 , so condition is true
		System.out.println("Conditional ture");
	}else {
		System.out.println("Conditional false");
	}
	
	/* grater than equal to */
	int u=20,v=30;
	if(u>=v) { //20>=30 , so condition is false
		System.out.println("Conditional ture");
	}else {
		System.out.println("Conditional false");
	}
}
}
