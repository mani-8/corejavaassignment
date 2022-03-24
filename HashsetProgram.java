package BasicProgram;

import java.util.HashSet;

public class HashsetProgram {
public static void main(String[]args) {
	HashSet<String> ha = new HashSet<String>();
	ha.add("Ajith");
	ha.add("andrew");
	ha.add("rohit");
	ha.add("nandan");
	ha.add("mani");
	ha.add(null);
	System.out.println(ha);
	
	//convert hashset to array
	
	String []arr = new String[ha.size()];
	ha.toArray(arr);
	
	for(String s: arr)
	{
		System.out.println(s);
	}	
	
}
}
