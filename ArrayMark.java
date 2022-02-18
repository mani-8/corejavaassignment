package BasicProgram;

import java.util.Scanner;

class Student{
	Scanner sc=new Scanner(System.in);
    int RegNo,Total=0,subjects;
    String name;
    int marks[];
   Student(){
	   System.out.print("Enter Registration No : ");
       RegNo=sc.nextInt();
       System.out.print("Enter Student Name: ");
       name=sc.next();;
       System.out.println("Enter the marks out of 100 : ");
       getMarks();
 }

   public void getMarks() {
       marks=new int[5];
       for(int i=0;i<5;i++) {
       String sub[]= {"Physics","Chemistry","Maths","Computer","English"};
       System.out.print("Enter marks of "+sub[i]+" : ");
       marks[i]=sc.nextInt();
       }
       
       for(int i=0;i<5;i++){
          Total+=marks[i];
       }
       
       for(int i=0;i<5;i++){
    	   String sub[]= {"Physics","Chemistry","Maths","Computer","English"};
       if(marks[i]<40) {
		System.out.println("you are failed in "+sub[i]+", pass mark is 40 out of 100");
       }else if(marks[i]>=40) {
    	   System.out.println("You passed in "+sub[i]);
       }
       }
       if((marks[0]<40) || (marks[1]<40) || (marks[2]<40) || (marks[3]<40) || (marks[4]<40)) {
      	 System.out.println("Result : PASS");  
         }else {
      	   System.out.println("Result : FAIL"); 
         }
       System.out.println("Total Marks of student "+name+": " +Total);
   }
}

class ArrayMark{
	public static void main(String args[])
    {
     System.out.println("Enter how many number of student data to add :");
     Scanner sc = new Scanner(System.in);
     int val = sc.nextInt();
	 Student s[]=new Student[val];
     for(int i=0;i<val;i++)
     s[i]=new Student();
     }
}
