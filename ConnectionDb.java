package com.dbms;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDb {
	static Connection conn=null;
	public static Connection connectDb() {
		
		try {
			//register driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//established the connection
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/anudip","root","Manih007mysql");
			
		}catch(Exception e) {
			
		}
		return conn;
		
	}


}
