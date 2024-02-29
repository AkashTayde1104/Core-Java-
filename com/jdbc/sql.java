package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class sql {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		System.out.println("Main Start");
		
		Class.forName("com.mysql.jdbc.Driver");//1. load driver class
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqldemo", "root", "root");//2.establish jdbc connection
		
		String sql="insert into Student values(2,'Ram','Nashik')";//3. construct sql query
		
		Statement smt = con.createStatement();//4. create the reference of required jdbc statement
		
		smt.execute(sql);// 5. submit sql query
		
		con.close();//6. close the connection
		smt.close();
		
		System.out.println("Done");
	}

}
