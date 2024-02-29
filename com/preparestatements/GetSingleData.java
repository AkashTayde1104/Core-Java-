package com.preparestatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// get single id data using prepare statement
public class GetSingleData {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqldemo", "root", "root");
    
    String sql="select * from Student where Sid=?";
    PreparedStatement ps = con.prepareStatement(sql);
  
    ps.setInt(1, 102);//get data of 102
    
    ResultSet rs = ps.executeQuery();
    
    rs.next();//get single data .....pointing control to data
    
    System.out.println(rs.getInt(1));
    System.out.println(rs.getString(2));
    System.out.println(rs.getString(3));
    
    ps.close();
    con.close();
    
}
}
