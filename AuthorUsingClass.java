package BasicProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AuthorUsingClass {
 
public static void main(String args[]){ 
	
   ArrayList<Author> al=new ArrayList<Author>();  
   al.add(new Author(101,"Vijay",23));  
   al.add(new Author(106,"Ajay",27));  
   al.add(new Author(105,"Jai",21));  
    
    Comparator<Author> au =new Comparator<Author>() {

		@Override
		public int compare(Author o1, Author o2) {
			if(o1.getAge() > o2.getAge()) {
			return 1;
			}else
				return -2;
		}
    	
    };
  
    Collections.sort(al ,au);  
    for(Author st:al){  
    System.out.println(st);  
}  
}  
}  
