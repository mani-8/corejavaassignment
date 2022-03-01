package BasicProgram;

import java.util.ArrayList;

class Container<T>{
	T value;
}

public class GenericDemo {
public static void main(String []args) {
	
	ArrayList<Integer> arrl = new ArrayList<Integer>();
	arrl.add(43);
	for(int ar: arrl) {
		System.out.println(ar);
	}
}
}
