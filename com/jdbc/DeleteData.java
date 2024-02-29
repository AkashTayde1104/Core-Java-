package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteData {
	static String url="jdbc:mysql://localhost:3306/sqldemo";
	static String userName="root";
	static String password="root";
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("Main Start");
			
			Class.forName("com.mysql.jdbc.Driver");//1. load driver class
			
			Connection con = DriverManager.getConnection(url, userName, password);//2.establish jdbc connection
			
			String sql="Delete from Student where Sid=1";//3. construct sql query
			
			Statement smt = con.createStatement();//4. create the reference of required jdbc statement
			
			 smt.execute(sql);// 5. submit SQL query
			 
			 con.close();
			 smt.close();
			 System.out.println("Delete success");

}
}