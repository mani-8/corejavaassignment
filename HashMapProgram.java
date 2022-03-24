package BasicProgram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapProgram {
 public static void main(String[]args) {
	 HashMap<Integer,String> hmap = new HashMap<Integer,String>();
	 hmap.put(1, "Andrew");
	 hmap.put(65, "ajith");
	 hmap.put(12, "rohit");
	 hmap.put(13, "mani");
	 hmap.put(18, "prasanth");

	 Set<Entry<Integer, String>> set =hmap.entrySet();
	 Iterator<Entry<Integer, String>> iterator = set.iterator();
	 while(iterator.hasNext()) {
		 Entry<Integer, String>  mentry=iterator.next();
		 System.out.println("The key is : "+mentry.getKey()+" & value is : "+mentry.getValue());
		 
		 //get value based on key
		 String var =hmap.get(13);
		 System.out.println("the value at index 4 is : "+var);
	 }
 }
}
