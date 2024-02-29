package com.stream.asssignments;

import java.util.Arrays;
import java.util.List;

//4. Find out total number of elements present in list
public class TotalNumberElements {
	public static void main(String[] args) {
		
		System.out.println("\n_________4. Find out total number of elements present in list________\n");
		
		List<Integer> l=Arrays.asList(20,15,8,49,25,98,12,15,2,98);
		System.out.println("List: "+l);
		
		long length = l.stream().count();
		System.out.println(length);
	}

}
