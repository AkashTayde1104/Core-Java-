package com.daily.assignments;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
//find even string using stream API
public class Day1_UsingStream {
	public static void main(String[] args) {
		List<String> l=new ArrayList();
		l.add("sky");
		l.add("is");
		l.add("Blue");
		l.add("And");
		l.add("Vast");
		l.add("ram");
		l.add("Gita");
		l.add("Ravi");
		
//		List<String> l1 = l.stream().filter(i->i.length()%2==0).collect(Collectors.toList());
//		System.out.println(l1);
		
		l.stream().filter(i->i.length()%2==0).forEach(i->System.out.println(i));//using for each
		
	}
}
