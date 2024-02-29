package com.stream.asssignments;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//3. Find out all duplicate elements
public class DuplicateElements {
	public static void main(String[] args) {
		
		System.out.println("\n_____________3. Find out all duplicate elements___________\n");
		List<Integer> l=Arrays.asList(20,15,8,49,25,98,12,15,2,98,20);
		
		System.out.println("List: "+l);
		
		Set<Integer> s=new HashSet();

		List<Integer> l1 = l.stream().filter(i->!s.add(i)).collect(Collectors.toList());
//		List<Integer> l1 = l.stream().filter(i->s.add(i)==false).collect(Collectors.toList());
		System.out.println(l1);
		}
}

         //l.stream // Converting list to stream
		//filter(i->!s.add(i))// to filter out the elements that are not added to the set
		//collect(Collectors.toList())// collected stream in list
		