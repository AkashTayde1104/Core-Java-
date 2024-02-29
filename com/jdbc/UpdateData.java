package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateData {
	static String url="jdbc:mysql://localhost:3306/sqldemo";
	static String userName="root";
	static String password="root";
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("Main Start");
			
			Class.forName("com.mysql.jdbc.Driver");//1. load driver class
			
			Connection con = DriverManager.getConnection(url, userName, password);//2.establish jdbc connection
			
			String sql="Update Student set sName='Ravi', sAddress='Nagpur' where Sid=2";//3. construct sql query
			
			Statement smt = con.createStatement();//4. create the reference of required jdbc statement
			
			 smt.executeUpdate(sql);// 5. submit SQL query
			 
			 con.close();
			 smt.close();
			 System.out.println("Update success");

}
}