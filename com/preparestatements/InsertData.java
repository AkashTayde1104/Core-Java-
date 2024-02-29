package com.preparestatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqldemo", "root", "root");
		
		String sql="Insert into Student value(?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, 102);
		ps.setString(2, "Rahul");
		ps.setString(3, "Pune");
		
//		boolean execute = ps.execute();
//		System.out.println(execute);// return false for insertion
		
		int add = ps.executeUpdate();
		System.out.println(add);//return 1 for insertion
		
		ps.close();
		con.close();
		System.out.println("Insert data successfully");
		
	}

}
