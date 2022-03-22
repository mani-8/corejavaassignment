package com.dbms;

import java.sql.Connection;
import java.sql.Statement;

public class CreateTableEmployee {

	public static void main(String[] args) {
		Connection conn =ConnectionDb.connectDb();
		try {
			
			//create statement
			Statement sta =conn.createStatement();
			
			//create query
			String query ="create table employee (empid int primary key,empname varchar(20), empsal int(100), empaddr varchar(100))";
			
			//execute query
			sta.executeUpdate(query);
			System.out.println("Table created successfully");
			
			//close the connection
			conn.close();
		}catch(Exception e) {
			
		}

	}

}
