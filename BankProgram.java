package BasicProgram;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Customers
{
Long acc_no;
String name;
String address;
Long bal;

Customers(Long acc_no,String name,String address,Long bal)
{
   this.acc_no = acc_no;
   this.name = name;
   this.address = address;
   this.bal = bal;
 }


public Long getAcc_no() {
	return acc_no;
}


public void setAcc_no(Long acc_no) {
	this.acc_no = acc_no;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getAddress() {
	return address;
}


public void setAddress(String address) {
	this.address = address;
}


public Long getBal() {
	return bal;
}


public void setBal(Long bal) {
	this.bal = bal;
}


@Override
public String toString() {
	return "Customers [acc_no=" + acc_no + ", name=" + name + ", address=" + address + ", bal=" + bal + "]";
}
	
	 
}

public class BankProgram
{
    ArrayList<Customers> arrl = new ArrayList<Customers>();
    Scanner sc =new Scanner(System.in);
    
    
	public void createAccount() {
		int inp;		
		System.out.println("Enter how many data input to add : ");
		inp= sc.nextInt();
		
		for(int i=0;i<inp;i++) {
    System.out.println("                   ***Enter Customers data***");
    sc.nextLine();
    System.out.println("Enter Customer Name : ");
    String nm = sc.nextLine(); 
    System.out.println("Enter Customer Address : ");
    String addr = sc.nextLine();
    System.out.println("Enter Customer Account Number : ");
    Long acc =sc.nextLong(); 
    System.out.println("Enter Account Balance : ");
    Long bal = sc.nextLong();

    Customers cus = new Customers(acc,nm,addr,bal);  
    arrl.add(cus);

    for(i=0;i<arrl.size()-1;i++) {
    	
    	try {
    		if(arrl.get(i).getAcc_no().equals(cus.getAcc_no())) {
    			arrl.remove(cus);
    			throw new Exception("Mr/Ms " +cus.getName()+" account number already added!! \n");
    		}
    	}catch(Exception e){
    		System.out.println(e.getMessage());
    		break;
    	}
    }
		}
   
}
	
	public void displayAccount() {
		System.out.println("                 *****All Customer Data*****");
			for(int i=0;i<=arrl.size()-1;i++) {
				System.out.println("Customer account number : " +arrl.get(i).getAcc_no());
				  System.out.println("Customer name : " +arrl.get(i).getName());
				  System.out.println("Customer address : " +arrl.get(i).getAddress());
				  System.out.println("Customer balance : " +arrl.get(i).getBal()+ "\n");
				 
		}
	}
	
 public void delCustomer() {
	 
		System.out.println("Enter account number to delete");    
			Long ac = sc.nextLong();    
			for(int i=0;i<arrl.size();i++) {
				 if(arrl.get(i).getAcc_no().equals(ac)) {
				  
				  arrl.remove(arrl.get(i)); 
				  System.out.println("Customer account no: "+ac+ " Removed Successfully");
				  
				  }else {
					  System.out.println("Account number not found!! ");
				  }
				  
			}
	
}
   

    public void deposit( ) {   
    	System.out.println("Enter your account number : ");
    	long ac = sc.nextLong();
		System.out.println("Enter the amount to deposit : ");
		long amount=sc.nextLong();
		for(int i=0;i<arrl.size();i++) {
			 if(arrl.get(i).getAcc_no().equals(ac)) {
				 long balance =arrl.get(i).getBal();
			     balance +=amount;
			     arrl.get(i).setBal(balance);
			     System.out.println("your amount deposit successfully");
			     System.out.println("Your current balance amount is : " +balance+ "\n");

			 }
	    }
	}
 
	public void withdrawal() {
		
		System.out.println("Enter your account number : ");
	long ac = sc.nextLong();
	System.out.println("Enter the amount to withdraw : ");
	long amount=sc.nextLong();
	for(int i=0;i<arrl.size();i++) {
		if(arrl.get(i).getAcc_no().equals(ac)) {
		 long balance =arrl.get(i).getBal();
		if(balance>=amount && balance>=500) {
			balance-=amount;
			arrl.get(i).setBal(balance);
			System.out.println("your amount withdrawal successfully");
		     System.out.println("Your current balance amount is : " +balance+ "\n");

		}else {
			System.out.println("'Insufficient balance' Your balance is less than " +amount +"\nTransaction failed");
		}
		}
	}
	}
	
 public void updateCustomer()  {
	 
     System.out.println("Enter account number to update : ");
     Long ac = sc.nextLong();
    
		  Iterator<Customers> up_cus = arrl.iterator(); 
		  while(up_cus.hasNext()) {
		  Customers c = (Customers)up_cus.next();
		 
     for(int i=0;i<arrl.size();i++) {
		 if(arrl.get(i).getAcc_no().equals(ac)) {
      System.out.println("                   *****Current Data***** ");
	  System.out.println("Customer account number : " +ac);
	  System.out.println("Customer name : " +c.name);
	  System.out.println("Customer address : " +c.address);
	  System.out.println("Customer balance : " +c.bal+ "\n");
	 
	  System.out.println("Enter your new name : "); 
	  sc.nextLine();
	  String nm = sc.nextLine();
	  System.out.println("Enter your new address : "); 
	  String addr = sc.nextLine();
	  Long old_bal = c.bal; 
	  Long old_ac_no = c.acc_no;
	  	  
	  arrl.remove(c); 
	  Customers new_cus = new Customers(old_ac_no,nm,addr,old_bal);
	  arrl.add(new_cus);
	  System.out.println("Successfully updated both Name and Address\n");
	  System.out.println("                    *****Your new data*****");
	  System.out.println("Customer name : " +new_cus.name);
	  System.out.println("Customer address : " +new_cus.address);
	  System.out.println("Customer account number : " +new_cus.acc_no);
	  System.out.println("Customer balance : " +new_cus.bal);
	 break;
  }
     }
     }
}

  public void searchCustomer() {
	  Scanner sc =new Scanner(System.in);
    System.out.println("Enter Account Number To View Customer : ");
    long ac= sc.nextLong();
    Iterator<Customers> s_cus = arrl.iterator();
		while(s_cus.hasNext()) 
		{	
			  Customers c = (Customers)s_cus.next();
			  if(ac == c.acc_no){ 
			  System.out.println("***Customer deatails***");
			  System.out.println("Customer name : " +c.name);
			  System.out.println("Customer address : " +c.address);
			  System.out.println("Customer account number : " +c.acc_no);
			  System.out.println("Customer Balance : " +c.bal+ "\n"); 
			  }
			 
		}

}
  
    public static void main(String[] args)  {
    	int choice;
     BankProgram obj = new BankProgram();    
     System.out.println("Welcome To Indian Bank");
  
     
    do{
    	 Scanner sc = new Scanner(System.in);
         System.out.println("MENU");
         System.out.println(" 1.Create customer account");
         System.out.println(" 2.Display customer information");
         System.out.println(" 3.Search customer");
         System.out.println(" 4.Delete customer");
         System.out.println(" 5.Update customer");
         System.out.println(" 6.Deposit amount");
         System.out.println(" 7.Withdrawl amount");      
         System.out.println(" 8.Exit");
         System.out.println("Enter Your Choice : ");
         choice = sc.nextInt();

     switch(choice){
           case 1 :
               obj.createAccount();
           break;
           case 2 :
        	   obj.displayAccount();
           break;
           case 3:
        	   obj.searchCustomer();
           break;
           case 4:   		
		       obj.delCustomer();
		   break;
           case 5:
               obj.updateCustomer();
           break;
           case 6:
               obj.deposit();
           break;
           case 7:
               obj.withdrawal();
           break;
		   case 8 : 
                   System.out.println("Thank You, visit again!!!");
           break;
		 
           default :
                   System.out.println("Enter valid choice number");
           break;
         }
      }while(choice!=7);
}
}