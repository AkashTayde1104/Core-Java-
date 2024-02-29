package com.programs.string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {
	public static void main(String[] args) {
		String s="aabcdd";
		
//		for(int i=0;i<s.length();i++)
//		{
//			boolean unique=true;
//			for( int j=0;j<s.length();j++)
//			{
//				if( i!=j && s.charAt(i)==s.charAt(j))
//				{
//					unique=false;
//				}
//			
//			}
//			if(unique)
//			{
//				System.out.println(s.charAt(i));
//				break;
//			}
			
//		}
		
		
		Map<Character, Integer> m=new HashMap<Character, Integer>();
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			if(m.get(c)==null)
			{
				m.put(c, 1);
			}
			else
			{
				m.put(c, m.get(c)+1);
			}
		}
		
		//using for each
		Set<Entry<Character, Integer>> entrySet = m.entrySet();
		
		for(Entry<Character, Integer> set :entrySet)
		{
			if(set.getValue()==1)
			{
				System.out.println(set.getKey());
				break;
			}
		}
		
		//using java 8 for all non-repeated character
//		m.entrySet().stream().filter(map->map.getValue()==1).forEach(System.out::println);
		
		
		
		//using java 8 for character occurence and
//		Map<Character, Long> collect = s.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//		System.out.println(collect);
//		
		
		//find first non repeated char
//		Character non = m.entrySet().stream().filter(f->f.getValue()>1).map(mm->mm.getKey()).findFirst().get();
//		System.out.println(non);
		
	}

}
