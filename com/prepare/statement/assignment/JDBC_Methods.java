package com.prepare.statement.assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
//using prepare Statements perform CRUD operation from user
public class JDBC_Methods {
	String url = "jdbc:mysql://localhost:3306/sqldemo";
	String username = "root";
	String password = "root";
	
	// Add data to datatbase
		public void setdata() throws ClassNotFoundException, SQLException {
			while (true) {
			    Class.forName("com.mysql.jdbc.Driver");// 1.load driver class
			    Connection con = DriverManager.getConnection(url, username, password);// 2.Establish connection
				Scanner sc = new Scanner(System.in);
				System.out.println("Wants to add data press Y/N");
				char a = sc.next().charAt(0);
				if (a == 'Y') {
					System.out.println("Enter id");
					int Eid = sc.nextInt();

					System.out.println("Enter name");
					String Ename = sc.next();

					System.out.println("Enter Address");
					String Eaddress = sc.next();

					System.out.println("Enter salary");
					long Esalary = sc.nextLong();
					
					String sql = "insert into employeedata values(?,?,?)";// 3.Create query

					PreparedStatement ps = con.prepareStatement(sql);// 4.create statement
                    ps.setInt(1, Eid);
                    ps.setString(2, Ename);
                    ps.setString(3, Eaddress);
                    ps.setLong(4, Esalary);
                    
					ps.execute();// 5.submit query

					con.close();// 6.close connection
					ps.close();

					System.out.println("Successfully add data");
				} else if (a == 'N') {
					break;
				} else {
					System.out.println("Invalid Input");
				}
			}
		}
		
		// get data from database
		public void getdata() {
			try {
				while (true) {
				Class.forName("com.mysql.jdbc.Driver");// 1.
				Connection con = DriverManager.getConnection(url, username, password);// 2.
				Scanner sc1 = new Scanner(System.in);
					System.out.println("Want to get data \n0. Exit \n1. Get all data \n2. Get Id data");
					int i = sc1.nextInt();
					if (i == 1) {

						String sql = "Select * from employeedata";// 3.
						PreparedStatement ps = con.prepareStatement(sql);// 4.
						ResultSet rs = ps.executeQuery(sql);// 5. submit SQL query
						while (rs.next()) {
							System.out.println(rs.getInt(1));
							System.out.println(rs.getString(2));
							System.out.println(rs.getString(3));
							System.out.println(rs.getLong(4));
							System.out.println();
						}

						ps.close();
						con.close();

					} else if (i == 2) {
						System.out.println("Enter Eid");
						int Eid = sc1.nextInt();
						String sql = "Select * from employeedata where Eid= ? ";
						PreparedStatement ps = con.prepareStatement(sql);
						ps.setInt(1, Eid);
						ResultSet rs = ps.executeQuery(sql);// 5. submit SQL query
						while (rs.next()) {
							System.out.println(rs.getInt(1));
							System.out.println(rs.getString(2));
							System.out.println(rs.getString(3));
							System.out.println(rs.getLong(4));
							System.out.println();
						}

						ps.close();
						con.close();

					} else if (i == 0) {
						break;
					} else {
						System.out.println("Invalid Input");
					}
				}

			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// Update/replace data to database
		public void updateData() {
			try {
				while (true) {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url, username, password);
				Scanner sc2 = new Scanner(System.in);
					System.out.println("Want to update data Press Y/N");
					char a = sc2.next().charAt(0);
					if (a == 'Y') {
						System.out.println("Enter name");
						String Ename = sc2.next();

						System.out.println("Enter Address");
						String Eaddress = sc2.next();

						System.out.println("Enter salary");
						long Esalary = sc2.nextLong();

						System.out.println("Enter Eid");
						int Eid = sc2.nextInt();

						String sql = "update employeedata set Ename=?, Eaddress=?, Esalary=? where Eid=? ";
						PreparedStatement ps = con.prepareStatement(sql);
						
						ps.setString(1, Ename);
						ps.setString(2, Eaddress);
						ps.setLong(3, Esalary);
						ps.setInt(4, Eid);
						ps.executeUpdate(sql);// 5. submit SQL query

						ps.close();
						con.close();

						System.out.println("Update success");

					} else if (a == 'N') {
						break;
					} else {
						System.out.println("Invalid Input");
					}
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		// Delete data from database
		public void deleteData() {
			try {
				while (true) {
				Class.forName("com.mysql.jdbc.Driver");// 1.
				Connection con = DriverManager.getConnection(url, username, password);// 2.
				Scanner sc2 = new Scanner(System.in);
			
					Scanner sc3 = new Scanner(System.in);
					System.out.println("Want to Delete data Press Y/N");
					char a = sc3.next().charAt(0);
					if (a == 'Y') {
						System.out.println("Enter Eid");
						int Eid = sc3.nextInt();
						String sql = "Delete from employeedata where Eid= ? ";// 3.
						PreparedStatement ps = con.prepareStatement(sql);// 4.
						
						ps.setInt(1, Eid);
						
						ps.execute(sql);// 5. submit SQL query
						con.close();// 6.
						ps.close();
						System.out.println("Delete success");
					} else if (a == 'N') {
						break;
					} else {
						System.out.println("Invalid Input");
					}
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	

}
