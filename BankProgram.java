package BasicProgram;

import java.util.Scanner;

public class BankProgram {
	public static void main (String[] args) {
		int accountNO,withdrawalAmount;
		Bank IndianBank = new Bank();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter account number : ");
		accountNO=scan.nextInt();
		scan.nextLine();
		System.out.println("Enter withdrawal amount : ");
		withdrawalAmount=scan.nextInt();
		IndianBank.setaccNumer(accountNO);
		IndianBank.setwithdraw(withdrawalAmount);
		IndianBank.withdrawAmount();
		scan.close();
	}
}

class Bank{
	private int accBalance=10000;
	private int accNumber;
	private int withdraw;
	public int getaccNum() {
		return accNumber;
	}
	public void setaccNumer(int accountNO) {
		this.accNumber=accountNO;
	}
	public int getwithdraw() {
		return withdraw;
	}
	public void setwithdraw(int withdrawlAmount) {
		this.withdraw=withdrawlAmount;
	}
	public void withdrawAmount() {
		if(withdraw<=accBalance) {
			accBalance-=withdraw;
			System.out.println("withdrawal Sucessfull");
			System.out.println("The withdrawal amount is : "+ withdraw);
			System.out.println("The account balance is : "+ accBalance);
		}else {
			System.out.println("Insufficient Balance");
		}
	}
}
    

