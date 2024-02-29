package com.programs.string;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringToListOfInteger {
	public static void main(String[] args) {
		
		String s="123456";
		
		String[] ss = s.split("");//split string character one by one
		
		for(String sss:ss)
			
		{
			System.out.println(sss);
		}
		
		List<String> list = Stream.of(ss).collect(Collectors.toList());
//		System.out.println(list);
		
	}

}



