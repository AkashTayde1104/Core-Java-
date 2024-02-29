package com.jdbcassignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC_Methods {

	String url = "jdbc:mysql://localhost:3306/sqldemo";
	String username = "root";
	String password = "root";

	Employee emp = new Employee();

	// Add data to datatbase
	public void setdata() throws ClassNotFoundException, SQLException {
		while (true) {
		    Class.forName("com.mysql.jdbc.Driver");// 1.load driver class
		    Connection con = DriverManager.getConnection(url, username, password);// 2.Establish connection
			Scanner sc = new Scanner(System.in);
			System.out.println("Want to add data press Y/N");
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
				String sql = "insert into EmployeeData values( " + Eid + "  ,' " + Ename + " ',' " + Eaddress + " ',' "
						+ Esalary + " ')";// 3.Create query

				Statement smt = con.createStatement();// 4.create statement

				smt.execute(sql);// 5.submit query

				con.close();// 6.close connection
				smt.close();

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
				System.out.println("Want to get data \n0. Exit \n1. Get all data \n2. Get single Id data");
				int i = sc1.nextInt();
				if (i == 1) {

					String sql = "Select * from EmployeeData";// 3.
					Statement smt = con.createStatement();// 4.
					ResultSet rs = smt.executeQuery(sql);// 5. submit SQL query
					while (rs.next()) {
						System.out.println(rs.getInt(1));
						System.out.println(rs.getString(2));
						System.out.println(rs.getString(3));
						System.out.println(rs.getLong(4));
						System.out.println();
					}

					smt.close();
					con.close();

				} else if (i == 2) {
					System.out.println("Enter Eid");
					int Eid = sc1.nextInt();
					String sql = "Select * from EmployeeData where Eid= " + Eid + " ";
					Statement smt = con.createStatement();
					ResultSet rs = smt.executeQuery(sql);// 5. submit SQL query
					while (rs.next()) {
						System.out.println(rs.getInt(1));
						System.out.println(rs.getString(2));
						System.out.println(rs.getString(3));
						System.out.println(rs.getLong(4));
						System.out.println();
					}

					smt.close();
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

					String sql = "update EmployeeData set Ename=' " + Ename + " ',Eaddress=' " + Eaddress
							+ " ' ,Esalary=" + Esalary + " where Eid=" + Eid + " ";
					Statement smt = con.createStatement();
					smt.executeUpdate(sql);// 5. submit SQL query

					smt.close();
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
					String sql = "Delete from EmployeeData where Eid= " + Eid + " ";// 3.
					Statement smt = con.createStatement();// 4.
					smt.execute(sql);// 5. submit SQL query
					con.close();// 6.
					smt.close();
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
