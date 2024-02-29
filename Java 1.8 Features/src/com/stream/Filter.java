package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
	public static void main(String[] args) {
		
//		// find number >20
//		List<Integer> l=new ArrayList();
//		l.add(10);
//		l.add(25);
//		l.add(78);
//		l.add(45);
//		
//		System.out.println(l);
//		List<Integer> l1=l.stream().filter(i->i>20).collect(Collectors.toList());	
//		System.out.println(l1);
		
		List<String> l2=new ArrayList();
		l2.add("Ram");
		l2.add("Shyam");
		l2.add("Vijay");
		l2.add("Raj");
		System.out.println(l2);
		
		List<String> l3=l2.stream().filter(i->i.length()>3).collect(Collectors.toList());
		System.out.println(l3);
		
	}

}
