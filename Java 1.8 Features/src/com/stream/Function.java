package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Function {
	
	public static void main(String[] args) {
		List<Integer> l=new ArrayList();
		l.add(10);
		l.add(25);
		l.add(78);
		l.add(45);
		
		System.out.println(l);
		
		List<Integer> ll=l.stream().map(i->i+10).collect(Collectors.toList());
		System.out.println(ll);
		
		List<Integer> lll=l.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println(lll);
		
		
		List<String> l2=new ArrayList();
		l2.add("Ram");
		l2.add("Shyam");
		l2.add("Vijay");
		l2.add("Raj");
		System.out.println(l2);
		List<Integer> l3=l2.stream().map(i->i.length()*2).collect(Collectors.toList());
		System.out.println(l3);
	}

}
