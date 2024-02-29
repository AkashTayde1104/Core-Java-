package com.Java8;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee_Dept_Main {
	public static void main(String[] args) {
		List<Employee_Dept> l=new ArrayList<Employee_Dept>();
	
		l.add(new Employee_Dept( "Rahul", "Pune", 101, 21000, "Development"));
		l.add(new Employee_Dept( "Amol", "Nashik", 102, 20000, "Development"));
		l.add(new Employee_Dept( "Rani", "Mumbai", 103, 25000, "Development"));
		l.add(new Employee_Dept( "Vishal", "Nashik", 104, 18000, "Testing"));
		

		//get 2 keys as development and testing and value = list of employee
		Map<String, List<Employee_Dept>> DepartmentMap = l.stream().collect(Collectors.groupingBy(Employee_Dept::getDepartment));
		System.out.println("Get department name with list of employee data :- \n");
		System.out.println(DepartmentMap +"\n\n");
		
		 Map<String, Double> Departmentsalary = l.stream().collect(Collectors.groupingBy(Employee_Dept::getDepartment, Collectors.summingDouble(Employee_Dept::getSalary)));
		System.out.println("Get department name with total employee  salary :- \n");
		System.out.println(Departmentsalary +"\n\n");
		
	       Map<String, Double> DeparatmentAverage = l.stream().collect(Collectors.groupingBy(Employee_Dept::getDepartment, Collectors.averagingDouble(Employee_Dept::getSalary)));
		   System.out.println("Get department name with Average salary :- \n");
			System.out.println(DeparatmentAverage +"\n\n");
			
		
	}

}
