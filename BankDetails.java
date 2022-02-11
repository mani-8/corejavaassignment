package banking;

import java.util.Scanner;

public class BankDetails {
	private String accno;
	private String name;
	private long balance;
	Scanner in=new Scanner(System.in);
	public void accountInfo() {
		System.out.println("Enter Account No : ");
		accno=in.nextLine();
		System.out.println("Enter Name : ");
		name=in.nextLine();
		System.out.println("Enter Account Balance : ");
		balance=in.nextLong();
	}
	public void displayInfo() {
		System.out.println("Name of account holder : "+ this.name);
		System.out.println("Account no : "+ this.accno);
		System.out.println("balance : "+ this.balance);
	}
	public void deposit( ) {
		System.out.println("Enter the amount to deposit : ");
		long amount=in.nextLong();
		balance=balance+amount;
	}
	public void withdrawal() {
		System.out.println("Enter the amount to withdraw : ");
		long amount=in.nextLong();
		if(balance>=amount && balance>=500) {
			balance=balance-amount;
		}else {
			System.out.println("'Insufficient balance' Your balance is less than " +amount +"\nTransaction failed");
		}
	}
}
