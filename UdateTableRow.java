package com.dbms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UdateTableRow {
	static Connection conn =ConnectionDb.connectDb();
	public static void main(String[]args) {
	try {
		
		//create statement
		//Statement sta =conn.createStatement();
		
		Scanner sc = new Scanner(System.in);
		
		//create query
		String query ="update employee set empname=? where empid=?";
	    PreparedStatement ps = conn.prepareStatement(query);
	    
	    System.out.println("Enter employee name : ");
		String emp_name=sc.nextLine();
		ps.setString(1, emp_name);
		
		
		System.out.println("Enter employee id : ");
		int emp_id =sc.nextInt();
		ps.setInt(2, emp_id);
		sc.nextLine();
		//execute query
		int row =ps.executeUpdate();
		
		if(row!=0) {
		System.out.println(row+" row updated");}
		else {
			System.out.println("There is no row to update");
		}
		sc.close();
		//close the connection
		conn.close();
	}catch(Exception e) {
		
	}

}
}

