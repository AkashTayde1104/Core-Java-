package com.arraylistsimple.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ascending_Stringlist {
	public static void main(String[] args) {
	List<String> l=new ArrayList();
	l.add("Jay");
	l.add("Pravin");
	l.add("Amol");
	l.add("Raj");
	
	Comparator<String> c=(obj1,obj2)->obj1.toString().compareTo(obj2.toString());
	
	Collections.sort(l, c);
	System.out.println(l);
	}

}
