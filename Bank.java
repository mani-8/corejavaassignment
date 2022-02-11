package banking;
import java.util.Scanner;
public class Bank {
	public static void main(String[] args) {
		int i;
		BankDetails bank_detail =new BankDetails();
		Scanner sc=new Scanner(System.in);
		do{
			System.out.println("Banking Transaction");
			System.out.println("1.Create Account \n2.Display Account \n3.To Deposit \n4.To Withdrawal \n5.Exit");
			System.out.println("Enter your choise : ");
			i=sc.nextInt();
                        sc.close();
			switch(i) {
			case 1:
				System.out.println("Enter your details");
				bank_detail.accountInfo();
				System.out.println("Account created");
				System.out.println();

			    break;
			case 2:
				System.out.println("User Info");
				bank_detail.displayInfo();
				System.out.println();
			    break;
			case 3:
				bank_detail.deposit();
				System.out.println();
			    break;
			case 4:
				bank_detail.withdrawal();
				System.out.println();
			    break;
			case 5:
				break;
			default:
				System.out.println();
				System.out.println(" Enthe the Correct choise, given in the list");
				System.out.println();
			}
		}while(i!=5);
		System.out.println("Thank you vist again");
	}
