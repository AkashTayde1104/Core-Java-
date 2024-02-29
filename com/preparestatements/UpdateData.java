package com.preparestatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// Update data using prepare Statement
public class UpdateData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
	    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqldemo", "root", "root");
	    
	    String sql="update Student set sName=?, sAddress=? where Sid=?";
	    
	    PreparedStatement ps = con.prepareStatement(sql);
	    
	    ps.setInt(1, 102);
	    ps.setString(2, "Priya");
	    ps.setString(3, "Delhi");//also get proper updation means index number shoul be same as parameter wise
	    // 1st name the for 1st index put name 2nd index put addrerss 3rd index put id
	    //we use first id then name address its possinle index no should be parameter wise of query
	  
	    
	    
	    int update = ps.executeUpdate();
	    System.out.println(update);// 1 for updation
	    
	    boolean execute = ps.execute();
	    System.out.println(execute);
	    
	    ps.close();
	    con.close();
	    
	    System.out.println("Update data successfully");
	}

}
