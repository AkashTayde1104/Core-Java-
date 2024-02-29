package com.stream.asssignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//1. find out all even numbers from list using stream API
public class EvenNo {
	public static void main(String[] args) {
		
		System.out.println("\n__________1. find out all even numbers from list using stream API________\n");
		
		List<Integer> l=Arrays.asList(10,15,8,49,25,98,32,2,30);
		System.out.println("List: "+l);
		
		List<Integer> l1=l.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l1);
	}

}
