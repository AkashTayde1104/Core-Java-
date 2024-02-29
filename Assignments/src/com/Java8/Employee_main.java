package com.Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee_main {
	public static void main(String[] args) {
		
//		Employee e1=new Employee();
//		e1.setName("Rahul");
//		e1.setAddress("Pune");
//		e1.setEid(101);
//		e1.setSalary(25000);
//		
//		Employee e2=new Employee();
//		e2.setName("Amol");
//		e2.setAddress("Nashik");
//		e2.setEid(102);
//		e2.setSalary(30000);
//		
//		Employee e3=new Employee();
//		e3.setName("Sandip");
//		e3.setAddress("Nagpur");
//		e3.setEid(103);
//		e3.setSalary(15000);
//		
//		Employee e4=new Employee();
//		e4.setName("Rani");
//		e4.setAddress("Sinnar");
//		e4.setEid(104);
//		e4.setSalary(35000);
		
		List<Employee> l=new ArrayList<Employee>();
		l.add(new Employee("Rahul", "Pune", 101, 15000));
		l.add(new Employee("Varsha", "Pune", 102, 25000));
		l.add(new Employee("Suraj", "Nashik", 103, 30000));
		l.add(new Employee("Ram", "Sinnar", 104, 35000));
		l.add(new Employee("Kiran", "Mumbai", 105, 10000));
		
		//key=result of getname , value=employees list with same employee name using groupingBy method
		Map<String, List<Employee>> namemap = l.stream().collect(Collectors.groupingBy(Employee::getName));
		System.out.println("Get employees name in hashmap using Grouping Method with employee list :- \n");
		System.out.println(namemap +"\n\n");
		
		
		//key=employee name value=salary (i.e get employee name with its salary using summingDouble method
		Map<String, Double> salarymap = l.stream().collect(Collectors.groupingBy(Employee::getName , Collectors.summingDouble(Employee::getSalary)));
		System.out.println("get employee name with salary :- \n");
		System.out.println(salarymap +"\n\n");
		
		Map<String, Double> averagesalary = l.stream().collect(Collectors.groupingBy(Employee::getName , Collectors.averagingDouble(Employee::getSalary)));
		System.out.println("get employee name with average salary :- \n");
		System.out.println(averagesalary +"\n\n");
		
	
	}

}
