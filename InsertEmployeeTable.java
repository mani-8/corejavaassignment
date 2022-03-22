package com.dbms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertEmployeeTable {
	
	static Connection conn =ConnectionDb.connectDb();
	public static void main(String[]args) {
	try {
		
		//create statement
		//Statement sta =conn.createStatement();
		Scanner sc =new Scanner(System.in);
		
		//create query
		String query ="insert into employee values(?,?,?,?)";
		 PreparedStatement ps = conn.prepareStatement(query);
		
			System.out.println("Enter employee id : ");
			int id = sc.nextInt();
			ps.setInt(1, id);
			sc.nextLine();
			
			System.out.println("Enter employee name : ");
			String name = sc.nextLine();
			ps.setString(2, name);
			
			System.out.println("Enter employee salary : ");
			int salary = sc.nextInt();
			ps.setInt(3, salary);
			sc.nextLine();
			
			System.out.println("Enter employee address : ");
			String address = sc.nextLine();
			ps.setString(4, address);
			
			int row =ps.executeUpdate();
		
			System.out.println(row+" row inserted");
			sc.close();
			//close the connection
			conn.close();
		}catch(Exception e) {
		}
		}
	}