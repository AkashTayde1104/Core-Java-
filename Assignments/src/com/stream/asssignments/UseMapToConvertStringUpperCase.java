package com.stream.asssignments;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//8. Use Map to convert String into UpperCase
public class UseMapToConvertStringUpperCase {
	public static void main(String[] args) {
		
		System.out.println("\n______8. Use Map to convert String into UpperCase________\n");
		List<String> l=Arrays.asList("one", "two", "three", "four", "five", "six");
		System.out.println("List: "+l);
		
		List<String> l1=l.stream().map(f->f.toUpperCase()).collect(Collectors.toList());
		System.out.println(l1);
	}

}
