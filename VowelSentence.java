package BasicProgram;

import java.util.Scanner;

public class VowelSentence {

	public static void main(String[] args) {
		String value;
		char ch;
		int count = 0,string_count;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the sentence to check the vowel :");
		value =sc.nextLine();
        sc.close();
       
        String[] word = value.split(" ");
        int count_word =word.length;
        
        for(int i=0;i<count_word;i++) {
            String wd = word[i];
        	ch =wd.charAt(0);
        	
        	if(ch=='a' || ch=='A' ||ch=='e' ||ch=='E' ||ch=='i' ||ch=='I' ||ch=='o' ||ch=='O' ||ch=='u' ||ch=='U') {
    			System.out.println(wd + " is \"vowel word\"");
    			count++;
    		}	 	
        }
        string_count =checkCount(value);
        System.out.println("There are "+count+" number of vowel word in the sentence");
        System.out.println("There are "+string_count+" number of vowel letters in the sentence");
	}

	private static int checkCount(String value) {
		String v=value;
		char ch;
		int count=0;
		for(int i=0;i<v.length();i++) {
		ch =value.charAt(i);
    	
    	if(ch=='a' || ch=='A' ||ch=='e' ||ch=='E' ||ch=='i' ||ch=='I' ||ch=='o' ||ch=='O' ||ch=='u' ||ch=='U') {
			count++;
		}
		}
		return count;
	}


}
