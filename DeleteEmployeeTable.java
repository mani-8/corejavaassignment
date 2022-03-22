package com.dbms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteEmployeeTable {

	static Connection conn =ConnectionDb.connectDb();
	public static void main(String[]args) {
	try {
		Scanner sc=new Scanner(System.in);
		
		String query="delete from employee where accno=?;";
		
		PreparedStatement ps=conn.prepareStatement(query);
		
		System.out.println("Enter account number: ");
		String accno=sc.nextLine();
		ps.setString(1,accno);
		
		sc.close();
		
		int row =ps.executeUpdate();
		if(row!=0)
			System.out.println(row+" row deleted");
		else
			System.out.println("no row deleted");
		
		conn.close();
	}catch(Exception e) {
		
	}

}
}
