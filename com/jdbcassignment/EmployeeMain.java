package com.jdbcassignment;

import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeMain {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		JDBC_Methods j=new JDBC_Methods();

        Scanner sc=new Scanner(System.in);
        while(true)
        {
        System.out.println("\n Enter your choice \n1. Add data \n2. Get data \n3. Update data \n4. Delete data \n");
        int i=sc.nextInt();
        
        switch(i)
        {
        case 1:
        	j.setdata();
        	break;
        	
        case 2: 
        	j.getdata();
        	break;
        	
        case 3:
        	j.updateData();
        	break;
        	
        case 4:
        	j.deleteData();
        	break;
        	
        }
	}
	}

}
