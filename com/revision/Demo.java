package com.revision;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqldemo", "root", "root");
	
		String query="select * from revise ";
		
		PreparedStatement ps = con.prepareStatement(query);
//		ps.setInt(1, 101);
//		ps.setString(1, "Rahul");
		
		ResultSet rs = ps.executeQuery();
		rs.next();
		{
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
		}
		
		
		ps.close();
		con.close();
		System.out.println("done");
		
		
		
		
	}

}

