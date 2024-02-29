package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.functioninterface.Employee;

public class Function_Employee {
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setId(101);
		e1.setName("Ram");
		
		Employee e2=new Employee();
		e2.setId(102);
		e2.setName("Sita");
		
		List<Employee> l=new ArrayList();
		l.add(e1);
		l.add(e2);
		
		List<String> ll=l.stream().map(i->i.getName()).collect(Collectors.toList());
		System.out.println(ll);
		
		List<Integer> lll=l.stream().map(i->i.getId()).collect(Collectors.toList());
		System.out.println(lll);
		
		
	}

}
