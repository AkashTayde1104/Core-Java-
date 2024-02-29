package com.preparestatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
	    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqldemo", "root", "root");
	    
	    String sql="Delete from Student where Sid=?";
	    
	    PreparedStatement ps = con.prepareStatement(sql);
	    ps.setInt(1, 103);
	    
//	    boolean execute = ps.execute();
//	    System.out.println(execute);//return false for ddeletion
	    
	    int Delete = ps.executeUpdate();
	    System.out.println(Delete);//id 102 not execute in table i.e data not deleted so return 0
	    
	    ps.close();
	    con.close();
	    
	    System.out.println("Delete data successfully");
	}

}
