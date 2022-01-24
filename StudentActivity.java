package BasicProgram;

	import java.util.Scanner;

	class Student{
		float studentId;
		String studentName;
		float studentMark;


	public void setIdAndMark(float si, float sm) {
		studentId=si;
		studentMark=sm;
	}
	}
	public class StudentActivity {

	public static void main(String [] args) {
		float studentId,studentMark;
		String studentName;
		human manikandan = new human();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your Id");
		studentId=sc.nextFloat();
		System.out.println("Enter your name");
		studentName=sc.nextLine();
		System.out.println("Enter your total mark");
		studentMark=sc.nextFloat();
		
		manikandan.setIdAndMark(studentId,studentName,studentMark);
		System.out.println("Your Id: "+manikandan.height +" Your total mark: "+manikandan.weight);
	}

	}


