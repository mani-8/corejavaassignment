package BasicProgram;

import java.util.HashSet;

import java.util.TreeSet;

public class TreeSetProgram {
 public static void main(String[] args) {
	
	 HashSet<String> ha = new HashSet<String>();
		ha.add("Ajith");
		ha.add("andrew");
		ha.add("rohit");
		ha.add("nandan");
		ha.add("mani");
		System.out.println(ha);
		
		TreeSet<String> tree= new TreeSet<String>(ha);
		System.out.println(tree);
		
 }
}
