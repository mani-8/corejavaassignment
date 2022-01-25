package BasicProgram;

import java.util.Scanner;

class student{
	float studentId;
	String studentName;
	float studentMark;



public void setStudentData(float si, String sn, float sm) {
	studentId=si;
	studentName=sn;
	studentMark=sm;
	
}
}
public class StudentActivity {

public static void main(String [] args) {
	float studentId,studentMark;
	String studentName;
	student st = new student();
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter your Id");
	studentId=sc.nextFloat();
	System.out.println("Enter your Name");
	studentName=sc.next();
	System.out.println("Enter your total mark");
	studentMark=sc.nextFloat();
	sc.close();
	st.setStudentData(studentId,studentName,studentMark);
	System.out.println("Your ID: "+st.studentId +'\n'+"Your Name: "+st.studentName +'\n' +"Your Mark: "+st.studentMark);
}

}
