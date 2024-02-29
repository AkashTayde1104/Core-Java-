package com.preparestatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




public class GetData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
	    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqldemo", "root", "root");
	    
	    String sql="select * from Student";
	    PreparedStatement ps = con.prepareStatement(sql);
	    ResultSet rs = ps.executeQuery();
	    
	    //single data get
//	    rs.next();//get single data .....pointing control to data
//	    System.out.println(rs.getInt(1));
//	    System.out.println(rs.getString(2));
//	    System.out.println(rs.getString(3));
	    
	    //or multiple data get
	    while( rs.next())//get more than one data .....pointing control to data
	    {
	        System.out.println(rs.getInt(1));
	  	    System.out.println(rs.getString(2));
	  	    System.out.println(rs.getString(3));
	  	    System.out.println();
	    }
	    
	    
	    ps.close();
	    con.close();
	    
	    
	    
	}

}
