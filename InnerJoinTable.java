package com.dbms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InnerJoinTable {

	public static void main(String[] args) {

			//create connection
			Connection conn = ConnectionDb.connectDb();
			try {
				//create query
				String query ="select * from employee inner join laptoo on employee.empid=laptoo.eid";
				 PreparedStatement ps = conn.prepareStatement(query);
				 ResultSet rs=ps.executeQuery();
					
					System.out.println("==========================================");
					while(rs.next()) {
						System.out.println("Employee id: "+ rs.getInt("empid") +"\nEmployee name: "+ rs.getString("empname") +"\nEmployee salary: "+ rs.getInt("empsal") +"\nEmployee address: "+ rs.getString("empaddr") +"\nEmployee model: "+rs.getString("model"));
					    System.out.println("==========================================");
					}
					
					conn.close();
			}catch(Exception e) {
				System.out.println(e);
			}
		}

	}

	}

}
