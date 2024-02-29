package com.interviews.program;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class String_To_Map {
	public static void main(String[] args) {
//		String s="aish";
//		
//		Map<Character, Integer> m=new HashMap();
//		
//		for(int i=0;i<s.length();i++)
//		{
//			char c = s.charAt(i);
//			
//			if(m.containsKey(c))
//			{
//				m.put(c, m.get(c)+1);
//			}
//			else
//			{
//				m.put(c, 1);
//			}
//						
//						
//						
//		}
//		System.out.println(m);
//		Map<Character, Long> map = s.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		System.out.println("\n\n"+map);
		
		
		//store string words
		String s1="Aish,Rahul,Purwi";
		
		Map<String, Integer> m1=new HashMap<String, Integer>();
		for(String word:s1.split(","))
		{
			if(m1.containsKey(word))
			{
				m1.put(word, m1.get(word)+1);
				
			}
			else
			{
				m1.put(word, 1);
			}
		}
		System.out.println(m1);
	}

}
