package com.interviews.program;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//converts list of elements to map
public class List__Elements_Converts_ToMap {
	public static void main(String[] args) {
	
	List<Student> l=new LinkedList<Student>();
	l.add(new Student(101, "Ram"));
	l.add(new Student(102, "Punam"));
	l.add(new Student(103, "Vishal"));
	
	
	//before 1.8
	Map<String, Integer> m=new LinkedHashMap<String, Integer>();
	for(Student ll:l)
	{
		m.put(ll.getName(), ll.getId());
	}
	System.out.println(m);
	
	
	//using java 8
	//key =name , value=student type                                                  give student object
	Map<String, Student> map = l.stream().collect(Collectors.toMap(Student::getName, Student->Student));
	
	System.out.println("\n\n "+map);
	
	//key=name , value= id
	Map<String, Integer> map2 = l.stream().collect(Collectors.toMap(Student::getName, Student::getId));
	System.out.println("\n\n" +map2);

	//	                                                                                 give student type object
	Map<String, Student> map3 = l.stream().collect(Collectors.toMap(Student::getName, Function.identity()));
	
	System.out.println("\n\n"+map3);
	
	//get in key value pair
	map.entrySet().stream().forEach(c->System.out.println(c.getKey()+" = "+c.getValue()));
	}

}
