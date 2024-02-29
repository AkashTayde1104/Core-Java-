package com.stream.asssignments;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//2. Find number starts with 1
public class FindNoStartsWith1 {
	public static void main(String[] args) {
		
		System.out.println("\n________2. Find number starts with 1_________\n");
		List<Integer>l=Arrays.asList(20,15,8,49,25,98,12,2,130);
		System.out.println("List: "+l);
		
		List<String> l1 = l.stream().map(f->f.toString()).filter(p->p.startsWith("1")).collect(Collectors.toList());
		System.out.println(l1);
	}

}
