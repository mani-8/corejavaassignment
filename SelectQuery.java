package com.dbms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.Scanner;

public class SelectQuery {

	public static void main(String[] args) {
		
        try {
        	Connection conn =ConnectionDb.connectDb();
			Scanner sc =new Scanner(System.in);
			
			//create query
			String query ="select *from employee where=?";
			 PreparedStatement ps = conn.prepareStatement(query);
			 ResultSet rs=ps.executeQuery();
				
				System.out.println("==========================================");
				while(rs.next()) {
					System.out.println("Employee id: "+ rs.getInt(1) +"\nEmployee name: "+ rs.getString(2) +"\nEmployee salary: "+ rs.getInt(3) +"\nEmployee address: "+ rs.getString(4));
				    System.out.println("==========================================");
				}
				sc.close();
				conn.close();
			}catch(Exception e) {
				System.out.println(e);
			}
	}
}