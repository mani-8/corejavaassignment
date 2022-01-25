package BasicProgram;

import java.util.Scanner;

class OddEven
{
  public static void main(String args[])
  {
    int num;
    System.out.println("Enter the number:");
    Scanner number = new Scanner(System.in);
    num = number.nextInt();

    if ( num % 2 == 0 )
        System.out.println("Entered number is even");
     else
        System.out.println("Entered number is odd");
  }
}
